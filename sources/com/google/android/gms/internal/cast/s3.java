package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s3 extends c5 {
    private static final f5 zzb = new c1();
    private static final s3 zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzi;
    private long zzk;
    private e5 zzh = d5.d;
    private h5 zzj = c6.d;

    static {
        s3 s3Var = new s3();
        zzd = s3Var;
        c5.e(s3.class, s3Var);
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i3, c5 c5Var) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new d6(zzd, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ࠞ\u0005᠌\u0002\u0006\u001b\u0007ဂ\u0003", new Object[]{"zze", "zzf", x0.B, "zzg", y.P, "zzh", x0.A, "zzi", y.J, "zzj", r3.class, "zzk"});
        }
        if (i10 == 3) {
            return new s3();
        }
        if (i10 == 4) {
            return new b3(zzd);
        }
        if (i10 != 5) {
            return null;
        }
        return zzd;
    }
}
