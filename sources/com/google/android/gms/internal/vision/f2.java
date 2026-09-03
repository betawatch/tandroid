package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        android.support.v4.media.a.v(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.vision.n2
    public final void b(Object obj) {
        this.b.getClass();
        ((f1) obj).zzb.e = false;
        this.c.getClass();
        android.support.v4.media.a.v(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.vision.n2
    public final void c(Object obj, y1 y1Var) {
        this.c.getClass();
        android.support.v4.media.a.v(obj);
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
    public final void f(Object obj, byte[] bArr, int i10, int i11, com.google.android.gms.internal.clearcut.m mVar) {
        f1 f1Var = (f1) obj;
        if (f1Var.zzb == q2.f) {
            f1Var.zzb = q2.b();
        }
        throw android.support.v4.media.a.j(obj);
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
        int i10 = q2Var.d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < q2Var.a; i12++) {
            int i13 = q2Var.b[i12] >>> 3;
            q0 q0Var = (q0) q2Var.c[i12];
            i11 += r0.J(3, q0Var) + r0.S(2, i13) + (r0.T(8) << 1);
        }
        q2Var.d = i11;
        return i11;
    }
}
