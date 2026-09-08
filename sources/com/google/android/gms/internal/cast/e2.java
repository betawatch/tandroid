package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class e2 extends h5 {
    private static final e2 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        e2 e2Var = new e2();
        zzb = e2Var;
        h5.e(e2.class, e2Var);
    }

    public static d2 l() {
        return (d2) zzb.j();
    }

    public static /* synthetic */ void m(e2 e2Var, int i10) {
        e2Var.zzd |= 2;
        e2Var.zzf = i10;
    }

    public static /* synthetic */ void n(e2 e2Var, int i10) {
        e2Var.zze = i10 - 1;
        e2Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", b1.w, "zzf"});
        }
        if (i11 == 3) {
            return new e2();
        }
        if (i11 == 4) {
            return new d2(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
