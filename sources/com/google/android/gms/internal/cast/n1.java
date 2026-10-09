package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class n1 extends f5 {
    private static final n1 zzb;
    private int zzd;
    private k2 zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private j3 zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;

    static {
        n1 n1Var = new n1();
        zzb = n1Var;
        f5.e(n1.class, n1Var);
    }

    public static m1 l() {
        return (m1) zzb.j();
    }

    public static m1 m(n1 n1Var) {
        e5 j3 = zzb.j();
        f5 f5Var = j3.a;
        if (!f5Var.equals(n1Var)) {
            if (!j3.b.g()) {
                f5 f5Var2 = (f5) f5Var.h(4, null);
                e6.c.a(f5Var2.getClass()).d(f5Var2, j3.b);
                j3.b = f5Var2;
            }
            f5 f5Var3 = j3.b;
            e6.c.a(f5Var3.getClass()).d(f5Var3, n1Var);
        }
        return (m1) j3;
    }

    public static n1 n() {
        return zzb;
    }

    public static /* synthetic */ void o(n1 n1Var, k2 k2Var) {
        n1Var.zze = k2Var;
        n1Var.zzd |= 1;
    }

    public static /* synthetic */ void p(n1 n1Var, boolean z10) {
        n1Var.zzd |= 2;
        n1Var.zzf = z10;
    }

    public static /* synthetic */ void q(n1 n1Var, long j3) {
        n1Var.zzd |= 4;
        n1Var.zzg = j3;
    }

    public static /* synthetic */ void r(n1 n1Var, int i10) {
        n1Var.zzd |= 64;
        n1Var.zzk = i10;
    }

    public static /* synthetic */ void s(n1 n1Var, int i10) {
        n1Var.zzd |= 128;
        n1Var.zzl = i10;
    }

    public static /* synthetic */ void t(n1 n1Var, int i10) {
        n1Var.zzd |= 1024;
        n1Var.zzo = i10;
    }

    public static /* synthetic */ void u(n1 n1Var, boolean z10) {
        n1Var.zzd |= 2048;
        n1Var.zzp = z10;
    }

    public static /* synthetic */ void v(n1 n1Var, int i10) {
        n1Var.zzd |= 4096;
        n1Var.zzq = i10;
    }

    public static /* synthetic */ void w(n1 n1Var, int i10) {
        n1Var.zzd |= 8192;
        n1Var.zzr = i10;
    }

    public static /* synthetic */ void x(n1 n1Var, boolean z10) {
        n1Var.zzd |= 16384;
        n1Var.zzs = z10;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new g6(zzb, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\tဉ\b\n᠌\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", z.x, "zzj", z.w, "zzk", "zzl", "zzm", "zzn", z.P, "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i11 == 3) {
            return new n1();
        }
        if (i11 == 4) {
            return new m1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
