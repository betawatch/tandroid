package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class f1 extends e5 {
    private static final h5 zzb = new e1();
    private static final f1 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private g5 zzh = f5.d;

    static {
        f1 f1Var = new f1();
        zzd = f1Var;
        e5.e(f1.class, f1Var);
    }

    @Override // com.google.android.gms.internal.cast.e5
    public final Object h(int i10, e5 e5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new f6(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", z0.C});
        }
        if (i11 == 3) {
            return new f1();
        }
        if (i11 == 4) {
            return new v0(zzd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
