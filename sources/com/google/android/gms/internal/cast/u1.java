package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class u1 extends e5 {
    private static final u1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        u1 u1Var = new u1();
        zzb = u1Var;
        e5.e(u1.class, u1Var);
    }

    public static t1 l() {
        return (t1) zzb.j();
    }

    public static /* synthetic */ void m(u1 u1Var, int i10) {
        u1Var.zzd |= 2;
        u1Var.zzf = i10;
    }

    public static /* synthetic */ void n(u1 u1Var, int i10) {
        u1Var.zzd |= 4;
        u1Var.zzg = i10;
    }

    public static /* synthetic */ void o(u1 u1Var, int i10) {
        u1Var.zzd |= 8;
        u1Var.zzh = i10;
    }

    public static /* synthetic */ void p(u1 u1Var, int i10) {
        u1Var.zzd |= 16;
        u1Var.zzi = i10;
    }

    public static /* synthetic */ void q(u1 u1Var, int i10) {
        u1Var.zze = i10 - 1;
        u1Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.e5
    public final Object h(int i10, e5 e5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new f6(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", z0.r, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new u1();
        }
        if (i11 == 4) {
            return new t1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
