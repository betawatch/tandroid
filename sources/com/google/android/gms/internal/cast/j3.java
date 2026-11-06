package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class j3 extends b5 {
    private static final j3 zzb;
    private int zzd;
    private String zze = "";
    private g5 zzf;
    private g5 zzg;
    private boolean zzh;

    static {
        j3 j3Var = new j3();
        zzb = j3Var;
        b5.e(j3.class, j3Var);
    }

    public j3() {
        b6 b6Var = b6.d;
        this.zzf = b6Var;
        this.zzg = b6Var;
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzd", "zze", "zzf", o2.class, "zzg", h2.class, "zzh"});
        }
        if (i10 == 3) {
            return new j3();
        }
        if (i10 == 4) {
            return new a3(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
