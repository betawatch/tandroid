package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class x2 extends f5 {
    private static final x2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        x2 x2Var = new x2();
        zzb = x2Var;
        f5.e(x2.class, x2Var);
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return new g6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", a1.c, "zzf", "zzg", f1.a});
        }
        if (i11 == 3) {
            return new x2();
        }
        if (i11 == 4) {
            return new w0(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzh = f5Var == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
