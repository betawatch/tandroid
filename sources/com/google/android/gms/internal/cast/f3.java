package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class f3 extends b5 {
    private static final f3 zzb;
    private int zzd;
    private g5 zze;
    private g5 zzf;
    private k3 zzg;

    static {
        f3 f3Var = new f3();
        zzb = f3Var;
        b5.e(f3.class, f3Var);
    }

    public f3() {
        b6 b6Var = b6.d;
        this.zze = b6Var;
        this.zzf = b6Var;
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzd", "zze", n3.class, "zzf", f2.class, "zzg"});
        }
        if (i10 == 3) {
            return new f3();
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
