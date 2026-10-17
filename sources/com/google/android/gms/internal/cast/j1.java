package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
        h6 h6Var = h6.d;
        this.zzi = h6Var;
        this.zzj = h6Var;
        this.zzk = "";
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzb, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzd", "zze", z.v, "zzf", "zzg", z.O, "zzh", "zzi", e3.class, "zzj", e3.class, "zzk"});
        }
        if (i11 == 3) {
            return new j1();
        }
        if (i11 == 4) {
            return new v0(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
