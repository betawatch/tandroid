package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class w2 extends e5 {
    private static final w2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        w2 w2Var = new w2();
        zzb = w2Var;
        e5.e(w2.class, w2Var);
    }

    @Override // com.google.android.gms.internal.cast.e5
    public final Object h(int i10, e5 e5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return new f6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", z0.c, "zzf", "zzg", e1.a});
        }
        if (i11 == 3) {
            return new w2();
        }
        if (i11 == 4) {
            return new v0(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzh = e5Var == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
