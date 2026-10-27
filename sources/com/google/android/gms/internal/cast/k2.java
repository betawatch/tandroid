package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class k2 extends c5 {
    private static final k2 zzb;
    private int zzd;
    private boolean zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private w2 zzi;
    private int zzj;
    private boolean zzk;

    static {
        k2 k2Var = new k2();
        zzb = k2Var;
        c5.e(k2.class, k2Var);
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i10, c5 c5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new d6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006᠌\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", x.O, "zzg", x.Q, "zzh", x.y, "zzi", "zzj", x.P, "zzk"});
        }
        if (i11 == 3) {
            return new k2();
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
