package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class y5 implements f6 {
    public final r4 a;
    public final i6 b;
    public final y4 c;

    public y5(i6 i6Var, y4 y4Var, r4 r4Var) {
        this.b = i6Var;
        this.c = y4Var;
        this.a = r4Var;
    }

    @Override // com.google.android.gms.internal.cast.f6
    public final void a(Object obj) {
        this.b.getClass();
        h6 h6Var = ((d5) obj).zzc;
        if (h6Var.d) {
            h6Var.d = false;
        }
        throw a9.p.i(obj);
    }

    @Override // com.google.android.gms.internal.cast.f6
    public final int b(d5 d5Var) {
        this.b.getClass();
        d5Var.zzc.getClass();
        return 506991;
    }

    @Override // com.google.android.gms.internal.cast.f6
    public final boolean c(d5 d5Var, d5 d5Var2) {
        this.b.getClass();
        return d5Var.zzc.equals(d5Var2.zzc);
    }

    @Override // com.google.android.gms.internal.cast.f6
    public final void d(Object obj, Object obj2) {
        g6.o(this.b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.cast.f6
    public final void e(Object obj, s5 s5Var) {
        this.c.getClass();
        a9.p.t(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.f6
    public final boolean f(Object obj) {
        this.c.getClass();
        a9.p.t(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.f6
    public final int g(r4 r4Var) {
        this.b.getClass();
        h6 h6Var = ((d5) r4Var).zzc;
        int i10 = h6Var.c;
        if (i10 != -1) {
            return i10;
        }
        h6Var.c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.f6
    public final d5 zzc() {
        r4 r4Var = this.a;
        return r4Var instanceof d5 ? (d5) ((d5) r4Var).h(4, null) : ((c5) ((d5) r4Var).h(5, null)).b();
    }
}
