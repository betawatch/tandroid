package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class t2 extends d5 {
    private static final t2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private q2 zzg;

    static {
        t2 t2Var = new t2();
        zzb = t2Var;
        d5.e(t2.class, t2Var);
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new t2();
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
