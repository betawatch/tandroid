package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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

    public static /* synthetic */ void zzi(zzym zzymVar, String str) {
        str.getClass();
        zzymVar.zze |= 2;
        zzymVar.zzg = str;
    }

    public static /* synthetic */ void zzj(zzym zzymVar, String str) {
        str.getClass();
        zzymVar.zze |= 1;
        zzymVar.zzf = str;
    }

    public static /* synthetic */ void zzk(zzym zzymVar, int i7) {
        zzymVar.zzi = 2;
        zzymVar.zze |= 4;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i7, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsn.zzF(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003'\u0004᠌\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzyl.zza, "zzj"});
        }
        if (i10 == 3) {
            return new zzym();
        }
        zzyp zzypVar = null;
        if (i10 == 4) {
            return new zzyk(zzypVar);
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
        synchronized (zzym.class) {
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
