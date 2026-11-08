package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class g3 extends b5 {
    private static final g3 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        g3 g3Var = new g3();
        zzb = g3Var;
        b5.e(g3.class, g3Var);
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            w0 w0Var = w0.k;
            return new c6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", w0Var, "zzf", w0Var});
        }
        if (i10 == 3) {
            return new g3();
        }
        if (i10 == 4) {
            return new a3(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
