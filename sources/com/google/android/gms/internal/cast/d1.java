package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d1 extends c5 {
    private static final f5 zzb = new c1();
    private static final d1 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private e5 zzh = d5.d;

    static {
        d1 d1Var = new d1();
        zzd = d1Var;
        c5.e(d1.class, d1Var);
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i3, c5 c5Var) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new d6(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", x0.C});
        }
        if (i10 == 3) {
            return new d1();
        }
        if (i10 == 4) {
            return new t0(zzd);
        }
        if (i10 != 5) {
            return null;
        }
        return zzd;
    }
}
