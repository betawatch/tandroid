package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class f1 extends f5 {
    private static final i5 zzb = new e1();
    private static final f1 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private h5 zzh = g5.d;

    static {
        f1 f1Var = new f1();
        zzd = f1Var;
        f5.e(f1.class, f1Var);
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", z0.C});
        }
        if (i11 == 3) {
            return new f1();
        }
        if (i11 == 4) {
            return new v0(zzd);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
