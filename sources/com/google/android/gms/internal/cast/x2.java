package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class x2 extends b5 {
    private static final x2 zzb;
    private int zzd;
    private long zze;
    private f5 zzf;
    private f5 zzg;

    static {
        x2 x2Var = new x2();
        zzb = x2Var;
        b5.e(x2.class, x2Var);
    }

    public x2() {
        o5 o5Var = o5.d;
        this.zzf = o5Var;
        this.zzg = o5Var;
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new x2();
        }
        if (i10 == 4) {
            return new s0(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
