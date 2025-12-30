package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzyb extends zzsn implements zztt {
    private static final zzyb zzb;
    private static volatile zzua zzd;
    private int zze;
    private String zzf = "";

    static {
        zzyb zzybVar = new zzyb();
        zzb = zzybVar;
        zzsn.zzI(zzyb.class, zzybVar);
    }

    private zzyb() {
    }

    public static zzya zzf() {
        return (zzya) zzb.zzq();
    }

    static /* synthetic */ void zzi(zzyb zzybVar, String str) {
        str.getClass();
        zzybVar.zze |= 1;
        zzybVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzyb();
        }
        zzyc zzycVar = null;
        if (i2 == 4) {
            return new zzya(zzycVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            throw null;
        }
        zzua zzuaVar = zzd;
        if (zzuaVar == null) {
            synchronized (zzyb.class) {
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
