package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class x1 extends b5 {
    private static final x1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        x1 x1Var = new x1();
        zzb = x1Var;
        b5.e(x1.class, x1Var);
    }

    public static w1 l() {
        return (w1) zzb.j();
    }

    public static /* synthetic */ void m(x1 x1Var, int i7) {
        x1Var.zzd |= 2;
        x1Var.zzf = i7;
    }

    public static /* synthetic */ void n(x1 x1Var, int i7) {
        x1Var.zzd |= 4;
        x1Var.zzg = i7;
    }

    public static /* synthetic */ void o(x1 x1Var, int i7) {
        x1Var.zzd |= 8;
        x1Var.zzh = i7;
    }

    public static /* synthetic */ void p(x1 x1Var, int i7) {
        x1Var.zze = i7 - 1;
        x1Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", w0.t, "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new x1();
        }
        if (i10 == 4) {
            return new w1(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
