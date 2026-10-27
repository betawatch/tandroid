package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class m3 extends c5 {
    private static final m3 zzb;
    private int zzd;
    private String zze = "";

    static {
        m3 m3Var = new m3();
        zzb = m3Var;
        c5.e(m3.class, m3Var);
    }

    @Override // com.google.android.gms.internal.cast.c5
    public final Object h(int i10, c5 c5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new d6(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new m3();
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
