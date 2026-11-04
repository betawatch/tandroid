package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s1 extends c5 {
    private static final s1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        s1 s1Var = new s1();
        zzb = s1Var;
        c5.e(s1.class, s1Var);
    }

    public static r1 l() {
        return (r1) zzb.j();
    }

    public static /* synthetic */ void m(s1 s1Var, int i3) {
        s1Var.zzd |= 2;
        s1Var.zzf = i3;
    }

    public static /* synthetic */ void n(s1 s1Var, int i3) {
        s1Var.zzd |= 4;
        s1Var.zzg = i3;
    }

    public static /* synthetic */ void o(s1 s1Var, int i3) {
        s1Var.zzd |= 8;
        s1Var.zzh = i3;
    }

    public static /* synthetic */ void p(s1 s1Var, int i3) {
        s1Var.zzd |= 16;
        s1Var.zzi = i3;
    }

    public static /* synthetic */ void q(s1 s1Var, int i3) {
        s1Var.zze = i3 - 1;
        s1Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i3, c5 c5Var) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new d6(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", x0.r, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new s1();
        }
        if (i10 == 4) {
            return new r1(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
