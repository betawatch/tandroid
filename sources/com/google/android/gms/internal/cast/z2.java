package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class z2 extends f5 {
    private static final z2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        z2 z2Var = new z2();
        zzb = z2Var;
        f5.e(z2.class, z2Var);
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i9, f5 f5Var) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005᠌\u0004\u0006ဆ\u0005", new Object[]{"zzd", "zze", "zzf", z0.e, "zzg", "zzh", "zzi", a0.H, "zzj"});
        }
        if (i10 == 3) {
            return new z2();
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
