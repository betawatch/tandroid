package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c2 extends f5 {
    private static final c2 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        c2 c2Var = new c2();
        zzb = c2Var;
        f5.e(c2.class, c2Var);
    }

    public static b2 l() {
        return (b2) zzb.j();
    }

    public static /* synthetic */ void m(c2 c2Var, int i9) {
        c2Var.zzd |= 2;
        c2Var.zzf = i9;
    }

    public static /* synthetic */ void n(c2 c2Var, int i9) {
        c2Var.zze = i9 - 1;
        c2Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i9, f5 f5Var) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", z0.w, "zzf"});
        }
        if (i10 == 3) {
            return new c2();
        }
        if (i10 == 4) {
            return new b2(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
