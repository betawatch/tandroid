package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class j3 extends f5 {
    private static final j3 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        j3 j3Var = new j3();
        zzb = j3Var;
        f5.e(j3.class, j3Var);
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            z0 z0Var = z0.k;
            return new h6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", z0Var, "zzf", z0Var});
        }
        if (i11 == 3) {
            return new j3();
        }
        if (i11 == 4) {
            return new d3(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
