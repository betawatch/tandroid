package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public final Object zzh(int i9, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002'\u0003%\u0004ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new zzzq();
        }
        zzzv zzzvVar = null;
        if (i10 == 4) {
            return new zzzp(zzzvVar);
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
        synchronized (zzzq.class) {
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

    public final String zzj() {
        return this.zzf;
    }

    public final List zzk() {
        return this.zzh;
    }
}
