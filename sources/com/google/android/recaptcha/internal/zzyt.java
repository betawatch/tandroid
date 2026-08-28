package com.google.android.recaptcha.internal;

import androidx.car.app.navigation.model.Maneuver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzyt extends zzsn implements zztt {
    private static final zzyt zzb;
    private static volatile zzua zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private zzyr zzj;
    private int zzk;
    private zzza zzl;

    static {
        zzyt zzytVar = new zzyt();
        zzb = zzytVar;
        zzsn.zzI(zzyt.class, zzytVar);
    }

    private zzyt() {
    }

    public static /* synthetic */ void zzM(zzyt zzytVar, int i9) {
        if (i9 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzytVar.zzh = i9 - 2;
    }

    public static /* synthetic */ void zzN(zzyt zzytVar, int i9) {
        if (i9 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzytVar.zzf = i9 - 2;
    }

    public static zzys zzf() {
        return (zzys) zzb.zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i9, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\f\u0004\f\u0005ဉ\u0000\u0006\u000b\u0007ဉ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i10 == 3) {
            return new zzyt();
        }
        zzyy zzyyVar = null;
        if (i10 == 4) {
            return new zzys(zzyyVar);
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
        synchronized (zzyt.class) {
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

    public final int zzk() {
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
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                i9 = 51;
                break;
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                i9 = 52;
                break;
            case 51:
                i9 = 53;
                break;
            case 52:
                i9 = 54;
                break;
            case 53:
                i9 = 55;
                break;
            case 54:
                i9 = 56;
                break;
            case 55:
                i9 = 57;
                break;
            case 56:
                i9 = 58;
                break;
            case 57:
                i9 = 59;
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

    public final int zzl() {
        int i9;
        switch (this.zzf) {
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
            default:
                i9 = 0;
                break;
        }
        if (i9 == 0) {
            return 1;
        }
        return i9;
    }
}
