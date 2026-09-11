package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class y1 extends h5 {
    private static final y1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;

    static {
        y1 y1Var = new y1();
        zzb = y1Var;
        h5.e(y1.class, y1Var);
    }

    public static x1 l() {
        return (x1) zzb.j();
    }

    public static /* synthetic */ void m(y1 y1Var, int i10) {
        y1Var.zzd |= 2;
        y1Var.zzf = i10;
    }

    public static /* synthetic */ void n(y1 y1Var, int i10) {
        y1Var.zzd |= 4;
        y1Var.zzg = i10;
    }

    public static /* synthetic */ void o(y1 y1Var, boolean z10) {
        y1Var.zzd |= 8;
        y1Var.zzh = z10;
    }

    public static /* synthetic */ void p(y1 y1Var, int i10) {
        y1Var.zze = i10 - 1;
        y1Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", b1.s, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new y1();
        }
        if (i11 == 4) {
            return new x1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
