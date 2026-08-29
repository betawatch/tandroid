package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j3 extends f5 {
    private static final j3 zzb;
    private int zzd;
    private k5 zze;
    private k5 zzf;
    private o3 zzg;

    static {
        j3 j3Var = new j3();
        zzb = j3Var;
        f5.e(j3.class, j3Var);
    }

    public j3() {
        f6 f6Var = f6.d;
        this.zze = f6Var;
        this.zzf = f6Var;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new g6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzd", "zze", r3.class, "zzf", j2.class, "zzg"});
        }
        if (i11 == 3) {
            return new j3();
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
