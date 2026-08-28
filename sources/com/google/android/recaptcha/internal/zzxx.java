package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzxx extends zzsn implements zztt {
    private static final zzxx zzb;
    private static volatile zzua zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private zzyb zzk;
    private zzxr zzl;
    private zzxz zzm;
    private zzxj zzn;
    private zzxv zzo;

    static {
        zzxx zzxxVar = new zzxx();
        zzb = zzxxVar;
        zzsn.zzI(zzxx.class, zzxxVar);
    }

    private zzxx() {
    }

    public static /* synthetic */ void zzN(zzxx zzxxVar, String str) {
        str.getClass();
        zzxxVar.zze |= 1;
        zzxxVar.zzf = str;
    }

    public static /* synthetic */ void zzO(zzxx zzxxVar, zzxj zzxjVar) {
        zzxjVar.getClass();
        zzxxVar.zzn = zzxjVar;
        zzxxVar.zze |= 256;
    }

    public static /* synthetic */ void zzP(zzxx zzxxVar, zzxr zzxrVar) {
        zzxrVar.getClass();
        zzxxVar.zzl = zzxrVar;
        zzxxVar.zze |= 64;
    }

    public static /* synthetic */ void zzQ(zzxx zzxxVar, zzyb zzybVar) {
        zzybVar.getClass();
        zzxxVar.zzk = zzybVar;
        zzxxVar.zze |= 32;
    }

    public static /* synthetic */ void zzR(zzxx zzxxVar, zzxz zzxzVar) {
        zzxzVar.getClass();
        zzxxVar.zzm = zzxzVar;
        zzxxVar.zze |= 128;
    }

    public static zzxw zzf() {
        return (zzxw) zzb.zzq();
    }

    public static zzxx zzi(byte[] bArr) {
        return (zzxx) zzsn.zzx(zzb, bArr);
    }

    @Deprecated
    public final String zzM() {
        return this.zzh;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i9, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsn.zzF(zzb, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (i10 == 3) {
            return new zzxx();
        }
        zzyc zzycVar = null;
        if (i10 == 4) {
            return new zzxw(zzycVar);
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
        synchronized (zzxx.class) {
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

    @Deprecated
    public final String zzj() {
        return this.zzi;
    }

    public final String zzk() {
        return this.zzf;
    }

    @Deprecated
    public final String zzl() {
        return this.zzg;
    }
}
