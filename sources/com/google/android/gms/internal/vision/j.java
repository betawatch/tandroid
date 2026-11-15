package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class j extends f1 {
    private static final j zzg;
    private static volatile k2 zzh;
    private int zzc;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        j jVar = new j();
        zzg = jVar;
        f1.g(j.class, jVar);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.vision.k2, java.lang.Object] */
    @Override // com.google.android.gms.internal.vision.f1
    public final Object e(int i7) {
        k2 k2Var;
        switch (g0.a[i7 - 1]) {
            case 1:
                return new j();
            case 2:
                return new h(zzg);
            case 3:
                return new m2(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"zzc", "zzd", i0.h, "zze", i0.i, "zzf"});
            case 4:
                return zzg;
            case 5:
                k2 k2Var2 = zzh;
                if (k2Var2 != null) {
                    return k2Var2;
                }
                synchronized (j.class) {
                    try {
                        k2 k2Var3 = zzh;
                        k2Var = k2Var3;
                        if (k2Var3 == null) {
                            ?? c1Var = new c1();
                            zzh = c1Var;
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
