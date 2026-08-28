package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k3 extends f5 {
    private static final k3 zzb;
    private int zzd;
    private k2 zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;
    private k5 zzk = f6.d;

    static {
        k3 k3Var = new k3();
        zzb = k3Var;
        f5.e(k3.class, k3Var);
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i9, f5 f5Var) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဂ\u0005\u0007\u001b", new Object[]{"zzd", "zze", "zzf", z0.m, "zzg", z0.l, "zzh", a0.K, "zzi", a0.A, "zzj", "zzk", k2.class});
        }
        if (i10 == 3) {
            return new k3();
        }
        if (i10 == 4) {
            return new d3(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
