package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o3 extends f5 {
    private static final o3 zzb;
    private int zzd;
    private j1 zze;

    static {
        o3 o3Var = new o3();
        zzb = o3Var;
        f5.e(o3.class, o3Var);
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new g6(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new o3();
        }
        if (i11 == 4) {
            return new e3(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
