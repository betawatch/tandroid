package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l1 extends f5 {
    private static final l1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        l1 l1Var = new l1();
        zzb = l1Var;
        f5.e(l1.class, l1Var);
    }

    public static k1 l() {
        return (k1) zzb.j();
    }

    public static /* synthetic */ void m(l1 l1Var, String str) {
        str.getClass();
        l1Var.zzd |= 1;
        l1Var.zze = str;
    }

    public static /* synthetic */ void n(l1 l1Var, String str) {
        str.getClass();
        l1Var.zzd |= 2;
        l1Var.zzf = str;
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
            return new l1();
        }
        if (i10 == 4) {
            return new k1(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
