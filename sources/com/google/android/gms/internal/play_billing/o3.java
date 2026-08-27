package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class o3 extends u1 {
    private static final o3 zzb;
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
        o3 o3Var = new o3();
        zzb = o3Var;
        u1.k(o3.class, o3Var);
    }

    public static /* synthetic */ void n(o3 o3Var, int i10) {
        o3Var.zzd |= 128;
        o3Var.zzl = i10;
    }

    public static /* synthetic */ void o(o3 o3Var, int i10) {
        o3Var.zzd |= 256;
        o3Var.zzm = i10;
    }

    public static /* synthetic */ void p(o3 o3Var, int i10) {
        o3Var.zzd |= 8;
        o3Var.zzh = i10;
    }

    public static /* synthetic */ void q(o3 o3Var, long j10) {
        o3Var.zzd |= 16;
        o3Var.zzi = j10;
    }

    public static /* synthetic */ void r(o3 o3Var, long j10) {
        o3Var.zzd |= 32;
        o3Var.zzj = j10;
    }

    public static /* synthetic */ void s(o3 o3Var) {
        o3Var.zzd |= 512;
        o3Var.zzn = 772604006L;
    }

    public static /* synthetic */ void t(o3 o3Var, String str) {
        str.getClass();
        o3Var.zzd |= 4;
        o3Var.zzg = str;
    }

    public static /* synthetic */ void u(o3 o3Var) {
        o3Var.zzd |= 64;
        o3Var.zzk = false;
    }

    public static /* synthetic */ void v(o3 o3Var) {
        o3Var.zzd |= 1;
        o3Var.zze = "8.0.0";
    }

    public static /* synthetic */ void w(o3 o3Var, String str) {
        o3Var.zzd |= 2;
        o3Var.zzf = str;
    }

    public static n3 x() {
        return (n3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.u1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r2(zzb, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i11 == 3) {
            return new o3();
        }
        if (i11 == 4) {
            return new n3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
