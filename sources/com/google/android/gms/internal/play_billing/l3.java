package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class l3 extends v1 {
    private static final l3 zzb;

    static {
        l3 l3Var = new l3();
        zzb = l3Var;
        v1.k(l3.class, l3Var);
    }

    public static l3 n() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final Object d(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new s2(zzb, "\u0004\u0000", null);
        }
        if (i10 == 3) {
            return new l3();
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
