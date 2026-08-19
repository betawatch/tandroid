package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzym extends zzsn implements zztt {
    private static final zzym zzb;
    private static volatile zzua zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzss zzh = zzsn.zzy();
    private int zzi;
    private int zzj;

    static {
        zzym zzymVar = new zzym();
        zzb = zzymVar;
        zzsn.zzI(zzym.class, zzymVar);
    }

    private zzym() {
    }

    public static zzyk zzf() {
        return (zzyk) zzb.zzq();
    }

    static /* synthetic */ void zzi(zzym zzymVar, String str) {
        str.getClass();
        zzymVar.zze |= 2;
        zzymVar.zzg = str;
    }

    static /* synthetic */ void zzj(zzym zzymVar, String str) {
        str.getClass();
        zzymVar.zze |= 1;
        zzymVar.zzf = str;
    }

    static /* synthetic */ void zzk(zzym zzymVar, int i) {
        zzymVar.zzi = 2;
        zzymVar.zze |= 4;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzua zzuaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003'\u0004᠌\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzyl.zza, "zzj"});
        }
        if (i2 == 3) {
            return new zzym();
        }
        zzyp zzypVar = null;
        if (i2 == 4) {
            return new zzyk(zzypVar);
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
        synchronized (zzym.class) {
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
