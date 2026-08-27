package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class u3 extends u1 {
    private static final u3 zzb;
    private int zzd;
    private y1 zze = q2.e;
    private String zzf = "";
    private boolean zzg;

    static {
        u3 u3Var = new u3();
        zzb = u3Var;
        u1.k(u3.class, u3Var);
    }

    public static /* synthetic */ void n(u3 u3Var, boolean z10) {
        u3Var.zzd |= 2;
        u3Var.zzg = z10;
    }

    public static u3 o() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.u1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", t3.class, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new u3();
        }
        if (i11 == 4) {
            return new s3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
