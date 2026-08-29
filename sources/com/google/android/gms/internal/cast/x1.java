package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class x1 extends f5 {
    private static final x1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;

    static {
        x1 x1Var = new x1();
        zzb = x1Var;
        f5.e(x1.class, x1Var);
    }

    public static w1 l() {
        return (w1) zzb.j();
    }

    public static /* synthetic */ void m(x1 x1Var, int i10) {
        x1Var.zzd |= 2;
        x1Var.zzf = i10;
    }

    public static /* synthetic */ void n(x1 x1Var, int i10) {
        x1Var.zzd |= 4;
        x1Var.zzg = i10;
    }

    public static /* synthetic */ void o(x1 x1Var, boolean z10) {
        x1Var.zzd |= 8;
        x1Var.zzh = z10;
    }

    public static /* synthetic */ void p(x1 x1Var, int i10) {
        x1Var.zze = i10 - 1;
        x1Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new g6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", a1.s, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new x1();
        }
        if (i11 == 4) {
            return new w1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
