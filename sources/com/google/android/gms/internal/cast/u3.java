package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u3 extends c5 {
    private static final u3 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        u3 u3Var = new u3();
        zzb = u3Var;
        c5.e(u3.class, u3Var);
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i3, c5 c5Var) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new d6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002", new Object[]{"zzd", "zze", x0.D, "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new u3();
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
