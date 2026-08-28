package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class x0 extends f5 {
    private static final x0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private w0 zzi;
    private int zzj;

    static {
        x0 x0Var = new x0();
        zzb = x0Var;
        f5.e(x0.class, x0Var);
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i9, f5 f5Var) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004\u0006᠌\u0005", new Object[]{"zzd", "zze", "zzf", a0.s, "zzg", "zzh", "zzi", "zzj", a0.r});
        }
        if (i10 == 3) {
            return new x0();
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
