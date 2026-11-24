package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zzyw extends zzsn implements zztt {
    private static final zzyw zzb;
    private static volatile zzua zzd;
    private int zze = 0;
    private Object zzf;

    static {
        zzyw zzywVar = new zzyw();
        zzb = zzywVar;
        zzsn.zzI(zzyw.class, zzywVar);
    }

    private zzyw() {
    }

    public static /* synthetic */ void zzM(zzyw zzywVar, float f) {
        zzywVar.zze = 9;
        zzywVar.zzf = Float.valueOf(f);
    }

    public static /* synthetic */ void zzN(zzyw zzywVar, int i) {
        zzywVar.zze = 4;
        zzywVar.zzf = Integer.valueOf(i);
    }

    public static /* synthetic */ void zzO(zzyw zzywVar, int i) {
        zzywVar.zze = 5;
        zzywVar.zzf = Integer.valueOf(i);
    }

    public static /* synthetic */ void zzP(zzyw zzywVar, long j) {
        zzywVar.zze = 7;
        zzywVar.zzf = Long.valueOf(j);
    }

    public static /* synthetic */ void zzQ(zzyw zzywVar, String str) {
        str.getClass();
        zzywVar.zze = 11;
        zzywVar.zzf = str;
    }

    public static zzyv zzf() {
        return (zzyv) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzyw zzywVar, boolean z) {
        zzywVar.zze = 1;
        zzywVar.zzf = Boolean.valueOf(z);
    }

    public static /* synthetic */ void zzj(zzyw zzywVar, zzqm zzqmVar) {
        zzywVar.zze = 2;
        zzywVar.zzf = zzqmVar;
    }

    public static /* synthetic */ void zzk(zzyw zzywVar, String str) {
        str.getClass();
        zzywVar.zze = 3;
        zzywVar.zzf = str;
    }

    public static /* synthetic */ void zzl(zzyw zzywVar, double d) {
        zzywVar.zze = 10;
        zzywVar.zzf = Double.valueOf(d);
    }

    @Override // com.google.android.recaptcha.internal.zzsn
    public final Object zzh(int i, Object obj, Object obj2) {
        zzua zzuaVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsn.zzF(zzb, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001:\u0000\u0002=\u0000\u0003Ȼ\u0000\u0004B\u0000\u0005B\u0000\u0006>\u0000\u0007C\u0000\b6\u0000\t4\u0000\n3\u0000\u000bȻ\u0000", new Object[]{"zzf", "zze"});
        }
        if (i2 == 3) {
            return new zzyw();
        }
        zzyy zzyyVar = null;
        if (i2 == 4) {
            return new zzyv(zzyyVar);
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
        synchronized (zzyw.class) {
            zzuaVar = zzd;
            if (zzuaVar == null) {
                zzuaVar = new zzsi(zzb);
                zzd = zzuaVar;
            }
        }
        return zzuaVar;
    }
}
