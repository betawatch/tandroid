package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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

    public static /* synthetic */ void zzi(zzzf zzzfVar, String str) {
        str.getClass();
        zzzfVar.zze = str;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i7, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzzf();
        }
        zzzv zzzvVar = null;
        if (i10 == 4) {
            return new zzze(zzzvVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        if (i10 != 6) {
            throw null;
        }
        zzua zzuaVar2 = zzd;
        if (zzuaVar2 != null) {
            return zzuaVar2;
        }
        synchronized (zzzf.class) {
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
}
