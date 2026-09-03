package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class t2 extends e5 {
    private static final t2 zzb;
    private int zzd;
    private j5 zze = e6.d;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        t2 t2Var = new t2();
        zzb = t2Var;
        e5.e(t2.class, t2Var);
    }

    @Override // com.google.android.gms.internal.cast.e5
    public final Object h(int i10, e5 e5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new f6(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u0006ဂ\u0004", new Object[]{"zzd", "zze", o2.class, "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new t2();
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
