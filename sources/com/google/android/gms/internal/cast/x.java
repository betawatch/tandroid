package com.google.android.gms.internal.cast;

import java.io.IOException;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements l5.e, a0 {
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
    public static final x w = new x();
    public static final x x = new x();
    public static final x y = new x();
    public static final x D = new x();
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

    @Override // l5.e
    public Object apply(Object obj) {
        p1 p1Var = (p1) obj;
        try {
            int i7 = p1Var.i();
            byte[] bArr = new byte[i7];
            v4 v4Var = new v4(bArr, i7);
            d6 a10 = a6.c.a(p1.class);
            q5 q5Var = v4Var.a;
            if (q5Var == null) {
                q5Var = new q5(v4Var);
            }
            a10.e(p1Var, q5Var);
            if (i7 - v4Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(a8.p0.p("Serializing ", p1Var.getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    @Override // com.google.android.gms.internal.cast.a0
    public Object zza() {
        throw new IllegalStateException();
    }
}
