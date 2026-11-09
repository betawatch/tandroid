package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class p3 extends b5 {
    private static final p3 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private g5 zzg;
    private g5 zzh;
    private int zzi;

    static {
        p3 p3Var = new p3();
        zzb = p3Var;
        b5.e(p3.class, p3Var);
    }

    public p3() {
        b6 b6Var = b6.d;
        this.zzg = b6Var;
        this.zzh = b6Var;
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004\u001b\u0005᠌\u0002", new Object[]{"zzd", "zze", w0.y, "zzf", w0.z, "zzg", h2.class, "zzh", h2.class, "zzi", x.O});
        }
        if (i10 == 3) {
            return new p3();
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
