package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class r3 extends b5 {
    private static final e5 zzb = new b1();
    private static final r3 zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzi;
    private long zzk;
    private d5 zzh = c5.d;
    private g5 zzj = b6.d;

    static {
        r3 r3Var = new r3();
        zzd = r3Var;
        b5.e(r3.class, r3Var);
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzd, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ࠞ\u0005᠌\u0002\u0006\u001b\u0007ဂ\u0003", new Object[]{"zze", "zzf", w0.B, "zzg", x.O, "zzh", w0.A, "zzi", x.I, "zzj", q3.class, "zzk"});
        }
        if (i10 == 3) {
            return new r3();
        }
        if (i10 == 4) {
            return new a3(zzd);
        }
        if (i10 != 5) {
            return null;
        }
        return zzd;
    }
}
