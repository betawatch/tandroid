package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public static /* synthetic */ void zzM(zzzm zzzmVar, zzxc zzxcVar) {
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

    public static /* synthetic */ void zzl(zzzm zzzmVar, zzwn zzwnVar) {
        zzwnVar.getClass();
        zzzmVar.zzf = zzwnVar;
        zzzmVar.zze = 1;
    }

    public final int zzN() {
        int i3 = this.zze;
        if (i3 == 0) {
            return 3;
        }
        int i10 = 1;
        if (i3 != 1) {
            i10 = 2;
            if (i3 != 2) {
                return 0;
            }
        }
        return i10;
    }

    public final zzwn zzf() {
        return this.zze == 1 ? (zzwn) this.zzf : zzwn.zzl();
    }

    public final zzxc zzg() {
        return this.zze == 2 ? (zzxc) this.zzf : zzxc.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i3, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zzf", "zze", zzwn.class, zzxc.class});
        }
        if (i10 == 3) {
            return new zzzm();
        }
        zzzv zzzvVar = null;
        if (i10 == 4) {
            return new zzzl(zzzvVar);
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
        synchronized (zzzm.class) {
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
}
