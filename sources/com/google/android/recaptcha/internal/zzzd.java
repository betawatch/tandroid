package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzzd extends zzsn implements zztt {
    private static final zzzd zzb;
    private static volatile zzua zzd;
    private int zze;
    private int zzi;
    private boolean zzm;
    private boolean zzn;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private String zzo = "";
    private String zzp = "";

    static {
        zzzd zzzdVar = new zzzd();
        zzb = zzzdVar;
        zzsn.zzI(zzzd.class, zzzdVar);
    }

    private zzzd() {
    }

    static /* synthetic */ void zzN(zzzd zzzdVar, String str) {
        str.getClass();
        zzzdVar.zzk = str;
    }

    static /* synthetic */ void zzO(zzzd zzzdVar, String str) {
        str.getClass();
        zzzdVar.zzg = str;
    }

    static /* synthetic */ void zzQ(zzzd zzzdVar, String str) {
        str.getClass();
        zzzdVar.zzj = str;
    }

    static /* synthetic */ void zzR(zzzd zzzdVar, String str) {
        str.getClass();
        zzzdVar.zzf = str;
    }

    public static zzzc zzf() {
        return (zzzc) zzb.zzq();
    }

    public static zzzd zzi() {
        return zzb;
    }

    static /* synthetic */ void zzj(zzzd zzzdVar, String str) {
        str.getClass();
        zzzdVar.zzo = str;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzua zzuaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0006Ȉ\u0007Ȉ\bȈ\t\u0007\n\u0007\u000bȈ\fለ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new zzzd();
        }
        zzzv zzzvVar = null;
        if (i2 == 4) {
            return new zzzc(zzzvVar);
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
        synchronized (zzzd.class) {
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
