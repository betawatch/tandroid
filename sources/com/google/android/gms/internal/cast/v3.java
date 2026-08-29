package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class v3 extends f5 {
    private static final i5 zzb = new f1();
    private static final v3 zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzi;
    private long zzk;
    private h5 zzh = g5.d;
    private k5 zzj = f6.d;

    static {
        v3 v3Var = new v3();
        zzd = v3Var;
        f5.e(v3.class, v3Var);
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new g6(zzd, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ࠞ\u0005᠌\u0002\u0006\u001b\u0007ဂ\u0003", new Object[]{"zze", "zzf", a1.B, "zzg", a0.K, "zzh", a1.A, "zzi", a0.E, "zzj", u3.class, "zzk"});
        }
        if (i11 == 3) {
            return new v3();
        }
        if (i11 == 4) {
            return new e3(zzd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
