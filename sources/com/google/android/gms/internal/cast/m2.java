package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class m2 extends h5 {
    private static final m2 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        m2 m2Var = new m2();
        zzb = m2Var;
        h5.e(m2.class, m2Var);
    }

    public static l2 l() {
        return (l2) zzb.j();
    }

    public static /* synthetic */ void m(m2 m2Var, String str) {
        str.getClass();
        m2Var.zzd |= 1;
        m2Var.zze = str;
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
            return new m2();
        }
        if (i11 == 4) {
            return new l2(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
