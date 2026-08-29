package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g1 extends f5 {
    private static final i5 zzb = new f1();
    private static final g1 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private h5 zzh = g5.d;

    static {
        g1 g1Var = new g1();
        zzd = g1Var;
        f5.e(g1.class, g1Var);
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new g6(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", a1.C});
        }
        if (i11 == 3) {
            return new g1();
        }
        if (i11 == 4) {
            return new w0(zzd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
