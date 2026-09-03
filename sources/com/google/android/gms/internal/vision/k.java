package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class k extends f1 {
    private static final k zzd;
    private static volatile j2 zze;
    private o1 zzc = m2.d;

    static {
        k kVar = new k();
        zzd = kVar;
        f1.g(k.class, kVar);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.vision.j2, java.lang.Object] */
    @Override // com.google.android.gms.internal.vision.f1
    public final Object e(int i10) {
        j2 j2Var;
        switch (g0.a[i10 - 1]) {
            case 1:
                return new k();
            case 2:
                return new h(zzd);
            case 3:
                return new l2(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", c0.class});
            case 4:
                return zzd;
            case 5:
                j2 j2Var2 = zze;
                if (j2Var2 != null) {
                    return j2Var2;
                }
                synchronized (k.class) {
                    try {
                        j2 j2Var3 = zze;
                        j2Var = j2Var3;
                        if (j2Var3 == null) {
                            ?? c1Var = new c1();
                            zze = c1Var;
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
