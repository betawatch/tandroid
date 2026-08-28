package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a0 extends f1 {
    private static final a0 zzj;
    private static volatile j2 zzk;
    private int zzc;
    private long zze;
    private g zzf;
    private t zzh;
    private i zzi;
    private String zzd = "";
    private String zzg = "";

    static {
        a0 a0Var = new a0();
        zzj = a0Var;
        f1.g(a0.class, a0Var);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.vision.j2, java.lang.Object] */
    @Override // com.google.android.gms.internal.vision.f1
    public final Object e(int i9) {
        j2 j2Var;
        switch (g0.a[i9 - 1]) {
            case 1:
                return new a0();
            case 2:
                return new h(zzj);
            case 3:
                return new l2(zzj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0006ဈ\u0003\u0010ဉ\u0004\u0011ဉ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                j2 j2Var2 = zzk;
                if (j2Var2 != null) {
                    return j2Var2;
                }
                synchronized (a0.class) {
                    try {
                        j2 j2Var3 = zzk;
                        j2Var = j2Var3;
                        if (j2Var3 == null) {
                            ?? c1Var = new c1();
                            zzk = c1Var;
                            j2Var = c1Var;
                        }
                    } catch (Throwable th) {
                        throw th;
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
