package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class r3 extends c5 {
    private static final f5 zzb = new b1();
    private static final r3 zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzi;
    private long zzk;
    private e5 zzh = d5.d;
    private h5 zzj = c6.d;

    static {
        r3 r3Var = new r3();
        zzd = r3Var;
        c5.e(r3.class, r3Var);
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i10, c5 c5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new d6(zzd, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ࠞ\u0005᠌\u0002\u0006\u001b\u0007ဂ\u0003", new Object[]{"zze", "zzf", w0.B, "zzg", x.O, "zzh", w0.A, "zzi", x.I, "zzj", q3.class, "zzk"});
        }
        if (i11 == 3) {
            return new r3();
        }
        if (i11 == 4) {
            return new a3(zzd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
