package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class zzyb extends zzsn implements zztt {
    private static final zzyb zzb;
    private static volatile zzua zzd;
    private int zze;
    private String zzf = "";

    static {
        zzyb zzybVar = new zzyb();
        zzb = zzybVar;
        zzsn.zzI(zzyb.class, zzybVar);
    }

    private zzyb() {
    }

    public static zzya zzf() {
        return (zzya) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzyb zzybVar, String str) {
        str.getClass();
        zzybVar.zze |= 1;
        zzybVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i7, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzyb();
        }
        zzyc zzycVar = null;
        if (i10 == 4) {
            return new zzya(zzycVar);
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
        synchronized (zzyb.class) {
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
