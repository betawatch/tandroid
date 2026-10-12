package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class w3 extends v1 {
    private static final w3 zzb;
    private int zzd;
    private z1 zze = r2.e;
    private String zzf = "";
    private boolean zzg;

    static {
        w3 w3Var = new w3();
        zzb = w3Var;
        v1.k(w3.class, w3Var);
    }

    public static /* synthetic */ void n(w3 w3Var, boolean z10) {
        w3Var.zzd |= 2;
        w3Var.zzg = z10;
    }

    public static w3 o() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", v3.class, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new w3();
        }
        if (i11 == 4) {
            return new u3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
