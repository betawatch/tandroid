package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzyr extends zzsn implements zztt {
    private static final zzyr zzb;
    private static volatile zzua zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzyr zzyrVar = new zzyr();
        zzb = zzyrVar;
        zzsn.zzI(zzyr.class, zzyrVar);
    }

    private zzyr() {
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzua zzuaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzyr();
        }
        zzyy zzyyVar = null;
        if (i2 == 4) {
            return new zzyq(zzyyVar);
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
        synchronized (zzyr.class) {
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
