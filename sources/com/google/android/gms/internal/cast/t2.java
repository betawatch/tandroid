package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class t2 extends b5 {
    private static final t2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        t2 t2Var = new t2();
        zzb = t2Var;
        b5.e(t2.class, t2Var);
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", w0.c, "zzf", "zzg", b1.a});
        }
        if (i10 == 3) {
            return new t2();
        }
        if (i10 == 4) {
            return new s0(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        this.zzh = b5Var == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
