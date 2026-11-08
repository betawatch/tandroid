package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class zzyx extends zzsn implements zztt {
    private static final zzyx zzb;
    private static volatile zzua zzd;
    private zzsu zze = zzsn.zzB();
    private int zzf;

    static {
        zzyx zzyxVar = new zzyx();
        zzb = zzyxVar;
        zzsn.zzI(zzyx.class, zzyxVar);
    }

    private zzyx() {
    }

    public static zzyu zzf() {
        return (zzyu) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzyx zzyxVar, Iterable iterable) {
        zzyxVar.zzl();
        zzpw.zzc(iterable, zzyxVar.zze);
    }

    public static /* synthetic */ void zzj(zzyx zzyxVar, zzyw zzywVar) {
        zzywVar.getClass();
        zzyxVar.zzl();
        zzyxVar.zze.add(zzywVar);
    }

    private final void zzl() {
        zzsu zzsuVar = this.zze;
        if (zzsuVar.zzc()) {
            return;
        }
        this.zze = zzsn.zzC(zzsuVar);
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i7, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[]{"zze", zzyw.class, "zzf"});
        }
        if (i10 == 3) {
            return new zzyx();
        }
        zzyy zzyyVar = null;
        if (i10 == 4) {
            return new zzyu(zzyyVar);
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
        synchronized (zzyx.class) {
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
