package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class w3 extends u1 {
    private static final w3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private o3 zzg;
    private p3 zzh;

    static {
        w3 w3Var = new w3();
        zzb = w3Var;
        u1.k(w3.class, w3Var);
    }

    public static /* synthetic */ void n(w3 w3Var, f3 f3Var) {
        w3Var.zzf = f3Var;
        w3Var.zze = 2;
    }

    public static /* synthetic */ void o(w3 w3Var, h3 h3Var) {
        w3Var.zzf = h3Var;
        w3Var.zze = 3;
    }

    public static /* synthetic */ void p(w3 w3Var, k3 k3Var) {
        k3Var.getClass();
        w3Var.zzf = k3Var;
        w3Var.zze = 7;
    }

    public static /* synthetic */ void q(w3 w3Var, o3 o3Var) {
        o3Var.getClass();
        w3Var.zzg = o3Var;
        w3Var.zzd |= 1;
    }

    public static /* synthetic */ void r(w3 w3Var, z3 z3Var) {
        w3Var.zzf = z3Var;
        w3Var.zze = 8;
    }

    public static /* synthetic */ void s(w3 w3Var, a4 a4Var) {
        w3Var.zzf = a4Var;
        w3Var.zze = 4;
    }

    public static v3 t() {
        return (v3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.u1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r2(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", f3.class, h3.class, a4.class, m3.class, "zzh", k3.class, z3.class});
        }
        if (i11 == 3) {
            return new w3();
        }
        if (i11 == 4) {
            return new v3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
