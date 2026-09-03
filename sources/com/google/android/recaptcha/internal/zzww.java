package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class zzww extends zzsn implements zztt {
    private static final zzww zzb;
    private static volatile zzua zzd;
    private int zze;
    private zzrv zzf;
    private zzut zzg;
    private zzrv zzh;
    private zzut zzi;

    static {
        zzww zzwwVar = new zzww();
        zzb = zzwwVar;
        zzsn.zzI(zzww.class, zzwwVar);
    }

    private zzww() {
    }

    public static zzwu zzf() {
        return (zzwu) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzww zzwwVar, zzut zzutVar) {
        zzutVar.getClass();
        zzwwVar.zzi = zzutVar;
        zzwwVar.zze |= 8;
    }

    public static /* synthetic */ void zzj(zzww zzwwVar, zzrv zzrvVar) {
        zzrvVar.getClass();
        zzwwVar.zzh = zzrvVar;
        zzwwVar.zze |= 4;
    }

    public static /* synthetic */ void zzk(zzww zzwwVar, zzut zzutVar) {
        zzutVar.getClass();
        zzwwVar.zzg = zzutVar;
        zzwwVar.zze |= 2;
    }

    public static /* synthetic */ void zzl(zzww zzwwVar, zzrv zzrvVar) {
        zzrvVar.getClass();
        zzwwVar.zzf = zzrvVar;
        zzwwVar.zze |= 1;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i10, Object obj, Object obj2) {
        zzua zzuaVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzww();
        }
        zzwv zzwvVar = null;
        if (i11 == 4) {
            return new zzwu(zzwvVar);
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
        synchronized (zzww.class) {
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
