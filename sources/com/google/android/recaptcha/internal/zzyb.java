package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class zzyb extends zzsn implements zztt {
    private static final zzyb zzb;
    private static volatile zzua zzd;
    private int zze;
    private String zzf = "";

    static {
        zzyb zzybVar = new zzyb();
        zzb = zzybVar;
        zzsn.zzI(zzyb.class, zzybVar);
    }

    private zzyb() {
    }

    public static zzya zzf() {
        return (zzya) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzyb zzybVar, String str) {
        str.getClass();
        zzybVar.zze |= 1;
        zzybVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i10, Object obj, Object obj2) {
        zzua zzuaVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzyb();
        }
        zzyc zzycVar = null;
        if (i11 == 4) {
            return new zzya(zzycVar);
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
        synchronized (zzyb.class) {
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
