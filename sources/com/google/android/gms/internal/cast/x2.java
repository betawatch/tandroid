package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class x2 extends c5 {
    private static final x2 zzb;
    private int zzd;
    private long zze;
    private g5 zzf;
    private g5 zzg;

    static {
        x2 x2Var = new x2();
        zzb = x2Var;
        c5.e(x2.class, x2Var);
    }

    public x2() {
        p5 p5Var = p5.d;
        this.zzf = p5Var;
        this.zzg = p5Var;
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i10, c5 c5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new d6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new x2();
        }
        if (i11 == 4) {
            return new s0(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
