package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k3 extends u1 {
    private static final k3 zzb;

    static {
        k3 k3Var = new k3();
        zzb = k3Var;
        u1.k(k3.class, k3Var);
    }

    public static k3 n() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.u1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r2(zzb, "\u0004\u0000", null);
        }
        if (i11 == 3) {
            return new k3();
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
