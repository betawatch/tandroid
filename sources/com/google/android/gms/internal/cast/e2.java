package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class e2 extends b5 {
    private static final e2 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private long zzg;

    static {
        e2 e2Var = new e2();
        zzb = e2Var;
        b5.e(e2.class, e2Var);
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001စ\u0000\u0002:\u0000\u00035\u0000\u00048\u0000", new Object[]{"zzf", "zze", "zzd", "zzg"});
        }
        if (i10 == 3) {
            return new e2();
        }
        if (i10 == 4) {
            return new s0(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
