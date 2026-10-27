package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c1 extends c5 {
    private static final f5 zzb = new b1();
    private static final c1 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private e5 zzh = d5.d;

    static {
        c1 c1Var = new c1();
        zzd = c1Var;
        c5.e(c1.class, c1Var);
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i10, c5 c5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new d6(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", w0.C});
        }
        if (i11 == 3) {
            return new c1();
        }
        if (i11 == 4) {
            return new s0(zzd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
