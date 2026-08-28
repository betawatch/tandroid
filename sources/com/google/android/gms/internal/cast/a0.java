package com.google.android.gms.internal.cast;

import java.io.IOException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements t2.e, c0 {
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

    @Override // t2.e, d3.f
    public Object apply(Object obj) {
        s1 s1Var = (s1) obj;
        try {
            int i9 = s1Var.i();
            byte[] bArr = new byte[i9];
            y4 y4Var = new y4(bArr, i9);
            h6 a2 = e6.c.a(s1.class);
            u5 u5Var = y4Var.a;
            if (u5Var == null) {
                u5Var = new u5(y4Var);
            }
            a2.e(s1Var, u5Var);
            if (i9 - y4Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(aa.d.o("Serializing ", s1Var.getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    @Override // com.google.android.gms.internal.cast.c0
    public Object zza() {
        throw new IllegalStateException();
    }
}
