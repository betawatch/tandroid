package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class r3 extends e5 {
    private static final r3 zzb;
    private int zzd;
    private int zze;
    private j5 zzf;
    private j5 zzg;
    private int zzh;

    static {
        r3 r3Var = new r3();
        zzb = r3Var;
        e5.e(r3.class, r3Var);
    }

    public r3() {
        e6 e6Var = e6.d;
        this.zzf = e6Var;
        this.zzg = e6Var;
    }

    @Override // com.google.android.gms.internal.cast.e5
    public final Object h(int i10, e5 e5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new f6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzd", "zze", z0.x, "zzf", e3.class, "zzg", e3.class, "zzh"});
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
