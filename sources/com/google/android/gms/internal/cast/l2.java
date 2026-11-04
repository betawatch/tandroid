package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l2 extends c5 {
    private static final l2 zzb;
    private int zzd;
    private boolean zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private x2 zzi;
    private int zzj;
    private boolean zzk;

    static {
        l2 l2Var = new l2();
        zzb = l2Var;
        c5.e(l2.class, l2Var);
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i3, c5 c5Var) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new d6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006᠌\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", y.P, "zzg", y.R, "zzh", y.E, "zzi", "zzj", y.Q, "zzk"});
        }
        if (i10 == 3) {
            return new l2();
        }
        if (i10 == 4) {
            return new t0(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
