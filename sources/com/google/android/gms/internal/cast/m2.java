package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class m2 extends c5 {
    private static final m2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private e5 zzg;
    private e5 zzh;
    private h5 zzi;
    private h5 zzj;
    private int zzk;

    static {
        m2 m2Var = new m2();
        zzb = m2Var;
        c5.e(m2.class, m2Var);
    }

    public m2() {
        d5 d5Var = d5.d;
        this.zzg = d5Var;
        this.zzh = d5Var;
        c6 c6Var = c6.d;
        this.zzi = c6Var;
        this.zzj = c6Var;
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i10, c5 c5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new d6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001င\u0000\u0002᠌\u0001\u0003\u0016\u0004\u0016\u0005\u001a\u0006\u001a\u0007᠌\u0002", new Object[]{"zzd", "zze", "zzf", x.S, "zzg", "zzh", "zzi", "zzj", "zzk", x.O});
        }
        if (i11 == 3) {
            return new m2();
        }
        if (i11 == 4) {
            return new s0(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
