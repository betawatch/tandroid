package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q2 extends f5 {
    private static final q2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private h5 zzg;
    private h5 zzh;
    private k5 zzi;
    private k5 zzj;
    private int zzk;

    static {
        q2 q2Var = new q2();
        zzb = q2Var;
        f5.e(q2.class, q2Var);
    }

    public q2() {
        g5 g5Var = g5.d;
        this.zzg = g5Var;
        this.zzh = g5Var;
        f6 f6Var = f6.d;
        this.zzi = f6Var;
        this.zzj = f6Var;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new g6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001င\u0000\u0002᠌\u0001\u0003\u0016\u0004\u0016\u0005\u001a\u0006\u001a\u0007᠌\u0002", new Object[]{"zzd", "zze", "zzf", a0.O, "zzg", "zzh", "zzi", "zzj", "zzk", a0.K});
        }
        if (i11 == 3) {
            return new q2();
        }
        if (i11 == 4) {
            return new w0(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
