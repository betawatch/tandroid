package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class n1 extends d5 {
    private static final n1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        n1 n1Var = new n1();
        zzb = n1Var;
        d5.e(n1.class, n1Var);
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003᠌\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", y0.b, "zzh"});
        }
        if (i11 == 3) {
            return new n1();
        }
        if (i11 == 4) {
            return new u0(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
