package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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

    public void a(int i10, q0 q0Var) {
        r0 r0Var = (r0) this.a;
        r0Var.D(i10, 2);
        r0Var.H(q0Var.n());
        r0Var.L(q0Var.b, q0Var.r(), q0Var.n());
    }

    public void b(int i10, Object obj, n2 n2Var) {
        r0 r0Var = (r0) this.a;
        l0 l0Var = (l0) obj;
        r0Var.D(i10, 2);
        int c3 = l0Var.c();
        if (c3 == -1) {
            c3 = n2Var.zzb(l0Var);
            l0Var.b(c3);
        }
        r0Var.H(c3);
        n2Var.c(l0Var, r0Var.b);
    }

    public void c(int i10, Object obj, n2 n2Var) {
        r0 r0Var = (r0) this.a;
        r0Var.D(i10, 3);
        n2Var.c((l0) obj, r0Var.b);
        r0Var.D(i10, 4);
    }

    public y1(r0 r0Var) {
        Charset charset = j1.a;
        this.a = r0Var;
        r0Var.b = this;
    }
}
