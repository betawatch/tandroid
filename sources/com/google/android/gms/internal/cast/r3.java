package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r3 extends d5 {
    private static final r3 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private i5 zzg;
    private i5 zzh;
    private int zzi;

    static {
        r3 r3Var = new r3();
        zzb = r3Var;
        d5.e(r3.class, r3Var);
    }

    public r3() {
        d6 d6Var = d6.d;
        this.zzg = d6Var;
        this.zzh = d6Var;
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004\u001b\u0005᠌\u0002", new Object[]{"zzd", "zze", y0.y, "zzf", y0.z, "zzg", j2.class, "zzh", j2.class, "zzi", z.K});
        }
        if (i11 == 3) {
            return new r3();
        }
        if (i11 == 4) {
            return new c3(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
