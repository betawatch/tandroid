package com.google.android.gms.internal.vision;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
        } catch (n1 e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static int a(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
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
