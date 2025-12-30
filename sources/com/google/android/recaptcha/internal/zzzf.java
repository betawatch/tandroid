package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzzf extends zzsn implements zztt {
    private static final zzzf zzb;
    private static volatile zzua zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzzf zzzfVar = new zzzf();
        zzb = zzzfVar;
        zzsn.zzI(zzzf.class, zzzfVar);
    }

    private zzzf() {
    }

    public static zzze zzf() {
        return (zzze) zzb.zzq();
    }

    static /* synthetic */ void zzi(zzzf zzzfVar, String str) {
        str.getClass();
        zzzfVar.zze = str;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzzf();
        }
        zzzv zzzvVar = null;
        if (i2 == 4) {
            return new zzze(zzzvVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            throw null;
        }
        zzua zzuaVar = zzd;
        if (zzuaVar == null) {
            synchronized (zzzf.class) {
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
