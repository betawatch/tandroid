package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c1 extends v1 {
    private static final c1 zzb;
    private int zzd;
    private String zze = "";

    static {
        c1 c1Var = new c1();
        zzb = c1Var;
        v1.k(c1.class, c1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final Object d(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new s2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new c1();
        }
        if (i10 == 4) {
            return new y0(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
