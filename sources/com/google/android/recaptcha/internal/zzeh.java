package com.google.android.recaptcha.internal;

import a8.ab;
import af.b;
import android.app.Application;
import gd.c;
import ie.d;
import kotlin.jvm.internal.j;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class zzeh {
    private final Application zza;
    private final ie.a zzb = new d();
    private zzeq zzc;
    private final c zzd;

    public zzeh(Application application) {
        this.zza = application;
        int i7 = zzby.zza;
        this.zzd = ab.b(zzef.zza);
        zzdp.zza(application);
    }

    public static /* synthetic */ Object zzd(zzeh zzehVar, String str, long j3, zzdw zzdwVar, zzdq zzdqVar, id.c cVar, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            zzdqVar = zzdq.zza;
        }
        zzdq zzdqVar2 = zzdqVar;
        if ((i7 & 2) != 0) {
            j3 = 10000;
        }
        return zzehVar.zzc(str, j3, null, zzdqVar2, cVar);
    }

    public static final /* synthetic */ void zzf(zzeh zzehVar, long j3) {
        if (j3 < 5000) {
            throw new zzcg(zzce.zzj, zzcd.zzI, null, null, 12, null);
        }
        if (f0.d.b(zzehVar.zza, "android.permission.INTERNET") != 0) {
            throw new zzcg(zzce.zzc, zzcd.zzao, null, null, 12, null);
        }
    }

    public final zzcr zza() {
        return (zzcr) this.zzd.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081 A[Catch: all -> 0x00b1, TryCatch #0 {all -> 0x00b1, blocks: (B:26:0x0076, B:30:0x008c, B:35:0x0081), top: B:25:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, long j3, zzdw zzdwVar, zzdq zzdqVar, id.c cVar) {
        zzea zzeaVar;
        Object obj;
        jd.a aVar;
        int i7;
        String str2;
        zzdq zzdqVar2;
        long j10;
        Object obj2;
        Object obj3;
        int i10;
        int i11;
        try {
            if (cVar instanceof zzea) {
                zzeaVar = (zzea) cVar;
                int i12 = zzeaVar.zzg;
                if ((i12 & TLObject.FLAG_31) != 0) {
                    zzeaVar.zzg = i12 - TLObject.FLAG_31;
                    zzea zzeaVar2 = zzeaVar;
                    obj = zzeaVar2.zze;
                    aVar = jd.a.a;
                    i7 = zzeaVar2.zzg;
                    if (i7 != 0) {
                        b.c(obj);
                        ie.a aVar2 = this.zzb;
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
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj3 = (ie.a) zzeaVar2.zza;
                        try {
                            b.c(obj);
                            zzeq zzeqVar = (zzeq) obj;
                            ((d) obj3).f(null);
                            return zzeqVar;
                        } catch (Throwable th2) {
                            th = th2;
                            ((d) obj3).f(null);
                            throw th;
                        }
                    }
                    long j11 = zzeaVar2.zzd;
                    Object obj4 = (ie.a) zzeaVar2.zzc;
                    zzdq zzdqVar3 = zzeaVar2.zzh;
                    String str3 = (String) zzeaVar2.zza;
                    b.c(obj);
                    obj2 = obj4;
                    zzdqVar2 = zzdqVar3;
                    str2 = str3;
                    j10 = j11;
                    if (!j.a(zzdqVar2, zzdq.zza)) {
                        i11 = 3;
                    } else {
                        if (!j.a(zzdqVar2, zzdq.zzb)) {
                            i10 = 2;
                            zzed zzedVar = new zzed(this, str2, null, zzdqVar2, j10, null);
                            zzeaVar2.zza = obj2;
                            zzeaVar2.zzb = null;
                            zzeaVar2.zzh = null;
                            zzeaVar2.zzc = null;
                            zzeaVar2.zzg = 2;
                            obj = zzedVar.invoke(new zzhh(str2, i10), zzeaVar2);
                            if (obj != aVar) {
                                obj3 = obj2;
                                zzeq zzeqVar2 = (zzeq) obj;
                                ((d) obj3).f(null);
                                return zzeqVar2;
                            }
                            return aVar;
                        }
                        i11 = 4;
                    }
                    i10 = i11;
                    zzed zzedVar2 = new zzed(this, str2, null, zzdqVar2, j10, null);
                    zzeaVar2.zza = obj2;
                    zzeaVar2.zzb = null;
                    zzeaVar2.zzh = null;
                    zzeaVar2.zzc = null;
                    zzeaVar2.zzg = 2;
                    obj = zzedVar2.invoke(new zzhh(str2, i10), zzeaVar2);
                    if (obj != aVar) {
                    }
                    return aVar;
                }
            }
            if (!j.a(zzdqVar2, zzdq.zza)) {
            }
            i10 = i11;
            zzed zzedVar22 = new zzed(this, str2, null, zzdqVar2, j10, null);
            zzeaVar2.zza = obj2;
            zzeaVar2.zzb = null;
            zzeaVar2.zzh = null;
            zzeaVar2.zzc = null;
            zzeaVar2.zzg = 2;
            obj = zzedVar22.invoke(new zzhh(str2, i10), zzeaVar2);
            if (obj != aVar) {
            }
            return aVar;
        } catch (Throwable th3) {
            th = th3;
            obj3 = obj2;
            ((d) obj3).f(null);
            throw th;
        }
        zzeaVar = new zzea(this, cVar);
        zzea zzeaVar22 = zzeaVar;
        obj = zzeaVar22.zze;
        aVar = jd.a.a;
        i7 = zzeaVar22.zzg;
        if (i7 != 0) {
        }
    }
}
