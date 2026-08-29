package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k1 extends f5 {
    private static final k1 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private k5 zzi;
    private k5 zzj;
    private String zzk;

    static {
        k1 k1Var = new k1();
        zzb = k1Var;
        f5.e(k1.class, k1Var);
    }

    public k1() {
        f6 f6Var = f6.d;
        this.zzi = f6Var;
        this.zzj = f6Var;
        this.zzk = "";
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new g6(zzb, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzd", "zze", a0.v, "zzf", "zzg", a0.K, "zzh", "zzi", f3.class, "zzj", f3.class, "zzk"});
        }
        if (i11 == 3) {
            return new k1();
        }
        if (i11 == 4) {
            return new w0(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
