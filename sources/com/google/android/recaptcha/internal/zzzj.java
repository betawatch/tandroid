package com.google.android.recaptcha.internal;

import java.io.InputStream;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
    public final Object zzh(int i10, Object obj, Object obj2) {
        zzua zzuaVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzzj();
        }
        zzzv zzzvVar = null;
        if (i11 == 4) {
            return new zzzi(zzzvVar);
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
        synchronized (zzzj.class) {
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

    public final zzzk zzi() {
        zzzk zzb2 = zzzk.zzb(this.zzg);
        return zzb2 == null ? zzzk.zzk : zzb2;
    }
}
