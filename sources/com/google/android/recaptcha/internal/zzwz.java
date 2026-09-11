package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
    public final Object zzh(int i10, Object obj, Object obj2) {
        zzua zzuaVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005Ȉ\u0006Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new zzwz();
        }
        zzwy zzwyVar = null;
        if (i11 == 4) {
            return new zzwx(zzwyVar);
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
        synchronized (zzwz.class) {
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
