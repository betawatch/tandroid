package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u1 extends c5 {
    private static final u1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;

    static {
        u1 u1Var = new u1();
        zzb = u1Var;
        c5.e(u1.class, u1Var);
    }

    public static t1 l() {
        return (t1) zzb.j();
    }

    public static /* synthetic */ void m(u1 u1Var, int i3) {
        u1Var.zzd |= 2;
        u1Var.zzf = i3;
    }

    public static /* synthetic */ void n(u1 u1Var, int i3) {
        u1Var.zzd |= 4;
        u1Var.zzg = i3;
    }

    public static /* synthetic */ void o(u1 u1Var, boolean z10) {
        u1Var.zzd |= 8;
        u1Var.zzh = z10;
    }

    public static /* synthetic */ void p(u1 u1Var, int i3) {
        u1Var.zze = i3 - 1;
        u1Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i3, c5 c5Var) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new d6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", x0.s, "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new u1();
        }
        if (i10 == 4) {
            return new t1(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
