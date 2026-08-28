package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzye extends zzsn implements zztt {
    private static final zzye zzb;
    private static volatile zzua zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private zzxx zzm;

    static {
        zzye zzyeVar = new zzye();
        zzb = zzyeVar;
        zzsn.zzI(zzye.class, zzyeVar);
    }

    private zzye() {
    }

    public static /* synthetic */ void zzM(zzye zzyeVar, String str) {
        str.getClass();
        zzyeVar.zze |= 4;
        zzyeVar.zzh = str;
    }

    public static zzyd zzf() {
        return (zzyd) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzye zzyeVar, String str) {
        str.getClass();
        zzyeVar.zze |= 8;
        zzyeVar.zzi = str;
    }

    public static /* synthetic */ void zzj(zzye zzyeVar, String str) {
        str.getClass();
        zzyeVar.zze |= 2;
        zzyeVar.zzg = str;
    }

    public static /* synthetic */ void zzk(zzye zzyeVar, String str) {
        str.getClass();
        zzyeVar.zze |= 1;
        zzyeVar.zzf = str;
    }

    public static /* synthetic */ void zzl(zzye zzyeVar, zzxx zzxxVar) {
        zzxxVar.getClass();
        zzyeVar.zzm = zzxxVar;
        zzyeVar.zze |= 128;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i9, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsn.zzF(zzb, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bဉ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i10 == 3) {
            return new zzye();
        }
        zzyj zzyjVar = null;
        if (i10 == 4) {
            return new zzyd(zzyjVar);
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
        synchronized (zzye.class) {
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
