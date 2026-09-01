package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class i1 extends d5 {
    private static final i1 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private i5 zzi;
    private i5 zzj;
    private String zzk;

    static {
        i1 i1Var = new i1();
        zzb = i1Var;
        d5.e(i1.class, i1Var);
    }

    public i1() {
        d6 d6Var = d6.d;
        this.zzi = d6Var;
        this.zzj = d6Var;
        this.zzk = "";
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzd", "zze", y.v, "zzf", "zzg", y.L, "zzh", "zzi", d3.class, "zzj", d3.class, "zzk"});
        }
        if (i11 == 3) {
            return new i1();
        }
        if (i11 == 4) {
            return new u0(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
