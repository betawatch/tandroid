package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class l1 extends h5 {
    private static final l1 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private m5 zzi;
    private m5 zzj;
    private String zzk;

    static {
        l1 l1Var = new l1();
        zzb = l1Var;
        h5.e(l1.class, l1Var);
    }

    public l1() {
        h6 h6Var = h6.d;
        this.zzi = h6Var;
        this.zzj = h6Var;
        this.zzk = "";
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzb, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzd", "zze", b0.v, "zzf", "zzg", b0.O, "zzh", "zzi", g3.class, "zzj", g3.class, "zzk"});
        }
        if (i11 == 3) {
            return new l1();
        }
        if (i11 == 4) {
            return new x0(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
