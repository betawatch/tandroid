package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s2(zzb, "\u0004\u0000", null);
        }
        if (i11 == 3) {
            return new l3();
        }
        if (i11 == 4) {
            return new y0(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
