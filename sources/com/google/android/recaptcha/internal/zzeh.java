package com.google.android.recaptcha.internal;

import android.app.Application;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zzeh {
    private final Application zza;
    private final vj7 zzb = new xj7();
    private zzeq zzc;
    private final h26 zzd;

    public zzeh(Application application) {
        this.zza = application;
        int i = zzby.zza;
        this.zzd = ure.b(zzef.zza);
        zzdp.zza(application);
    }

    public static /* synthetic */ Object zzd(zzeh zzehVar, String str, long j, zzdw zzdwVar, zzdq zzdqVar, zw2 zw2Var, int i, Object obj) {
        if ((i & 8) != 0) {
            zzdqVar = zzdq.zza;
        }
        zzdq zzdqVar2 = zzdqVar;
        if ((i & 2) != 0) {
            j = 10000;
        }
        return zzehVar.zzc(str, j, null, zzdqVar2, zw2Var);
    }

    public static final /* synthetic */ void zzf(zzeh zzehVar, long j) {
        if (j < 5000) {
            throw new zzcg(zzce.zzj, zzcd.zzI, null, null, 12, null);
        }
        if (sr.b(zzehVar.zza, "android.permission.INTERNET") != 0) {
            throw new zzcg(zzce.zzc, zzcd.zzao, null, null, 12, null);
        }
    }

    public final zzcr zza() {
        return (zzcr) this.zzd.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c A[Catch: all -> 0x00ae, TryCatch #1 {all -> 0x00ae, blocks: (B:26:0x0071, B:30:0x0087, B:35:0x007c), top: B:25:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, long j, zzdw zzdwVar, zzdq zzdqVar, zw2 zw2Var) {
        zzea zzeaVar;
        Object obj;
        int i;
        vx2 vx2Var;
        String str2;
        zzdq zzdqVar2;
        long j2;
        Object obj2;
        Object obj3;
        int i2;
        int i3;
        try {
            if (zw2Var instanceof zzea) {
                zzeaVar = (zzea) zw2Var;
                int i4 = zzeaVar.zzg;
                if ((i4 & TLObject.FLAG_31) != 0) {
                    zzeaVar.zzg = i4 - TLObject.FLAG_31;
                    zzea zzeaVar2 = zzeaVar;
                    obj = zzeaVar2.zze;
                    i = zzeaVar2.zzg;
                    vx2Var = vx2.a;
                    if (i != 0) {
                        ixe.b(obj);
                        vj7 vj7Var = this.zzb;
                        str2 = str;
                        zzeaVar2.zza = str2;
                        zzeaVar2.zzb = null;
                        zzdqVar2 = zzdqVar;
                        zzeaVar2.zzh = zzdqVar2;
                        zzeaVar2.zzc = vj7Var;
                        j2 = j;
                        zzeaVar2.zzd = j2;
                        zzeaVar2.zzg = 1;
                        xj7 xj7Var = (xj7) vj7Var;
                        if (xj7Var.d(zzeaVar2) != vx2Var) {
                            obj2 = xj7Var;
                        }
                        return vx2Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj3 = (vj7) zzeaVar2.zza;
                        try {
                            ixe.b(obj);
                            zzeq zzeqVar = (zzeq) obj;
                            ((xj7) obj3).f(null);
                            return zzeqVar;
                        } catch (Throwable th) {
                            th = th;
                            ((xj7) obj3).f(null);
                            throw th;
                        }
                    }
                    long j3 = zzeaVar2.zzd;
                    Object obj4 = (vj7) zzeaVar2.zzc;
                    zzdq zzdqVar3 = zzeaVar2.zzh;
                    String str3 = (String) zzeaVar2.zza;
                    ixe.b(obj);
                    obj2 = obj4;
                    zzdqVar2 = zzdqVar3;
                    str2 = str3;
                    j2 = j3;
                    if (!ur5.a(zzdqVar2, zzdq.zza)) {
                        i3 = 3;
                    } else {
                        if (!ur5.a(zzdqVar2, zzdq.zzb)) {
                            i2 = 2;
                            zzed zzedVar = new zzed(this, str2, null, zzdqVar2, j2, null);
                            zzeaVar2.zza = obj2;
                            zzeaVar2.zzb = null;
                            zzeaVar2.zzh = null;
                            zzeaVar2.zzc = null;
                            zzeaVar2.zzg = 2;
                            obj = zzedVar.invoke(new zzhh(str2, i2), zzeaVar2);
                            if (obj != vx2Var) {
                                obj3 = obj2;
                                zzeq zzeqVar2 = (zzeq) obj;
                                ((xj7) obj3).f(null);
                                return zzeqVar2;
                            }
                            return vx2Var;
                        }
                        i3 = 4;
                    }
                    i2 = i3;
                    zzed zzedVar2 = new zzed(this, str2, null, zzdqVar2, j2, null);
                    zzeaVar2.zza = obj2;
                    zzeaVar2.zzb = null;
                    zzeaVar2.zzh = null;
                    zzeaVar2.zzc = null;
                    zzeaVar2.zzg = 2;
                    obj = zzedVar2.invoke(new zzhh(str2, i2), zzeaVar2);
                    if (obj != vx2Var) {
                    }
                    return vx2Var;
                }
            }
            if (!ur5.a(zzdqVar2, zzdq.zza)) {
            }
            i2 = i3;
            zzed zzedVar22 = new zzed(this, str2, null, zzdqVar2, j2, null);
            zzeaVar2.zza = obj2;
            zzeaVar2.zzb = null;
            zzeaVar2.zzh = null;
            zzeaVar2.zzc = null;
            zzeaVar2.zzg = 2;
            obj = zzedVar22.invoke(new zzhh(str2, i2), zzeaVar2);
            if (obj != vx2Var) {
            }
            return vx2Var;
        } catch (Throwable th2) {
            th = th2;
            obj3 = obj2;
            ((xj7) obj3).f(null);
            throw th;
        }
        zzeaVar = new zzea(this, zw2Var);
        zzea zzeaVar22 = zzeaVar;
        obj = zzeaVar22.zze;
        i = zzeaVar22.zzg;
        vx2Var = vx2.a;
        if (i != 0) {
        }
    }
}
