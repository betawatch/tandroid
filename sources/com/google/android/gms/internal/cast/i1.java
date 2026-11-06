package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class i1 extends b5 {
    private static final i1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        i1 i1Var = new i1();
        zzb = i1Var;
        b5.e(i1.class, i1Var);
    }

    public static h1 l() {
        return (h1) zzb.j();
    }

    public static /* synthetic */ void m(i1 i1Var, String str) {
        str.getClass();
        i1Var.zzd |= 1;
        i1Var.zze = str;
    }

    public static /* synthetic */ void n(i1 i1Var, String str) {
        str.getClass();
        i1Var.zzd |= 2;
        i1Var.zzf = str;
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new i1();
        }
        if (i10 == 4) {
            return new h1(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
