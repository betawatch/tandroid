package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class zzxp extends zzsn implements zztt {
    private static final zzxp zzb;
    private static volatile zzua zzd;
    private zzqm zze;
    private String zzf;
    private long zzg;
    private zzqm zzh;
    private String zzi;
    private String zzj;

    static {
        zzxp zzxpVar = new zzxp();
        zzb = zzxpVar;
        zzsn.zzI(zzxp.class, zzxpVar);
    }

    private zzxp() {
        zzqm zzqmVar = zzqm.zzb;
        this.zze = zzqmVar;
        this.zzf = "";
        this.zzh = zzqmVar;
        this.zzi = "";
        this.zzj = "";
    }

    public static zzxp zzk() {
        return zzb;
    }

    public final long zzf() {
        return this.zzg;
    }

    public final zzqm zzg() {
        return this.zzh;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i10, Object obj, Object obj2) {
        zzua zzuaVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\u0002\u0004\n\u0005Ȉ\u0006Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzxp();
        }
        zzyc zzycVar = null;
        if (i11 == 4) {
            return new zzxo(zzycVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        if (i11 != 6) {
            throw null;
        }
        zzua zzuaVar2 = zzd;
        if (zzuaVar2 != null) {
            return zzuaVar2;
        }
        synchronized (zzxp.class) {
            try {
                zzuaVar = zzd;
                if (zzuaVar == null) {
                    zzuaVar = new zzsi(zzb);
                    zzd = zzuaVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzuaVar;
    }

    public final zzqm zzi() {
        return this.zze;
    }

    public final String zzl() {
        return this.zzf;
    }
}
