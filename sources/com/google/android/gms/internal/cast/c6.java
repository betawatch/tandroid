package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class c6 implements j6 {
    public final v4 a;
    public final m6 b;
    public final c5 c;

    public c6(m6 m6Var, c5 c5Var, v4 v4Var) {
        this.b = m6Var;
        this.c = c5Var;
        this.a = v4Var;
    }

    @Override // com.google.android.gms.internal.cast.j6
    public final void a(Object obj) {
        this.b.getClass();
        l6 l6Var = ((h5) obj).zzc;
        if (l6Var.d) {
            l6Var.d = false;
        }
        throw a4.a.j(obj);
    }

    @Override // com.google.android.gms.internal.cast.j6
    public final int b(h5 h5Var) {
        this.b.getClass();
        h5Var.zzc.getClass();
        return 506991;
    }

    @Override // com.google.android.gms.internal.cast.j6
    public final boolean c(h5 h5Var, h5 h5Var2) {
        this.b.getClass();
        return h5Var.zzc.equals(h5Var2.zzc);
    }

    @Override // com.google.android.gms.internal.cast.j6
    public final void d(Object obj, Object obj2) {
        k6.o(this.b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.cast.j6
    public final void e(Object obj, w5 w5Var) {
        this.c.getClass();
        a4.a.y(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.j6
    public final boolean f(Object obj) {
        this.c.getClass();
        a4.a.y(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.j6
    public final int g(v4 v4Var) {
        this.b.getClass();
        l6 l6Var = ((h5) v4Var).zzc;
        int i10 = l6Var.c;
        if (i10 != -1) {
            return i10;
        }
        l6Var.c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.j6
    public final h5 zzc() {
        v4 v4Var = this.a;
        return v4Var instanceof h5 ? (h5) ((h5) v4Var).h(4, null) : ((g5) ((h5) v4Var).h(5, null)).b();
    }
}
