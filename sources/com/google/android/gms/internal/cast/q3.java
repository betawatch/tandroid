package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q3 extends d5 {
    private static final q3 zzb;
    private int zzd;
    private int zze;
    private i5 zzf;
    private i5 zzg;
    private int zzh;

    static {
        q3 q3Var = new q3();
        zzb = q3Var;
        d5.e(q3.class, q3Var);
    }

    public q3() {
        d6 d6Var = d6.d;
        this.zzf = d6Var;
        this.zzg = d6Var;
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzd", "zze", y0.x, "zzf", d3.class, "zzg", d3.class, "zzh"});
        }
        if (i11 == 3) {
            return new q3();
        }
        if (i11 == 4) {
            return new c3(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
