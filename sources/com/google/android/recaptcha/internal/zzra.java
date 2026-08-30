package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class zzra extends zzsk implements zztt {
    private static final zzra zzd;
    private static volatile zzua zze;
    private int zzf;
    private boolean zzg;
    private zzrk zzh;
    private boolean zzi;
    private zzrm zzj;
    private byte zzl = 2;
    private zzsu zzk = zzud.zze();

    static {
        zzra zzraVar = new zzra();
        zzd = zzraVar;
        zzsn.zzI(zzra.class, zzraVar);
    }

    private zzra() {
    }

    public static zzra zzg() {
        return zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i10, Object obj, Object obj2) {
        zzua zzuaVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i11 == 2) {
            return new zzue(zzd, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဉ\u0003ϧЛ", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzrq.class});
        }
        if (i11 == 3) {
            return new zzra();
        }
        zzrr zzrrVar = null;
        if (i11 == 4) {
            return new zzqz(zzrrVar);
        }
        if (i11 == 5) {
            return zzd;
        }
        if (i11 != 6) {
            this.zzl = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzua zzuaVar2 = zze;
        if (zzuaVar2 != null) {
            return zzuaVar2;
        }
        synchronized (zzra.class) {
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
