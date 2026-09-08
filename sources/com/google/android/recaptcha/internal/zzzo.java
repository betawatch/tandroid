package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class zzzo extends zzsn implements zztt {
    private static final zzzo zzb;
    private static volatile zzua zzd;
    private zzsu zze = zzsn.zzB();

    static {
        zzzo zzzoVar = new zzzo();
        zzb = zzzoVar;
        zzsn.zzI(zzzo.class, zzzoVar);
    }

    private zzzo() {
    }

    public static zzzo zzg(byte[] bArr) {
        return (zzzo) zzsn.zzx(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i10, Object obj, Object obj2) {
        zzua zzuaVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzzu.class});
        }
        if (i11 == 3) {
            return new zzzo();
        }
        zzzv zzzvVar = null;
        if (i11 == 4) {
            return new zzzn(zzzvVar);
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
        synchronized (zzzo.class) {
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

    public final List zzi() {
        return this.zze;
    }
}
