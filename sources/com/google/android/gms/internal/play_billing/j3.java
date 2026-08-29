package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j3 extends u1 {
    private static final j3 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private String zzf = "";
    private String zzh = "";

    static {
        j3 j3Var = new j3();
        zzb = j3Var;
        u1.k(j3.class, j3Var);
    }

    public static /* synthetic */ void n(j3 j3Var, String str) {
        j3Var.zzd |= 8;
        j3Var.zzh = str;
    }

    public static /* synthetic */ void o(j3 j3Var, String str) {
        str.getClass();
        j3Var.zzd |= 2;
        j3Var.zzf = str;
    }

    public static /* synthetic */ void p(j3 j3Var, int i10) {
        j3Var.zzd |= 16;
        j3Var.zzi = i10;
    }

    public static void q(j3 j3Var, int i10) {
        j3Var.zzg = a4.w.c(i10);
        j3Var.zzd |= 4;
    }

    public static /* synthetic */ void r(j3 j3Var, int i10) {
        j3Var.zzd |= 1;
        j3Var.zze = i10;
    }

    public static i3 s() {
        return (i3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.u1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r2(zzb, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", d1.d, "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new j3();
        }
        if (i11 == 4) {
            return new i3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
