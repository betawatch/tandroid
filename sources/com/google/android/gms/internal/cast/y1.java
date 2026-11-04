package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y1 extends c5 {
    private static final y1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        y1 y1Var = new y1();
        zzb = y1Var;
        c5.e(y1.class, y1Var);
    }

    public static x1 l() {
        return (x1) zzb.j();
    }

    public static /* synthetic */ void m(y1 y1Var, int i3) {
        y1Var.zzd |= 2;
        y1Var.zzf = i3;
    }

    public static /* synthetic */ void n(y1 y1Var, int i3) {
        y1Var.zzd |= 4;
        y1Var.zzg = i3;
    }

    public static /* synthetic */ void o(y1 y1Var, int i3) {
        y1Var.zzd |= 8;
        y1Var.zzh = i3;
    }

    public static /* synthetic */ void p(y1 y1Var, int i3) {
        y1Var.zze = i3 - 1;
        y1Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i3, c5 c5Var) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new d6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", x0.t, "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new y1();
        }
        if (i10 == 4) {
            return new x1(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
