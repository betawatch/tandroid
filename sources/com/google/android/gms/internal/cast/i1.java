package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i1 extends e5 {
    private static final i1 zzb;
    private int zzd;
    private int zze;
    private double zzf;
    private double zzg;
    private double zzh;
    private double zzi;

    static {
        i1 i1Var = new i1();
        zzb = i1Var;
        e5.e(i1.class, i1Var);
    }

    @Override // com.google.android.gms.internal.cast.e5
    public final Object h(int i10, e5 e5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new f6(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003\u0005က\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new i1();
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
