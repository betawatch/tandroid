package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class k2 extends h5 {
    private static final k2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private k1 zzg;

    static {
        k2 k2Var = new k2();
        zzb = k2Var;
        h5.e(k2.class, k2Var);
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", b0.M, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new k2();
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
