package com.google.android.recaptcha.internal;

import java.util.List;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
    public final Object zzh(int i7, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i7 - 1;
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzuaVar;
    }

    public final List zzj() {
        return this.zzg;
    }

    public final int zzk() {
        int i7;
        switch (this.zze) {
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
            default:
                i7 = 0;
                break;
        }
        if (i7 == 0) {
            return 1;
        }
        return i7;
    }
}
