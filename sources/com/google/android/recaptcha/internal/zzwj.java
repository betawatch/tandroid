package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzwj extends zzsn implements zztt {
    private static final zzwj zzb;
    private static volatile zzua zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzk;
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";

    static {
        zzwj zzwjVar = new zzwj();
        zzb = zzwjVar;
        zzsn.zzI(zzwj.class, zzwjVar);
    }

    private zzwj() {
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005\u0004\u0006Ȉ\u0007\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzwj();
        }
        zzwi zzwiVar = null;
        if (i2 == 4) {
            return new zzwh(zzwiVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            throw null;
        }
        zzua zzuaVar = zzd;
        if (zzuaVar == null) {
            synchronized (zzwj.class) {
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
