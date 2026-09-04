package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class g2 implements o2 {
    public final l0 a;
    public final q2 b;
    public final v0 c;

    public g2(q2 q2Var, v0 v0Var, l0 l0Var) {
        this.b = q2Var;
        v0Var.getClass();
        this.c = v0Var;
        this.a = l0Var;
    }

    @Override // com.google.android.gms.internal.vision.o2
    public final boolean a(Object obj) {
        this.c.getClass();
        a4.a.y(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.vision.o2
    public final void b(Object obj) {
        this.b.getClass();
        ((f1) obj).zzb.e = false;
        this.c.getClass();
        a4.a.y(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.vision.o2
    public final void c(Object obj, y1 y1Var) {
        this.c.getClass();
        a4.a.y(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.vision.o2
    public final int d(f1 f1Var) {
        this.b.getClass();
        return f1Var.zzb.hashCode();
    }

    @Override // com.google.android.gms.internal.vision.o2
    public final void e(f1 f1Var, f1 f1Var2) {
        p2.h(this.b, f1Var, f1Var2);
    }

    @Override // com.google.android.gms.internal.vision.o2
    public final void f(Object obj, byte[] bArr, int i10, int i11, com.google.android.gms.internal.clearcut.l lVar) {
        f1 f1Var = (f1) obj;
        if (f1Var.zzb == r2.f) {
            f1Var.zzb = r2.b();
        }
        throw a4.a.j(obj);
    }

    @Override // com.google.android.gms.internal.vision.o2
    public final boolean g(f1 f1Var, f1 f1Var2) {
        this.b.getClass();
        return f1Var.zzb.equals(f1Var2.zzb);
    }

    @Override // com.google.android.gms.internal.vision.o2
    public final Object zza() {
        return ((d1) ((f1) this.a).e(5)).e();
    }

    @Override // com.google.android.gms.internal.vision.o2
    public final int zzb(Object obj) {
        this.b.getClass();
        r2 r2Var = ((f1) obj).zzb;
        int i10 = r2Var.d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < r2Var.a; i12++) {
            int i13 = r2Var.b[i12] >>> 3;
            q0 q0Var = (q0) r2Var.c[i12];
            i11 += r0.J(3, q0Var) + r0.S(2, i13) + (r0.T(8) << 1);
        }
        r2Var.d = i11;
        return i11;
    }
}
