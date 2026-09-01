package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class m1 extends d5 {
    private static final m1 zzb;
    private int zzd;
    private j2 zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private i3 zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;

    static {
        m1 m1Var = new m1();
        zzb = m1Var;
        d5.e(m1.class, m1Var);
    }

    public static l1 l() {
        return (l1) zzb.j();
    }

    public static l1 m(m1 m1Var) {
        c5 j10 = zzb.j();
        d5 d5Var = j10.a;
        if (!d5Var.equals(m1Var)) {
            if (!j10.b.g()) {
                d5 d5Var2 = (d5) d5Var.h(4, null);
                c6.c.a(d5Var2.getClass()).d(d5Var2, j10.b);
                j10.b = d5Var2;
            }
            d5 d5Var3 = j10.b;
            c6.c.a(d5Var3.getClass()).d(d5Var3, m1Var);
        }
        return (l1) j10;
    }

    public static m1 n() {
        return zzb;
    }

    public static /* synthetic */ void o(m1 m1Var, j2 j2Var) {
        m1Var.zze = j2Var;
        m1Var.zzd |= 1;
    }

    public static /* synthetic */ void p(m1 m1Var, boolean z4) {
        m1Var.zzd |= 2;
        m1Var.zzf = z4;
    }

    public static /* synthetic */ void q(m1 m1Var, long j10) {
        m1Var.zzd |= 4;
        m1Var.zzg = j10;
    }

    public static /* synthetic */ void r(m1 m1Var, int i10) {
        m1Var.zzd |= 64;
        m1Var.zzk = i10;
    }

    public static /* synthetic */ void s(m1 m1Var, int i10) {
        m1Var.zzd |= 128;
        m1Var.zzl = i10;
    }

    public static /* synthetic */ void t(m1 m1Var, int i10) {
        m1Var.zzd |= 1024;
        m1Var.zzo = i10;
    }

    public static /* synthetic */ void u(m1 m1Var, boolean z4) {
        m1Var.zzd |= 2048;
        m1Var.zzp = z4;
    }

    public static /* synthetic */ void v(m1 m1Var, int i10) {
        m1Var.zzd |= 4096;
        m1Var.zzq = i10;
    }

    public static /* synthetic */ void w(m1 m1Var, int i10) {
        m1Var.zzd |= 8192;
        m1Var.zzr = i10;
    }

    public static /* synthetic */ void x(m1 m1Var, boolean z4) {
        m1Var.zzd |= 16384;
        m1Var.zzs = z4;
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\tဉ\b\n᠌\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", y.x, "zzj", y.w, "zzk", "zzl", "zzm", "zzn", y.M, "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i11 == 3) {
            return new m1();
        }
        if (i11 == 4) {
            return new l1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
