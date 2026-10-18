package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class o3 extends v1 {
    private static final o3 zzb;
    private int zzd;
    private int zzf;
    private l3 zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private y1 zzg = w1.e;
    private z1 zzh = r2.e;

    static {
        o3 o3Var = new o3();
        zzb = o3Var;
        v1.k(o3.class, o3Var);
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s2(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", d1.f, "zzg", d1.e, "zzh", z3.class, "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new o3();
        }
        if (i11 == 4) {
            return new y0(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
