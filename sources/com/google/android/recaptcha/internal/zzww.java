package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzww extends zzsn implements zztt {
    private static final zzww zzb;
    private static volatile zzua zzd;
    private int zze;
    private zzrv zzf;
    private zzut zzg;
    private zzrv zzh;
    private zzut zzi;

    static {
        zzww zzwwVar = new zzww();
        zzb = zzwwVar;
        zzsn.zzI(zzww.class, zzwwVar);
    }

    private zzww() {
    }

    public static zzwu zzf() {
        return (zzwu) zzb.zzq();
    }

    static /* synthetic */ void zzi(zzww zzwwVar, zzut zzutVar) {
        zzutVar.getClass();
        zzwwVar.zzi = zzutVar;
        zzwwVar.zze |= 8;
    }

    static /* synthetic */ void zzj(zzww zzwwVar, zzrv zzrvVar) {
        zzrvVar.getClass();
        zzwwVar.zzh = zzrvVar;
        zzwwVar.zze |= 4;
    }

    static /* synthetic */ void zzk(zzww zzwwVar, zzut zzutVar) {
        zzutVar.getClass();
        zzwwVar.zzg = zzutVar;
        zzwwVar.zze |= 2;
    }

    static /* synthetic */ void zzl(zzww zzwwVar, zzrv zzrvVar) {
        zzrvVar.getClass();
        zzwwVar.zzf = zzrvVar;
        zzwwVar.zze |= 1;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzww();
        }
        zzwv zzwvVar = null;
        if (i2 == 4) {
            return new zzwu(zzwvVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            throw null;
        }
        zzua zzuaVar = zzd;
        if (zzuaVar == null) {
            synchronized (zzww.class) {
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
