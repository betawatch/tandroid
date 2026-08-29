package com.google.android.gms.internal.cast;

import java.io.IOException;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements v2.e, c0 {
    public static final /* synthetic */ a0 a = new a0();
    public static final /* synthetic */ a0 b = new a0();
    public static final a0 c = new a0();
    public static final a0 d = new a0();
    public static final a0 e = new a0();
    public static final a0 f = new a0();
    public static final a0 h = new a0();
    public static final a0 n = new a0();
    public static final a0 r = new a0();
    public static final a0 s = new a0();
    public static final a0 v = new a0();
    public static final a0 w = new a0();
    public static final a0 x = new a0();
    public static final a0 y = new a0();
    public static final a0 A = new a0();
    public static final a0 B = new a0();
    public static final a0 C = new a0();
    public static final a0 D = new a0();
    public static final a0 E = new a0();
    public static final a0 F = new a0();
    public static final a0 G = new a0();
    public static final a0 H = new a0();
    public static final a0 I = new a0();
    public static final a0 J = new a0();
    public static final a0 K = new a0();
    public static final a0 L = new a0();
    public static final a0 M = new a0();
    public static final a0 N = new a0();
    public static final a0 O = new a0();
    public static final a0 P = new a0();

    @Override // v2.e
    public Object apply(Object obj) {
        t1 t1Var = (t1) obj;
        try {
            int i10 = t1Var.i();
            byte[] bArr = new byte[i10];
            y4 y4Var = new y4(bArr, i10);
            h6 a2 = e6.c.a(t1.class);
            u5 u5Var = y4Var.a;
            if (u5Var == null) {
                u5Var = new u5(y4Var);
            }
            a2.e(t1Var, u5Var);
            if (i10 - y4Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(a4.w.n("Serializing ", t1Var.getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    @Override // com.google.android.gms.internal.cast.c0
    public Object zza() {
        throw new IllegalStateException();
    }
}
