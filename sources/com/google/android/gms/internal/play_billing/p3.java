package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class p3 extends v1 {
    private static final p3 zzb;
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
        p3 p3Var = new p3();
        zzb = p3Var;
        v1.k(p3.class, p3Var);
    }

    public static /* synthetic */ void n(p3 p3Var, int i10) {
        p3Var.zzd |= 128;
        p3Var.zzl = i10;
    }

    public static /* synthetic */ void o(p3 p3Var, int i10) {
        p3Var.zzd |= 256;
        p3Var.zzm = i10;
    }

    public static /* synthetic */ void p(p3 p3Var, int i10) {
        p3Var.zzd |= 8;
        p3Var.zzh = i10;
    }

    public static /* synthetic */ void q(p3 p3Var, long j10) {
        p3Var.zzd |= 16;
        p3Var.zzi = j10;
    }

    public static /* synthetic */ void r(p3 p3Var, long j10) {
        p3Var.zzd |= 32;
        p3Var.zzj = j10;
    }

    public static /* synthetic */ void s(p3 p3Var) {
        p3Var.zzd |= 512;
        p3Var.zzn = 772604006L;
    }

    public static /* synthetic */ void t(p3 p3Var, String str) {
        str.getClass();
        p3Var.zzd |= 4;
        p3Var.zzg = str;
    }

    public static /* synthetic */ void u(p3 p3Var) {
        p3Var.zzd |= 64;
        p3Var.zzk = false;
    }

    public static /* synthetic */ void v(p3 p3Var) {
        p3Var.zzd |= 1;
        p3Var.zze = "8.0.0";
    }

    public static /* synthetic */ void w(p3 p3Var, String str) {
        p3Var.zzd |= 2;
        p3Var.zzf = str;
    }

    public static o3 x() {
        return (o3) zzb.f();
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
            return new p3();
        }
        if (i11 == 4) {
            return new o3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
