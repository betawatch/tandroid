package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class c3 extends h5 {
    private static final c3 zzb;
    private int zzd;
    private long zze;
    private l5 zzf;
    private l5 zzg;

    static {
        c3 c3Var = new c3();
        zzb = c3Var;
        h5.e(c3.class, c3Var);
    }

    public c3() {
        u5 u5Var = u5.d;
        this.zzf = u5Var;
        this.zzg = u5Var;
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new c3();
        }
        if (i11 == 4) {
            return new x0(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
