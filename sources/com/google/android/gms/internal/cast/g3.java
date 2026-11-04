package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g3 extends c5 {
    private static final g3 zzb;
    private int zzd;
    private h5 zze;
    private h5 zzf;
    private l3 zzg;

    static {
        g3 g3Var = new g3();
        zzb = g3Var;
        c5.e(g3.class, g3Var);
    }

    public g3() {
        c6 c6Var = c6.d;
        this.zze = c6Var;
        this.zzf = c6Var;
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i3, c5 c5Var) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new d6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzd", "zze", o3.class, "zzf", g2.class, "zzg"});
        }
        if (i10 == 3) {
            return new g3();
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
