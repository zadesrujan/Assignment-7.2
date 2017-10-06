package implict;
//here we cretaed pacakage as protect which that organizes a set of related classes and interfaces.

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.

		byte s=20;
		//taking byte and initialized the variable as 20 
		int v=200;
		//and another variable of integer data type which is greater than 
		//byte data type
		System.out.println("s:"+s+"\n v:"+v);
		//system is used to return code
        //out is a static number
    	//Println is used to print text and gives output of v
		s=(byte)v;
		//here we are converting integer value into byte
		System.out.println("int to byte:"+s);
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.
		s=(byte) v;
		//value of int is equal to byte
		System.out.println("byte to int:"+v);
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.
		int z=900;
		//taking here integer as 900
		float a=z;
		//using float value. integer value is equal to float
		System.out.println("int to float:"+z);
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.
		long b=(long)a;
		//taking value in short and converting it from integer to long
		System.out.println("float to long:"+b);
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.
	}


	}


