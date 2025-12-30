package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzyx extends zzsn implements zztt {
    private static final zzyx zzb;
    private static volatile zzua zzd;
    private zzsu zze = zzsn.zzB();
    private int zzf;

    static {
        zzyx zzyxVar = new zzyx();
        zzb = zzyxVar;
        zzsn.zzI(zzyx.class, zzyxVar);
    }

    private zzyx() {
    }

    public static zzyu zzf() {
        return (zzyu) zzb.zzq();
    }

    static /* synthetic */ void zzi(zzyx zzyxVar, Iterable iterable) {
        zzyxVar.zzl();
        zzpw.zzc(iterable, zzyxVar.zze);
    }

    static /* synthetic */ void zzj(zzyx zzyxVar, zzyw zzywVar) {
        zzywVar.getClass();
        zzyxVar.zzl();
        zzyxVar.zze.add(zzywVar);
    }

    private final void zzl() {
        zzsu zzsuVar = this.zze;
        if (zzsuVar.zzc()) {
            return;
        }
        this.zze = zzsn.zzC(zzsuVar);
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[]{"zze", zzyw.class, "zzf"});
        }
        if (i2 == 3) {
            return new zzyx();
        }
        zzyy zzyyVar = null;
        if (i2 == 4) {
            return new zzyu(zzyyVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            throw null;
        }
        zzua zzuaVar = zzd;
        if (zzuaVar == null) {
            synchronized (zzyx.class) {
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
