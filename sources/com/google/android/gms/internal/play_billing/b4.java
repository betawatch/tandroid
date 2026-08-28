package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b4 extends v1 {
    private static final b4 zzb;
    private int zzd;
    private int zze;

    static {
        b4 b4Var = new b4();
        zzb = b4Var;
        v1.k(b4.class, b4Var);
    }

    public static b4 n() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final Object d(int i9) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new s2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", d1.i});
        }
        if (i10 == 3) {
            return new b4();
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
