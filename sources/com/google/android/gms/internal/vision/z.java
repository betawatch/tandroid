package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class z extends f1 {
    private static final z zzi;
    private static volatile k2 zzj;
    private int zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        z zVar = new z();
        zzi = zVar;
        f1.g(z.class, zVar);
    }

    public static void j(z zVar, long j3) {
        zVar.zzc |= 2;
        zVar.zze = j3;
    }

    public static y k() {
        return (y) ((d1) zzi.e(5));
    }

    public static void l(z zVar, long j3) {
        zVar.zzc |= 4;
        zVar.zzf = j3;
    }

    public static void m(z zVar, long j3) {
        zVar.zzc |= 8;
        zVar.zzg = j3;
    }

    public static void n(z zVar, long j3) {
        zVar.zzc |= 16;
        zVar.zzh = j3;
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.vision.k2, java.lang.Object] */
    @Override // com.google.android.gms.internal.vision.f1
    public final Object e(int i10) {
        k2 k2Var;
        switch (g0.a[i10 - 1]) {
            case 1:
                return new z();
            case 2:
                return new y(zzi);
            case 3:
                return new m2(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဂ\u0003", new Object[]{"zzc", "zzd", i0.g, "zze", "zzf", "zzh", "zzg"});
            case 4:
                return zzi;
            case 5:
                k2 k2Var2 = zzj;
                if (k2Var2 != null) {
                    return k2Var2;
                }
                synchronized (z.class) {
                    try {
                        k2 k2Var3 = zzj;
                        k2Var = k2Var3;
                        if (k2Var3 == null) {
                            ?? c1Var = new c1();
                            zzj = c1Var;
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
