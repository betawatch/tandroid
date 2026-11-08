package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class z1 extends b5 {
    private static final z1 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        z1 z1Var = new z1();
        zzb = z1Var;
        b5.e(z1.class, z1Var);
    }

    public static y1 l() {
        return (y1) zzb.j();
    }

    public static /* synthetic */ void m(z1 z1Var, int i7) {
        z1Var.zzd |= 2;
        z1Var.zzf = i7;
    }

    public static /* synthetic */ void n(z1 z1Var, int i7) {
        z1Var.zze = i7 - 1;
        z1Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", w0.w, "zzf"});
        }
        if (i10 == 3) {
            return new z1();
        }
        if (i10 == 4) {
            return new y1(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
