package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class i1 extends c5 {
    private static final i1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        i1 i1Var = new i1();
        zzb = i1Var;
        c5.e(i1.class, i1Var);
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

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i10, c5 c5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new d6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new i1();
        }
        if (i11 == 4) {
            return new h1(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
