package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
    public final Object zzh(int i, Object obj, Object obj2) {
        zzua zzuaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzzf();
        }
        zzzv zzzvVar = null;
        if (i2 == 4) {
            return new zzze(zzzvVar);
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
        synchronized (zzzf.class) {
            zzuaVar = zzd;
            if (zzuaVar == null) {
                zzuaVar = new zzsi(zzb);
                zzd = zzuaVar;
            }
        }
        return zzuaVar;
    }
}
