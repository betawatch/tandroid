package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class d0 extends f1 {
    private static final d0 zzh;
    private static volatile k2 zzi;
    private int zzc;
    private k zzd;
    private int zze;
    private u zzf;
    private j zzg;

    static {
        d0 d0Var = new d0();
        zzh = d0Var;
        f1.g(d0.class, d0Var);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.vision.k2, java.lang.Object] */
    @Override // com.google.android.gms.internal.vision.f1
    public final Object e(int i10) {
        k2 k2Var;
        switch (g0.a[i10 - 1]) {
            case 1:
                return new d0();
            case 2:
                return new h(zzh);
            case 3:
                return new m2(zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                k2 k2Var2 = zzi;
                if (k2Var2 != null) {
                    return k2Var2;
                }
                synchronized (d0.class) {
                    try {
                        k2 k2Var3 = zzi;
                        k2Var = k2Var3;
                        if (k2Var3 == null) {
                            ?? c1Var = new c1();
                            zzi = c1Var;
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
