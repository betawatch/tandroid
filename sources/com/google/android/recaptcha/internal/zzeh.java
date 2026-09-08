package com.google.android.recaptcha.internal;

import android.app.Application;
import gd.c;
import gd.g;
import ie.a;
import ie.d;
import ie.e;
import kotlin.jvm.internal.i;
import org.telegram.tgnet.TLObject;
import v7.s7;
import v7.t7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class zzeh {
    private final Application zza;
    private final a zzb = e.a();
    private zzeq zzc;
    private final c zzd;

    public zzeh(Application application) {
        this.zza = application;
        int i10 = zzby.zza;
        this.zzd = s7.a(zzef.zza);
        zzdp.zza(application);
    }

    public static /* synthetic */ Object zzd(zzeh zzehVar, String str, long j3, zzdw zzdwVar, zzdq zzdqVar, id.c cVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            zzdqVar = zzdq.zza;
        }
        zzdq zzdqVar2 = zzdqVar;
        if ((i10 & 2) != 0) {
            j3 = 10000;
        }
        return zzehVar.zzc(str, j3, null, zzdqVar2, cVar);
    }

    public static final /* synthetic */ void zzf(zzeh zzehVar, long j3) {
        if (j3 < 5000) {
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
    public final Object zzc(String str, long j3, zzdw zzdwVar, zzdq zzdqVar, id.c cVar) {
        zzea zzeaVar;
        Object obj;
        jd.a aVar;
        int i10;
        String str2;
        zzdq zzdqVar2;
        long j10;
        Object obj2;
        Object obj3;
        try {
            if (cVar instanceof zzea) {
                zzeaVar = (zzea) cVar;
                int i11 = zzeaVar.zzg;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    zzeaVar.zzg = i11 - TLObject.FLAG_31;
                    zzea zzeaVar2 = zzeaVar;
                    obj = zzeaVar2.zze;
                    aVar = jd.a.a;
                    i10 = zzeaVar2.zzg;
                    if (i10 != 0) {
                        t7.b(obj);
                        a aVar2 = this.zzb;
                        str2 = str;
                        zzeaVar2.zza = str2;
                        zzeaVar2.zzb = null;
                        zzdqVar2 = zzdqVar;
                        zzeaVar2.zzh = zzdqVar2;
                        zzeaVar2.zzc = aVar2;
                        j10 = j3;
                        zzeaVar2.zzd = j10;
                        zzeaVar2.zzg = 1;
                        d dVar = (d) aVar2;
                        if (dVar.d(zzeaVar2) != aVar) {
                            obj2 = dVar;
                        }
                        return aVar;
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj3 = (a) zzeaVar2.zza;
                        try {
                            t7.b(obj);
                            zzeq zzeqVar = (zzeq) obj;
                            ((d) obj3).e(null);
                            return zzeqVar;
                        } catch (Throwable th2) {
                            th = th2;
                            ((d) obj3).e(null);
                            throw th;
                        }
                    }
                    long j11 = zzeaVar2.zzd;
                    Object obj4 = (a) zzeaVar2.zzc;
                    zzdq zzdqVar3 = zzeaVar2.zzh;
                    String str3 = (String) zzeaVar2.zza;
                    t7.b(obj);
                    obj2 = obj4;
                    zzdqVar2 = zzdqVar3;
                    str2 = str3;
                    j10 = j11;
                    int i12 = !i.a(zzdqVar2, zzdq.zza) ? 3 : i.a(zzdqVar2, zzdq.zzb) ? 4 : 2;
                    zzed zzedVar = new zzed(this, str2, null, zzdqVar2, j10, null);
                    zzeaVar2.zza = obj2;
                    zzeaVar2.zzb = null;
                    zzeaVar2.zzh = null;
                    zzeaVar2.zzc = null;
                    zzeaVar2.zzg = 2;
                    obj = zzedVar.invoke(new zzhh(str2, i12), zzeaVar2);
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
            zzed zzedVar2 = new zzed(this, str2, null, zzdqVar2, j10, null);
            zzeaVar2.zza = obj2;
            zzeaVar2.zzb = null;
            zzeaVar2.zzh = null;
            zzeaVar2.zzc = null;
            zzeaVar2.zzg = 2;
            obj = zzedVar2.invoke(new zzhh(str2, i12), zzeaVar2);
            if (obj != aVar) {
            }
            return aVar;
        } catch (Throwable th3) {
            th = th3;
            obj3 = obj2;
            ((d) obj3).e(null);
            throw th;
        }
        zzeaVar = new zzea(this, cVar);
        zzea zzeaVar22 = zzeaVar;
        obj = zzeaVar22.zze;
        aVar = jd.a.a;
        i10 = zzeaVar22.zzg;
        if (i10 != 0) {
        }
    }
}
