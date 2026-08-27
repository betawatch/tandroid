package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t1 extends d5 {
    private static final t1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        t1 t1Var = new t1();
        zzb = t1Var;
        d5.e(t1.class, t1Var);
    }

    public static s1 l() {
        return (s1) zzb.j();
    }

    public static /* synthetic */ void m(t1 t1Var, int i10) {
        t1Var.zzd |= 2;
        t1Var.zzf = i10;
    }

    public static /* synthetic */ void n(t1 t1Var, int i10) {
        t1Var.zzd |= 4;
        t1Var.zzg = i10;
    }

    public static /* synthetic */ void o(t1 t1Var, int i10) {
        t1Var.zzd |= 8;
        t1Var.zzh = i10;
    }

    public static /* synthetic */ void p(t1 t1Var, int i10) {
        t1Var.zzd |= 16;
        t1Var.zzi = i10;
    }

    public static /* synthetic */ void q(t1 t1Var, int i10) {
        t1Var.zze = i10 - 1;
        t1Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", y0.r, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new t1();
        }
        if (i11 == 4) {
            return new s1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
