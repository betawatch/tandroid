package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
    public final Object zzh(int i, Object obj, Object obj2) {
        zzua zzuaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\u0002\u0004\n\u0005Ȉ\u0006Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzxp();
        }
        zzyc zzycVar = null;
        if (i2 == 4) {
            return new zzxo(zzycVar);
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
        synchronized (zzxp.class) {
            zzuaVar = zzd;
            if (zzuaVar == null) {
                zzuaVar = new zzsi(zzb);
                zzd = zzuaVar;
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
