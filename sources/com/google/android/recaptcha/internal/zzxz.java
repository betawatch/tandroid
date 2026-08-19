package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzxz extends zzsn implements zztt {
    private static final zzxz zzb;
    private static volatile zzua zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzxz zzxzVar = new zzxz();
        zzb = zzxzVar;
        zzsn.zzI(zzxz.class, zzxzVar);
    }

    private zzxz() {
    }

    public static zzxy zzf() {
        return (zzxy) zzb.zzq();
    }

    static /* synthetic */ void zzi(zzxz zzxzVar, String str) {
        str.getClass();
        zzxzVar.zze |= 2;
        zzxzVar.zzg = str;
    }

    static /* synthetic */ void zzj(zzxz zzxzVar, String str) {
        str.getClass();
        zzxzVar.zze |= 1;
        zzxzVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzua zzuaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzxz();
        }
        zzyc zzycVar = null;
        if (i2 == 4) {
            return new zzxy(zzycVar);
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
        synchronized (zzxz.class) {
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
