package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
    public final Object zzh(int i10, Object obj, Object obj2) {
        zzua zzuaVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002'\u0003%\u0004ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzzq();
        }
        zzzv zzzvVar = null;
        if (i11 == 4) {
            return new zzzp(zzzvVar);
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
        synchronized (zzzq.class) {
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

    public final String zzj() {
        return this.zzf;
    }

    public final List zzk() {
        return this.zzh;
    }
}
