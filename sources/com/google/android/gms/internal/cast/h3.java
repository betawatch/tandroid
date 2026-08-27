package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h3 extends d5 {
    private static final h3 zzb;
    private int zzd;
    private i5 zze;
    private i5 zzf;
    private m3 zzg;

    static {
        h3 h3Var = new h3();
        zzb = h3Var;
        d5.e(h3.class, h3Var);
    }

    public h3() {
        d6 d6Var = d6.d;
        this.zze = d6Var;
        this.zzf = d6Var;
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzd", "zze", p3.class, "zzf", h2.class, "zzg"});
        }
        if (i11 == 3) {
            return new h3();
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
