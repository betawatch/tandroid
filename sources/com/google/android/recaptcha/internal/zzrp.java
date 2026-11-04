package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class zzrp extends zzsn implements zztt {
    private static final zzrp zzb;
    private static volatile zzua zzd;
    private int zze;
    private boolean zzg;
    private byte zzh = 2;
    private String zzf = "";

    static {
        zzrp zzrpVar = new zzrp();
        zzb = zzrpVar;
        zzsn.zzI(zzrp.class, zzrpVar);
    }

    private zzrp() {
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i3, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i10 == 2) {
            return new zzue(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzrp();
        }
        zzrr zzrrVar = null;
        if (i10 == 4) {
            return new zzro(zzrrVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        if (i10 != 6) {
            this.zzh = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzua zzuaVar2 = zzd;
        if (zzuaVar2 != null) {
            return zzuaVar2;
        }
        synchronized (zzrp.class) {
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
