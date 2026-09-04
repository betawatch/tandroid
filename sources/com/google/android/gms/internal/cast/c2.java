package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class c2 extends h5 {
    private static final c2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        c2 c2Var = new c2();
        zzb = c2Var;
        h5.e(c2.class, c2Var);
    }

    public static b2 l() {
        return (b2) zzb.j();
    }

    public static /* synthetic */ void m(c2 c2Var, int i10) {
        c2Var.zzd |= 2;
        c2Var.zzf = i10;
    }

    public static /* synthetic */ void n(c2 c2Var, int i10) {
        c2Var.zzd |= 4;
        c2Var.zzg = i10;
    }

    public static /* synthetic */ void o(c2 c2Var, int i10) {
        c2Var.zzd |= 8;
        c2Var.zzh = i10;
    }

    public static /* synthetic */ void p(c2 c2Var, int i10) {
        c2Var.zze = i10 - 1;
        c2Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", b1.t, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new c2();
        }
        if (i11 == 4) {
            return new b2(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
