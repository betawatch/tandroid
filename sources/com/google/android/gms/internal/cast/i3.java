package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class i3 extends e5 {
    private static final i3 zzb;
    private int zzd;
    private j5 zze;
    private j5 zzf;
    private n3 zzg;

    static {
        i3 i3Var = new i3();
        zzb = i3Var;
        e5.e(i3.class, i3Var);
    }

    public i3() {
        e6 e6Var = e6.d;
        this.zze = e6Var;
        this.zzf = e6Var;
    }

    @Override // com.google.android.gms.internal.cast.e5
    public final Object h(int i10, e5 e5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new f6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzd", "zze", q3.class, "zzf", i2.class, "zzg"});
        }
        if (i11 == 3) {
            return new i3();
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
