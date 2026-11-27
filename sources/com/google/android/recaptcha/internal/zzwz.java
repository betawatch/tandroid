package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zzwz extends zzsn implements zztt {
    private static final zzwz zzb;
    private static volatile zzua zzd;
    private int zze;
    private zzwd zzg;
    private zzvu zzh;
    private zzwg zzi;
    private String zzf = "";
    private String zzj = "";
    private String zzk = "";

    static {
        zzwz zzwzVar = new zzwz();
        zzb = zzwzVar;
        zzsn.zzI(zzwz.class, zzwzVar);
    }

    private zzwz() {
    }

    public static zzwx zzf() {
        return (zzwx) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzwz zzwzVar, zzvu zzvuVar) {
        zzvuVar.getClass();
        zzwzVar.zzh = zzvuVar;
        zzwzVar.zze |= 2;
    }

    public static /* synthetic */ void zzj(zzwz zzwzVar, String str) {
        str.getClass();
        zzwzVar.zzk = str;
    }

    public static /* synthetic */ void zzk(zzwz zzwzVar, String str) {
        str.getClass();
        zzwzVar.zzj = str;
    }

    public static /* synthetic */ void zzl(zzwz zzwzVar, String str) {
        str.getClass();
        zzwzVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i, Object obj, Object obj2) {
        zzua zzuaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005Ȉ\u0006Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzwz();
        }
        zzwy zzwyVar = null;
        if (i2 == 4) {
            return new zzwx(zzwyVar);
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
        synchronized (zzwz.class) {
            zzuaVar = zzd;
            if (zzuaVar == null) {
                zzuaVar = new zzsi(zzb);
                zzd = zzuaVar;
            }
        }
        return zzuaVar;
    }
}
