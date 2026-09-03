package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class o1 extends d5 {
    private static final o1 zzb;
    private int zzd;
    private int zze;

    static {
        o1 o1Var = new o1();
        zzb = o1Var;
        d5.e(o1.class, o1Var);
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", y.C});
        }
        if (i11 == 3) {
            return new o1();
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
