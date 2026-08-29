package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n3 extends f5 {
    private static final n3 zzb;
    private int zzd;
    private String zze = "";
    private k5 zzf;
    private k5 zzg;
    private boolean zzh;

    static {
        n3 n3Var = new n3();
        zzb = n3Var;
        f5.e(n3.class, n3Var);
    }

    public n3() {
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
            return new g6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzd", "zze", "zzf", s2.class, "zzg", l2.class, "zzh"});
        }
        if (i11 == 3) {
            return new n3();
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
