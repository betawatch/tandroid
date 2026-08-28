package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a6 implements h6 {
    public final t4 a;
    public final k6 b;
    public final a5 c;

    public a6(k6 k6Var, a5 a5Var, t4 t4Var) {
        this.b = k6Var;
        this.c = a5Var;
        this.a = t4Var;
    }

    @Override // com.google.android.gms.internal.cast.h6
    public final void a(Object obj) {
        this.b.getClass();
        j6 j6Var = ((f5) obj).zzc;
        if (j6Var.d) {
            j6Var.d = false;
        }
        throw aa.d.j(obj);
    }

    @Override // com.google.android.gms.internal.cast.h6
    public final int b(f5 f5Var) {
        this.b.getClass();
        f5Var.zzc.getClass();
        return 506991;
    }

    @Override // com.google.android.gms.internal.cast.h6
    public final boolean c(f5 f5Var, f5 f5Var2) {
        this.b.getClass();
        return f5Var.zzc.equals(f5Var2.zzc);
    }

    @Override // com.google.android.gms.internal.cast.h6
    public final void d(Object obj, Object obj2) {
        i6.o(this.b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.cast.h6
    public final void e(Object obj, u5 u5Var) {
        this.c.getClass();
        aa.d.v(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.h6
    public final boolean f(Object obj) {
        this.c.getClass();
        aa.d.v(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.h6
    public final int g(t4 t4Var) {
        this.b.getClass();
        j6 j6Var = ((f5) t4Var).zzc;
        int i9 = j6Var.c;
        if (i9 != -1) {
            return i9;
        }
        j6Var.c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.h6
    public final f5 zzc() {
        t4 t4Var = this.a;
        return t4Var instanceof f5 ? (f5) ((f5) t4Var).h(4, null) : ((e5) ((f5) t4Var).h(5, null)).b();
    }
}
