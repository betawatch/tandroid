package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class b6 implements i6 {
    public final t4 a;
    public final l6 b;
    public final a5 c;

    public b6(l6 l6Var, a5 a5Var, t4 t4Var) {
        this.b = l6Var;
        this.c = a5Var;
        this.a = t4Var;
    }

    @Override // com.google.android.gms.internal.cast.i6
    public final void a(Object obj) {
        this.b.getClass();
        k6 k6Var = ((f5) obj).zzc;
        if (k6Var.d) {
            k6Var.d = false;
        }
        throw a1.g.i(obj);
    }

    @Override // com.google.android.gms.internal.cast.i6
    public final int b(f5 f5Var) {
        this.b.getClass();
        f5Var.zzc.getClass();
        return 506991;
    }

    @Override // com.google.android.gms.internal.cast.i6
    public final boolean c(f5 f5Var, f5 f5Var2) {
        this.b.getClass();
        return f5Var.zzc.equals(f5Var2.zzc);
    }

    @Override // com.google.android.gms.internal.cast.i6
    public final void d(Object obj, Object obj2) {
        j6.o(this.b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.cast.i6
    public final void e(Object obj, u5 u5Var) {
        this.c.getClass();
        a1.g.z(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.i6
    public final boolean f(Object obj) {
        this.c.getClass();
        a1.g.z(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.i6
    public final int g(t4 t4Var) {
        this.b.getClass();
        k6 k6Var = ((f5) t4Var).zzc;
        int i10 = k6Var.c;
        if (i10 != -1) {
            return i10;
        }
        k6Var.c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.i6
    public final f5 zzc() {
        t4 t4Var = this.a;
        return t4Var instanceof f5 ? (f5) ((f5) t4Var).h(4, null) : ((e5) ((f5) t4Var).h(5, null)).b();
    }
}
