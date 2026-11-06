package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class h3 extends b5 {
    private static final h3 zzb;
    private int zzd;
    private h2 zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;
    private g5 zzk = b6.d;

    static {
        h3 h3Var = new h3();
        zzb = h3Var;
        b5.e(h3.class, h3Var);
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဂ\u0005\u0007\u001b", new Object[]{"zzd", "zze", "zzf", w0.m, "zzg", w0.l, "zzh", x.O, "zzi", x.E, "zzj", "zzk", h2.class});
        }
        if (i10 == 3) {
            return new h3();
        }
        if (i10 == 4) {
            return new a3(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
