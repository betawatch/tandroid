package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class zzxn extends zzsn implements zztt {
    private static final zzxn zzb;
    private static volatile zzua zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private zzst zzl = zzsn.zzA();
    private zzqm zzm = zzqm.zzb;
    private zzxp zzn;
    private zzxl zzo;
    private zzxt zzp;

    static {
        zzxn zzxnVar = new zzxn();
        zzb = zzxnVar;
        zzsn.zzI(zzxn.class, zzxnVar);
    }

    private zzxn() {
    }

    public static zzxn zzj() {
        return zzb;
    }

    public final String zzM() {
        return this.zzi;
    }

    public final String zzN() {
        return this.zzh;
    }

    public final String zzO() {
        return this.zzj;
    }

    public final String zzP() {
        return this.zzk;
    }

    public final List zzQ() {
        return this.zzl;
    }

    public final boolean zzR() {
        return (this.zze & 256) != 0;
    }

    public final boolean zzS() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzT() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzU() {
        return (this.zze & 128) != 0;
    }

    public final boolean zzV() {
        return (this.zze & 64) != 0;
    }

    public final zzqm zzf() {
        return this.zzm;
    }

    public final zzxl zzg() {
        zzxl zzxlVar = this.zzo;
        return zzxlVar == null ? zzxl.zzi() : zzxlVar;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i10, Object obj, Object obj2) {
        zzua zzuaVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzsn.zzF(zzb, "\u0000\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007%\bည\u0006\u000bဉ\u0007\fဉ\b\rဉ\t", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (i11 == 3) {
            return new zzxn();
        }
        zzyc zzycVar = null;
        if (i11 == 4) {
            return new zzxm(zzycVar);
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
        synchronized (zzxn.class) {
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

    public final zzxp zzk() {
        zzxp zzxpVar = this.zzn;
        return zzxpVar == null ? zzxp.zzk() : zzxpVar;
    }

    public final String zzl() {
        return this.zzg;
    }
}
