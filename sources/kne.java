// default package

import android.opengl.GLES20;
import android.opengl.GLES30;
import android.util.AtomicFile;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class kne {
    public static int a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        grb.i(glGetShaderInfoLog);
        return 0;
    }

    public static boolean b(int i, AtomicFile atomicFile) {
        DataInputStream dataInputStream;
        if (!atomicFile.getBaseFile().isFile()) {
            return false;
        }
        try {
            dataInputStream = new DataInputStream(atomicFile.openRead());
            try {
            } finally {
            }
        } catch (Exception unused) {
        }
        if (dataInputStream.readInt() != 1145524273) {
            throw new IllegalStateException("Invalid program cache");
        }
        int readInt = dataInputStream.readInt();
        int readInt2 = dataInputStream.readInt();
        if (readInt2 <= 0 || readInt2 > 16777216) {
            throw new IllegalStateException("Invalid binary length");
        }
        int[] iArr = new int[1];
        byte[] bArr = new byte[readInt2];
        dataInputStream.readFully(bArr);
        if (dataInputStream.read() != -1) {
            throw new IllegalStateException("Invalid binary size");
        }
        ByteBuffer order = ByteBuffer.allocateDirect(readInt2).order(ByteOrder.nativeOrder());
        order.put(bArr).position(0);
        while (GLES20.glGetError() != 0) {
        }
        GLES30.glProgramBinary(i, readInt, order, readInt2);
        int glGetError = GLES20.glGetError();
        GLES20.glGetProgramiv(i, 35714, iArr, 0);
        if (glGetError == 0 && iArr[0] != 0) {
            dataInputStream.close();
            return true;
        }
        dataInputStream.close();
        atomicFile.delete();
        return false;
    }

    public static void c(int i, AtomicFile atomicFile) {
        FileOutputStream fileOutputStream = null;
        try {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            GLES20.glGetProgramiv(i, 34625, iArr, 0);
            int i2 = iArr[0];
            if (i2 <= 0 || i2 > 16777216) {
                return;
            }
            ByteBuffer order = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
            GLES30.glGetProgramBinary(i, iArr[0], iArr, 0, iArr2, 0, order);
            int i3 = iArr[0];
            if (i3 > 0) {
                byte[] bArr = new byte[i3];
                order.position(0);
                order.get(bArr);
                fileOutputStream = atomicFile.startWrite();
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                dataOutputStream.writeInt(1145524273);
                dataOutputStream.writeInt(iArr2[0]);
                dataOutputStream.writeInt(i3);
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                atomicFile.finishWrite(fileOutputStream);
            }
        } catch (Exception unused) {
            if (fileOutputStream != null) {
                atomicFile.failWrite(fileOutputStream);
            }
        }
    }
}
