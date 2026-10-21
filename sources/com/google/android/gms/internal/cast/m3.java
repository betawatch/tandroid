package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class m3 extends f5 {
    private static final m3 zzb;
    private int zzd;
    private String zze = "";
    private k5 zzf;
    private k5 zzg;
    private boolean zzh;

    static {
        m3 m3Var = new m3();
        zzb = m3Var;
        f5.e(m3.class, m3Var);
    }

    public m3() {
        g6 g6Var = g6.d;
        this.zzf = g6Var;
        this.zzg = g6Var;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzd", "zze", "zzf", r2.class, "zzg", k2.class, "zzh"});
        }
        if (i11 == 3) {
            return new m3();
        }
        if (i11 == 4) {
            return new d3(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
