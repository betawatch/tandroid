package com.google.android.gms.internal.cast;

import java.io.IOException;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements i5.e, e0 {
    public static final /* synthetic */ b0 a = new b0();
    public static final /* synthetic */ b0 b = new b0();
    public static final b0 c = new b0();
    public static final b0 d = new b0();
    public static final b0 e = new b0();
    public static final b0 f = new b0();
    public static final b0 h = new b0();
    public static final b0 n = new b0();
    public static final b0 r = new b0();
    public static final b0 s = new b0();
    public static final b0 v = new b0();
    public static final b0 w = new b0();
    public static final b0 x = new b0();
    public static final b0 y = new b0();
    public static final b0 E = new b0();
    public static final b0 F = new b0();
    public static final b0 G = new b0();
    public static final b0 H = new b0();
    public static final b0 I = new b0();
    public static final b0 J = new b0();
    public static final b0 K = new b0();
    public static final b0 L = new b0();
    public static final b0 M = new b0();
    public static final b0 N = new b0();
    public static final b0 O = new b0();
    public static final b0 P = new b0();
    public static final b0 Q = new b0();
    public static final b0 R = new b0();
    public static final b0 S = new b0();
    public static final b0 T = new b0();

    @Override // i5.e
    public Object apply(Object obj) {
        u1 u1Var = (u1) obj;
        try {
            int i10 = u1Var.i();
            byte[] bArr = new byte[i10];
            a5 a5Var = new a5(bArr, i10);
            j6 a2 = g6.c.a(u1.class);
            w5 w5Var = a5Var.a;
            if (w5Var == null) {
                w5Var = new w5(a5Var);
            }
            a2.e(u1Var, w5Var);
            if (i10 - a5Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e7) {
            throw new RuntimeException(a4.a.p("Serializing ", u1Var.getClass().getName(), " to a byte array threw an IOException (should never happen)."), e7);
        }
    }

    @Override // com.google.android.gms.internal.cast.e0
    public Object zza() {
        throw new IllegalStateException();
    }
}
