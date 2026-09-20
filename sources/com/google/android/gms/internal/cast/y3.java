package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class y3 extends h5 {
    private static final y3 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        y3 y3Var = new y3();
        zzb = y3Var;
        h5.e(y3.class, y3Var);
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final Object h(int i10, h5 h5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002", new Object[]{"zzd", "zze", b1.D, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new y3();
        }
        if (i11 == 4) {
            return new f3(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
