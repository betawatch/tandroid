package com.google.android.gms.internal.cast;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l1 extends c5 {
    private static final l1 zzb;
    private int zzd;
    private i2 zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private h3 zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;

    static {
        l1 l1Var = new l1();
        zzb = l1Var;
        c5.e(l1.class, l1Var);
    }

    public static k1 l() {
        return (k1) zzb.j();
    }

    public static k1 m(l1 l1Var) {
        b5 j10 = zzb.j();
        c5 c5Var = j10.a;
        if (!c5Var.equals(l1Var)) {
            if (!j10.b.g()) {
                c5 c5Var2 = (c5) c5Var.h(4, null);
                b6.c.a(c5Var2.getClass()).d(c5Var2, j10.b);
                j10.b = c5Var2;
            }
            c5 c5Var3 = j10.b;
            b6.c.a(c5Var3.getClass()).d(c5Var3, l1Var);
        }
        return (k1) j10;
    }

    public static l1 n() {
        return zzb;
    }

    public static /* synthetic */ void o(l1 l1Var, i2 i2Var) {
        l1Var.zze = i2Var;
        l1Var.zzd |= 1;
    }

    public static /* synthetic */ void p(l1 l1Var, boolean z10) {
        l1Var.zzd |= 2;
        l1Var.zzf = z10;
    }

    public static /* synthetic */ void q(l1 l1Var, long j10) {
        l1Var.zzd |= 4;
        l1Var.zzg = j10;
    }

    public static /* synthetic */ void r(l1 l1Var, int i3) {
        l1Var.zzd |= 64;
        l1Var.zzk = i3;
    }

    public static /* synthetic */ void s(l1 l1Var, int i3) {
        l1Var.zzd |= 128;
        l1Var.zzl = i3;
    }

    public static /* synthetic */ void t(l1 l1Var, int i3) {
        l1Var.zzd |= 1024;
        l1Var.zzo = i3;
    }

    public static /* synthetic */ void u(l1 l1Var, boolean z10) {
        l1Var.zzd |= 2048;
        l1Var.zzp = z10;
    }

    public static /* synthetic */ void v(l1 l1Var, int i3) {
        l1Var.zzd |= TLObject.FLAG_12;
        l1Var.zzq = i3;
    }

    public static /* synthetic */ void w(l1 l1Var, int i3) {
        l1Var.zzd |= TLObject.FLAG_13;
        l1Var.zzr = i3;
    }

    public static /* synthetic */ void x(l1 l1Var, boolean z10) {
        l1Var.zzd |= TLObject.FLAG_14;
        l1Var.zzs = z10;
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i3, c5 c5Var) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new d6(zzb, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\tဉ\b\n᠌\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", y.y, "zzj", y.x, "zzk", "zzl", "zzm", "zzn", y.Q, "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i10 == 3) {
            return new l1();
        }
        if (i10 == 4) {
            return new k1(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
