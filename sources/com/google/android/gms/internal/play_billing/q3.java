package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class q3 extends v1 {
    private static final q3 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;

    static {
        q3 q3Var = new q3();
        zzb = q3Var;
        v1.k(q3.class, q3Var);
    }

    public static /* synthetic */ void n(q3 q3Var, int i10) {
        q3Var.zzd |= 128;
        q3Var.zzl = i10;
    }

    public static /* synthetic */ void o(q3 q3Var, int i10) {
        q3Var.zzd |= 256;
        q3Var.zzm = i10;
    }

    public static /* synthetic */ void p(q3 q3Var, int i10) {
        q3Var.zzd |= 8;
        q3Var.zzh = i10;
    }

    public static /* synthetic */ void q(q3 q3Var, long j10) {
        q3Var.zzd |= 16;
        q3Var.zzi = j10;
    }

    public static /* synthetic */ void r(q3 q3Var, long j10) {
        q3Var.zzd |= 32;
        q3Var.zzj = j10;
    }

    public static /* synthetic */ void s(q3 q3Var) {
        q3Var.zzd |= 512;
        q3Var.zzn = 772604006L;
    }

    public static /* synthetic */ void t(q3 q3Var, String str) {
        str.getClass();
        q3Var.zzd |= 4;
        q3Var.zzg = str;
    }

    public static /* synthetic */ void u(q3 q3Var) {
        q3Var.zzd |= 64;
        q3Var.zzk = false;
    }

    public static /* synthetic */ void v(q3 q3Var) {
        q3Var.zzd |= 1;
        q3Var.zze = "8.0.0";
    }

    public static /* synthetic */ void w(q3 q3Var, String str) {
        q3Var.zzd |= 2;
        q3Var.zzf = str;
    }

    public static p3 x() {
        return (p3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s2(zzb, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i11 == 3) {
            return new q3();
        }
        if (i11 == 4) {
            return new p3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
