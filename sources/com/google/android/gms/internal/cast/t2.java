package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class t2 extends c5 {
    private static final t2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        t2 t2Var = new t2();
        zzb = t2Var;
        c5.e(t2.class, t2Var);
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i10, c5 c5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return new d6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", w0.c, "zzf", "zzg", b1.a});
        }
        if (i11 == 3) {
            return new t2();
        }
        if (i11 == 4) {
            return new s0(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzh = c5Var == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
