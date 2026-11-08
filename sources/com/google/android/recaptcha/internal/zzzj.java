package com.google.android.recaptcha.internal;

import java.io.InputStream;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
    public final Object zzh(int i7, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzzj();
        }
        zzzv zzzvVar = null;
        if (i10 == 4) {
            return new zzzi(zzzvVar);
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
