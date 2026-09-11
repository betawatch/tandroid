package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class p1 extends h5 {
    private static final p1 zzb;
    private int zzd;
    private m2 zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private l3 zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;

    static {
        p1 p1Var = new p1();
        zzb = p1Var;
        h5.e(p1.class, p1Var);
    }

    public static o1 l() {
        return (o1) zzb.j();
    }

    public static o1 m(p1 p1Var) {
        g5 j3 = zzb.j();
        h5 h5Var = j3.a;
        if (!h5Var.equals(p1Var)) {
            if (!j3.b.g()) {
                h5 h5Var2 = (h5) h5Var.h(4, null);
                g6.c.a(h5Var2.getClass()).d(h5Var2, j3.b);
                j3.b = h5Var2;
            }
            h5 h5Var3 = j3.b;
            g6.c.a(h5Var3.getClass()).d(h5Var3, p1Var);
        }
        return (o1) j3;
    }

    public static p1 n() {
        return zzb;
    }

    public static /* synthetic */ void o(p1 p1Var, m2 m2Var) {
        p1Var.zze = m2Var;
        p1Var.zzd |= 1;
    }

    public static /* synthetic */ void p(p1 p1Var, boolean z10) {
        p1Var.zzd |= 2;
        p1Var.zzf = z10;
    }

    public static /* synthetic */ void q(p1 p1Var, long j3) {
        p1Var.zzd |= 4;
        p1Var.zzg = j3;
    }

    public static /* synthetic */ void r(p1 p1Var, int i10) {
        p1Var.zzd |= 64;
        p1Var.zzk = i10;
    }

    public static /* synthetic */ void s(p1 p1Var, int i10) {
        p1Var.zzd |= 128;
        p1Var.zzl = i10;
    }

    public static /* synthetic */ void t(p1 p1Var, int i10) {
        p1Var.zzd |= 1024;
        p1Var.zzo = i10;
    }

    public static /* synthetic */ void u(p1 p1Var, boolean z10) {
        p1Var.zzd |= 2048;
        p1Var.zzp = z10;
    }

    public static /* synthetic */ void v(p1 p1Var, int i10) {
        p1Var.zzd |= 4096;
        p1Var.zzq = i10;
    }

    public static /* synthetic */ void w(p1 p1Var, int i10) {
        p1Var.zzd |= 8192;
        p1Var.zzr = i10;
    }

    public static /* synthetic */ void x(p1 p1Var, boolean z10) {
        p1Var.zzd |= 16384;
        p1Var.zzs = z10;
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzb, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\tဉ\b\n᠌\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", b0.x, "zzj", b0.w, "zzk", "zzl", "zzm", "zzn", b0.P, "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i11 == 3) {
            return new p1();
        }
        if (i11 == 4) {
            return new o1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
