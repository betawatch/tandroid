package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g2 extends f5 {
    private static final g2 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        g2 g2Var = new g2();
        zzb = g2Var;
        f5.e(g2.class, g2Var);
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i9, f5 f5Var) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", a0.G, "zzf", a0.F});
        }
        if (i10 == 3) {
            return new g2();
        }
        if (i10 == 4) {
            return new v0(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
