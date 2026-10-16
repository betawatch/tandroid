package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class y3 extends v1 {
    private static final y3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private q3 zzg;
    private r3 zzh;

    static {
        y3 y3Var = new y3();
        zzb = y3Var;
        v1.k(y3.class, y3Var);
    }

    public static /* synthetic */ void n(y3 y3Var, g3 g3Var) {
        y3Var.zzf = g3Var;
        y3Var.zze = 2;
    }

    public static /* synthetic */ void o(y3 y3Var, i3 i3Var) {
        y3Var.zzf = i3Var;
        y3Var.zze = 3;
    }

    public static /* synthetic */ void p(y3 y3Var, m3 m3Var) {
        m3Var.getClass();
        y3Var.zzf = m3Var;
        y3Var.zze = 7;
    }

    public static /* synthetic */ void q(y3 y3Var, q3 q3Var) {
        q3Var.getClass();
        y3Var.zzg = q3Var;
        y3Var.zzd |= 1;
    }

    public static /* synthetic */ void r(y3 y3Var, b4 b4Var) {
        y3Var.zzf = b4Var;
        y3Var.zze = 8;
    }

    public static /* synthetic */ void s(y3 y3Var, c4 c4Var) {
        y3Var.zzf = c4Var;
        y3Var.zze = 4;
    }

    public static x3 t() {
        return (x3) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.v1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new s2(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", g3.class, i3.class, c4.class, o3.class, "zzh", m3.class, b4.class});
        }
        if (i11 == 3) {
            return new y3();
        }
        if (i11 == 4) {
            return new x3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
