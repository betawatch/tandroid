package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class m3 extends v1 {
    private static final m3 zzb;

    static {
        m3 m3Var = new m3();
        zzb = m3Var;
        v1.k(m3.class, m3Var);
    }

    public static m3 n() {
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
            return new m3();
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
