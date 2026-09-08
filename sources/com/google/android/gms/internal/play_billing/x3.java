package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class x3 extends v1 {
    private static final x3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private p3 zzg;
    private q3 zzh;

    static {
        x3 x3Var = new x3();
        zzb = x3Var;
        v1.k(x3.class, x3Var);
    }

    public static /* synthetic */ void n(x3 x3Var, g3 g3Var) {
        x3Var.zzf = g3Var;
        x3Var.zze = 2;
    }

    public static /* synthetic */ void o(x3 x3Var, i3 i3Var) {
        x3Var.zzf = i3Var;
        x3Var.zze = 3;
    }

    public static /* synthetic */ void p(x3 x3Var, l3 l3Var) {
        l3Var.getClass();
        x3Var.zzf = l3Var;
        x3Var.zze = 7;
    }

    public static /* synthetic */ void q(x3 x3Var, p3 p3Var) {
        p3Var.getClass();
        x3Var.zzg = p3Var;
        x3Var.zzd |= 1;
    }

    public static /* synthetic */ void r(x3 x3Var, a4 a4Var) {
        x3Var.zzf = a4Var;
        x3Var.zze = 8;
    }

    public static /* synthetic */ void s(x3 x3Var, b4 b4Var) {
        x3Var.zzf = b4Var;
        x3Var.zze = 4;
    }

    public static w3 t() {
        return (w3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s2(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", g3.class, i3.class, b4.class, n3.class, "zzh", l3.class, a4.class});
        }
        if (i11 == 3) {
            return new x3();
        }
        if (i11 == 4) {
            return new w3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
