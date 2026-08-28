package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public final Object d(int i9) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new s2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", u3.class, "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new v3();
        }
        if (i10 == 4) {
            return new t3(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
