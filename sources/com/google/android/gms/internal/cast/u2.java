package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u2 extends c5 {
    private static final u2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        u2 u2Var = new u2();
        zzb = u2Var;
        c5.e(u2.class, u2Var);
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i3, c5 c5Var) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i10 == 2) {
            return new d6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", x0.c, "zzf", "zzg", c1.a});
        }
        if (i10 == 3) {
            return new u2();
        }
        if (i10 == 4) {
            return new t0(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        this.zzh = c5Var == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
