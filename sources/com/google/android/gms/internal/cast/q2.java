package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class q2 extends b5 {
    private static final q2 zzb;
    private int zzd;
    private g5 zze = b6.d;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        q2 q2Var = new q2();
        zzb = q2Var;
        b5.e(q2.class, q2Var);
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u0006ဂ\u0004", new Object[]{"zzd", "zze", l2.class, "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i10 == 3) {
            return new q2();
        }
        if (i10 == 4) {
            return new s0(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
