package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class l3 extends d5 {
    private static final l3 zzb;
    private int zzd;
    private String zze = "";
    private i5 zzf;
    private i5 zzg;
    private boolean zzh;

    static {
        l3 l3Var = new l3();
        zzb = l3Var;
        d5.e(l3.class, l3Var);
    }

    public l3() {
        d6 d6Var = d6.d;
        this.zzf = d6Var;
        this.zzg = d6Var;
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzd", "zze", "zzf", q2.class, "zzg", j2.class, "zzh"});
        }
        if (i11 == 3) {
            return new l3();
        }
        if (i11 == 4) {
            return new c3(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
