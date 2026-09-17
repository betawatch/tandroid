package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class a3 extends h5 {
    private static final a3 zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private int zzg;

    static {
        a3 a3Var = new a3();
        zzb = a3Var;
        h5.e(a3.class, a3Var);
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", b1.d, "zzf", "zzg", b0.E});
        }
        if (i11 == 3) {
            return new a3();
        }
        if (i11 == 4) {
            return new x0(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
