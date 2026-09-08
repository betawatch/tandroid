package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    public static /* synthetic */ void zzM(zzyw zzywVar, float f7) {
        zzywVar.zze = 9;
        zzywVar.zzf = Float.valueOf(f7);
    }

    public static /* synthetic */ void zzN(zzyw zzywVar, int i10) {
        zzywVar.zze = 4;
        zzywVar.zzf = Integer.valueOf(i10);
    }

    public static /* synthetic */ void zzO(zzyw zzywVar, int i10) {
        zzywVar.zze = 5;
        zzywVar.zzf = Integer.valueOf(i10);
    }

    public static /* synthetic */ void zzP(zzyw zzywVar, long j3) {
        zzywVar.zze = 7;
        zzywVar.zzf = Long.valueOf(j3);
    }

    public static /* synthetic */ void zzQ(zzyw zzywVar, String str) {
        str.getClass();
        zzywVar.zze = 11;
        zzywVar.zzf = str;
    }

    public static zzyv zzf() {
        return (zzyv) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzyw zzywVar, boolean z10) {
        zzywVar.zze = 1;
        zzywVar.zzf = Boolean.valueOf(z10);
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
    public final Object zzh(int i10, Object obj, Object obj2) {
        zzua zzuaVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzsn.zzF(zzb, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001:\u0000\u0002=\u0000\u0003Ȼ\u0000\u0004B\u0000\u0005B\u0000\u0006>\u0000\u0007C\u0000\b6\u0000\t4\u0000\n3\u0000\u000bȻ\u0000", new Object[]{"zzf", "zze"});
        }
        if (i11 == 3) {
            return new zzyw();
        }
        zzyy zzyyVar = null;
        if (i11 == 4) {
            return new zzyv(zzyyVar);
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
        synchronized (zzyw.class) {
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
}
