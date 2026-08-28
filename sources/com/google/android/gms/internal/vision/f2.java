package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f2 implements n2 {
    public final l0 a;
    public final p2 b;
    public final v0 c;

    public f2(p2 p2Var, v0 v0Var, l0 l0Var) {
        this.b = p2Var;
        v0Var.getClass();
        this.c = v0Var;
        this.a = l0Var;
    }

    @Override // com.google.android.gms.internal.vision.n2
    public final boolean a(Object obj) {
        this.c.getClass();
        aa.d.v(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.vision.n2
    public final void b(Object obj) {
        this.b.getClass();
        ((f1) obj).zzb.e = false;
        this.c.getClass();
        aa.d.v(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.vision.n2
    public final void c(Object obj, y1 y1Var) {
        this.c.getClass();
        aa.d.v(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.vision.n2
    public final int d(f1 f1Var) {
        this.b.getClass();
        return f1Var.zzb.hashCode();
    }

    @Override // com.google.android.gms.internal.vision.n2
    public final void e(f1 f1Var, f1 f1Var2) {
        o2.h(this.b, f1Var, f1Var2);
    }

    @Override // com.google.android.gms.internal.vision.n2
    public final void f(Object obj, byte[] bArr, int i9, int i10, com.google.android.gms.internal.clearcut.m mVar) {
        f1 f1Var = (f1) obj;
        if (f1Var.zzb == q2.f) {
            f1Var.zzb = q2.b();
        }
        throw aa.d.j(obj);
    }

    @Override // com.google.android.gms.internal.vision.n2
    public final boolean g(f1 f1Var, f1 f1Var2) {
        this.b.getClass();
        return f1Var.zzb.equals(f1Var2.zzb);
    }

    @Override // com.google.android.gms.internal.vision.n2
    public final Object zza() {
        return ((d1) ((f1) this.a).e(5)).e();
    }

    @Override // com.google.android.gms.internal.vision.n2
    public final int zzb(Object obj) {
        this.b.getClass();
        q2 q2Var = ((f1) obj).zzb;
        int i9 = q2Var.d;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < q2Var.a; i11++) {
            int i12 = q2Var.b[i11] >>> 3;
            q0 q0Var = (q0) q2Var.c[i11];
            i10 += r0.J(3, q0Var) + r0.S(2, i12) + (r0.T(8) << 1);
        }
        q2Var.d = i10;
        return i10;
    }
}
