package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class u3 extends e5 {
    private static final h5 zzb = new e1();
    private static final u3 zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzi;
    private long zzk;
    private g5 zzh = f5.d;
    private j5 zzj = e6.d;

    static {
        u3 u3Var = new u3();
        zzd = u3Var;
        e5.e(u3.class, u3Var);
    }

    @Override // com.google.android.gms.internal.cast.e5
    public final Object h(int i10, e5 e5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new f6(zzd, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ࠞ\u0005᠌\u0002\u0006\u001b\u0007ဂ\u0003", new Object[]{"zze", "zzf", z0.B, "zzg", z.L, "zzh", z0.A, "zzi", z.F, "zzj", t3.class, "zzk"});
        }
        if (i11 == 3) {
            return new u3();
        }
        if (i11 == 4) {
            return new d3(zzd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
