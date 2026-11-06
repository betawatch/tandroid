package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class h2 extends b5 {
    private static final h2 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        h2 h2Var = new h2();
        zzb = h2Var;
        b5.e(h2.class, h2Var);
    }

    public static g2 l() {
        return (g2) zzb.j();
    }

    public static /* synthetic */ void m(h2 h2Var, String str) {
        str.getClass();
        h2Var.zzd |= 1;
        h2Var.zze = str;
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new h2();
        }
        if (i10 == 4) {
            return new g2(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
