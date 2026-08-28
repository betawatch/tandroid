package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzxe extends zzsn implements zztt {
    private static final zzxe zzb;
    private static volatile zzua zzd;
    private zzsu zze = zzsn.zzB();

    static {
        zzxe zzxeVar = new zzxe();
        zzb = zzxeVar;
        zzsn.zzI(zzxe.class, zzxeVar);
    }

    private zzxe() {
    }

    public static zzxe zzg() {
        return zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i9, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"zze"});
        }
        if (i10 == 3) {
            return new zzxe();
        }
        zzxh zzxhVar = null;
        if (i10 == 4) {
            return new zzxd(zzxhVar);
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
        synchronized (zzxe.class) {
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

    public final List zzi() {
        return this.zze;
    }
}
