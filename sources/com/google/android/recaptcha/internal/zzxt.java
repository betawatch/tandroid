package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzxt extends zzsn implements zztt {
    private static final zzxt zzb;
    private static volatile zzua zzd;
    private zzqm zze;
    private zzqm zzf;

    static {
        zzxt zzxtVar = new zzxt();
        zzb = zzxtVar;
        zzsn.zzI(zzxt.class, zzxtVar);
    }

    private zzxt() {
        zzqm zzqmVar = zzqm.zzb;
        this.zze = zzqmVar;
        this.zzf = zzqmVar;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzua zzuaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzxt();
        }
        zzyc zzycVar = null;
        if (i2 == 4) {
            return new zzxs(zzycVar);
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
        synchronized (zzxt.class) {
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
