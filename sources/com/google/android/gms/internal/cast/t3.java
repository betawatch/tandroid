package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class t3 extends h5 {
    private static final t3 zzb;
    private int zzd;
    private int zze;
    private m5 zzf;
    private m5 zzg;
    private int zzh;

    static {
        t3 t3Var = new t3();
        zzb = t3Var;
        h5.e(t3.class, t3Var);
    }

    public t3() {
        h6 h6Var = h6.d;
        this.zzf = h6Var;
        this.zzg = h6Var;
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzd", "zze", b1.x, "zzf", g3.class, "zzg", g3.class, "zzh"});
        }
        if (i11 == 3) {
            return new t3();
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
