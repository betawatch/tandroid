package com.google.android.gms.internal.cast;

import java.io.IOException;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements v2.e, b0 {
    public static final /* synthetic */ z a = new z();
    public static final /* synthetic */ z b = new z();
    public static final z c = new z();
    public static final z d = new z();
    public static final z e = new z();
    public static final z f = new z();
    public static final z h = new z();
    public static final z n = new z();
    public static final z r = new z();
    public static final z s = new z();
    public static final z v = new z();
    public static final z w = new z();
    public static final z x = new z();
    public static final z y = new z();
    public static final z B = new z();
    public static final z C = new z();
    public static final z D = new z();
    public static final z E = new z();
    public static final z F = new z();
    public static final z G = new z();
    public static final z H = new z();
    public static final z I = new z();
    public static final z J = new z();
    public static final z K = new z();
    public static final z L = new z();
    public static final z M = new z();
    public static final z N = new z();
    public static final z O = new z();
    public static final z P = new z();
    public static final z Q = new z();

    @Override // v2.e
    public Object apply(Object obj) {
        s1 s1Var = (s1) obj;
        try {
            int i10 = s1Var.i();
            byte[] bArr = new byte[i10];
            y4 y4Var = new y4(bArr, i10);
            g6 a2 = d6.c.a(s1.class);
            t5 t5Var = y4Var.a;
            if (t5Var == null) {
                t5Var = new t5(y4Var);
            }
            a2.e(s1Var, t5Var);
            if (i10 - y4Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e6) {
            throw new RuntimeException(android.support.v4.media.a.o("Serializing ", s1Var.getClass().getName(), " to a byte array threw an IOException (should never happen)."), e6);
        }
    }

    @Override // com.google.android.gms.internal.cast.b0
    public Object zza() {
        throw new IllegalStateException();
    }
}
