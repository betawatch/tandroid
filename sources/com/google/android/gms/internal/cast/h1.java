package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class h1 extends h5 {
    private static final k5 zzb = new g1();
    private static final h1 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private j5 zzh = i5.d;

    static {
        h1 h1Var = new h1();
        zzd = h1Var;
        h5.e(h1.class, h1Var);
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", b1.C});
        }
        if (i11 == 3) {
            return new h1();
        }
        if (i11 == 4) {
            return new x0(zzd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
