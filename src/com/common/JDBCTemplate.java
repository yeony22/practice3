package com.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTemplate {
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch(ClassNotFoundException e) {
			System.out.println("ClassNotFoundException : " + e.getMessage());
		
		}
		try {
			String url = "jdbc:mysql://localhost:3306/practice3?characterEndoding=UTF-8&serverTimezone=UTC&useSSL=false";
			con = DriverManager.getConnection(url, "root", "1234");
			con.setAutoCommit(false);
			
		} catch(SQLException e) {
			System.out.println("SQLException : " + e.getMessage());
		
		}
		return con;
	}

}
