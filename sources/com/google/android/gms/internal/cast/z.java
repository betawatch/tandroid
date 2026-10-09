package com.google.android.gms.internal.cast;

import java.io.IOException;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements i5.e, c0 {
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
    public static final z R = new z();
    public static final z S = new z();
    public static final z T = new z();

    @Override // i5.e
    public Object apply(Object obj) {
        s1 s1Var = (s1) obj;
        try {
            int i10 = s1Var.i();
            byte[] bArr = new byte[i10];
            y4 y4Var = new y4(bArr, i10);
            h6 a2 = e6.c.a(s1.class);
            u5 u5Var = y4Var.a;
            if (u5Var == null) {
                u5Var = new u5(y4Var);
            }
            a2.e(s1Var, u5Var);
            if (i10 - y4Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e7) {
            throw new RuntimeException(a1.g.q("Serializing ", s1Var.getClass().getName(), " to a byte array threw an IOException (should never happen)."), e7);
        }
    }

    @Override // com.google.android.gms.internal.cast.c0
    public Object zza() {
        throw new IllegalStateException();
    }
}
