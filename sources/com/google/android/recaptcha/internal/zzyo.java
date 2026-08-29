package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
    public final Object zzh(int i10, Object obj, Object obj2) {
        zzua zzuaVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzsn.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zze", "zzg", zzym.class, "zzf"});
        }
        if (i11 == 3) {
            return new zzyo();
        }
        zzyp zzypVar = null;
        if (i11 == 4) {
            return new zzyn(zzypVar);
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
        synchronized (zzyo.class) {
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
