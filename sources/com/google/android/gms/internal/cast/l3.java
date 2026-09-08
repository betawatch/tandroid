package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class l3 extends h5 {
    private static final l3 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        l3 l3Var = new l3();
        zzb = l3Var;
        h5.e(l3.class, l3Var);
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            b1 b1Var = b1.k;
            return new i6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", b1Var, "zzf", b1Var});
        }
        if (i11 == 3) {
            return new l3();
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
