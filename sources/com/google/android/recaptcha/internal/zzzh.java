package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public final Object zzh(int i9, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zze"});
        }
        if (i10 == 3) {
            return new zzzh();
        }
        zzzv zzzvVar = null;
        if (i10 == 4) {
            return new zzzg(zzzvVar);
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
        synchronized (zzzh.class) {
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

    public final zzzk zzi() {
        zzzk zzb2 = zzzk.zzb(this.zze);
        return zzb2 == null ? zzzk.zzk : zzb2;
    }
}
