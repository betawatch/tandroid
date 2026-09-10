package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class w1 extends h5 {
    private static final w1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        w1 w1Var = new w1();
        zzb = w1Var;
        h5.e(w1.class, w1Var);
    }

    public static v1 l() {
        return (v1) zzb.j();
    }

    public static /* synthetic */ void m(w1 w1Var, int i10) {
        w1Var.zzd |= 2;
        w1Var.zzf = i10;
    }

    public static /* synthetic */ void n(w1 w1Var, int i10) {
        w1Var.zzd |= 4;
        w1Var.zzg = i10;
    }

    public static /* synthetic */ void o(w1 w1Var, int i10) {
        w1Var.zzd |= 8;
        w1Var.zzh = i10;
    }

    public static /* synthetic */ void p(w1 w1Var, int i10) {
        w1Var.zzd |= 16;
        w1Var.zzi = i10;
    }

    public static /* synthetic */ void q(w1 w1Var, int i10) {
        w1Var.zze = i10 - 1;
        w1Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", b1.r, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new w1();
        }
        if (i11 == 4) {
            return new v1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
