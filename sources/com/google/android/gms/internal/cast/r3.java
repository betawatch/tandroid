package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class r3 extends f5 {
    private static final r3 zzb;
    private int zzd;
    private int zze;
    private k5 zzf;
    private k5 zzg;
    private int zzh;

    static {
        r3 r3Var = new r3();
        zzb = r3Var;
        f5.e(r3.class, r3Var);
    }

    public r3() {
        g6 g6Var = g6.d;
        this.zzf = g6Var;
        this.zzg = g6Var;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzd", "zze", z0.x, "zzf", e3.class, "zzg", e3.class, "zzh"});
        }
        if (i11 == 3) {
            return new r3();
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
