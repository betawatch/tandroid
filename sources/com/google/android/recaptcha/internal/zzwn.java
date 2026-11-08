package com.google.android.recaptcha.internal;

import org.telegram.messenger.qs;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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

    public static /* synthetic */ void zzP(zzwn zzwnVar, int i7) {
        zzss zzssVar = zzwnVar.zzv;
        if (!zzssVar.zzc()) {
            zzwnVar.zzv = zzsn.zzz(zzssVar);
        }
        zzwnVar.zzv.zzh(0);
    }

    public static /* synthetic */ void zzQ(zzwn zzwnVar, String str) {
        str.getClass();
        zzwnVar.zzj = str;
    }

    public static /* synthetic */ void zzS(zzwn zzwnVar, zzwa zzwaVar) {
        zzwnVar.zzq = zzwaVar;
        zzwnVar.zze |= 2;
    }

    public static /* synthetic */ void zzT(zzwn zzwnVar, String str) {
        str.getClass();
        zzwnVar.zzk = str;
    }

    public static /* synthetic */ void zzU(zzwn zzwnVar, zzwz zzwzVar) {
        zzwzVar.getClass();
        zzwnVar.zzr = zzwzVar;
        zzwnVar.zze |= 4;
    }

    public static /* synthetic */ void zzV(zzwn zzwnVar, int i7) {
        zzwnVar.zze |= 32;
        zzwnVar.zzw = i7;
    }

    public static /* synthetic */ void zzX(zzwn zzwnVar, String str) {
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
        int i7;
        switch (this.zzh) {
            case 0:
                i7 = 2;
                break;
            case 1:
                i7 = 3;
                break;
            case 2:
                i7 = 4;
                break;
            case 3:
                i7 = 5;
                break;
            case 4:
                i7 = 6;
                break;
            case 5:
                i7 = 7;
                break;
            case 6:
                i7 = 8;
                break;
            case 7:
                i7 = 9;
                break;
            case 8:
                i7 = 10;
                break;
            case 9:
                i7 = 11;
                break;
            case 10:
                i7 = 12;
                break;
            case 11:
                i7 = 13;
                break;
            case 12:
                i7 = 14;
                break;
            case 13:
                i7 = 15;
                break;
            case 14:
                i7 = 16;
                break;
            case 15:
                i7 = 17;
                break;
            case 16:
                i7 = 18;
                break;
            case 17:
                i7 = 19;
                break;
            case 18:
                i7 = 20;
                break;
            case 19:
                i7 = 21;
                break;
            case 20:
                i7 = 22;
                break;
            case 21:
                i7 = 23;
                break;
            case 22:
                i7 = 24;
                break;
            case 23:
                i7 = 25;
                break;
            case 24:
                i7 = 26;
                break;
            case 25:
                i7 = 27;
                break;
            case 26:
                i7 = 28;
                break;
            case 27:
                i7 = 29;
                break;
            case 28:
                i7 = 30;
                break;
            case 29:
                i7 = 31;
                break;
            case qs.T /* 30 */:
                i7 = 32;
                break;
            case qs.U /* 31 */:
                i7 = 33;
                break;
            case 32:
                i7 = 34;
                break;
            case 33:
                i7 = 35;
                break;
            case 34:
                i7 = 36;
                break;
            case 35:
                i7 = 37;
                break;
            case 36:
                i7 = 38;
                break;
            case 37:
                i7 = 39;
                break;
            case 38:
                i7 = 40;
                break;
            case 39:
                i7 = 41;
                break;
            case 40:
                i7 = 42;
                break;
            case 41:
                i7 = 43;
                break;
            case 42:
                i7 = 44;
                break;
            case 43:
                i7 = 45;
                break;
            case 44:
                i7 = 46;
                break;
            case 45:
                i7 = 47;
                break;
            case 46:
                i7 = 48;
                break;
            case 47:
                i7 = 49;
                break;
            case 48:
                i7 = 50;
                break;
            default:
                i7 = 0;
                break;
        }
        if (i7 == 0) {
            return 1;
        }
        return i7;
    }

    public final int zzab() {
        int i7 = this.zzp;
        int i10 = i7 != 0 ? i7 != 1 ? i7 != 2 ? 0 : 4 : 3 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int zzf() {
        return this.zzw;
    }

    @Deprecated
    public final long zzg() {
        return this.zzn;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i7, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0011\u0001\u0001\u0001\u0013\u0011\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u0003\u0004\f\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bȈ\tȈ\nဉ\u0000\u000bဉ\u0003\rဉ\u0004\u000eȈ\u000f<\u0000\u0011'\u0012င\u0005\u0013\f", new Object[]{"zzg", "zzf", "zze", "zzh", "zzk", "zzn", "zzp", "zzq", "zzr", "zzs", "zzl", "zzm", "zzo", "zzt", "zzu", "zzj", zzvq.class, "zzv", "zzw", "zzi"});
        }
        if (i10 == 3) {
            return new zzwn();
        }
        zzwm zzwmVar = null;
        if (i10 == 4) {
            return new zzwk(zzwmVar);
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
        synchronized (zzwn.class) {
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

    public final zzwa zzi() {
        zzwa zzwaVar = this.zzq;
        return zzwaVar == null ? zzwa.zzj() : zzwaVar;
    }
}
