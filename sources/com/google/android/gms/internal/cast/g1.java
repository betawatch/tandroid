package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class g1 extends b5 {
    private static final g1 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private g5 zzi;
    private g5 zzj;
    private String zzk;

    static {
        g1 g1Var = new g1();
        zzb = g1Var;
        b5.e(g1.class, g1Var);
    }

    public g1() {
        b6 b6Var = b6.d;
        this.zzi = b6Var;
        this.zzj = b6Var;
        this.zzk = "";
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzd", "zze", x.w, "zzf", "zzg", x.O, "zzh", "zzi", b3.class, "zzj", b3.class, "zzk"});
        }
        if (i10 == 3) {
            return new g1();
        }
        if (i10 == 4) {
            return new s0(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
