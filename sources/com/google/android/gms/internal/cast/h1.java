package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h1 extends c5 {
    private static final h1 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private h5 zzi;
    private h5 zzj;
    private String zzk;

    static {
        h1 h1Var = new h1();
        zzb = h1Var;
        c5.e(h1.class, h1Var);
    }

    public h1() {
        c6 c6Var = c6.d;
        this.zzi = c6Var;
        this.zzj = c6Var;
        this.zzk = "";
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i3, c5 c5Var) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new d6(zzb, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzd", "zze", y.w, "zzf", "zzg", y.P, "zzh", "zzi", c3.class, "zzj", c3.class, "zzk"});
        }
        if (i10 == 3) {
            return new h1();
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
