package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class v2 extends d5 {
    private static final v2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        v2 v2Var = new v2();
        zzb = v2Var;
        d5.e(v2.class, v2Var);
    }

    @Override // com.google.android.gms.internal.cast.d5
    public final Object h(int i10, d5 d5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return new e6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", y0.c, "zzf", "zzg", d1.a});
        }
        if (i11 == 3) {
            return new v2();
        }
        if (i11 == 4) {
            return new u0(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzh = d5Var == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
