package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class r3 extends v1 {
    private static final r3 zzb;
    private int zzd;
    private int zze;

    static {
        r3 r3Var = new r3();
        zzb = r3Var;
        v1.k(r3.class, r3Var);
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final Object d(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new s2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", d1.g});
        }
        if (i10 == 3) {
            return new r3();
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
