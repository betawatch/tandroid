package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k1 extends d5 {
    private static final k1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        k1 k1Var = new k1();
        zzb = k1Var;
        d5.e(k1.class, k1Var);
    }

    public static j1 l() {
        return (j1) zzb.j();
    }

    public static /* synthetic */ void m(k1 k1Var, String str) {
        str.getClass();
        k1Var.zzd |= 1;
        k1Var.zze = str;
    }

    public static /* synthetic */ void n(k1 k1Var, String str) {
        str.getClass();
        k1Var.zzd |= 2;
        k1Var.zzf = str;
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new k1();
        }
        if (i11 == 4) {
            return new j1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
