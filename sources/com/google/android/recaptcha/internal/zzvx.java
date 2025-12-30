package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzvx extends zzsn implements zztt {
    private static final zzvx zzb;
    private static volatile zzua zzd;
    private zzqm zze;
    private String zzf;
    private zzqm zzg;
    private String zzh;
    private String zzi;
    private zzqm zzj;
    private String zzk;
    private zzqm zzl;

    static {
        zzvx zzvxVar = new zzvx();
        zzb = zzvxVar;
        zzsn.zzI(zzvx.class, zzvxVar);
    }

    private zzvx() {
        zzqm zzqmVar = zzqm.zzb;
        this.zze = zzqmVar;
        this.zzf = "";
        this.zzg = zzqmVar;
        this.zzh = "";
        this.zzi = "";
        this.zzj = zzqmVar;
        this.zzk = "";
        this.zzl = zzqmVar;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\n\u0004Ȉ\u0005Ȉ\u0006\n\u0007Ȉ\b\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzvx();
        }
        zzvw zzvwVar = null;
        if (i2 == 4) {
            return new zzvv(zzvwVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            throw null;
        }
        zzua zzuaVar = zzd;
        if (zzuaVar == null) {
            synchronized (zzvx.class) {
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
