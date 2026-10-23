package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new l1();
        }
        if (i11 == 4) {
            return new k1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
