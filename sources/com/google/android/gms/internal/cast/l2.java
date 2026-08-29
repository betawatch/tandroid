package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l2 extends f5 {
    private static final l2 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        l2 l2Var = new l2();
        zzb = l2Var;
        f5.e(l2.class, l2Var);
    }

    public static k2 l() {
        return (k2) zzb.j();
    }

    public static /* synthetic */ void m(l2 l2Var, String str) {
        str.getClass();
        l2Var.zzd |= 1;
        l2Var.zze = str;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new g6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new l2();
        }
        if (i11 == 4) {
            return new k2(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
