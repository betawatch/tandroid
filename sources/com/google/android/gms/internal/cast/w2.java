package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class w2 extends c5 {
    private static final w2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        w2 w2Var = new w2();
        zzb = w2Var;
        c5.e(w2.class, w2Var);
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i10, c5 c5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new d6(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005᠌\u0004\u0006ဆ\u0005", new Object[]{"zzd", "zze", "zzf", w0.e, "zzg", "zzh", "zzi", x.L, "zzj"});
        }
        if (i11 == 3) {
            return new w2();
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
