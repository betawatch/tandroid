// default package

import java.io.InputStream;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class cj5 extends h00 {
    public static String b(int i, int i2, byte[] bArr) {
        try {
            String str = new String(bArr, i, i2, "ISO-8859-1");
            int indexOf = str.indexOf(0);
            return indexOf < 0 ? str : str.substring(0, indexOf);
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean c(InputStream inputStream) {
        boolean z;
        inputStream.mark(3);
        try {
            if (inputStream.read() == 84 && inputStream.read() == 65) {
                if (inputStream.read() == 71) {
                    z = true;
                    return z;
                }
            }
            z = false;
            return z;
        } finally {
            inputStream.reset();
        }
    }
}
