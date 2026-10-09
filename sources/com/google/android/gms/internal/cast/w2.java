package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class w2 extends f5 {
    private static final w2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        w2 w2Var = new w2();
        zzb = w2Var;
        f5.e(w2.class, w2Var);
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return new g6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", z0.c, "zzf", "zzg", e1.a});
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
        this.zzh = f5Var == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
