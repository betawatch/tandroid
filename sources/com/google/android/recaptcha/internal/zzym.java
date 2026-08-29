package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    public static /* synthetic */ void zzk(zzym zzymVar, int i10) {
        zzymVar.zzi = 2;
        zzymVar.zze |= 4;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i10, Object obj, Object obj2) {
        zzua zzuaVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzsn.zzF(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003'\u0004᠌\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzyl.zza, "zzj"});
        }
        if (i11 == 3) {
            return new zzym();
        }
        zzyp zzypVar = null;
        if (i11 == 4) {
            return new zzyk(zzypVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        if (i11 != 6) {
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
