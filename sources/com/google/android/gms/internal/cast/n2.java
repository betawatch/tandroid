package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n2 extends f5 {
    private static final n2 zzb;
    private int zzd;
    private boolean zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private z2 zzi;
    private int zzj;
    private boolean zzk;

    static {
        n2 n2Var = new n2();
        zzb = n2Var;
        f5.e(n2.class, n2Var);
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i9, f5 f5Var) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006᠌\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", a0.K, "zzg", a0.M, "zzh", a0.y, "zzi", "zzj", a0.L, "zzk"});
        }
        if (i10 == 3) {
            return new n2();
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
