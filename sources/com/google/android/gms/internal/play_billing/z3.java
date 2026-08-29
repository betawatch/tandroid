package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class z3 extends u1 {
    private static final z3 zzb;
    private int zzd;
    private j3 zze;
    private long zzf;

    static {
        z3 z3Var = new z3();
        zzb = z3Var;
        u1.k(z3.class, z3Var);
    }

    public static /* synthetic */ void n(z3 z3Var, j3 j3Var) {
        z3Var.zze = j3Var;
        z3Var.zzd |= 1;
    }

    public static /* synthetic */ void o(z3 z3Var, long j10) {
        z3Var.zzd |= 2;
        z3Var.zzf = j10;
    }

    public static y3 p() {
        return (y3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.u1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new z3();
        }
        if (i11 == 4) {
            return new y3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
