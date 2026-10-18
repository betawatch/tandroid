package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class p2 extends f5 {
    private static final p2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private h5 zzg;
    private h5 zzh;
    private k5 zzi;
    private k5 zzj;
    private int zzk;

    static {
        p2 p2Var = new p2();
        zzb = p2Var;
        f5.e(p2.class, p2Var);
    }

    public p2() {
        g5 g5Var = g5.d;
        this.zzg = g5Var;
        this.zzh = g5Var;
        g6 g6Var = g6.d;
        this.zzi = g6Var;
        this.zzj = g6Var;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001င\u0000\u0002᠌\u0001\u0003\u0016\u0004\u0016\u0005\u001a\u0006\u001a\u0007᠌\u0002", new Object[]{"zzd", "zze", "zzf", z.S, "zzg", "zzh", "zzi", "zzj", "zzk", z.O});
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
