package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
    public final Object zzh(int i10, Object obj, Object obj2) {
        zzua zzuaVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzsn.zzF(zzb, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bဉ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new zzye();
        }
        zzyj zzyjVar = null;
        if (i11 == 4) {
            return new zzyd(zzyjVar);
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
        synchronized (zzye.class) {
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
