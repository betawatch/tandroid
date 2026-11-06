package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class m2 extends b5 {
    private static final m2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private d5 zzg;
    private d5 zzh;
    private g5 zzi;
    private g5 zzj;
    private int zzk;

    static {
        m2 m2Var = new m2();
        zzb = m2Var;
        b5.e(m2.class, m2Var);
    }

    public m2() {
        c5 c5Var = c5.d;
        this.zzg = c5Var;
        this.zzh = c5Var;
        b6 b6Var = b6.d;
        this.zzi = b6Var;
        this.zzj = b6Var;
    }

    @Override // com.google.android.gms.internal.cast.b5
    public final Object h(int i7, b5 b5Var) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c6(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001င\u0000\u0002᠌\u0001\u0003\u0016\u0004\u0016\u0005\u001a\u0006\u001a\u0007᠌\u0002", new Object[]{"zzd", "zze", "zzf", x.S, "zzg", "zzh", "zzi", "zzj", "zzk", x.O});
        }
        if (i10 == 3) {
            return new m2();
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
