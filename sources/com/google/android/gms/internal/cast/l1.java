package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class l1 extends b5 {
    private static final l1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        l1 l1Var = new l1();
        zzb = l1Var;
        b5.e(l1.class, l1Var);
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003᠌\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", w0.b, "zzh"});
        }
        if (i10 == 3) {
            return new l1();
        }
        if (i10 == 4) {
            return new s0(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
