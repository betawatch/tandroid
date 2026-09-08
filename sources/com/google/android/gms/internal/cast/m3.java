package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class m3 extends h5 {
    private static final m3 zzb;
    private int zzd;
    private m2 zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;
    private m5 zzk = h6.d;

    static {
        m3 m3Var = new m3();
        zzb = m3Var;
        h5.e(m3.class, m3Var);
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဂ\u0005\u0007\u001b", new Object[]{"zzd", "zze", "zzf", b1.m, "zzg", b1.l, "zzh", b0.O, "zzi", b0.E, "zzj", "zzk", m2.class});
        }
        if (i11 == 3) {
            return new m3();
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
