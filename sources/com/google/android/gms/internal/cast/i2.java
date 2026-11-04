package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i2 extends c5 {
    private static final i2 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        i2 i2Var = new i2();
        zzb = i2Var;
        c5.e(i2.class, i2Var);
    }

    public static h2 l() {
        return (h2) zzb.j();
    }

    public static /* synthetic */ void m(i2 i2Var, String str) {
        str.getClass();
        i2Var.zzd |= 1;
        i2Var.zze = str;
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i3, c5 c5Var) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new d6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new i2();
        }
        if (i10 == 4) {
            return new h2(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
