package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j1 extends c5 {
    private static final j1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        j1 j1Var = new j1();
        zzb = j1Var;
        c5.e(j1.class, j1Var);
    }

    public static i1 l() {
        return (i1) zzb.j();
    }

    public static /* synthetic */ void m(j1 j1Var, String str) {
        str.getClass();
        j1Var.zzd |= 1;
        j1Var.zze = str;
    }

    public static /* synthetic */ void n(j1 j1Var, String str) {
        str.getClass();
        j1Var.zzd |= 2;
        j1Var.zzf = str;
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
            return new j1();
        }
        if (i10 == 4) {
            return new i1(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
