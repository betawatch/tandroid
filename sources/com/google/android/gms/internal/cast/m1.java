package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m1 extends f5 {
    private static final m1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        m1 m1Var = new m1();
        zzb = m1Var;
        f5.e(m1.class, m1Var);
    }

    public static l1 l() {
        return (l1) zzb.j();
    }

    public static /* synthetic */ void m(m1 m1Var, String str) {
        str.getClass();
        m1Var.zzd |= 1;
        m1Var.zze = str;
    }

    public static /* synthetic */ void n(m1 m1Var, String str) {
        str.getClass();
        m1Var.zzd |= 2;
        m1Var.zzf = str;
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
            return new m1();
        }
        if (i11 == 4) {
            return new l1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
