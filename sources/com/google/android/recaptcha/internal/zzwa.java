package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class zzwa extends zzsn implements zztt {
    private static final zzwa zzb;
    private static volatile zzua zzd;
    private int zzg;
    private int zzj;
    private int zzk;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzwa zzwaVar = new zzwa();
        zzb = zzwaVar;
        zzsn.zzI(zzwa.class, zzwaVar);
    }

    private zzwa() {
    }

    public static /* synthetic */ void zzO(zzwa zzwaVar, String str) {
        str.getClass();
        zzwaVar.zze = str;
    }

    public static zzvy zzg() {
        return (zzvy) zzb.zzq();
    }

    public static zzwa zzj() {
        return zzb;
    }

    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i, Object obj, Object obj2) {
        zzua zzuaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ\u0007\u0004", new Object[]{"zze", "zzg", "zzi", "zzj", "zzf", "zzh", "zzk"});
        }
        if (i2 == 3) {
            return new zzwa();
        }
        zzvz zzvzVar = null;
        if (i2 == 4) {
            return new zzvy(zzvzVar);
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
        synchronized (zzwa.class) {
            zzuaVar = zzd;
            if (zzuaVar == null) {
                zzuaVar = new zzsi(zzb);
                zzd = zzuaVar;
            }
        }
        return zzuaVar;
    }

    public final String zzk() {
        return this.zze;
    }
}
