package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import ld.e0;
import uc.c;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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

    public static final Object zzb(Application application, String str, long j10, c cVar) {
        return zzeh.zzd(zza(application), str, j10, null, null, cVar, 12, null);
    }

    public static final Task zzc(Application application, String str, long j10) {
        return zzbv.zza(e0.c(zza(application).zza().zza(), new zzdx(application, str, j10, null)));
    }

    public static final Object zzd(Application application, String str, c cVar) {
        return zzeh.zzd(zza(application), str, 0L, null, zzdq.zzb, cVar, 2, null);
    }

    public static final Task zze(Application application, String str) {
        return zzbv.zza(e0.c(zza(application).zza().zza(), new zzdy(application, str, null)));
    }
}
