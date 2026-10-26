package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class g1 extends c5 {
    private static final g1 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private h5 zzi;
    private h5 zzj;
    private String zzk;

    static {
        g1 g1Var = new g1();
        zzb = g1Var;
        c5.e(g1.class, g1Var);
    }

    public g1() {
        c6 c6Var = c6.d;
        this.zzi = c6Var;
        this.zzj = c6Var;
        this.zzk = "";
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i10, c5 c5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new d6(zzb, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzd", "zze", x.v, "zzf", "zzg", x.O, "zzh", "zzi", b3.class, "zzj", b3.class, "zzk"});
        }
        if (i11 == 3) {
            return new g1();
        }
        if (i11 == 4) {
            return new s0(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
