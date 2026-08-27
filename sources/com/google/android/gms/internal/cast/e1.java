package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e1 extends d5 {
    private static final g5 zzb = new d1();
    private static final e1 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private f5 zzh = e5.d;

    static {
        e1 e1Var = new e1();
        zzd = e1Var;
        d5.e(e1.class, e1Var);
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", y0.C});
        }
        if (i11 == 3) {
            return new e1();
        }
        if (i11 == 4) {
            return new u0(zzd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
