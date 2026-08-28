package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k2 extends f5 {
    private static final k2 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        k2 k2Var = new k2();
        zzb = k2Var;
        f5.e(k2.class, k2Var);
    }

    public static j2 l() {
        return (j2) zzb.j();
    }

    public static /* synthetic */ void m(k2 k2Var, String str) {
        str.getClass();
        k2Var.zzd |= 1;
        k2Var.zze = str;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i9, f5 f5Var) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new k2();
        }
        if (i10 == 4) {
            return new j2(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
