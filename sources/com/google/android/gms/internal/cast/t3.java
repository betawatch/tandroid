package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t3 extends d5 {
    private static final g5 zzb = new d1();
    private static final t3 zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzi;
    private long zzk;
    private f5 zzh = e5.d;
    private i5 zzj = d6.d;

    static {
        t3 t3Var = new t3();
        zzd = t3Var;
        d5.e(t3.class, t3Var);
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzd, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ࠞ\u0005᠌\u0002\u0006\u001b\u0007ဂ\u0003", new Object[]{"zze", "zzf", y0.B, "zzg", z.K, "zzh", y0.A, "zzi", z.E, "zzj", s3.class, "zzk"});
        }
        if (i11 == 3) {
            return new t3();
        }
        if (i11 == 4) {
            return new c3(zzd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
