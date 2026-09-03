package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class w1 extends e5 {
    private static final w1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;

    static {
        w1 w1Var = new w1();
        zzb = w1Var;
        e5.e(w1.class, w1Var);
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

    public static /* synthetic */ void o(w1 w1Var, boolean z4) {
        w1Var.zzd |= 8;
        w1Var.zzh = z4;
    }

    public static /* synthetic */ void p(w1 w1Var, int i10) {
        w1Var.zze = i10 - 1;
        w1Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.e5
    public final Object h(int i10, e5 e5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new f6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", z0.s, "zzf", "zzg", "zzh"});
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
