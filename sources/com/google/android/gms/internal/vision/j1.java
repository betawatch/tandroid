package com.google.android.gms.internal.vision;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class j1 {
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
                throw n1.b();
            }
            if (length > Integer.MAX_VALUE) {
                throw n1.a();
            }
        } catch (n1 e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    public static int a(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static f1 b(Object obj, Object obj2) {
        f1 f1Var = (f1) ((l0) obj);
        d1 d1Var = (d1) f1Var.e(5);
        d1Var.a(f1Var);
        l0 l0Var = (l0) obj2;
        if (!d1Var.a.getClass().isInstance(l0Var)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        d1Var.a((f1) l0Var);
        return d1Var.e();
    }
}
