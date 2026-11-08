package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class w5 implements d6 {
    public final q4 a;
    public final g6 b;
    public final w4 c;

    public w5(g6 g6Var, w4 w4Var, q4 q4Var) {
        this.b = g6Var;
        this.c = w4Var;
        this.a = q4Var;
    }

    @Override // com.google.android.gms.internal.cast.d6
    public final void a(Object obj) {
        this.b.getClass();
        f6 f6Var = ((b5) obj).zzc;
        if (f6Var.d) {
            f6Var.d = false;
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.cast.d6
    public final int b(b5 b5Var) {
        this.b.getClass();
        b5Var.zzc.getClass();
        return 506991;
    }

    @Override // com.google.android.gms.internal.cast.d6
    public final boolean c(b5 b5Var, b5 b5Var2) {
        this.b.getClass();
        return b5Var.zzc.equals(b5Var2.zzc);
    }

    @Override // com.google.android.gms.internal.cast.d6
    public final void d(Object obj, Object obj2) {
        e6.o(this.b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.cast.d6
    public final void e(Object obj, q5 q5Var) {
        this.c.getClass();
        a8.p0.A(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.d6
    public final boolean f(Object obj) {
        this.c.getClass();
        a8.p0.A(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.d6
    public final int g(q4 q4Var) {
        this.b.getClass();
        f6 f6Var = ((b5) q4Var).zzc;
        int i7 = f6Var.c;
        if (i7 != -1) {
            return i7;
        }
        f6Var.c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.d6
    public final b5 zzc() {
        q4 q4Var = this.a;
        return q4Var instanceof b5 ? (b5) ((b5) q4Var).h(4, null) : ((a5) ((b5) q4Var).h(5, null)).b();
    }
}
