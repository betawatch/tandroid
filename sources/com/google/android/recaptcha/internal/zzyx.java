package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
    public final Object zzh(int i10, Object obj, Object obj2) {
        zzua zzuaVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[]{"zze", zzyw.class, "zzf"});
        }
        if (i11 == 3) {
            return new zzyx();
        }
        zzyy zzyyVar = null;
        if (i11 == 4) {
            return new zzyu(zzyyVar);
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
