package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class n3 extends v1 {
    private static final n3 zzb;
    private int zzd;
    private int zzf;
    private k3 zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private y1 zzg = w1.e;
    private z1 zzh = r2.e;

    static {
        n3 n3Var = new n3();
        zzb = n3Var;
        v1.k(n3.class, n3Var);
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final Object d(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new s2(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", d1.f, "zzg", d1.e, "zzh", y3.class, "zzi", "zzj", "zzk"});
        }
        if (i10 == 3) {
            return new n3();
        }
        if (i10 == 4) {
            return new y0(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
