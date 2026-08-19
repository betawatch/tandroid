package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzvu extends zzsn implements zztt {
    private static final zzvu zzb;
    private static volatile zzua zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private zzss zzk = zzsn.zzy();

    static {
        zzvu zzvuVar = new zzvu();
        zzb = zzvuVar;
        zzsn.zzI(zzvu.class, zzvuVar);
    }

    private zzvu() {
    }

    static /* synthetic */ void zzM(zzvu zzvuVar, String str) {
        str.getClass();
        zzvuVar.zzf = str;
    }

    static /* synthetic */ void zzN(zzvu zzvuVar, String str) {
        str.getClass();
        zzvuVar.zzi = str;
    }

    public static zzvr zzf() {
        return (zzvr) zzb.zzq();
    }

    static /* synthetic */ void zzi(zzvu zzvuVar, Iterable iterable) {
        zzss zzssVar = zzvuVar.zzk;
        if (!zzssVar.zzc()) {
            zzvuVar.zzk = zzsn.zzz(zzssVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzvuVar.zzk.zzh(((zzvs) it.next()).zza());
        }
    }

    static /* synthetic */ void zzk(zzvu zzvuVar, String str) {
        str.getClass();
        zzvuVar.zzj = str;
    }

    static /* synthetic */ void zzl(zzvu zzvuVar, String str) {
        str.getClass();
        zzvuVar.zzh = str;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzua zzuaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007,", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzvu();
        }
        zzvt zzvtVar = null;
        if (i2 == 4) {
            return new zzvr(zzvtVar);
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
        synchronized (zzvu.class) {
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
