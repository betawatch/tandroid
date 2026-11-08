package com.google.android.gms.internal.cast;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class k1 extends b5 {
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
        b5.e(k1.class, k1Var);
    }

    public static j1 l() {
        return (j1) zzb.j();
    }

    public static j1 m(k1 k1Var) {
        a5 j3 = zzb.j();
        b5 b5Var = j3.a;
        if (!b5Var.equals(k1Var)) {
            if (!j3.b.g()) {
                b5 b5Var2 = (b5) b5Var.h(4, null);
                a6.c.a(b5Var2.getClass()).d(b5Var2, j3.b);
                j3.b = b5Var2;
            }
            b5 b5Var3 = j3.b;
            a6.c.a(b5Var3.getClass()).d(b5Var3, k1Var);
        }
        return (j1) j3;
    }

    public static k1 n() {
        return zzb;
    }

    public static /* synthetic */ void o(k1 k1Var, h2 h2Var) {
        k1Var.zze = h2Var;
        k1Var.zzd |= 1;
    }

    public static /* synthetic */ void p(k1 k1Var, boolean z9) {
        k1Var.zzd |= 2;
        k1Var.zzf = z9;
    }

    public static /* synthetic */ void q(k1 k1Var, long j3) {
        k1Var.zzd |= 4;
        k1Var.zzg = j3;
    }

    public static /* synthetic */ void r(k1 k1Var, int i7) {
        k1Var.zzd |= 64;
        k1Var.zzk = i7;
    }

    public static /* synthetic */ void s(k1 k1Var, int i7) {
        k1Var.zzd |= 128;
        k1Var.zzl = i7;
    }

    public static /* synthetic */ void t(k1 k1Var, int i7) {
        k1Var.zzd |= 1024;
        k1Var.zzo = i7;
    }

    public static /* synthetic */ void u(k1 k1Var, boolean z9) {
        k1Var.zzd |= 2048;
        k1Var.zzp = z9;
    }

    public static /* synthetic */ void v(k1 k1Var, int i7) {
        k1Var.zzd |= TLObject.FLAG_12;
        k1Var.zzq = i7;
    }

    public static /* synthetic */ void w(k1 k1Var, int i7) {
        k1Var.zzd |= TLObject.FLAG_13;
        k1Var.zzr = i7;
    }

    public static /* synthetic */ void x(k1 k1Var, boolean z9) {
        k1Var.zzd |= TLObject.FLAG_14;
        k1Var.zzs = z9;
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\tဉ\b\n᠌\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", x.y, "zzj", x.x, "zzk", "zzl", "zzm", "zzn", x.P, "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i10 == 3) {
            return new k1();
        }
        if (i10 == 4) {
            return new j1(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
