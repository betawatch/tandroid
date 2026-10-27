package com.google.android.gms.internal.cast;

import java.io.IOException;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements j5.e, a0 {
    public static final /* synthetic */ x a = new x();
    public static final /* synthetic */ x b = new x();
    public static final x c = new x();
    public static final x d = new x();
    public static final x e = new x();
    public static final x f = new x();
    public static final x h = new x();
    public static final x n = new x();
    public static final x r = new x();
    public static final x s = new x();
    public static final x v = new x();
    public static final x w = new x();
    public static final x x = new x();
    public static final x y = new x();
    public static final x E = new x();
    public static final x F = new x();
    public static final x G = new x();
    public static final x H = new x();
    public static final x I = new x();
    public static final x J = new x();
    public static final x K = new x();
    public static final x L = new x();
    public static final x M = new x();
    public static final x N = new x();
    public static final x O = new x();
    public static final x P = new x();
    public static final x Q = new x();
    public static final x R = new x();
    public static final x S = new x();
    public static final x T = new x();

    @Override // j5.e
    public Object apply(Object obj) {
        p1 p1Var = (p1) obj;
        try {
            int i10 = p1Var.i();
            byte[] bArr = new byte[i10];
            v4 v4Var = new v4(bArr, i10);
            e6 a2 = b6.c.a(p1.class);
            r5 r5Var = v4Var.a;
            if (r5Var == null) {
                r5Var = new r5(v4Var);
            }
            a2.e(p1Var, r5Var);
            if (i10 - v4Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(a1.g.p("Serializing ", p1Var.getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    @Override // com.google.android.gms.internal.cast.a0
    public Object zza() {
        throw new IllegalStateException();
    }
}
