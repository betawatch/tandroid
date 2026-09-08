package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c0 extends f1 {
    private static final c0 zzf;
    private static volatile k2 zzg;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        c0 c0Var = new c0();
        zzf = c0Var;
        f1.g(c0.class, c0Var);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.vision.k2, java.lang.Object] */
    @Override // com.google.android.gms.internal.vision.f1
    public final Object e(int i10) {
        k2 k2Var;
        switch (g0.a[i10 - 1]) {
            case 1:
                return new c0();
            case 2:
                return new h(zzf);
            case 3:
                return new m2(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                k2 k2Var2 = zzg;
                if (k2Var2 != null) {
                    return k2Var2;
                }
                synchronized (c0.class) {
                    try {
                        k2 k2Var3 = zzg;
                        k2Var = k2Var3;
                        if (k2Var3 == null) {
                            ?? c1Var = new c1();
                            zzg = c1Var;
                            k2Var = c1Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return k2Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
