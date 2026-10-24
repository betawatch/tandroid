package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class l3 extends v1 {
    private static final l3 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private String zzf = "";
    private String zzh = "";

    static {
        l3 l3Var = new l3();
        zzb = l3Var;
        v1.k(l3.class, l3Var);
    }

    public static /* synthetic */ void n(l3 l3Var, String str) {
        l3Var.zzd |= 8;
        l3Var.zzh = str;
    }

    public static /* synthetic */ void o(l3 l3Var, String str) {
        str.getClass();
        l3Var.zzd |= 2;
        l3Var.zzf = str;
    }

    public static /* synthetic */ void p(l3 l3Var, int i10) {
        l3Var.zzd |= 16;
        l3Var.zzi = i10;
    }

    public static void q(l3 l3Var, int i10) {
        l3Var.zzg = k3.b(i10);
        l3Var.zzd |= 4;
    }

    public static /* synthetic */ void r(l3 l3Var, int i10) {
        l3Var.zzd |= 1;
        l3Var.zze = i10;
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
            return new l3();
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
