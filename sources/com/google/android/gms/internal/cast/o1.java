package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o1 extends f5 {
    private static final o1 zzb;
    private int zzd;
    private l2 zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private k3 zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;

    static {
        o1 o1Var = new o1();
        zzb = o1Var;
        f5.e(o1.class, o1Var);
    }

    public static n1 l() {
        return (n1) zzb.j();
    }

    public static n1 m(o1 o1Var) {
        e5 j10 = zzb.j();
        f5 f5Var = j10.a;
        if (!f5Var.equals(o1Var)) {
            if (!j10.b.g()) {
                f5 f5Var2 = (f5) f5Var.h(4, null);
                e6.c.a(f5Var2.getClass()).d(f5Var2, j10.b);
                j10.b = f5Var2;
            }
            f5 f5Var3 = j10.b;
            e6.c.a(f5Var3.getClass()).d(f5Var3, o1Var);
        }
        return (n1) j10;
    }

    public static o1 n() {
        return zzb;
    }

    public static /* synthetic */ void o(o1 o1Var, l2 l2Var) {
        o1Var.zze = l2Var;
        o1Var.zzd |= 1;
    }

    public static /* synthetic */ void p(o1 o1Var, boolean z10) {
        o1Var.zzd |= 2;
        o1Var.zzf = z10;
    }

    public static /* synthetic */ void q(o1 o1Var, long j10) {
        o1Var.zzd |= 4;
        o1Var.zzg = j10;
    }

    public static /* synthetic */ void r(o1 o1Var, int i10) {
        o1Var.zzd |= 64;
        o1Var.zzk = i10;
    }

    public static /* synthetic */ void s(o1 o1Var, int i10) {
        o1Var.zzd |= 128;
        o1Var.zzl = i10;
    }

    public static /* synthetic */ void t(o1 o1Var, int i10) {
        o1Var.zzd |= 1024;
        o1Var.zzo = i10;
    }

    public static /* synthetic */ void u(o1 o1Var, boolean z10) {
        o1Var.zzd |= 2048;
        o1Var.zzp = z10;
    }

    public static /* synthetic */ void v(o1 o1Var, int i10) {
        o1Var.zzd |= 4096;
        o1Var.zzq = i10;
    }

    public static /* synthetic */ void w(o1 o1Var, int i10) {
        o1Var.zzd |= 8192;
        o1Var.zzr = i10;
    }

    public static /* synthetic */ void x(o1 o1Var, boolean z10) {
        o1Var.zzd |= 16384;
        o1Var.zzs = z10;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new g6(zzb, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\tဉ\b\n᠌\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", a0.x, "zzj", a0.w, "zzk", "zzl", "zzm", "zzn", a0.L, "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i11 == 3) {
            return new o1();
        }
        if (i11 == 4) {
            return new n1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
