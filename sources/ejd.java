// default package

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class ejd {
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
                throw new vkd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if ((0 - 0) + length > Integer.MAX_VALUE) {
                throw vkd.a();
            }
        } catch (vkd e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static vid a(Object obj, Object obj2) {
        vid vidVar = (vid) ((g9d) obj);
        tid tidVar = (tid) vidVar.a(5);
        tidVar.a(vidVar);
        g9d g9dVar = (g9d) obj2;
        if (tidVar.a.getClass().isInstance(g9dVar)) {
            tidVar.a((vid) g9dVar);
            return tidVar.c();
        }
        w26.j("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
