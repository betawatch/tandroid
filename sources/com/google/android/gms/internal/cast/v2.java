package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class v2 extends b5 {
    private static final v2 zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private int zzg;

    static {
        v2 v2Var = new v2();
        zzb = v2Var;
        b5.e(v2.class, v2Var);
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", w0.d, "zzf", "zzg", x.E});
        }
        if (i10 == 3) {
            return new v2();
        }
        if (i10 == 4) {
            return new s0(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
