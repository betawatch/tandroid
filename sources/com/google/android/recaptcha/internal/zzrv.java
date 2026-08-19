package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzrv extends zzsn implements zztt {
    private static final zzrv zzb;
    private static volatile zzua zzd;
    private long zze;
    private int zzf;

    static {
        zzrv zzrvVar = new zzrv();
        zzb = zzrvVar;
        zzsn.zzI(zzrv.class, zzrvVar);
    }

    private zzrv() {
    }

    public static zzrt zzi() {
        return (zzrt) zzb.zzq();
    }

    public final int zzf() {
        return this.zzf;
    }

    public final long zzg() {
        return this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzua zzuaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzue(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzrv();
        }
        zzru zzruVar = null;
        if (i2 == 4) {
            return new zzrt(zzruVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            throw null;
        }
        zzua zzuaVar2 = zzd;
        if (zzuaVar2 != null) {
            return zzuaVar2;
        }
        synchronized (zzrv.class) {
            try {
                zzuaVar = zzd;
                if (zzuaVar == null) {
                    zzuaVar = new zzsi(zzb);
                    zzd = zzuaVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzuaVar;
    }
}
