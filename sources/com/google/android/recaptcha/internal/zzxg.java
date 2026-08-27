package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class zzxg extends zzsn implements zztt {
    private static final zzxg zzb;
    private static volatile zzua zzd;
    private int zze;
    private zzxe zzf;
    private zzxe zzg;

    static {
        zzxg zzxgVar = new zzxg();
        zzb = zzxgVar;
        zzsn.zzI(zzxg.class, zzxgVar);
    }

    private zzxg() {
    }

    public static zzxg zzj(byte[] bArr) {
        return (zzxg) zzsn.zzx(zzb, bArr);
    }

    public final zzxe zzf() {
        zzxe zzxeVar = this.zzf;
        return zzxeVar == null ? zzxe.zzg() : zzxeVar;
    }

    public final zzxe zzg() {
        zzxe zzxeVar = this.zzg;
        return zzxeVar == null ? zzxe.zzg() : zzxeVar;
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i10, Object obj, Object obj2) {
        zzua zzuaVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzsn.zzF(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzxg();
        }
        zzxh zzxhVar = null;
        if (i11 == 4) {
            return new zzxf(zzxhVar);
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
        synchronized (zzxg.class) {
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
