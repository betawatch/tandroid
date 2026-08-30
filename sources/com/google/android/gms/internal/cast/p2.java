package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class p2 extends e5 {
    private static final p2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private g5 zzg;
    private g5 zzh;
    private j5 zzi;
    private j5 zzj;
    private int zzk;

    static {
        p2 p2Var = new p2();
        zzb = p2Var;
        e5.e(p2.class, p2Var);
    }

    public p2() {
        f5 f5Var = f5.d;
        this.zzg = f5Var;
        this.zzh = f5Var;
        e6 e6Var = e6.d;
        this.zzi = e6Var;
        this.zzj = e6Var;
    }

    @Override // com.google.android.gms.internal.cast.e5
    public final Object h(int i10, e5 e5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new f6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001င\u0000\u0002᠌\u0001\u0003\u0016\u0004\u0016\u0005\u001a\u0006\u001a\u0007᠌\u0002", new Object[]{"zzd", "zze", "zzf", z.P, "zzg", "zzh", "zzi", "zzj", "zzk", z.L});
        }
        if (i11 == 3) {
            return new p2();
        }
        if (i11 == 4) {
            return new v0(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
