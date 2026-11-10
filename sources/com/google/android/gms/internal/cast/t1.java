package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class t1 extends b5 {
    private static final t1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;

    static {
        t1 t1Var = new t1();
        zzb = t1Var;
        b5.e(t1.class, t1Var);
    }

    public static s1 l() {
        return (s1) zzb.j();
    }

    public static /* synthetic */ void m(t1 t1Var, int i7) {
        t1Var.zzd |= 2;
        t1Var.zzf = i7;
    }

    public static /* synthetic */ void n(t1 t1Var, int i7) {
        t1Var.zzd |= 4;
        t1Var.zzg = i7;
    }

    public static /* synthetic */ void o(t1 t1Var, boolean z9) {
        t1Var.zzd |= 8;
        t1Var.zzh = z9;
    }

    public static /* synthetic */ void p(t1 t1Var, int i7) {
        t1Var.zze = i7 - 1;
        t1Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", w0.s, "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new t1();
        }
        if (i10 == 4) {
            return new s1(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
