package com.google.android.gms.internal.cast;

import java.io.IOException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements k5.e, b0 {
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
    public static final y U = new y();

    @Override // k5.e
    public Object apply(Object obj) {
        q1 q1Var = (q1) obj;
        try {
            int i3 = q1Var.i();
            byte[] bArr = new byte[i3];
            w4 w4Var = new w4(bArr, i3);
            e6 a10 = b6.c.a(q1.class);
            r5 r5Var = w4Var.a;
            if (r5Var == null) {
                r5Var = new r5(w4Var);
            }
            a10.e(q1Var, r5Var);
            if (i3 - w4Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(a1.g.q("Serializing ", q1Var.getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    @Override // com.google.android.gms.internal.cast.b0
    public Object zza() {
        throw new IllegalStateException();
    }
}
