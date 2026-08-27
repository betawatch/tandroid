package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class z1 extends d5 {
    private static final z1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        z1 z1Var = new z1();
        zzb = z1Var;
        d5.e(z1.class, z1Var);
    }

    public static y1 l() {
        return (y1) zzb.j();
    }

    public static /* synthetic */ void m(z1 z1Var, int i10) {
        z1Var.zzd |= 2;
        z1Var.zzf = i10;
    }

    public static /* synthetic */ void n(z1 z1Var, int i10) {
        z1Var.zzd |= 4;
        z1Var.zzg = i10;
    }

    public static /* synthetic */ void o(z1 z1Var, int i10) {
        z1Var.zzd |= 8;
        z1Var.zzh = i10;
    }

    public static /* synthetic */ void p(z1 z1Var, int i10) {
        z1Var.zze = i10 - 1;
        z1Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", y0.t, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new z1();
        }
        if (i11 == 4) {
            return new y1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
