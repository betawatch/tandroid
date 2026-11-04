package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y3 extends v1 {
    private static final y3 zzb;
    private int zzd;
    private int zzf;
    private z1 zze = r2.e;
    private String zzg = "";

    static {
        y3 y3Var = new y3();
        zzb = y3Var;
        v1.k(y3.class, y3Var);
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final Object d(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new s2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new y3();
        }
        if (i10 == 4) {
            return new y0(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
