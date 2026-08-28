package com.google.android.recaptcha.internal;

import android.app.Application;
import g7.x5;
import g7.y5;
import kotlin.jvm.internal.i;
import oc.c;
import oc.g;
import org.telegram.tgnet.TLObject;
import qd.a;
import qd.d;
import qd.e;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzeh {
    private final Application zza;
    private final a zzb = e.a();
    private zzeq zzc;
    private final c zzd;

    public zzeh(Application application) {
        this.zza = application;
        int i9 = zzby.zza;
        this.zzd = x5.a(zzef.zza);
        zzdp.zza(application);
    }

    public static /* synthetic */ Object zzd(zzeh zzehVar, String str, long j10, zzdw zzdwVar, zzdq zzdqVar, qc.c cVar, int i9, Object obj) {
        if ((i9 & 8) != 0) {
            zzdqVar = zzdq.zza;
        }
        zzdq zzdqVar2 = zzdqVar;
        if ((i9 & 2) != 0) {
            j10 = 10000;
        }
        return zzehVar.zzc(str, j10, null, zzdqVar2, cVar);
    }

    public static final /* synthetic */ void zzf(zzeh zzehVar, long j10) {
        if (j10 < 5000) {
            throw new zzcg(zzce.zzj, zzcd.zzI, null, null, 12, null);
        }
        if (f0.e.b(zzehVar.zza, "android.permission.INTERNET") != 0) {
            throw new zzcg(zzce.zzc, zzcd.zzao, null, null, 12, null);
        }
    }

    public final zzcr zza() {
        return (zzcr) ((g) this.zzd).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081 A[Catch: all -> 0x00b2, TryCatch #0 {all -> 0x00b2, blocks: (B:26:0x0076, B:29:0x008d, B:34:0x0081), top: B:25:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, long j10, zzdw zzdwVar, zzdq zzdqVar, qc.c cVar) {
        zzea zzeaVar;
        Object obj;
        rc.a aVar;
        int i9;
        String str2;
        zzdq zzdqVar2;
        long j11;
        Object obj2;
        Object obj3;
        try {
            if (cVar instanceof zzea) {
                zzeaVar = (zzea) cVar;
                int i10 = zzeaVar.zzg;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    zzeaVar.zzg = i10 - TLObject.FLAG_31;
                    zzea zzeaVar2 = zzeaVar;
                    obj = zzeaVar2.zze;
                    aVar = rc.a.a;
                    i9 = zzeaVar2.zzg;
                    if (i9 != 0) {
                        y5.b(obj);
                        a aVar2 = this.zzb;
                        str2 = str;
                        zzeaVar2.zza = str2;
                        zzeaVar2.zzb = null;
                        zzdqVar2 = zzdqVar;
                        zzeaVar2.zzh = zzdqVar2;
                        zzeaVar2.zzc = aVar2;
                        j11 = j10;
                        zzeaVar2.zzd = j11;
                        zzeaVar2.zzg = 1;
                        d dVar = (d) aVar2;
                        if (dVar.d(zzeaVar2) != aVar) {
                            obj2 = dVar;
                        }
                        return aVar;
                    }
                    if (i9 != 1) {
                        if (i9 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj3 = (a) zzeaVar2.zza;
                        try {
                            y5.b(obj);
                            zzeq zzeqVar = (zzeq) obj;
                            ((d) obj3).e(null);
                            return zzeqVar;
                        } catch (Throwable th) {
                            th = th;
                            ((d) obj3).e(null);
                            throw th;
                        }
                    }
                    long j12 = zzeaVar2.zzd;
                    Object obj4 = (a) zzeaVar2.zzc;
                    zzdq zzdqVar3 = zzeaVar2.zzh;
                    String str3 = (String) zzeaVar2.zza;
                    y5.b(obj);
                    obj2 = obj4;
                    zzdqVar2 = zzdqVar3;
                    str2 = str3;
                    j11 = j12;
                    int i11 = !i.a(zzdqVar2, zzdq.zza) ? 3 : i.a(zzdqVar2, zzdq.zzb) ? 4 : 2;
                    zzed zzedVar = new zzed(this, str2, null, zzdqVar2, j11, null);
                    zzeaVar2.zza = obj2;
                    zzeaVar2.zzb = null;
                    zzeaVar2.zzh = null;
                    zzeaVar2.zzc = null;
                    zzeaVar2.zzg = 2;
                    obj = zzedVar.invoke(new zzhh(str2, i11), zzeaVar2);
                    if (obj != aVar) {
                        obj3 = obj2;
                        zzeq zzeqVar2 = (zzeq) obj;
                        ((d) obj3).e(null);
                        return zzeqVar2;
                    }
                    return aVar;
                }
            }
            if (!i.a(zzdqVar2, zzdq.zza)) {
            }
            zzed zzedVar2 = new zzed(this, str2, null, zzdqVar2, j11, null);
            zzeaVar2.zza = obj2;
            zzeaVar2.zzb = null;
            zzeaVar2.zzh = null;
            zzeaVar2.zzc = null;
            zzeaVar2.zzg = 2;
            obj = zzedVar2.invoke(new zzhh(str2, i11), zzeaVar2);
            if (obj != aVar) {
            }
            return aVar;
        } catch (Throwable th2) {
            th = th2;
            obj3 = obj2;
            ((d) obj3).e(null);
            throw th;
        }
        zzeaVar = new zzea(this, cVar);
        zzea zzeaVar22 = zzeaVar;
        obj = zzeaVar22.zze;
        aVar = rc.a.a;
        i9 = zzeaVar22.zzg;
        if (i9 != 0) {
        }
    }
}
