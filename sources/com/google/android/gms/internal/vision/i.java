package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class i extends f1 {
    private static final l1 zzd = new h0(0);
    private static final i zze;
    private static volatile j2 zzf;
    private m1 zzc = f1.i();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.vision.h0, com.google.android.gms.internal.vision.l1] */
    static {
        i iVar = new i();
        zze = iVar;
        f1.g(i.class, iVar);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.vision.j2, java.lang.Object] */
    @Override // com.google.android.gms.internal.vision.f1
    public final Object e(int i10) {
        j2 j2Var;
        switch (g0.a[i10 - 1]) {
            case 1:
                return new i();
            case 2:
                return new h(zze);
            case 3:
                return new l2(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzc", i0.h});
            case 4:
                return zze;
            case 5:
                j2 j2Var2 = zzf;
                if (j2Var2 != null) {
                    return j2Var2;
                }
                synchronized (i.class) {
                    try {
                        j2 j2Var3 = zzf;
                        j2Var = j2Var3;
                        if (j2Var3 == null) {
                            ?? c1Var = new c1();
                            zzf = c1Var;
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
