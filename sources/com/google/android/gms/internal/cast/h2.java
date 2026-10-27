package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class h2 extends c5 {
    private static final h2 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        h2 h2Var = new h2();
        zzb = h2Var;
        c5.e(h2.class, h2Var);
    }

    public static g2 l() {
        return (g2) zzb.j();
    }

    public static /* synthetic */ void m(h2 h2Var, String str) {
        str.getClass();
        h2Var.zzd |= 1;
        h2Var.zze = str;
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
            return new h2();
        }
        if (i11 == 4) {
            return new g2(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
