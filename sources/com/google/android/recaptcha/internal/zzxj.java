package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class zzxj extends zzsn implements zztt {
    private static final zzxj zzb;
    private static volatile zzua zzd;
    private int zze;
    private String zzf = "";

    static {
        zzxj zzxjVar = new zzxj();
        zzb = zzxjVar;
        zzsn.zzI(zzxj.class, zzxjVar);
    }

    private zzxj() {
    }

    public static zzxi zzf() {
        return (zzxi) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzxj zzxjVar, String str) {
        zzxjVar.zze |= 1;
        zzxjVar.zzf = str;
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
            return new zzxj();
        }
        zzyc zzycVar = null;
        if (i11 == 4) {
            return new zzxi(zzycVar);
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
        synchronized (zzxj.class) {
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
