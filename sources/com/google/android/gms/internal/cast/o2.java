package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class o2 extends d5 {
    private static final o2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private f5 zzg;
    private f5 zzh;
    private i5 zzi;
    private i5 zzj;
    private int zzk;

    static {
        o2 o2Var = new o2();
        zzb = o2Var;
        d5.e(o2.class, o2Var);
    }

    public o2() {
        e5 e5Var = e5.d;
        this.zzg = e5Var;
        this.zzh = e5Var;
        d6 d6Var = d6.d;
        this.zzi = d6Var;
        this.zzj = d6Var;
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001င\u0000\u0002᠌\u0001\u0003\u0016\u0004\u0016\u0005\u001a\u0006\u001a\u0007᠌\u0002", new Object[]{"zzd", "zze", "zzf", y.P, "zzg", "zzh", "zzi", "zzj", "zzk", y.L});
        }
        if (i11 == 3) {
            return new o2();
        }
        if (i11 == 4) {
            return new u0(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
