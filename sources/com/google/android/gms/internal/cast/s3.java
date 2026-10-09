package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class s3 extends f5 {
    private static final s3 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private k5 zzg;
    private k5 zzh;
    private int zzi;

    static {
        s3 s3Var = new s3();
        zzb = s3Var;
        f5.e(s3.class, s3Var);
    }

    public s3() {
        f6 f6Var = f6.d;
        this.zzg = f6Var;
        this.zzh = f6Var;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new g6(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004\u001b\u0005᠌\u0002", new Object[]{"zzd", "zze", z0.y, "zzf", z0.z, "zzg", k2.class, "zzh", k2.class, "zzi", z.O});
        }
        if (i11 == 3) {
            return new s3();
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
