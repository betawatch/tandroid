package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n2 implements s2 {
    public final e1 a;
    public final s1 b;

    public n2(s1 s1Var, e1 e1Var) {
        s1 s1Var2 = o1.a;
        this.b = s1Var;
        this.a = e1Var;
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final void a(Object obj, byte[] bArr, int i10, int i11, cg.w0 w0Var) {
        u1 u1Var = (u1) obj;
        if (u1Var.zzc == w2.f) {
            u1Var.zzc = w2.b();
        }
        throw a4.w.j(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final int b(u1 u1Var) {
        return u1Var.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final boolean c(Object obj) {
        throw a4.w.j(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final void d(Object obj, h2 h2Var) {
        throw a4.w.j(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final int e(e1 e1Var) {
        w2 w2Var = ((u1) e1Var).zzc;
        int i10 = w2Var.d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < w2Var.a; i12++) {
            int i13 = w2Var.b[i12] >>> 3;
            k1 k1Var = (k1) w2Var.c[i12];
            int b10 = l1.b(8);
            int b11 = l1.b(i13) + l1.b(16);
            int b12 = l1.b(24);
            int o10 = k1Var.o();
            i11 += b10 + b10 + b11 + l1.b(o10) + o10 + b12;
        }
        w2Var.d = i11;
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final boolean f(u1 u1Var, u1 u1Var2) {
        return u1Var.zzc.equals(u1Var2.zzc);
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final u1 zze() {
        e1 e1Var = this.a;
        return e1Var instanceof u1 ? (u1) ((u1) e1Var).d(4) : ((t1) ((u1) e1Var).d(5)).b();
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final void zzf(Object obj) {
        this.b.getClass();
        w2 w2Var = ((u1) obj).zzc;
        if (w2Var.e) {
            w2Var.e = false;
        }
        s1 s1Var = o1.a;
        throw a4.w.j(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final void zzg(Object obj, Object obj2) {
        t2.p(obj, obj2);
    }
}
