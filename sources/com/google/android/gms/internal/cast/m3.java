package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        f6 f6Var = f6.d;
        this.zzf = f6Var;
        this.zzg = f6Var;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new g6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzd", "zze", "zzf", r2.class, "zzg", k2.class, "zzh"});
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
