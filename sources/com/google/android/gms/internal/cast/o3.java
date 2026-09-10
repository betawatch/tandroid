package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class o3 extends h5 {
    private static final o3 zzb;
    private int zzd;
    private String zze = "";
    private m5 zzf;
    private m5 zzg;
    private boolean zzh;

    static {
        o3 o3Var = new o3();
        zzb = o3Var;
        h5.e(o3.class, o3Var);
    }

    public o3() {
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
            return new i6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzd", "zze", "zzf", t2.class, "zzg", m2.class, "zzh"});
        }
        if (i11 == 3) {
            return new o3();
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
