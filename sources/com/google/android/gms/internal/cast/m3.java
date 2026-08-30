package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class m3 extends e5 {
    private static final m3 zzb;
    private int zzd;
    private String zze = "";
    private j5 zzf;
    private j5 zzg;
    private boolean zzh;

    static {
        m3 m3Var = new m3();
        zzb = m3Var;
        e5.e(m3.class, m3Var);
    }

    public m3() {
        e6 e6Var = e6.d;
        this.zzf = e6Var;
        this.zzg = e6Var;
    }

    @Override // com.google.android.gms.internal.cast.e5
    public final Object h(int i10, e5 e5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new f6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzd", "zze", "zzf", r2.class, "zzg", k2.class, "zzh"});
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
