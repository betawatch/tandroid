package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class n1 extends b5 {
    private static final n1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;

    static {
        n1 n1Var = new n1();
        zzb = n1Var;
        b5.e(n1.class, n1Var);
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", w0.k, "zzf", w0.i, "zzg", w0.j, "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new n1();
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
