package com.google.android.recaptcha.internal;

import androidx.car.app.navigation.model.Maneuver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public static /* synthetic */ void zzP(zzwn zzwnVar, int i9) {
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

    public static /* synthetic */ void zzV(zzwn zzwnVar, int i9) {
        zzwnVar.zze |= 32;
        zzwnVar.zzw = i9;
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
        int i9;
        switch (this.zzh) {
            case 0:
                i9 = 2;
                break;
            case 1:
                i9 = 3;
                break;
            case 2:
                i9 = 4;
                break;
            case 3:
                i9 = 5;
                break;
            case 4:
                i9 = 6;
                break;
            case 5:
                i9 = 7;
                break;
            case 6:
                i9 = 8;
                break;
            case 7:
                i9 = 9;
                break;
            case 8:
                i9 = 10;
                break;
            case 9:
                i9 = 11;
                break;
            case 10:
                i9 = 12;
                break;
            case 11:
                i9 = 13;
                break;
            case 12:
                i9 = 14;
                break;
            case 13:
                i9 = 15;
                break;
            case 14:
                i9 = 16;
                break;
            case 15:
                i9 = 17;
                break;
            case 16:
                i9 = 18;
                break;
            case 17:
                i9 = 19;
                break;
            case 18:
                i9 = 20;
                break;
            case 19:
                i9 = 21;
                break;
            case 20:
                i9 = 22;
                break;
            case 21:
                i9 = 23;
                break;
            case 22:
                i9 = 24;
                break;
            case 23:
                i9 = 25;
                break;
            case 24:
                i9 = 26;
                break;
            case 25:
                i9 = 27;
                break;
            case 26:
                i9 = 28;
                break;
            case 27:
                i9 = 29;
                break;
            case 28:
                i9 = 30;
                break;
            case 29:
                i9 = 31;
                break;
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                i9 = 32;
                break;
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                i9 = 33;
                break;
            case 32:
                i9 = 34;
                break;
            case 33:
                i9 = 35;
                break;
            case 34:
                i9 = 36;
                break;
            case 35:
                i9 = 37;
                break;
            case 36:
                i9 = 38;
                break;
            case 37:
                i9 = 39;
                break;
            case 38:
                i9 = 40;
                break;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                i9 = 41;
                break;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                i9 = 42;
                break;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                i9 = 43;
                break;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                i9 = 44;
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                i9 = 45;
                break;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                i9 = 46;
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                i9 = 47;
                break;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                i9 = 48;
                break;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                i9 = 49;
                break;
            case 48:
                i9 = 50;
                break;
            default:
                i9 = 0;
                break;
        }
        if (i9 == 0) {
            return 1;
        }
        return i9;
    }

    public final int zzab() {
        int i9 = this.zzp;
        int i10 = i9 != 0 ? i9 != 1 ? i9 != 2 ? 0 : 4 : 3 : 2;
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
    public final Object zzh(int i9, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i9 - 1;
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
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzuaVar;
    }

    public final zzwa zzi() {
        zzwa zzwaVar = this.zzq;
        return zzwaVar == null ? zzwa.zzj() : zzwaVar;
    }
}
