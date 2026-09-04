package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class r2 extends h5 {
    private static final r2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private j5 zzg;
    private j5 zzh;
    private m5 zzi;
    private m5 zzj;
    private int zzk;

    static {
        r2 r2Var = new r2();
        zzb = r2Var;
        h5.e(r2.class, r2Var);
    }

    public r2() {
        i5 i5Var = i5.d;
        this.zzg = i5Var;
        this.zzh = i5Var;
        h6 h6Var = h6.d;
        this.zzi = h6Var;
        this.zzj = h6Var;
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001င\u0000\u0002᠌\u0001\u0003\u0016\u0004\u0016\u0005\u001a\u0006\u001a\u0007᠌\u0002", new Object[]{"zzd", "zze", "zzf", b0.S, "zzg", "zzh", "zzi", "zzj", "zzk", b0.O});
        }
        if (i11 == 3) {
            return new r2();
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
