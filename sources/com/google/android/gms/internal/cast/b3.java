package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class b3 extends b5 {
    private static final b3 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        b3 b3Var = new b3();
        zzb = b3Var;
        b5.e(b3.class, b3Var);
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new b3();
        }
        if (i10 == 4) {
            return new a3(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
