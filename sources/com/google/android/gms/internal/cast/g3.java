package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class g3 extends e5 {
    private static final g3 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        g3 g3Var = new g3();
        zzb = g3Var;
        e5.e(g3.class, g3Var);
    }

    @Override // com.google.android.gms.internal.cast.e5
    public final Object h(int i10, e5 e5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new f6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", z0.h, "zzg"});
        }
        if (i11 == 3) {
            return new g3();
        }
        if (i11 == 4) {
            return new d3(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
