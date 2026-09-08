package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    public static /* synthetic */ void zzi(zzxz zzxzVar, String str) {
        str.getClass();
        zzxzVar.zze |= 2;
        zzxzVar.zzg = str;
    }

    public static /* synthetic */ void zzj(zzxz zzxzVar, String str) {
        str.getClass();
        zzxzVar.zze |= 1;
        zzxzVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i10, Object obj, Object obj2) {
        zzua zzuaVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzxz();
        }
        zzyc zzycVar = null;
        if (i11 == 4) {
            return new zzxy(zzycVar);
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
        synchronized (zzxz.class) {
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
