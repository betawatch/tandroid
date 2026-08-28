package com.google.android.recaptcha.internal;

import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzzu extends zzsn implements zztt {
    private static final zzzu zzb;
    private static volatile zzua zzd;
    private int zze;
    private int zzf;
    private zzsu zzg = zzsn.zzB();

    static {
        zzzu zzzuVar = new zzzu();
        zzb = zzzuVar;
        zzsn.zzI(zzzu.class, zzzuVar);
        zzra zzg = zzra.zzg();
        zzvg zzvgVar = zzvg.zzi;
        zzsn.zzs(zzg, "", null, null, 490775251, zzvgVar, String.class);
        zzsn.zzs(zzra.zzg(), "", null, null, 490775252, zzvgVar, String.class);
    }

    private zzzu() {
    }

    public final int zzf() {
        return this.zze;
    }

    public final int zzg() {
        return this.zzf;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i9, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u000b\u0003\u001b", new Object[]{"zze", "zzf", "zzg", zzzt.class});
        }
        if (i10 == 3) {
            return new zzzu();
        }
        zzzv zzzvVar = null;
        if (i10 == 4) {
            return new zzzr(zzzvVar);
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
        synchronized (zzzu.class) {
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

    public final List zzj() {
        return this.zzg;
    }

    public final int zzk() {
        int i9;
        switch (this.zze) {
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
