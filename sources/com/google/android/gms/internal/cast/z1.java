package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class z1 extends c5 {
    private static final z1 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        z1 z1Var = new z1();
        zzb = z1Var;
        c5.e(z1.class, z1Var);
    }

    public static y1 l() {
        return (y1) zzb.j();
    }

    public static /* synthetic */ void m(z1 z1Var, int i10) {
        z1Var.zzd |= 2;
        z1Var.zzf = i10;
    }

    public static /* synthetic */ void n(z1 z1Var, int i10) {
        z1Var.zze = i10 - 1;
        z1Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i10, c5 c5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new d6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", w0.w, "zzf"});
        }
        if (i11 == 3) {
            return new z1();
        }
        if (i11 == 4) {
            return new y1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
