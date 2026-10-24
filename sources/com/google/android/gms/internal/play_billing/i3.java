package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class i3 extends v1 {
    private static final i3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        i3 i3Var = new i3();
        zzb = i3Var;
        v1.k(i3.class, i3Var);
    }

    public static void o(i3 i3Var, n3 n3Var) {
        i3Var.zzh = n3Var.a;
        i3Var.zzd |= 2;
    }

    public static /* synthetic */ void p(i3 i3Var, w3 w3Var) {
        i3Var.zzf = w3Var;
        i3Var.zze = 4;
    }

    public static /* synthetic */ void q(i3 i3Var, e4 e4Var) {
        i3Var.zzf = e4Var;
        i3Var.zze = 3;
    }

    public static /* synthetic */ void r(i3 i3Var, int i10) {
        i3Var.zzg = i10 - 1;
        i3Var.zzd |= 1;
    }

    public static h3 s() {
        return (h3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s2(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", d1.c, s3.class, e4.class, w3.class, "zzh", d1.e});
        }
        if (i11 == 3) {
            return new i3();
        }
        if (i11 == 4) {
            return new h3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }

    public final w3 n() {
        return this.zze == 4 ? (w3) this.zzf : w3.o();
    }
}
