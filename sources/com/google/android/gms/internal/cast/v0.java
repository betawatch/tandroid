package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v0 extends c5 {
    private static final v0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private u0 zzi;
    private int zzj;

    static {
        v0 v0Var = new v0();
        zzb = v0Var;
        c5.e(v0.class, v0Var);
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i3, c5 c5Var) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new d6(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004\u0006᠌\u0005", new Object[]{"zzd", "zze", "zzf", y.s, "zzg", "zzh", "zzi", "zzj", y.r});
        }
        if (i10 == 3) {
            return new v0();
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
