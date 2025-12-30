package com.google.android.recaptcha.internal;

import android.app.Application;
import androidx.core.content.ContextCompat;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class zzeh {
    private final Application zza;
    private final Mutex zzb = MutexKt.Mutex$default(false, 1, null);
    private zzeq zzc;
    private final Lazy zzd;

    public zzeh(Application application) {
        this.zza = application;
        int i = zzby.zza;
        this.zzd = LazyKt.lazy(zzef.zza);
        zzdp.zza(application);
    }

    public static /* synthetic */ Object zzd(zzeh zzehVar, String str, long j, zzdw zzdwVar, zzdq zzdqVar, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            zzdqVar = zzdq.zza;
        }
        zzdq zzdqVar2 = zzdqVar;
        if ((i & 2) != 0) {
            j = 10000;
        }
        return zzehVar.zzc(str, j, null, zzdqVar2, continuation);
    }

    public static final /* synthetic */ void zzf(zzeh zzehVar, long j) {
        if (j < 5000) {
            throw new zzcg(zzce.zzj, zzcd.zzI, null, null, 12, null);
        }
        if (ContextCompat.checkSelfPermission(zzehVar.zza, "android.permission.INTERNET") != 0) {
            throw new zzcg(zzce.zzc, zzcd.zzao, null, null, 12, null);
        }
    }

    public final zzcr zza() {
        return (zzcr) this.zzd.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[Catch: all -> 0x00bd, TryCatch #1 {all -> 0x00bd, blocks: (B:26:0x0078, B:29:0x008f, B:34:0x0083), top: B:25:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, long j, zzdw zzdwVar, zzdq zzdqVar, Continuation continuation) {
        zzea zzeaVar;
        Object obj;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        String str2;
        long j2;
        zzdq zzdqVar2;
        Mutex mutex2;
        try {
            if (continuation instanceof zzea) {
                zzeaVar = (zzea) continuation;
                int i2 = zzeaVar.zzg;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    zzeaVar.zzg = i2 - TLObject.FLAG_31;
                    zzea zzeaVar2 = zzeaVar;
                    obj = zzeaVar2.zze;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzeaVar2.zzg;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex3 = this.zzb;
                        zzeaVar2.zza = str;
                        zzeaVar2.zzb = null;
                        zzeaVar2.zzh = zzdqVar;
                        zzeaVar2.zzc = mutex3;
                        zzeaVar2.zzd = j;
                        zzeaVar2.zzg = 1;
                        if (mutex3.lock(null, zzeaVar2) != coroutine_suspended) {
                            mutex = mutex3;
                            str2 = str;
                            j2 = j;
                            zzdqVar2 = zzdqVar;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) zzeaVar2.zza;
                        try {
                            ResultKt.throwOnFailure(obj);
                            zzeq zzeqVar = (zzeq) obj;
                            mutex2.unlock(null);
                            return zzeqVar;
                        } catch (Throwable th) {
                            th = th;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    long j3 = zzeaVar2.zzd;
                    Mutex mutex4 = (Mutex) zzeaVar2.zzc;
                    zzdqVar2 = zzeaVar2.zzh;
                    String str3 = (String) zzeaVar2.zza;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex4;
                    str2 = str3;
                    j2 = j3;
                    int i3 = !Intrinsics.areEqual(zzdqVar2, zzdq.zza) ? 3 : Intrinsics.areEqual(zzdqVar2, zzdq.zzb) ? 4 : 2;
                    zzed zzedVar = new zzed(this, str2, null, zzdqVar2, j2, null);
                    zzeaVar2.zza = mutex;
                    zzeaVar2.zzb = null;
                    zzeaVar2.zzh = null;
                    zzeaVar2.zzc = null;
                    zzeaVar2.zzg = 2;
                    obj = zzedVar.invoke(new zzhh(str2, i3), zzeaVar2);
                    if (obj != coroutine_suspended) {
                        mutex2 = mutex;
                        zzeq zzeqVar2 = (zzeq) obj;
                        mutex2.unlock(null);
                        return zzeqVar2;
                    }
                    return coroutine_suspended;
                }
            }
            if (!Intrinsics.areEqual(zzdqVar2, zzdq.zza)) {
            }
            zzed zzedVar2 = new zzed(this, str2, null, zzdqVar2, j2, null);
            zzeaVar2.zza = mutex;
            zzeaVar2.zzb = null;
            zzeaVar2.zzh = null;
            zzeaVar2.zzc = null;
            zzeaVar2.zzg = 2;
            obj = zzedVar2.invoke(new zzhh(str2, i3), zzeaVar2);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
        zzeaVar = new zzea(this, continuation);
        zzea zzeaVar22 = zzeaVar;
        obj = zzeaVar22.zze;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzeaVar22.zzg;
        if (i != 0) {
        }
    }
}
