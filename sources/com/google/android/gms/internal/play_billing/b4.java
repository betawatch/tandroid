package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", d1.i});
        }
        if (i11 == 3) {
            return new b4();
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
