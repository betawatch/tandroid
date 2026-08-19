package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzwn extends zzsn implements zztt {
    private static final zzwn zzb;
    private static volatile zzua zzd;
    private int zze;
    private Object zzg;
    private int zzh;
    private int zzi;
    private long zzn;
    private zzrv zzo;
    private int zzp;
    private zzwa zzq;
    private zzwz zzr;
    private zzut zzt;
    private zzrv zzu;
    private int zzw;
    private int zzf = 0;
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private String zzs = "";
    private zzss zzv = zzsn.zzy();

    static {
        zzwn zzwnVar = new zzwn();
        zzb = zzwnVar;
        zzsn.zzI(zzwn.class, zzwnVar);
    }

    private zzwn() {
    }

    public static zzwn zzM(byte[] bArr) {
        return (zzwn) zzsn.zzx(zzb, bArr);
    }

    static /* synthetic */ void zzP(zzwn zzwnVar, int i) {
        zzss zzssVar = zzwnVar.zzv;
        if (!zzssVar.zzc()) {
            zzwnVar.zzv = zzsn.zzz(zzssVar);
        }
        zzwnVar.zzv.zzh(0);
    }

    static /* synthetic */ void zzQ(zzwn zzwnVar, String str) {
        str.getClass();
        zzwnVar.zzj = str;
    }

    static /* synthetic */ void zzS(zzwn zzwnVar, zzwa zzwaVar) {
        zzwnVar.zzq = zzwaVar;
        zzwnVar.zze |= 2;
    }

    static /* synthetic */ void zzT(zzwn zzwnVar, String str) {
        str.getClass();
        zzwnVar.zzk = str;
    }

    static /* synthetic */ void zzU(zzwn zzwnVar, zzwz zzwzVar) {
        zzwzVar.getClass();
        zzwnVar.zzr = zzwzVar;
        zzwnVar.zze |= 4;
    }

    static /* synthetic */ void zzV(zzwn zzwnVar, int i) {
        zzwnVar.zze |= 32;
        zzwnVar.zzw = i;
    }

    static /* synthetic */ void zzX(zzwn zzwnVar, String str) {
        str.getClass();
        zzwnVar.zzl = str;
    }

    public static zzwk zzj() {
        return (zzwk) zzb.zzq();
    }

    public static zzwn zzl() {
        return zzb;
    }

    public final String zzN() {
        return this.zzk;
    }

    public final String zzO() {
        return this.zzl;
    }

    public final boolean zzY() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzZ() {
        return (this.zze & 32) != 0;
    }

    public final int zzaa() {
        int i;
        switch (this.zzh) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            case 12:
                i = 14;
                break;
            case 13:
                i = 15;
                break;
            case 14:
                i = 16;
                break;
            case 15:
                i = 17;
                break;
            case 16:
                i = 18;
                break;
            case 17:
                i = 19;
                break;
            case 18:
                i = 20;
                break;
            case 19:
                i = 21;
                break;
            case 20:
                i = 22;
                break;
            case 21:
                i = 23;
                break;
            case 22:
                i = 24;
                break;
            case 23:
                i = 25;
                break;
            case 24:
                i = 26;
                break;
            case 25:
                i = 27;
                break;
            case 26:
                i = 28;
                break;
            case 27:
                i = 29;
                break;
            case 28:
                i = 30;
                break;
            case 29:
                i = 31;
                break;
            case 30:
                i = 32;
                break;
            case 31:
                i = 33;
                break;
            case 32:
                i = 34;
                break;
            case 33:
                i = 35;
                break;
            case 34:
                i = 36;
                break;
            case 35:
                i = 37;
                break;
            case 36:
                i = 38;
                break;
            case 37:
                i = 39;
                break;
            case 38:
                i = 40;
                break;
            case 39:
                i = 41;
                break;
            case 40:
                i = 42;
                break;
            case 41:
                i = 43;
                break;
            case 42:
                i = 44;
                break;
            case 43:
                i = 45;
                break;
            case 44:
                i = 46;
                break;
            case 45:
                i = 47;
                break;
            case 46:
                i = 48;
                break;
            case 47:
                i = 49;
                break;
            case 48:
                i = 50;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int zzab() {
        int i = this.zzp;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzf() {
        return this.zzw;
    }

    @Deprecated
    public final long zzg() {
        return this.zzn;
    }

    public final zzwa zzi() {
        zzwa zzwaVar = this.zzq;
        return zzwaVar == null ? zzwa.zzj() : zzwaVar;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzua zzuaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0011\u0001\u0001\u0001\u0013\u0011\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u0003\u0004\f\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bȈ\tȈ\nဉ\u0000\u000bဉ\u0003\rဉ\u0004\u000eȈ\u000f<\u0000\u0011'\u0012င\u0005\u0013\f", new Object[]{"zzg", "zzf", "zze", "zzh", "zzk", "zzn", "zzp", "zzq", "zzr", "zzs", "zzl", "zzm", "zzo", "zzt", "zzu", "zzj", zzvq.class, "zzv", "zzw", "zzi"});
        }
        if (i2 == 3) {
            return new zzwn();
        }
        zzwm zzwmVar = null;
        if (i2 == 4) {
            return new zzwk(zzwmVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            throw null;
        }
        zzua zzuaVar2 = zzd;
        if (zzuaVar2 != null) {
            return zzuaVar2;
        }
        synchronized (zzwn.class) {
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
