package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class v3 extends v1 {
    private static final v3 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        v3 v3Var = new v3();
        zzb = v3Var;
        v1.k(v3.class, v3Var);
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", d1.h, "zzf"});
        }
        if (i11 == 3) {
            return new v3();
        }
        if (i11 == 4) {
            return new y0(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
