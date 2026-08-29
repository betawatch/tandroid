package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j2 extends f5 {
    private static final j2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private j1 zzg;

    static {
        j2 j2Var = new j2();
        zzb = j2Var;
        f5.e(j2.class, j2Var);
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new g6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", a0.I, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new j2();
        }
        if (i11 == 4) {
            return new w0(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
