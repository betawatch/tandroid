package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p2 extends f5 {
    private static final p2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private h5 zzg;
    private h5 zzh;
    private k5 zzi;
    private k5 zzj;
    private int zzk;

    static {
        p2 p2Var = new p2();
        zzb = p2Var;
        f5.e(p2.class, p2Var);
    }

    public p2() {
        g5 g5Var = g5.d;
        this.zzg = g5Var;
        this.zzh = g5Var;
        f6 f6Var = f6.d;
        this.zzi = f6Var;
        this.zzj = f6Var;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i9, f5 f5Var) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001င\u0000\u0002᠌\u0001\u0003\u0016\u0004\u0016\u0005\u001a\u0006\u001a\u0007᠌\u0002", new Object[]{"zzd", "zze", "zzf", a0.O, "zzg", "zzh", "zzi", "zzj", "zzk", a0.K});
        }
        if (i10 == 3) {
            return new p2();
        }
        if (i10 == 4) {
            return new v0(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
