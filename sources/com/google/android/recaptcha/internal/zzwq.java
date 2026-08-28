package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzwq extends zzsn implements zztt {
    private static final zzwq zzb;
    private static volatile zzua zzd;
    private int zze;
    private zzsu zzf = zzsn.zzB();
    private zzsu zzg = zzsn.zzB();
    private zzvx zzh;

    static {
        zzwq zzwqVar = new zzwq();
        zzb = zzwqVar;
        zzsn.zzI(zzwq.class, zzwqVar);
    }

    private zzwq() {
    }

    public static /* synthetic */ void zzM(zzwq zzwqVar, zzwn zzwnVar) {
        zzwnVar.getClass();
        zzsu zzsuVar = zzwqVar.zzf;
        if (!zzsuVar.zzc()) {
            zzwqVar.zzf = zzsn.zzC(zzsuVar);
        }
        zzwqVar.zzf.add(zzwnVar);
    }

    public static /* synthetic */ void zzN(zzwq zzwqVar, zzxc zzxcVar) {
        zzxcVar.getClass();
        zzsu zzsuVar = zzwqVar.zzg;
        if (!zzsuVar.zzc()) {
            zzwqVar.zzg = zzsn.zzC(zzsuVar);
        }
        zzwqVar.zzg.add(zzxcVar);
    }

    public static zzwo zzi() {
        return (zzwo) zzb.zzq();
    }

    public static zzwq zzk(byte[] bArr) {
        return (zzwq) zzsn.zzx(zzb, bArr);
    }

    public final int zzf() {
        return this.zzf.size();
    }

    public final int zzg() {
        return this.zzg.size();
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i9, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zze", "zzf", zzwn.class, "zzg", zzxc.class, "zzh"});
        }
        if (i10 == 3) {
            return new zzwq();
        }
        zzwp zzwpVar = null;
        if (i10 == 4) {
            return new zzwo(zzwpVar);
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
        synchronized (zzwq.class) {
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

    public final List zzl() {
        return this.zzf;
    }
}
