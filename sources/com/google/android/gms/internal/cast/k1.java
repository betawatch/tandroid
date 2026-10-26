package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class k1 extends c5 {
    private static final k1 zzb;
    private int zzd;
    private h2 zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private g3 zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;

    static {
        k1 k1Var = new k1();
        zzb = k1Var;
        c5.e(k1.class, k1Var);
    }

    public static j1 l() {
        return (j1) zzb.j();
    }

    public static j1 m(k1 k1Var) {
        b5 j10 = zzb.j();
        c5 c5Var = j10.a;
        if (!c5Var.equals(k1Var)) {
            if (!j10.b.g()) {
                c5 c5Var2 = (c5) c5Var.h(4, null);
                b6.c.a(c5Var2.getClass()).d(c5Var2, j10.b);
                j10.b = c5Var2;
            }
            c5 c5Var3 = j10.b;
            b6.c.a(c5Var3.getClass()).d(c5Var3, k1Var);
        }
        return (j1) j10;
    }

    public static k1 n() {
        return zzb;
    }

    public static /* synthetic */ void o(k1 k1Var, h2 h2Var) {
        k1Var.zze = h2Var;
        k1Var.zzd |= 1;
    }

    public static /* synthetic */ void p(k1 k1Var, boolean z10) {
        k1Var.zzd |= 2;
        k1Var.zzf = z10;
    }

    public static /* synthetic */ void q(k1 k1Var, long j10) {
        k1Var.zzd |= 4;
        k1Var.zzg = j10;
    }

    public static /* synthetic */ void r(k1 k1Var, int i10) {
        k1Var.zzd |= 64;
        k1Var.zzk = i10;
    }

    public static /* synthetic */ void s(k1 k1Var, int i10) {
        k1Var.zzd |= 128;
        k1Var.zzl = i10;
    }

    public static /* synthetic */ void t(k1 k1Var, int i10) {
        k1Var.zzd |= 1024;
        k1Var.zzo = i10;
    }

    public static /* synthetic */ void u(k1 k1Var, boolean z10) {
        k1Var.zzd |= 2048;
        k1Var.zzp = z10;
    }

    public static /* synthetic */ void v(k1 k1Var, int i10) {
        k1Var.zzd |= 4096;
        k1Var.zzq = i10;
    }

    public static /* synthetic */ void w(k1 k1Var, int i10) {
        k1Var.zzd |= 8192;
        k1Var.zzr = i10;
    }

    public static /* synthetic */ void x(k1 k1Var, boolean z10) {
        k1Var.zzd |= 16384;
        k1Var.zzs = z10;
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i10, c5 c5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new d6(zzb, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\tဉ\b\n᠌\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", x.x, "zzj", x.w, "zzk", "zzl", "zzm", "zzn", x.P, "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i11 == 3) {
            return new k1();
        }
        if (i11 == 4) {
            return new j1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
