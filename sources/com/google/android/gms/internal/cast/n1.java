package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class n1 extends h5 {
    private static final n1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        n1 n1Var = new n1();
        zzb = n1Var;
        h5.e(n1.class, n1Var);
    }

    public static m1 l() {
        return (m1) zzb.j();
    }

    public static /* synthetic */ void m(n1 n1Var, String str) {
        str.getClass();
        n1Var.zzd |= 1;
        n1Var.zze = str;
    }

    public static /* synthetic */ void n(n1 n1Var, String str) {
        str.getClass();
        n1Var.zzd |= 2;
        n1Var.zzf = str;
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new n1();
        }
        if (i11 == 4) {
            return new m1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
