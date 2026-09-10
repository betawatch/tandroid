package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class v3 extends v1 {
    private static final v3 zzb;
    private int zzd;
    private z1 zze = r2.e;
    private String zzf = "";
    private boolean zzg;

    static {
        v3 v3Var = new v3();
        zzb = v3Var;
        v1.k(v3.class, v3Var);
    }

    public static /* synthetic */ void n(v3 v3Var, boolean z10) {
        v3Var.zzd |= 2;
        v3Var.zzg = z10;
    }

    public static v3 o() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", u3.class, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new v3();
        }
        if (i11 == 4) {
            return new t3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
