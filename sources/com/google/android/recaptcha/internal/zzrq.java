package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzrq extends zzsn implements zztt {
    private static final zzrq zzb;
    private static volatile zzua zzd;
    private int zze;
    private long zzh;
    private long zzi;
    private double zzj;
    private byte zzm = 2;
    private zzsu zzf = zzud.zze();
    private String zzg = "";
    private zzqm zzk = zzqm.zzb;
    private String zzl = "";

    static {
        zzrq zzrqVar = new zzrq();
        zzb = zzrqVar;
        zzsn.zzI(zzrq.class, zzrqVar);
    }

    private zzrq() {
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzua zzuaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i2 == 2) {
            return new zzue(zzb, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"zze", "zzf", zzrp.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzrq();
        }
        zzrr zzrrVar = null;
        if (i2 == 4) {
            return new zzrn(zzrrVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            this.zzm = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzua zzuaVar2 = zzd;
        if (zzuaVar2 != null) {
            return zzuaVar2;
        }
        synchronized (zzrq.class) {
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
