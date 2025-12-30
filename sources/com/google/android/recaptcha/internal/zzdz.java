package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;

/* loaded from: classes.dex */
public final class zzdz {
    private static zzeh zza;

    public static final zzeh zza(Application application) {
        zzeh zzehVar = zza;
        if (zzehVar == null) {
            zzehVar = new zzeh(application);
        }
        if (zza == null) {
            zza = zzehVar;
        }
        return zzehVar;
    }

    public static final Object zzb(Application application, String str, long j, Continuation continuation) {
        return zzeh.zzd(zza(application), str, j, null, null, continuation, 12, null);
    }

    public static final Task zzc(Application application, String str, long j) {
        Deferred async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(zza(application).zza().zza(), null, null, new zzdx(application, str, j, null), 3, null);
        return zzbv.zza(async$default);
    }

    public static final Object zzd(Application application, String str, Continuation continuation) {
        return zzeh.zzd(zza(application), str, 0L, null, zzdq.zzb, continuation, 2, null);
    }

    public static final Task zze(Application application, String str) {
        Deferred async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(zza(application).zza().zza(), null, null, new zzdy(application, str, null), 3, null);
        return zzbv.zza(async$default);
    }
}
