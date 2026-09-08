package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class g extends f1 {
    private static final g zzf;
    private static volatile k2 zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    static {
        g gVar = new g();
        zzf = gVar;
        f1.g(g.class, gVar);
    }

    public static void j(g gVar, String str) {
        gVar.getClass();
        str.getClass();
        gVar.zzc |= 1;
        gVar.zzd = str;
    }

    public static f k() {
        return (f) ((d1) zzf.e(5));
    }

    public static void m(g gVar, String str) {
        gVar.getClass();
        gVar.zzc |= 2;
        gVar.zze = str;
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.vision.k2, java.lang.Object] */
    @Override // com.google.android.gms.internal.vision.f1
    public final Object e(int i10) {
        k2 k2Var;
        switch (g0.a[i10 - 1]) {
            case 1:
                return new g();
            case 2:
                return new f(zzf);
            case 3:
                return new m2(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                k2 k2Var2 = zzg;
                if (k2Var2 != null) {
                    return k2Var2;
                }
                synchronized (g.class) {
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
