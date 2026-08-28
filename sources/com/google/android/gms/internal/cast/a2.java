package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a2 extends f5 {
    private static final a2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        a2 a2Var = new a2();
        zzb = a2Var;
        f5.e(a2.class, a2Var);
    }

    public static z1 l() {
        return (z1) zzb.j();
    }

    public static /* synthetic */ void m(a2 a2Var, int i9) {
        a2Var.zzd |= 2;
        a2Var.zzf = i9;
    }

    public static /* synthetic */ void n(a2 a2Var, int i9) {
        a2Var.zzd |= 4;
        a2Var.zzg = i9;
    }

    public static /* synthetic */ void o(a2 a2Var, int i9) {
        a2Var.zzd |= 8;
        a2Var.zzh = i9;
    }

    public static /* synthetic */ void p(a2 a2Var, int i9) {
        a2Var.zze = i9 - 1;
        a2Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i9, f5 f5Var) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", z0.t, "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new a2();
        }
        if (i10 == 4) {
            return new z1(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
