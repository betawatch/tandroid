package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class o3 extends c5 {
    private static final o3 zzb;
    private int zzd;
    private int zze;
    private h5 zzf;
    private h5 zzg;
    private int zzh;

    static {
        o3 o3Var = new o3();
        zzb = o3Var;
        c5.e(o3.class, o3Var);
    }

    public o3() {
        c6 c6Var = c6.d;
        this.zzf = c6Var;
        this.zzg = c6Var;
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i10, c5 c5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new d6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzd", "zze", w0.x, "zzf", b3.class, "zzg", b3.class, "zzh"});
        }
        if (i11 == 3) {
            return new o3();
        }
        if (i11 == 4) {
            return new a3(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
