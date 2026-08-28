package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t2 extends f5 {
    private static final t2 zzb;
    private int zzd;
    private k5 zze = f6.d;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        t2 t2Var = new t2();
        zzb = t2Var;
        f5.e(t2.class, t2Var);
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i9, f5 f5Var) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u0006ဂ\u0004", new Object[]{"zzd", "zze", o2.class, "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i10 == 3) {
            return new t2();
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
