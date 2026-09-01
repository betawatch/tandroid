package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a0 {
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
                throw new d0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if ((0 - 0) + length > Integer.MAX_VALUE) {
                throw d0.a();
            }
        } catch (d0 e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public static z a(Object obj, Object obj2) {
        z zVar = (z) ((j) obj);
        x xVar = (x) zVar.a(5);
        xVar.a(zVar);
        j jVar = (j) obj2;
        if (!xVar.a.getClass().isInstance(jVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        xVar.a((z) jVar);
        return xVar.c();
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
