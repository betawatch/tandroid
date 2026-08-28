package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u3 extends f5 {
    private static final i5 zzb = new e1();
    private static final u3 zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzi;
    private long zzk;
    private h5 zzh = g5.d;
    private k5 zzj = f6.d;

    static {
        u3 u3Var = new u3();
        zzd = u3Var;
        f5.e(u3.class, u3Var);
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i9, f5 f5Var) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzd, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ࠞ\u0005᠌\u0002\u0006\u001b\u0007ဂ\u0003", new Object[]{"zze", "zzf", z0.B, "zzg", a0.K, "zzh", z0.A, "zzi", a0.E, "zzj", t3.class, "zzk"});
        }
        if (i10 == 3) {
            return new u3();
        }
        if (i10 == 4) {
            return new d3(zzd);
        }
        if (i10 != 5) {
            return null;
        }
        return zzd;
    }
}
