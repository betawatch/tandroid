package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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

    public static /* synthetic */ void zzM(zzvu zzvuVar, String str) {
        str.getClass();
        zzvuVar.zzf = str;
    }

    public static /* synthetic */ void zzN(zzvu zzvuVar, String str) {
        str.getClass();
        zzvuVar.zzi = str;
    }

    public static zzvr zzf() {
        return (zzvr) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzvu zzvuVar, Iterable iterable) {
        zzss zzssVar = zzvuVar.zzk;
        if (!zzssVar.zzc()) {
            zzvuVar.zzk = zzsn.zzz(zzssVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzvuVar.zzk.zzh(((zzvs) it.next()).zza());
        }
    }

    public static /* synthetic */ void zzk(zzvu zzvuVar, String str) {
        str.getClass();
        zzvuVar.zzj = str;
    }

    public static /* synthetic */ void zzl(zzvu zzvuVar, String str) {
        str.getClass();
        zzvuVar.zzh = str;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i7, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007,", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i10 == 3) {
            return new zzvu();
        }
        zzvt zzvtVar = null;
        if (i10 == 4) {
            return new zzvr(zzvtVar);
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
        synchronized (zzvu.class) {
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
