package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class s2 extends d5 {
    private static final s2 zzb;
    private int zzd;
    private i5 zze = d6.d;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        s2 s2Var = new s2();
        zzb = s2Var;
        d5.e(s2.class, s2Var);
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u0006ဂ\u0004", new Object[]{"zzd", "zze", n2.class, "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new s2();
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
