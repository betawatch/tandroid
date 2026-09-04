package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class k3 extends h5 {
    private static final k3 zzb;
    private int zzd;
    private m5 zze;
    private m5 zzf;
    private p3 zzg;

    static {
        k3 k3Var = new k3();
        zzb = k3Var;
        h5.e(k3.class, k3Var);
    }

    public k3() {
        h6 h6Var = h6.d;
        this.zze = h6Var;
        this.zzf = h6Var;
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzd", "zze", s3.class, "zzf", k2.class, "zzg"});
        }
        if (i11 == 3) {
            return new k3();
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
