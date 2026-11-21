package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import id.c;
import zd.b0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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

    public static final Object zzb(Application application, String str, long j3, c cVar) {
        return zzeh.zzd(zza(application), str, j3, null, null, cVar, 12, null);
    }

    public static final Task zzc(Application application, String str, long j3) {
        return zzbv.zza(b0.c(zza(application).zza().zza(), new zzdx(application, str, j3, null)));
    }

    public static final Object zzd(Application application, String str, c cVar) {
        return zzeh.zzd(zza(application), str, 0L, null, zzdq.zzb, cVar, 2, null);
    }

    public static final Task zze(Application application, String str) {
        return zzbv.zza(b0.c(zza(application).zza().zza(), new zzdy(application, str, null)));
    }
}
