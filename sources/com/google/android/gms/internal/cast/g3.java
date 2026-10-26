package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class g3 extends c5 {
    private static final g3 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        g3 g3Var = new g3();
        zzb = g3Var;
        c5.e(g3.class, g3Var);
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i10, c5 c5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            w0 w0Var = w0.k;
            return new d6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", w0Var, "zzf", w0Var});
        }
        if (i11 == 3) {
            return new g3();
        }
        if (i11 == 4) {
            return new a3(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
