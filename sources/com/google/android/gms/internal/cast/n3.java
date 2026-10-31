package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n3 extends d5 {
    private static final n3 zzb;
    private int zzd;
    private long zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;

    static {
        n3 n3Var = new n3();
        zzb = n3Var;
        d5.e(n3.class, n3Var);
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new n3();
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
