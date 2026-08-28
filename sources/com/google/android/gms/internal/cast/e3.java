package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e3 extends f5 {
    private static final e3 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        e3 e3Var = new e3();
        zzb = e3Var;
        f5.e(e3.class, e3Var);
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i9, f5 f5Var) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new e3();
        }
        if (i10 == 4) {
            return new d3(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
