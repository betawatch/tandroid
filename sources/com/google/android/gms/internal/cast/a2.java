package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a2 extends c5 {
    private static final a2 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        a2 a2Var = new a2();
        zzb = a2Var;
        c5.e(a2.class, a2Var);
    }

    public static z1 l() {
        return (z1) zzb.j();
    }

    public static /* synthetic */ void m(a2 a2Var, int i3) {
        a2Var.zzd |= 2;
        a2Var.zzf = i3;
    }

    public static /* synthetic */ void n(a2 a2Var, int i3) {
        a2Var.zze = i3 - 1;
        a2Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i3, c5 c5Var) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new d6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", x0.w, "zzf"});
        }
        if (i10 == 3) {
            return new a2();
        }
        if (i10 == 4) {
            return new z1(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
