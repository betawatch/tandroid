package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a2 extends e5 {
    private static final a2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        a2 a2Var = new a2();
        zzb = a2Var;
        e5.e(a2.class, a2Var);
    }

    public static z1 l() {
        return (z1) zzb.j();
    }

    public static /* synthetic */ void m(a2 a2Var, int i10) {
        a2Var.zzd |= 2;
        a2Var.zzf = i10;
    }

    public static /* synthetic */ void n(a2 a2Var, int i10) {
        a2Var.zzd |= 4;
        a2Var.zzg = i10;
    }

    public static /* synthetic */ void o(a2 a2Var, int i10) {
        a2Var.zzd |= 8;
        a2Var.zzh = i10;
    }

    public static /* synthetic */ void p(a2 a2Var, int i10) {
        a2Var.zze = i10 - 1;
        a2Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.e5
    public final Object h(int i10, e5 e5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new f6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", z0.t, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new a2();
        }
        if (i11 == 4) {
            return new z1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
