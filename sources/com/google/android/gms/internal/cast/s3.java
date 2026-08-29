package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class s3 extends f5 {
    private static final s3 zzb;
    private int zzd;
    private int zze;
    private k5 zzf;
    private k5 zzg;
    private int zzh;

    static {
        s3 s3Var = new s3();
        zzb = s3Var;
        f5.e(s3.class, s3Var);
    }

    public s3() {
        f6 f6Var = f6.d;
        this.zzf = f6Var;
        this.zzg = f6Var;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new g6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzd", "zze", a1.x, "zzf", f3.class, "zzg", f3.class, "zzh"});
        }
        if (i11 == 3) {
            return new s3();
        }
        if (i11 == 4) {
            return new e3(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
