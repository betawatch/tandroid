package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q3 extends c5 {
    private static final q3 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private h5 zzg;
    private h5 zzh;
    private int zzi;

    static {
        q3 q3Var = new q3();
        zzb = q3Var;
        c5.e(q3.class, q3Var);
    }

    public q3() {
        c6 c6Var = c6.d;
        this.zzg = c6Var;
        this.zzh = c6Var;
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i3, c5 c5Var) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new d6(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004\u001b\u0005᠌\u0002", new Object[]{"zzd", "zze", x0.y, "zzf", x0.z, "zzg", i2.class, "zzh", i2.class, "zzi", y.P});
        }
        if (i10 == 3) {
            return new q3();
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
