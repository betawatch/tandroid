package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class zzrk extends zzsk implements zztt {
    private static final zzrk zzd;
    private static volatile zzua zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private byte zzo = 2;

    static {
        zzrk zzrkVar = new zzrk();
        zzd = zzrkVar;
        zzsn.zzI(zzrk.class, zzrkVar);
    }

    private zzrk() {
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i10, Object obj, Object obj2) {
        zzua zzuaVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzo);
        }
        if (i11 == 2) {
            return new zzue(zzd, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzf", "zzg", zzre.zza, "zzh", zzrd.zza, "zzi", zzrh.zza, "zzj", zzri.zza, "zzk", zzrg.zza, "zzl", zzrf.zza, "zzm", zzrc.zza, "zzn", zzrj.zza});
        }
        if (i11 == 3) {
            return new zzrk();
        }
        zzrr zzrrVar = null;
        if (i11 == 4) {
            return new zzrb(zzrrVar);
        }
        if (i11 == 5) {
            return zzd;
        }
        if (i11 != 6) {
            this.zzo = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzua zzuaVar2 = zze;
        if (zzuaVar2 != null) {
            return zzuaVar2;
        }
        synchronized (zzrk.class) {
            try {
                zzuaVar = zze;
                if (zzuaVar == null) {
                    zzuaVar = new zzsi(zzd);
                    zze = zzuaVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzuaVar;
    }
}
