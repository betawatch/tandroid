package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class zzzf extends zzsn implements zztt {
    private static final zzzf zzb;
    private static volatile zzua zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzzf zzzfVar = new zzzf();
        zzb = zzzfVar;
        zzsn.zzI(zzzf.class, zzzfVar);
    }

    private zzzf() {
    }

    public static zzze zzf() {
        return (zzze) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzzf zzzfVar, String str) {
        str.getClass();
        zzzfVar.zze = str;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i10, Object obj, Object obj2) {
        zzua zzuaVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzzf();
        }
        zzzv zzzvVar = null;
        if (i11 == 4) {
            return new zzze(zzzvVar);
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
        synchronized (zzzf.class) {
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
