package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzxr extends zzsn implements zztt {
    private static final zzxr zzb;
    private static volatile zzua zzd;
    private int zze;
    private String zzf = "";

    static {
        zzxr zzxrVar = new zzxr();
        zzb = zzxrVar;
        zzsn.zzI(zzxr.class, zzxrVar);
    }

    private zzxr() {
    }

    public static zzxq zzf() {
        return (zzxq) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzxr zzxrVar, String str) {
        zzxrVar.zze |= 1;
        zzxrVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i9, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzxr();
        }
        zzyc zzycVar = null;
        if (i10 == 4) {
            return new zzxq(zzycVar);
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
        synchronized (zzxr.class) {
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
