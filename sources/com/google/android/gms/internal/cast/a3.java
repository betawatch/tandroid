package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class a3 extends f5 {
    private static final a3 zzb;
    private int zzd;
    private long zze;
    private j5 zzf;
    private j5 zzg;

    static {
        a3 a3Var = new a3();
        zzb = a3Var;
        f5.e(a3.class, a3Var);
    }

    public a3() {
        s5 s5Var = s5.d;
        this.zzf = s5Var;
        this.zzg = s5Var;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new g6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new a3();
        }
        if (i11 == 4) {
            return new v0(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
