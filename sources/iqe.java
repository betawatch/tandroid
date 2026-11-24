// default package

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class iqe {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length < 0) {
                throw ire.b();
            }
            if (length > Integer.MAX_VALUE) {
                throw ire.a();
            }
        } catch (ire e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static qpe b(Object obj, Object obj2) {
        qpe qpeVar = (qpe) ((rfe) obj);
        mpe mpeVar = (mpe) qpeVar.d(5);
        mpeVar.a(qpeVar);
        rfe rfeVar = (rfe) obj2;
        if (mpeVar.a.getClass().isInstance(rfeVar)) {
            mpeVar.a((qpe) rfeVar);
            return mpeVar.e();
        }
        u36.j("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }
}
