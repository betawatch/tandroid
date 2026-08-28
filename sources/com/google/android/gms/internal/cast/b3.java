package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b3 extends f5 {
    private static final b3 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    static {
        b3 b3Var = new b3();
        zzb = b3Var;
        f5.e(b3.class, b3Var);
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i9, f5 f5Var) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            z0 z0Var = z0.f;
            return new g6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", z0Var, "zzj", z0Var, "zzk"});
        }
        if (i10 == 3) {
            return new b3();
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
