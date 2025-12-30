package com.google.android.recaptcha.internal;

import java.util.List;

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

    public final List zzi() {
        return this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzxe();
        }
        zzxh zzxhVar = null;
        if (i2 == 4) {
            return new zzxd(zzxhVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            throw null;
        }
        zzua zzuaVar = zzd;
        if (zzuaVar == null) {
            synchronized (zzxe.class) {
                try {
                    zzuaVar = zzd;
                    if (zzuaVar == null) {
                        zzuaVar = new zzsi(zzb);
                        zzd = zzuaVar;
                    }
                } finally {
                }
            }
        }
        return zzuaVar;
    }
}
