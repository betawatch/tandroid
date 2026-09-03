package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class o2 extends e5 {
    private static final h5 zzb = new e1();
    private static final o2 zzd;
    private int zze;
    private boolean zzg;
    private boolean zzh;
    private u3 zzi;
    private boolean zzj;
    private long zzl;
    private long zzm;
    private String zzf = "";
    private g5 zzk = f5.d;

    static {
        o2 o2Var = new o2();
        zzd = o2Var;
        e5.e(o2.class, o2Var);
    }

    @Override // com.google.android.gms.internal.cast.e5
    public final Object h(int i10, e5 e5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new f6(zzd, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0004ဇ\u0004\u0005ࠬ\u0006ဇ\u0002\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zze", "zzf", "zzg", "zzi", "zzj", "zzk", z0.A, "zzh", "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new o2();
        }
        if (i11 == 4) {
            return new v0(zzd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
