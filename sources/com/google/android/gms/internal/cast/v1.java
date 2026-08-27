package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class v1 extends d5 {
    private static final v1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;

    static {
        v1 v1Var = new v1();
        zzb = v1Var;
        d5.e(v1.class, v1Var);
    }

    public static u1 l() {
        return (u1) zzb.j();
    }

    public static /* synthetic */ void m(v1 v1Var, int i10) {
        v1Var.zzd |= 2;
        v1Var.zzf = i10;
    }

    public static /* synthetic */ void n(v1 v1Var, int i10) {
        v1Var.zzd |= 4;
        v1Var.zzg = i10;
    }

    public static /* synthetic */ void o(v1 v1Var, boolean z10) {
        v1Var.zzd |= 8;
        v1Var.zzh = z10;
    }

    public static /* synthetic */ void p(v1 v1Var, int i10) {
        v1Var.zze = i10 - 1;
        v1Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", y0.s, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new v1();
        }
        if (i11 == 4) {
            return new u1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
