package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public abstract class z {
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
            throw b0.f();
        } catch (b0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }

    public static w c(Object obj, Object obj2) {
        w wVar = (w) ((a) obj);
        u uVar = (u) wVar.d(5);
        uVar.c();
        u.d(uVar.b, wVar);
        a aVar = (a) obj2;
        if (!uVar.a.getClass().isInstance(aVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        uVar.c();
        u.d(uVar.b, (w) aVar);
        return uVar.b();
    }
}
