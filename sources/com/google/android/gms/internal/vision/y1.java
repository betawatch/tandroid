package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y1 {
    public static final g1 b = new g1(1);
    public final Object a;

    public y1() {
        d2 d2Var;
        try {
            d2Var = (d2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            d2Var = b;
        }
        d2[] d2VarArr = {g1.b, d2Var};
        z1 z1Var = new z1();
        z1Var.a = d2VarArr;
        Charset charset = j1.a;
        this.a = z1Var;
    }

    public void a(int i3, q0 q0Var) {
        r0 r0Var = (r0) this.a;
        r0Var.D(i3, 2);
        r0Var.H(q0Var.i());
        r0Var.L(q0Var.b, q0Var.m(), q0Var.i());
    }

    public void b(int i3, Object obj, n2 n2Var) {
        r0 r0Var = (r0) this.a;
        l0 l0Var = (l0) obj;
        r0Var.D(i3, 2);
        int c2 = l0Var.c();
        if (c2 == -1) {
            c2 = n2Var.zzb(l0Var);
            l0Var.b(c2);
        }
        r0Var.H(c2);
        n2Var.c(l0Var, r0Var.b);
    }

    public void c(int i3, Object obj, n2 n2Var) {
        r0 r0Var = (r0) this.a;
        r0Var.D(i3, 3);
        n2Var.c((l0) obj, r0Var.b);
        r0Var.D(i3, 4);
    }

    public y1(r0 r0Var) {
        Charset charset = j1.a;
        this.a = r0Var;
        r0Var.b = this;
    }
}
