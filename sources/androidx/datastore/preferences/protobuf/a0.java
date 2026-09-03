package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class a0 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        if (0 + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw c0.f();
        } catch (c0 e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static x c(Object obj, Object obj2) {
        x xVar = (x) ((a) obj);
        v vVar = (v) xVar.d(5);
        vVar.c();
        v.d(vVar.b, xVar);
        a aVar = (a) obj2;
        if (!vVar.a.getClass().isInstance(aVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        vVar.c();
        v.d(vVar.b, (x) aVar);
        return vVar.b();
    }
}
