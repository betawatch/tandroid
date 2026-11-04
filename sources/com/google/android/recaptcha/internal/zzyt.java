package com.google.android.recaptcha.internal;

import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public static /* synthetic */ void zzM(zzyt zzytVar, int i3) {
        if (i3 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzytVar.zzh = i3 - 2;
    }

    public static /* synthetic */ void zzN(zzyt zzytVar, int i3) {
        if (i3 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzytVar.zzf = i3 - 2;
    }

    public static zzys zzf() {
        return (zzys) zzb.zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i3, Object obj, Object obj2) {
        zzua zzuaVar;
        int i10 = i3 - 1;
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzuaVar;
    }

    public final int zzk() {
        int i3;
        switch (this.zzh) {
            case 0:
                i3 = 2;
                break;
            case 1:
                i3 = 3;
                break;
            case 2:
                i3 = 4;
                break;
            case 3:
                i3 = 5;
                break;
            case 4:
                i3 = 6;
                break;
            case 5:
                i3 = 7;
                break;
            case 6:
                i3 = 8;
                break;
            case 7:
                i3 = 9;
                break;
            case 8:
                i3 = 10;
                break;
            case 9:
                i3 = 11;
                break;
            case 10:
                i3 = 12;
                break;
            case 11:
                i3 = 13;
                break;
            case 12:
                i3 = 14;
                break;
            case 13:
                i3 = 15;
                break;
            case 14:
                i3 = 16;
                break;
            case 15:
                i3 = 17;
                break;
            case 16:
                i3 = 18;
                break;
            case 17:
                i3 = 19;
                break;
            case 18:
                i3 = 20;
                break;
            case 19:
                i3 = 21;
                break;
            case 20:
                i3 = 22;
                break;
            case 21:
                i3 = 23;
                break;
            case 22:
                i3 = 24;
                break;
            case 23:
                i3 = 25;
                break;
            case 24:
                i3 = 26;
                break;
            case 25:
                i3 = 27;
                break;
            case 26:
                i3 = 28;
                break;
            case 27:
                i3 = 29;
                break;
            case 28:
                i3 = 30;
                break;
            case 29:
                i3 = 31;
                break;
            case hs.T /* 30 */:
                i3 = 32;
                break;
            case hs.U /* 31 */:
                i3 = 33;
                break;
            case 32:
                i3 = 34;
                break;
            case 33:
                i3 = 35;
                break;
            case 34:
                i3 = 36;
                break;
            case 35:
                i3 = 37;
                break;
            case 36:
                i3 = 38;
                break;
            case 37:
                i3 = 39;
                break;
            case 38:
                i3 = 40;
                break;
            case 39:
                i3 = 41;
                break;
            case 40:
                i3 = 42;
                break;
            case 41:
                i3 = 43;
                break;
            case 42:
                i3 = 44;
                break;
            case 43:
                i3 = 45;
                break;
            case 44:
                i3 = 46;
                break;
            case 45:
                i3 = 47;
                break;
            case 46:
                i3 = 48;
                break;
            case 47:
                i3 = 49;
                break;
            case 48:
                i3 = 50;
                break;
            case 49:
                i3 = 51;
                break;
            case 50:
                i3 = 52;
                break;
            case hs.o0 /* 51 */:
                i3 = 53;
                break;
            case hs.p0 /* 52 */:
                i3 = 54;
                break;
            case hs.q0 /* 53 */:
                i3 = 55;
                break;
            case hs.r0 /* 54 */:
                i3 = 56;
                break;
            case hs.s0 /* 55 */:
                i3 = 57;
                break;
            case hs.t0 /* 56 */:
                i3 = 58;
                break;
            case hs.u0 /* 57 */:
                i3 = 59;
                break;
            default:
                i3 = 0;
                break;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public final int zzl() {
        int i3;
        switch (this.zzf) {
            case 0:
                i3 = 2;
                break;
            case 1:
                i3 = 3;
                break;
            case 2:
                i3 = 4;
                break;
            case 3:
                i3 = 5;
                break;
            case 4:
                i3 = 6;
                break;
            case 5:
                i3 = 7;
                break;
            case 6:
                i3 = 8;
                break;
            case 7:
                i3 = 9;
                break;
            case 8:
                i3 = 10;
                break;
            case 9:
                i3 = 11;
                break;
            case 10:
                i3 = 12;
                break;
            case 11:
                i3 = 13;
                break;
            case 12:
                i3 = 14;
                break;
            case 13:
                i3 = 15;
                break;
            case 14:
                i3 = 16;
                break;
            default:
                i3 = 0;
                break;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }
}
