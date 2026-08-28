package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j1 extends f5 {
    private static final j1 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private k5 zzi;
    private k5 zzj;
    private String zzk;

    static {
        j1 j1Var = new j1();
        zzb = j1Var;
        f5.e(j1.class, j1Var);
    }

    public j1() {
        f6 f6Var = f6.d;
        this.zzi = f6Var;
        this.zzj = f6Var;
        this.zzk = "";
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i9, f5 f5Var) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzb, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzd", "zze", a0.v, "zzf", "zzg", a0.K, "zzh", "zzi", e3.class, "zzj", e3.class, "zzk"});
        }
        if (i10 == 3) {
            return new j1();
        }
        if (i10 == 4) {
            return new v0(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
