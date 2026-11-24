package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zzzh extends zzsn implements zztt {
    private static final zzzh zzb;
    private static volatile zzua zzd;
    private int zze;

    static {
        zzzh zzzhVar = new zzzh();
        zzb = zzzhVar;
        zzsn.zzI(zzzh.class, zzzhVar);
    }

    private zzzh() {
    }

    public static zzzh zzg(byte[] bArr) {
        return (zzzh) zzsn.zzx(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i, Object obj, Object obj2) {
        zzua zzuaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzzh();
        }
        zzzv zzzvVar = null;
        if (i2 == 4) {
            return new zzzg(zzzvVar);
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
        synchronized (zzzh.class) {
            zzuaVar = zzd;
            if (zzuaVar == null) {
                zzuaVar = new zzsi(zzb);
                zzd = zzuaVar;
            }
        }
        return zzuaVar;
    }

    public final zzzk zzi() {
        zzzk zzb2 = zzzk.zzb(this.zze);
        return zzb2 == null ? zzzk.zzk : zzb2;
    }
}
