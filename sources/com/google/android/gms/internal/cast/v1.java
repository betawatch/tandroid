package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class v1 extends f5 {
    private static final v1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        v1 v1Var = new v1();
        zzb = v1Var;
        f5.e(v1.class, v1Var);
    }

    public static u1 l() {
        return (u1) zzb.j();
    }

    public static /* synthetic */ void m(v1 v1Var, int i10) {
        v1Var.zzd |= 2;
        v1Var.zzf = i10;
    }

    public static /* synthetic */ void n(v1 v1Var, int i10) {
        v1Var.zzd |= 4;
        v1Var.zzg = i10;
    }

    public static /* synthetic */ void o(v1 v1Var, int i10) {
        v1Var.zzd |= 8;
        v1Var.zzh = i10;
    }

    public static /* synthetic */ void p(v1 v1Var, int i10) {
        v1Var.zzd |= 16;
        v1Var.zzi = i10;
    }

    public static /* synthetic */ void q(v1 v1Var, int i10) {
        v1Var.zze = i10 - 1;
        v1Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new g6(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", a1.r, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new v1();
        }
        if (i11 == 4) {
            return new u1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
