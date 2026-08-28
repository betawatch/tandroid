package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r3 extends f5 {
    private static final r3 zzb;
    private int zzd;
    private int zze;
    private k5 zzf;
    private k5 zzg;
    private int zzh;

    static {
        r3 r3Var = new r3();
        zzb = r3Var;
        f5.e(r3.class, r3Var);
    }

    public r3() {
        f6 f6Var = f6.d;
        this.zzf = f6Var;
        this.zzg = f6Var;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i9, f5 f5Var) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzd", "zze", z0.x, "zzf", e3.class, "zzg", e3.class, "zzh"});
        }
        if (i10 == 3) {
            return new r3();
        }
        if (i10 == 4) {
            return new d3(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
