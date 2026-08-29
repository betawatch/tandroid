package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d2 extends f5 {
    private static final d2 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        d2 d2Var = new d2();
        zzb = d2Var;
        f5.e(d2.class, d2Var);
    }

    public static c2 l() {
        return (c2) zzb.j();
    }

    public static /* synthetic */ void m(d2 d2Var, int i10) {
        d2Var.zzd |= 2;
        d2Var.zzf = i10;
    }

    public static /* synthetic */ void n(d2 d2Var, int i10) {
        d2Var.zze = i10 - 1;
        d2Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new g6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", a1.w, "zzf"});
        }
        if (i11 == 3) {
            return new d2();
        }
        if (i11 == 4) {
            return new c2(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
