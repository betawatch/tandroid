package com.google.android.gms.internal.vision;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        } catch (n1 e6) {
            throw new IllegalArgumentException(e6);
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
