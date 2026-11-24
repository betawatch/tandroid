// default package

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class g00 {
    public String a;
    public long b;
    public String c;
    public String d;
    public String e;
    public String f;
    public short g;
    public String h;
    public String i;
    public short j;
    public short k;
    public String l;
    public String m;
    public String n;
    public Bitmap o;
    public Bitmap p;
    public File q;

    public static g00 a(File file) {
        byte b;
        try {
            byte[] bArr = new byte[12];
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            randomAccessFile.readFully(bArr, 0, 8);
            randomAccessFile.close();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            if (bArr[4] == 102 && bArr[5] == 116 && bArr[6] == 121 && bArr[7] == 112) {
                return new hg6(bufferedInputStream);
            }
            if (bArr[0] == 102 && bArr[1] == 76 && bArr[2] == 97 && bArr[3] == 99) {
                br7 br7Var = new br7(file);
                if (br7Var.s) {
                    return null;
                }
                return br7Var;
            }
            if (file.getAbsolutePath().endsWith("mp3") || (((b = bArr[0]) == 73 && bArr[1] == 68 && bArr[2] == 51) || (b == 84 && bArr[1] == 65 && bArr[2] == 71))) {
                return new qg6(bufferedInputStream, file.length());
            }
            br7 br7Var2 = new br7(file);
            if (br7Var2.s) {
                return null;
            }
            return br7Var2;
        } catch (Exception unused) {
            return null;
        }
    }
}
