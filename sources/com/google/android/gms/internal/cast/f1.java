package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f1 extends f5 {
    private static final i5 zzb = new e1();
    private static final f1 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private h5 zzh = g5.d;

    static {
        f1 f1Var = new f1();
        zzd = f1Var;
        f5.e(f1.class, f1Var);
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i9, f5 f5Var) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", z0.C});
        }
        if (i10 == 3) {
            return new f1();
        }
        if (i10 == 4) {
            return new v0(zzd);
        }
        if (i10 != 5) {
            return null;
        }
        return zzd;
    }
}
