package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m3 extends f5 {
    private static final m3 zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private k5 zzg = f6.d;

    static {
        m3 m3Var = new m3();
        zzb = m3Var;
        f5.e(m3.class, m3Var);
    }

    @Override // com.google.android.gms.internal.cast.f5
    public final Object h(int i10, f5 f5Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new g6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", n3.class});
        }
        if (i11 == 3) {
            return new m3();
        }
        if (i11 == 4) {
            return new e3(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
