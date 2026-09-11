package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class w3 extends h5 {
    private static final k5 zzb = new g1();
    private static final w3 zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzi;
    private long zzk;
    private j5 zzh = i5.d;
    private m5 zzj = h6.d;

    static {
        w3 w3Var = new w3();
        zzd = w3Var;
        h5.e(w3.class, w3Var);
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzd, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ࠞ\u0005᠌\u0002\u0006\u001b\u0007ဂ\u0003", new Object[]{"zze", "zzf", b1.B, "zzg", b0.O, "zzh", b1.A, "zzi", b0.I, "zzj", v3.class, "zzk"});
        }
        if (i11 == 3) {
            return new w3();
        }
        if (i11 == 4) {
            return new f3(zzd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
