package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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

    public static /* synthetic */ void p(k3 k3Var, int i7) {
        k3Var.zzd |= 16;
        k3Var.zzi = i7;
    }

    public static void q(k3 k3Var, int i7) {
        k3Var.zzg = a8.p0.e(i7);
        k3Var.zzd |= 4;
    }

    public static /* synthetic */ void r(k3 k3Var, int i7) {
        k3Var.zzd |= 1;
        k3Var.zze = i7;
    }

    public static j3 s() {
        return (j3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final Object d(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new s2(zzb, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", d1.d, "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new k3();
        }
        if (i10 == 4) {
            return new j3(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
