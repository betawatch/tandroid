// default package

import java.io.InputStream;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class ah5 extends g00 {
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
