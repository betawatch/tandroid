package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class j extends f1 {
    private static final j zzg;
    private static volatile j2 zzh;
    private int zzc;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        j jVar = new j();
        zzg = jVar;
        f1.g(j.class, jVar);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.vision.j2, java.lang.Object] */
    @Override // com.google.android.gms.internal.vision.f1
    public final Object e(int i10) {
        j2 j2Var;
        switch (g0.a[i10 - 1]) {
            case 1:
                return new j();
            case 2:
                return new h(zzg);
            case 3:
                return new l2(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"zzc", "zzd", i0.h, "zze", i0.i, "zzf"});
            case 4:
                return zzg;
            case 5:
                j2 j2Var2 = zzh;
                if (j2Var2 != null) {
                    return j2Var2;
                }
                synchronized (j.class) {
                    try {
                        j2 j2Var3 = zzh;
                        j2Var = j2Var3;
                        if (j2Var3 == null) {
                            ?? c1Var = new c1();
                            zzh = c1Var;
                            j2Var = c1Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return j2Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
