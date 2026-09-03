package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class m extends f1 {
    private static final m zzl;
    private static volatile j2 zzm;
    private int zzc;
    private boolean zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzk;
    private String zzd = "";
    private String zzj = "";

    static {
        m mVar = new m();
        zzl = mVar;
        f1.g(m.class, mVar);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.vision.j2, java.lang.Object] */
    @Override // com.google.android.gms.internal.vision.f1
    public final Object e(int i10) {
        j2 j2Var;
        switch (g0.a[i10 - 1]) {
            case 1:
                return new m();
            case 2:
                return new h(zzl);
            case 3:
                return new l2(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", i0.b, "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                j2 j2Var2 = zzm;
                if (j2Var2 != null) {
                    return j2Var2;
                }
                synchronized (m.class) {
                    try {
                        j2 j2Var3 = zzm;
                        j2Var = j2Var3;
                        if (j2Var3 == null) {
                            ?? c1Var = new c1();
                            zzm = c1Var;
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
