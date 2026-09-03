package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class y5 implements f6 {
    public final s4 a;
    public final i6 b;
    public final y4 c;

    public y5(i6 i6Var, y4 y4Var, s4 s4Var) {
        this.b = i6Var;
        this.c = y4Var;
        this.a = s4Var;
    }

    @Override // com.google.android.gms.internal.cast.f6
    public final void a(Object obj) {
        this.b.getClass();
        h6 h6Var = ((d5) obj).zzc;
        if (h6Var.d) {
            h6Var.d = false;
        }
        throw android.support.v4.media.a.j(obj);
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
        android.support.v4.media.a.v(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.f6
    public final boolean f(Object obj) {
        this.c.getClass();
        android.support.v4.media.a.v(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.f6
    public final int g(s4 s4Var) {
        this.b.getClass();
        h6 h6Var = ((d5) s4Var).zzc;
        int i10 = h6Var.c;
        if (i10 != -1) {
            return i10;
        }
        h6Var.c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.f6
    public final d5 zzc() {
        s4 s4Var = this.a;
        return s4Var instanceof d5 ? (d5) ((d5) s4Var).h(4, null) : ((c5) ((d5) s4Var).h(5, null)).b();
    }
}
