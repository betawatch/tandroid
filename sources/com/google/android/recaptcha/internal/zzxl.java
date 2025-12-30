package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzxl extends zzsn implements zztt {
    private static final zzxl zzb;
    private static volatile zzua zzd;
    private zzqm zze = zzqm.zzb;

    static {
        zzxl zzxlVar = new zzxl();
        zzb = zzxlVar;
        zzsn.zzI(zzxl.class, zzxlVar);
    }

    private zzxl() {
    }

    public static zzxl zzi() {
        return zzb;
    }

    public final zzqm zzf() {
        return this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzxl();
        }
        zzyc zzycVar = null;
        if (i2 == 4) {
            return new zzxk(zzycVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            throw null;
        }
        zzua zzuaVar = zzd;
        if (zzuaVar == null) {
            synchronized (zzxl.class) {
                try {
                    zzuaVar = zzd;
                    if (zzuaVar == null) {
                        zzuaVar = new zzsi(zzb);
                        zzd = zzuaVar;
                    }
                } finally {
                }
            }
        }
        return zzuaVar;
    }
}
