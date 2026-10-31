package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f2 extends d5 {
    private static final f2 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        f2 f2Var = new f2();
        zzb = f2Var;
        d5.e(f2.class, f2Var);
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", y.K, "zzf", y.J});
        }
        if (i11 == 3) {
            return new f2();
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
