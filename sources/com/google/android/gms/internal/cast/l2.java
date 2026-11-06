package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class l2 extends b5 {
    private static final e5 zzb = new b1();
    private static final l2 zzd;
    private int zze;
    private boolean zzg;
    private boolean zzh;
    private r3 zzi;
    private boolean zzj;
    private long zzl;
    private long zzm;
    private String zzf = "";
    private d5 zzk = c5.d;

    static {
        l2 l2Var = new l2();
        zzd = l2Var;
        b5.e(l2.class, l2Var);
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzd, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0004ဇ\u0004\u0005ࠬ\u0006ဇ\u0002\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zze", "zzf", "zzg", "zzi", "zzj", "zzk", w0.A, "zzh", "zzl", "zzm"});
        }
        if (i10 == 3) {
            return new l2();
        }
        if (i10 == 4) {
            return new s0(zzd);
        }
        if (i10 != 5) {
            return null;
        }
        return zzd;
    }
}
