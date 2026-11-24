// default package

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class mp5 {
    public static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new yj2(bArr, 0, 0, false).e(0);
        } catch (zp5 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        fvc.f(str);
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
