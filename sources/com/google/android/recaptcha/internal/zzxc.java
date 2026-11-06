package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class zzxc extends zzsn implements zztt {
    private static final zzxc zzb;
    private static volatile zzua zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private zzrv zzj;
    private zzut zzk;
    private int zzl;
    private zzwj zzm;
    private String zzh = "";
    private String zzi = "";
    private zzsu zzn = zzsn.zzB();

    static {
        zzxc zzxcVar = new zzxc();
        zzb = zzxcVar;
        zzsn.zzI(zzxc.class, zzxcVar);
    }

    private zzxc() {
    }

    public static zzxc zzg() {
        return zzb;
    }

    public static zzxc zzi(byte[] bArr) {
        return (zzxc) zzsn.zzx(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i7, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsn.zzF(zzb, "\u0000\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001\u0004\u0003ဉ\u0000\u0004ဉ\u0001\u0005\f\u0007\u001b\b\f\tȈ\nȈ\u000bဉ\u0002", new Object[]{"zze", "zzf", "zzj", "zzk", "zzl", "zzn", zzwt.class, "zzg", "zzh", "zzi", "zzm"});
        }
        if (i10 == 3) {
            return new zzxc();
        }
        zzxb zzxbVar = null;
        if (i10 == 4) {
            return new zzxa(zzxbVar);
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
        synchronized (zzxc.class) {
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
