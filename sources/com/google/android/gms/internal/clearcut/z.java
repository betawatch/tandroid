package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class z {
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
                throw new c0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if ((0 - 0) + length > Integer.MAX_VALUE) {
                throw c0.a();
            }
        } catch (c0 e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static y a(Object obj, Object obj2) {
        y yVar = (y) ((i) obj);
        w wVar = (w) yVar.a(5);
        wVar.a(yVar);
        i iVar = (i) obj2;
        if (!wVar.a.getClass().isInstance(iVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        wVar.a((y) iVar);
        return wVar.c();
    }

    public static int b(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }
}
