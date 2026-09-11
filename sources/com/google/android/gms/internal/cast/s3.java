package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class s3 extends h5 {
    private static final s3 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private k1 zzg;

    static {
        s3 s3Var = new s3();
        zzb = s3Var;
        h5.e(s3.class, s3Var);
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", b1.q, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new s3();
        }
        if (i11 == 4) {
            return new f3(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
