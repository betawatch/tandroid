package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzrm extends zzsn implements zztt {
    private static final zzrm zzb;
    private static volatile zzua zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private int zzi;

    static {
        zzrm zzrmVar = new zzrm();
        zzb = zzrmVar;
        zzsn.zzI(zzrm.class, zzrmVar);
    }

    private zzrm() {
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzua zzuaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzqy zzqyVar = zzqy.zza;
            zzsr zzsrVar = zzqx.zza;
            return new zzue(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"zze", "zzf", zzsrVar, "zzg", zzsrVar, "zzh", "zzi", zzsrVar});
        }
        if (i2 == 3) {
            return new zzrm();
        }
        zzrr zzrrVar = null;
        if (i2 == 4) {
            return new zzrl(zzrrVar);
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
        synchronized (zzrm.class) {
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
