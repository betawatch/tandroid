package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m3 extends d5 {
    private static final m3 zzb;
    private int zzd;
    private h1 zze;

    static {
        m3 m3Var = new m3();
        zzb = m3Var;
        d5.e(m3.class, m3Var);
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new m3();
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
