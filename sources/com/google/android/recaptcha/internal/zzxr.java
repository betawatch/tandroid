package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
    public final Object zzh(int i, Object obj, Object obj2) {
        zzua zzuaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzxr();
        }
        zzyc zzycVar = null;
        if (i2 == 4) {
            return new zzxq(zzycVar);
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
        synchronized (zzxr.class) {
            zzuaVar = zzd;
            if (zzuaVar == null) {
                zzuaVar = new zzsi(zzb);
                zzd = zzuaVar;
            }
        }
        return zzuaVar;
    }
}
