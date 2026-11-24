// default package

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class afe {
    public static final byte[] a;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        a = bArr;
        ByteBuffer.wrap(bArr);
    }
}
