package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class h1 extends d5 {
    private static final h1 zzb;
    private int zzd;
    private int zze;
    private double zzf;
    private double zzg;
    private double zzh;
    private double zzi;

    static {
        h1 h1Var = new h1();
        zzb = h1Var;
        d5.e(h1.class, h1Var);
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003\u0005က\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new h1();
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
