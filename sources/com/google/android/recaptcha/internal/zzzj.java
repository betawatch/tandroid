package com.google.android.recaptcha.internal;

import java.io.InputStream;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class zzzj extends zzsn implements zztt {
    private static final zzzj zzb;
    private static volatile zzua zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzzj zzzjVar = new zzzj();
        zzb = zzzjVar;
        zzsn.zzI(zzzj.class, zzzjVar);
    }

    private zzzj() {
    }

    public static zzzj zzg(InputStream inputStream) {
        return (zzzj) zzsn.zzw(zzb, inputStream);
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i, Object obj, Object obj2) {
        zzua zzuaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzzj();
        }
        zzzv zzzvVar = null;
        if (i2 == 4) {
            return new zzzi(zzzvVar);
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
        synchronized (zzzj.class) {
            zzuaVar = zzd;
            if (zzuaVar == null) {
                zzuaVar = new zzsi(zzb);
                zzd = zzuaVar;
            }
        }
        return zzuaVar;
    }

    public final zzzk zzi() {
        zzzk zzb2 = zzzk.zzb(this.zzg);
        return zzb2 == null ? zzzk.zzk : zzb2;
    }
}
