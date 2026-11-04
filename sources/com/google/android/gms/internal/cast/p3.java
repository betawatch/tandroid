package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p3 extends c5 {
    private static final p3 zzb;
    private int zzd;
    private int zze;
    private h5 zzf;
    private h5 zzg;
    private int zzh;

    static {
        p3 p3Var = new p3();
        zzb = p3Var;
        c5.e(p3.class, p3Var);
    }

    public p3() {
        c6 c6Var = c6.d;
        this.zzf = c6Var;
        this.zzg = c6Var;
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i3, c5 c5Var) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new d6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzd", "zze", x0.x, "zzf", c3.class, "zzg", c3.class, "zzh"});
        }
        if (i10 == 3) {
            return new p3();
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
