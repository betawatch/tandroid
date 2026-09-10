package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class k extends f1 {
    private static final k zzd;
    private static volatile k2 zze;
    private o1 zzc = n2.d;

    static {
        k kVar = new k();
        zzd = kVar;
        f1.g(k.class, kVar);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.vision.k2, java.lang.Object] */
    @Override // com.google.android.gms.internal.vision.f1
    public final Object e(int i10) {
        k2 k2Var;
        switch (g0.a[i10 - 1]) {
            case 1:
                return new k();
            case 2:
                return new h(zzd);
            case 3:
                return new m2(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", c0.class});
            case 4:
                return zzd;
            case 5:
                k2 k2Var2 = zze;
                if (k2Var2 != null) {
                    return k2Var2;
                }
                synchronized (k.class) {
                    try {
                        k2 k2Var3 = zze;
                        k2Var = k2Var3;
                        if (k2Var3 == null) {
                            ?? c1Var = new c1();
                            zze = c1Var;
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
