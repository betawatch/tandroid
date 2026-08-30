package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class z5 implements g6 {
    public final t4 a;
    public final j6 b;
    public final z4 c;

    public z5(j6 j6Var, z4 z4Var, t4 t4Var) {
        this.b = j6Var;
        this.c = z4Var;
        this.a = t4Var;
    }

    @Override // com.google.android.gms.internal.cast.g6
    public final void a(Object obj) {
        this.b.getClass();
        i6 i6Var = ((e5) obj).zzc;
        if (i6Var.d) {
            i6Var.d = false;
        }
        throw android.support.v4.media.a.j(obj);
    }

    @Override // com.google.android.gms.internal.cast.g6
    public final int b(e5 e5Var) {
        this.b.getClass();
        e5Var.zzc.getClass();
        return 506991;
    }

    @Override // com.google.android.gms.internal.cast.g6
    public final boolean c(e5 e5Var, e5 e5Var2) {
        this.b.getClass();
        return e5Var.zzc.equals(e5Var2.zzc);
    }

    @Override // com.google.android.gms.internal.cast.g6
    public final void d(Object obj, Object obj2) {
        h6.o(this.b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.cast.g6
    public final void e(Object obj, t5 t5Var) {
        this.c.getClass();
        android.support.v4.media.a.v(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.g6
    public final boolean f(Object obj) {
        this.c.getClass();
        android.support.v4.media.a.v(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.g6
    public final int g(t4 t4Var) {
        this.b.getClass();
        i6 i6Var = ((e5) t4Var).zzc;
        int i10 = i6Var.c;
        if (i10 != -1) {
            return i10;
        }
        i6Var.c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.g6
    public final e5 zzc() {
        t4 t4Var = this.a;
        return t4Var instanceof e5 ? (e5) ((e5) t4Var).h(4, null) : ((d5) ((e5) t4Var).h(5, null)).b();
    }
}
