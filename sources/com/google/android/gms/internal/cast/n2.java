package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n2 extends c5 {
    private static final n2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private e5 zzg;
    private e5 zzh;
    private h5 zzi;
    private h5 zzj;
    private int zzk;

    static {
        n2 n2Var = new n2();
        zzb = n2Var;
        c5.e(n2.class, n2Var);
    }

    public n2() {
        d5 d5Var = d5.d;
        this.zzg = d5Var;
        this.zzh = d5Var;
        c6 c6Var = c6.d;
        this.zzi = c6Var;
        this.zzj = c6Var;
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i3, c5 c5Var) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new d6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001င\u0000\u0002᠌\u0001\u0003\u0016\u0004\u0016\u0005\u001a\u0006\u001a\u0007᠌\u0002", new Object[]{"zzd", "zze", "zzf", y.T, "zzg", "zzh", "zzi", "zzj", "zzk", y.P});
        }
        if (i10 == 3) {
            return new n2();
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
