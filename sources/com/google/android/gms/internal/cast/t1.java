package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class t1 extends c5 {
    private static final t1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;

    static {
        t1 t1Var = new t1();
        zzb = t1Var;
        c5.e(t1.class, t1Var);
    }

    public static s1 l() {
        return (s1) zzb.j();
    }

    public static /* synthetic */ void m(t1 t1Var, int i10) {
        t1Var.zzd |= 2;
        t1Var.zzf = i10;
    }

    public static /* synthetic */ void n(t1 t1Var, int i10) {
        t1Var.zzd |= 4;
        t1Var.zzg = i10;
    }

    public static /* synthetic */ void o(t1 t1Var, boolean z10) {
        t1Var.zzd |= 8;
        t1Var.zzh = z10;
    }

    public static /* synthetic */ void p(t1 t1Var, int i10) {
        t1Var.zze = i10 - 1;
        t1Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i10, c5 c5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new d6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", w0.s, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new t1();
        }
        if (i11 == 4) {
            return new s1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
