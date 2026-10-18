package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class n3 extends f5 {
    private static final n3 zzb;
    private int zzd;
    private i1 zze;

    static {
        n3 n3Var = new n3();
        zzb = n3Var;
        f5.e(n3.class, n3Var);
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new n3();
        }
        if (i11 == 4) {
            return new d3(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
