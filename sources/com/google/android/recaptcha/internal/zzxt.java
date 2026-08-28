package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzxt extends zzsn implements zztt {
    private static final zzxt zzb;
    private static volatile zzua zzd;
    private zzqm zze;
    private zzqm zzf;

    static {
        zzxt zzxtVar = new zzxt();
        zzb = zzxtVar;
        zzsn.zzI(zzxt.class, zzxtVar);
    }

    private zzxt() {
        zzqm zzqmVar = zzqm.zzb;
        this.zze = zzqmVar;
        this.zzf = zzqmVar;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i9, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzxt();
        }
        zzyc zzycVar = null;
        if (i10 == 4) {
            return new zzxs(zzycVar);
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
        synchronized (zzxt.class) {
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
