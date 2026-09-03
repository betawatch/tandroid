package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class j2 extends d5 {
    private static final j2 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        j2 j2Var = new j2();
        zzb = j2Var;
        d5.e(j2.class, j2Var);
    }

    public static i2 l() {
        return (i2) zzb.j();
    }

    public static /* synthetic */ void m(j2 j2Var, String str) {
        str.getClass();
        j2Var.zzd |= 1;
        j2Var.zze = str;
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
            return new j2();
        }
        if (i11 == 4) {
            return new i2(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
