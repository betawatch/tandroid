package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class zzwg extends zzsn implements zztt {
    private static final zzwg zzb;
    private static volatile zzua zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzwg zzwgVar = new zzwg();
        zzb = zzwgVar;
        zzsn.zzI(zzwg.class, zzwgVar);
    }

    private zzwg() {
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i7, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzwg();
        }
        zzwf zzwfVar = null;
        if (i10 == 4) {
            return new zzwe(zzwfVar);
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
        synchronized (zzwg.class) {
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
