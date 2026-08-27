package com.google.android.gms.internal.cast;

import java.io.IOException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements t2.e, b0 {
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
    public static final z A = new z();
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

    @Override // t2.e, d3.f
    public Object apply(Object obj) {
        r1 r1Var = (r1) obj;
        try {
            int i10 = r1Var.i();
            byte[] bArr = new byte[i10];
            w4 w4Var = new w4(bArr, i10);
            f6 a2 = c6.c.a(r1.class);
            s5 s5Var = w4Var.a;
            if (s5Var == null) {
                s5Var = new s5(w4Var);
            }
            a2.e(r1Var, s5Var);
            if (i10 - w4Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e9) {
            throw new RuntimeException(a9.p.m("Serializing ", r1Var.getClass().getName(), " to a byte array threw an IOException (should never happen)."), e9);
        }
    }

    @Override // com.google.android.gms.internal.cast.b0
    public Object zza() {
        throw new IllegalStateException();
    }
}
