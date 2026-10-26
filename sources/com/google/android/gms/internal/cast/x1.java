package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class x1 extends c5 {
    private static final x1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        x1 x1Var = new x1();
        zzb = x1Var;
        c5.e(x1.class, x1Var);
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

    public static /* synthetic */ void o(x1 x1Var, int i10) {
        x1Var.zzd |= 8;
        x1Var.zzh = i10;
    }

    public static /* synthetic */ void p(x1 x1Var, int i10) {
        x1Var.zze = i10 - 1;
        x1Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i10, c5 c5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new d6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", w0.t, "zzf", "zzg", "zzh"});
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
