package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class i3 extends f5 {
    private static final i3 zzb;
    private int zzd;
    private k5 zze;
    private k5 zzf;
    private n3 zzg;

    static {
        i3 i3Var = new i3();
        zzb = i3Var;
        f5.e(i3.class, i3Var);
    }

    public i3() {
        f6 f6Var = f6.d;
        this.zze = f6Var;
        this.zzf = f6Var;
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new g6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzd", "zze", q3.class, "zzf", i2.class, "zzg"});
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
