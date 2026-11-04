package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    public final Object zzh(int i3, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i3 - 1;
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
