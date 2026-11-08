package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c1 extends b5 {
    private static final e5 zzb = new b1();
    private static final c1 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private d5 zzh = c5.d;

    static {
        c1 c1Var = new c1();
        zzd = c1Var;
        b5.e(c1.class, c1Var);
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", w0.C});
        }
        if (i10 == 3) {
            return new c1();
        }
        if (i10 == 4) {
            return new s0(zzd);
        }
        if (i10 != 5) {
            return null;
        }
        return zzd;
    }
}
