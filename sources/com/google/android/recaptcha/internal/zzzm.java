package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzzm extends zzsn implements zztt {
    private static final zzzm zzb;
    private static volatile zzua zzd;
    private int zze = 0;
    private Object zzf;

    static {
        zzzm zzzmVar = new zzzm();
        zzb = zzzmVar;
        zzsn.zzI(zzzm.class, zzzmVar);
    }

    private zzzm() {
    }

    static /* synthetic */ void zzM(zzzm zzzmVar, zzxc zzxcVar) {
        zzxcVar.getClass();
        zzzmVar.zzf = zzxcVar;
        zzzmVar.zze = 2;
    }

    public static zzzl zzi() {
        return (zzzl) zzb.zzq();
    }

    public static zzzm zzk(byte[] bArr) {
        return (zzzm) zzsn.zzx(zzb, bArr);
    }

    static /* synthetic */ void zzl(zzzm zzzmVar, zzwn zzwnVar) {
        zzwnVar.getClass();
        zzzmVar.zzf = zzwnVar;
        zzzmVar.zze = 1;
    }

    public final int zzN() {
        int i = this.zze;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final zzwn zzf() {
        return this.zze == 1 ? (zzwn) this.zzf : zzwn.zzl();
    }

    public final zzxc zzg() {
        return this.zze == 2 ? (zzxc) this.zzf : zzxc.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzua zzuaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zzf", "zze", zzwn.class, zzxc.class});
        }
        if (i2 == 3) {
            return new zzzm();
        }
        zzzv zzzvVar = null;
        if (i2 == 4) {
            return new zzzl(zzzvVar);
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
        synchronized (zzzm.class) {
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
}
