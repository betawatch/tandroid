package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h3 extends u1 {
    private static final h3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        h3 h3Var = new h3();
        zzb = h3Var;
        u1.k(h3.class, h3Var);
    }

    public static void o(h3 h3Var, l3 l3Var) {
        h3Var.zzh = l3Var.a;
        h3Var.zzd |= 2;
    }

    public static /* synthetic */ void p(h3 h3Var, u3 u3Var) {
        h3Var.zzf = u3Var;
        h3Var.zze = 4;
    }

    public static /* synthetic */ void q(h3 h3Var, c4 c4Var) {
        h3Var.zzf = c4Var;
        h3Var.zze = 3;
    }

    public static /* synthetic */ void r(h3 h3Var, int i10) {
        h3Var.zzg = i10 - 1;
        h3Var.zzd |= 1;
    }

    public static g3 s() {
        return (g3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.u1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r2(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", d1.c, q3.class, c4.class, u3.class, "zzh", d1.e});
        }
        if (i11 == 3) {
            return new h3();
        }
        if (i11 == 4) {
            return new g3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }

    public final u3 n() {
        return this.zze == 4 ? (u3) this.zzf : u3.o();
    }
}
