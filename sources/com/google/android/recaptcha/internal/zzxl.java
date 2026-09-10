package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class zzxl extends zzsn implements zztt {
    private static final zzxl zzb;
    private static volatile zzua zzd;
    private zzqm zze = zzqm.zzb;

    static {
        zzxl zzxlVar = new zzxl();
        zzb = zzxlVar;
        zzsn.zzI(zzxl.class, zzxlVar);
    }

    private zzxl() {
    }

    public static zzxl zzi() {
        return zzb;
    }

    public final zzqm zzf() {
        return this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i10, Object obj, Object obj2) {
        zzua zzuaVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"zze"});
        }
        if (i11 == 3) {
            return new zzxl();
        }
        zzyc zzycVar = null;
        if (i11 == 4) {
            return new zzxk(zzycVar);
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
        synchronized (zzxl.class) {
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
