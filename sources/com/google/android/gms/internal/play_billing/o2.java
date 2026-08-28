package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o2 implements t2 {
    public final e1 a;
    public final t1 b;

    public o2(t1 t1Var, e1 e1Var) {
        t1 t1Var2 = p1.a;
        this.b = t1Var;
        this.a = e1Var;
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final int a(v1 v1Var) {
        return v1Var.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final boolean b(Object obj) {
        throw aa.d.j(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final void c(Object obj, i2 i2Var) {
        throw aa.d.j(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final int d(e1 e1Var) {
        x2 x2Var = ((v1) e1Var).zzc;
        int i9 = x2Var.d;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < x2Var.a; i11++) {
            int i12 = x2Var.b[i11] >>> 3;
            l1 l1Var = (l1) x2Var.c[i11];
            int b10 = m1.b(8);
            int b11 = m1.b(i12) + m1.b(16);
            int b12 = m1.b(24);
            int o6 = l1Var.o();
            i10 += b10 + b10 + b11 + m1.b(o6) + o6 + b12;
        }
        x2Var.d = i10;
        return i10;
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final void e(Object obj, byte[] bArr, int i9, int i10, h1 h1Var) {
        v1 v1Var = (v1) obj;
        if (v1Var.zzc == x2.f) {
            v1Var.zzc = x2.b();
        }
        throw aa.d.j(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final boolean f(v1 v1Var, v1 v1Var2) {
        return v1Var.zzc.equals(v1Var2.zzc);
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final v1 zze() {
        e1 e1Var = this.a;
        return e1Var instanceof v1 ? (v1) ((v1) e1Var).d(4) : ((u1) ((v1) e1Var).d(5)).b();
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final void zzf(Object obj) {
        this.b.getClass();
        x2 x2Var = ((v1) obj).zzc;
        if (x2Var.e) {
            x2Var.e = false;
        }
        t1 t1Var = p1.a;
        throw aa.d.j(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.t2
    public final void zzg(Object obj, Object obj2) {
        u2.p(obj, obj2);
    }
}
