package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class b0 extends f1 {
    private static final b0 zzf;
    private static volatile k2 zzg;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        b0 b0Var = new b0();
        zzf = b0Var;
        f1.g(b0.class, b0Var);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.vision.k2, java.lang.Object] */
    @Override // com.google.android.gms.internal.vision.f1
    public final Object e(int i10) {
        k2 k2Var;
        switch (g0.a[i10 - 1]) {
            case 1:
                return new b0();
            case 2:
                return new h(zzf);
            case 3:
                return new m2(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                k2 k2Var2 = zzg;
                if (k2Var2 != null) {
                    return k2Var2;
                }
                synchronized (b0.class) {
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
