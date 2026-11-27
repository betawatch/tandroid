package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zzzq extends zzsn implements zztt {
    private static final zzzq zzb;
    private static volatile zzua zzd;
    private int zze;
    private String zzf = "";
    private zzss zzg = zzsn.zzy();
    private zzst zzh = zzsn.zzA();
    private zzza zzi;

    static {
        zzzq zzzqVar = new zzzq();
        zzb = zzzqVar;
        zzsn.zzI(zzzq.class, zzzqVar);
    }

    private zzzq() {
    }

    public static zzzq zzi(byte[] bArr) {
        return (zzzq) zzsn.zzx(zzb, bArr);
    }

    public final zzza zzf() {
        zzza zzzaVar = this.zzi;
        return zzzaVar == null ? zzza.zzg() : zzzaVar;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i, Object obj, Object obj2) {
        zzua zzuaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002'\u0003%\u0004ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzzq();
        }
        zzzv zzzvVar = null;
        if (i2 == 4) {
            return new zzzp(zzzvVar);
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
        synchronized (zzzq.class) {
            zzuaVar = zzd;
            if (zzuaVar == null) {
                zzuaVar = new zzsi(zzb);
                zzd = zzuaVar;
            }
        }
        return zzuaVar;
    }

    public final String zzj() {
        return this.zzf;
    }

    public final List zzk() {
        return this.zzh;
    }
}
