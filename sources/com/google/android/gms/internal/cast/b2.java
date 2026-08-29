package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b2 extends f5 {
    private static final b2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        b2 b2Var = new b2();
        zzb = b2Var;
        f5.e(b2.class, b2Var);
    }

    public static a2 l() {
        return (a2) zzb.j();
    }

    public static /* synthetic */ void m(b2 b2Var, int i10) {
        b2Var.zzd |= 2;
        b2Var.zzf = i10;
    }

    public static /* synthetic */ void n(b2 b2Var, int i10) {
        b2Var.zzd |= 4;
        b2Var.zzg = i10;
    }

    public static /* synthetic */ void o(b2 b2Var, int i10) {
        b2Var.zzd |= 8;
        b2Var.zzh = i10;
    }

    public static /* synthetic */ void p(b2 b2Var, int i10) {
        b2Var.zze = i10 - 1;
        b2Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new g6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", a1.t, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new b2();
        }
        if (i11 == 4) {
            return new a2(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
