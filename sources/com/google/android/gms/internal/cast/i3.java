package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i3 extends c5 {
    private static final i3 zzb;
    private int zzd;
    private i2 zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;
    private h5 zzk = c6.d;

    static {
        i3 i3Var = new i3();
        zzb = i3Var;
        c5.e(i3.class, i3Var);
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i3, c5 c5Var) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new d6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဂ\u0005\u0007\u001b", new Object[]{"zzd", "zze", "zzf", x0.m, "zzg", x0.l, "zzh", y.P, "zzi", y.F, "zzj", "zzk", i2.class});
        }
        if (i10 == 3) {
            return new i3();
        }
        if (i10 == 4) {
            return new b3(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
