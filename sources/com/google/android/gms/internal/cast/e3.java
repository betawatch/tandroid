package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e3 extends d5 {
    private static final e3 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzh = "";
    private String zzk = "";

    static {
        e3 e3Var = new e3();
        zzb = e3Var;
        d5.e(e3.class, e3Var);
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006င\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new e3();
        }
        if (i11 == 4) {
            return new c3(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
