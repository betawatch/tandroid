package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class r1 extends b5 {
    private static final r1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        r1 r1Var = new r1();
        zzb = r1Var;
        b5.e(r1.class, r1Var);
    }

    public static q1 l() {
        return (q1) zzb.j();
    }

    public static /* synthetic */ void m(r1 r1Var, int i7) {
        r1Var.zzd |= 2;
        r1Var.zzf = i7;
    }

    public static /* synthetic */ void n(r1 r1Var, int i7) {
        r1Var.zzd |= 4;
        r1Var.zzg = i7;
    }

    public static /* synthetic */ void o(r1 r1Var, int i7) {
        r1Var.zzd |= 8;
        r1Var.zzh = i7;
    }

    public static /* synthetic */ void p(r1 r1Var, int i7) {
        r1Var.zzd |= 16;
        r1Var.zzi = i7;
    }

    public static /* synthetic */ void q(r1 r1Var, int i7) {
        r1Var.zze = i7 - 1;
        r1Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", w0.r, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new r1();
        }
        if (i10 == 4) {
            return new q1(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
