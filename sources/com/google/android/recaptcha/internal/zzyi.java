package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzyi extends zzsn implements zztt {
    private static final zzyi zzb;
    private static volatile zzua zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzyi zzyiVar = new zzyi();
        zzb = zzyiVar;
        zzsn.zzI(zzyi.class, zzyiVar);
    }

    private zzyi() {
    }

    public final String zzg() {
        return this.zzf;
    }

    public final String zzi() {
        return this.zzg;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzyi();
        }
        zzyj zzyjVar = null;
        if (i2 == 4) {
            return new zzyh(zzyjVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            throw null;
        }
        zzua zzuaVar = zzd;
        if (zzuaVar == null) {
            synchronized (zzyi.class) {
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
