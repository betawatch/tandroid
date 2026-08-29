package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f0 extends f1 {
    private static final f0 zzi;
    private static volatile j2 zzj;
    private int zzc;
    private m zzd;
    private a0 zze;
    private w zzf;
    private int zzg;
    private boolean zzh;

    static {
        f0 f0Var = new f0();
        zzi = f0Var;
        f1.g(f0.class, f0Var);
    }

    public static void j(f0 f0Var, w wVar) {
        f0Var.getClass();
        f0Var.zzf = wVar;
        f0Var.zzc |= 4;
    }

    public static e0 k() {
        return (e0) ((d1) zzi.e(5));
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.vision.j2, java.lang.Object] */
    @Override // com.google.android.gms.internal.vision.f1
    public final Object e(int i10) {
        j2 j2Var;
        switch (g0.a[i10 - 1]) {
            case 1:
                return new f0();
            case 2:
                return new e0(zzi);
            case 3:
                return new l2(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                j2 j2Var2 = zzj;
                if (j2Var2 != null) {
                    return j2Var2;
                }
                synchronized (f0.class) {
                    try {
                        j2 j2Var3 = zzj;
                        j2Var = j2Var3;
                        if (j2Var3 == null) {
                            ?? c1Var = new c1();
                            zzj = c1Var;
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
