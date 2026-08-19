package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes.dex */
public final class zzyg extends zzsn implements zztt {
    private static final zzyg zzb;
    private static volatile zzua zzd;
    private int zze;
    private long zzg;
    private int zzh;
    private String zzf = "";
    private zzsu zzi = zzsn.zzB();
    private zzqm zzj = zzqm.zzb;
    private String zzk = "";
    private String zzl = "";

    static {
        zzyg zzygVar = new zzyg();
        zzb = zzygVar;
        zzsn.zzI(zzyg.class, zzygVar);
    }

    private zzyg() {
    }

    public static zzyg zzi() {
        return zzb;
    }

    public final zzqm zzf() {
        return this.zzj;
    }

    public final String zzj() {
        return this.zzf;
    }

    public final List zzk() {
        return this.zzi;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzua zzuaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0004ဌ\u0002\u0005\u001b\u0006ည\u0003\u0007ለ\u0004\bለ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzyi.class, "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzyg();
        }
        zzyj zzyjVar = null;
        if (i2 == 4) {
            return new zzyf(zzyjVar);
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
        synchronized (zzyg.class) {
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
