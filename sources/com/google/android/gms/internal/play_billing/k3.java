package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class k3 extends v1 {
    private static final k3 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private String zzf = "";
    private String zzh = "";

    static {
        k3 k3Var = new k3();
        zzb = k3Var;
        v1.k(k3.class, k3Var);
    }

    public static /* synthetic */ void n(k3 k3Var, String str) {
        k3Var.zzd |= 8;
        k3Var.zzh = str;
    }

    public static /* synthetic */ void o(k3 k3Var, String str) {
        str.getClass();
        k3Var.zzd |= 2;
        k3Var.zzf = str;
    }

    public static /* synthetic */ void p(k3 k3Var, int i10) {
        k3Var.zzd |= 16;
        k3Var.zzi = i10;
    }

    public static void q(k3 k3Var, int i10) {
        k3Var.zzg = a4.a.d(i10);
        k3Var.zzd |= 4;
    }

    public static /* synthetic */ void r(k3 k3Var, int i10) {
        k3Var.zzd |= 1;
        k3Var.zze = i10;
    }

    public static j3 s() {
        return (j3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s2(zzb, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", d1.d, "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new k3();
        }
        if (i11 == 4) {
            return new j3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
