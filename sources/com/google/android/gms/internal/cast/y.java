package com.google.android.gms.internal.cast;

import java.io.IOException;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements i5.e, b0 {
    public static final /* synthetic */ y a = new y();
    public static final /* synthetic */ y b = new y();
    public static final y c = new y();
    public static final y d = new y();
    public static final y e = new y();
    public static final y f = new y();
    public static final y h = new y();
    public static final y n = new y();
    public static final y r = new y();
    public static final y s = new y();
    public static final y w = new y();
    public static final y x = new y();
    public static final y y = new y();
    public static final y D = new y();
    public static final y E = new y();
    public static final y F = new y();
    public static final y G = new y();
    public static final y H = new y();
    public static final y I = new y();
    public static final y J = new y();
    public static final y K = new y();
    public static final y L = new y();
    public static final y M = new y();
    public static final y N = new y();
    public static final y O = new y();
    public static final y P = new y();
    public static final y Q = new y();
    public static final y R = new y();
    public static final y S = new y();
    public static final y T = new y();

    @Override // i5.e
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
        } catch (IOException e7) {
            throw new RuntimeException(a1.g.n("Serializing ", r1Var.getClass().getName(), " to a byte array threw an IOException (should never happen)."), e7);
        }
    }

    @Override // com.google.android.gms.internal.cast.b0
    public Object zza() {
        throw new IllegalStateException();
    }
}
