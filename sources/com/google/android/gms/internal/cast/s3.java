package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class s3 extends e5 {
    private static final s3 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private j5 zzg;
    private j5 zzh;
    private int zzi;

    static {
        s3 s3Var = new s3();
        zzb = s3Var;
        e5.e(s3.class, s3Var);
    }

    public s3() {
        e6 e6Var = e6.d;
        this.zzg = e6Var;
        this.zzh = e6Var;
    }

    @Override // com.google.android.gms.internal.cast.e5
    public final Object h(int i10, e5 e5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new f6(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004\u001b\u0005᠌\u0002", new Object[]{"zzd", "zze", z0.y, "zzf", z0.z, "zzg", k2.class, "zzh", k2.class, "zzi", z.L});
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
