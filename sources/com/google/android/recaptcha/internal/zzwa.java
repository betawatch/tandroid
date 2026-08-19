package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzwa extends zzsn implements zztt {
    private static final zzwa zzb;
    private static volatile zzua zzd;
    private int zzg;
    private int zzj;
    private int zzk;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzwa zzwaVar = new zzwa();
        zzb = zzwaVar;
        zzsn.zzI(zzwa.class, zzwaVar);
    }

    private zzwa() {
    }

    static /* synthetic */ void zzO(zzwa zzwaVar, String str) {
        str.getClass();
        zzwaVar.zze = str;
    }

    public static zzvy zzg() {
        return (zzvy) zzb.zzq();
    }

    public static zzwa zzj() {
        return zzb;
    }

    public final int zzf() {
        return this.zzg;
    }

    public final String zzk() {
        return this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzua zzuaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ\u0007\u0004", new Object[]{"zze", "zzg", "zzi", "zzj", "zzf", "zzh", "zzk"});
        }
        if (i2 == 3) {
            return new zzwa();
        }
        zzvz zzvzVar = null;
        if (i2 == 4) {
            return new zzvy(zzvzVar);
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
        synchronized (zzwa.class) {
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
