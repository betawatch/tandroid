package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class r1 extends c5 {
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
        c5.e(r1.class, r1Var);
    }

    public static q1 l() {
        return (q1) zzb.j();
    }

    public static /* synthetic */ void m(r1 r1Var, int i10) {
        r1Var.zzd |= 2;
        r1Var.zzf = i10;
    }

    public static /* synthetic */ void n(r1 r1Var, int i10) {
        r1Var.zzd |= 4;
        r1Var.zzg = i10;
    }

    public static /* synthetic */ void o(r1 r1Var, int i10) {
        r1Var.zzd |= 8;
        r1Var.zzh = i10;
    }

    public static /* synthetic */ void p(r1 r1Var, int i10) {
        r1Var.zzd |= 16;
        r1Var.zzi = i10;
    }

    public static /* synthetic */ void q(r1 r1Var, int i10) {
        r1Var.zze = i10 - 1;
        r1Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i10, c5 c5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new d6(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", w0.r, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new r1();
        }
        if (i11 == 4) {
            return new q1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
