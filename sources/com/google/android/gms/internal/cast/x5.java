package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class x5 implements e6 {
    public final q4 a;
    public final h6 b;
    public final x4 c;

    public x5(h6 h6Var, x4 x4Var, q4 q4Var) {
        this.b = h6Var;
        this.c = x4Var;
        this.a = q4Var;
    }

    @Override // com.google.android.gms.internal.cast.e6
    public final void a(Object obj) {
        this.b.getClass();
        g6 g6Var = ((c5) obj).zzc;
        if (g6Var.d) {
            g6Var.d = false;
        }
        throw c3.h0.k(obj);
    }

    @Override // com.google.android.gms.internal.cast.e6
    public final int b(c5 c5Var) {
        this.b.getClass();
        c5Var.zzc.getClass();
        return 506991;
    }

    @Override // com.google.android.gms.internal.cast.e6
    public final boolean c(c5 c5Var, c5 c5Var2) {
        this.b.getClass();
        return c5Var.zzc.equals(c5Var2.zzc);
    }

    @Override // com.google.android.gms.internal.cast.e6
    public final void d(Object obj, Object obj2) {
        f6.o(this.b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.cast.e6
    public final void e(Object obj, r5 r5Var) {
        this.c.getClass();
        a1.g.B(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.e6
    public final boolean f(Object obj) {
        this.c.getClass();
        a1.g.B(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.e6
    public final int g(q4 q4Var) {
        this.b.getClass();
        g6 g6Var = ((c5) q4Var).zzc;
        int i10 = g6Var.c;
        if (i10 != -1) {
            return i10;
        }
        g6Var.c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.e6
    public final c5 zzc() {
        q4 q4Var = this.a;
        return q4Var instanceof c5 ? (c5) ((c5) q4Var).h(4, null) : ((b5) ((c5) q4Var).h(5, null)).b();
    }
}
