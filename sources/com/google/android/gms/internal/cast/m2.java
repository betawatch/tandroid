package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m2 extends f5 {
    private static final m2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private k5 zzh = f6.d;

    static {
        m2 m2Var = new m2();
        zzb = m2Var;
        f5.e(m2.class, m2Var);
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i9, f5 f5Var) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", l2.class});
        }
        if (i10 == 3) {
            return new m2();
        }
        if (i10 == 4) {
            return new v0(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
