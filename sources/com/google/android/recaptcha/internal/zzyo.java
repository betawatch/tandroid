package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzyo extends zzsn implements zztt {
    private static final zzyo zzb;
    private static volatile zzua zzd;
    private int zze;
    private String zzf = "";
    private zzsu zzg = zzsn.zzB();

    static {
        zzyo zzyoVar = new zzyo();
        zzb = zzyoVar;
        zzsn.zzI(zzyo.class, zzyoVar);
    }

    private zzyo() {
    }

    public static zzyn zzf() {
        return (zzyn) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzyo zzyoVar, Iterable iterable) {
        zzyoVar.zzl();
        zzpw.zzc(iterable, zzyoVar.zzg);
    }

    public static /* synthetic */ void zzj(zzyo zzyoVar, zzym zzymVar) {
        zzymVar.getClass();
        zzyoVar.zzl();
        zzyoVar.zzg.add(zzymVar);
    }

    public static /* synthetic */ void zzk(zzyo zzyoVar, String str) {
        str.getClass();
        zzyoVar.zze |= 1;
        zzyoVar.zzf = str;
    }

    private final void zzl() {
        zzsu zzsuVar = this.zzg;
        if (zzsuVar.zzc()) {
            return;
        }
        this.zzg = zzsn.zzC(zzsuVar);
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i9, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsn.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zze", "zzg", zzym.class, "zzf"});
        }
        if (i10 == 3) {
            return new zzyo();
        }
        zzyp zzypVar = null;
        if (i10 == 4) {
            return new zzyn(zzypVar);
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
        synchronized (zzyo.class) {
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
