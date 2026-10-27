package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class p3 extends c5 {
    private static final p3 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private h5 zzg;
    private h5 zzh;
    private int zzi;

    static {
        p3 p3Var = new p3();
        zzb = p3Var;
        c5.e(p3.class, p3Var);
    }

    public p3() {
        c6 c6Var = c6.d;
        this.zzg = c6Var;
        this.zzh = c6Var;
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i10, c5 c5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new d6(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004\u001b\u0005᠌\u0002", new Object[]{"zzd", "zze", w0.y, "zzf", w0.z, "zzg", h2.class, "zzh", h2.class, "zzi", x.O});
        }
        if (i11 == 3) {
            return new p3();
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
