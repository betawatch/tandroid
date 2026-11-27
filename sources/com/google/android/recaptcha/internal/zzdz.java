package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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

    public static final Object zzb(Application application, String str, long j, zw2 zw2Var) {
        return zzeh.zzd(zza(application), str, j, null, null, zw2Var, 12, null);
    }

    public static final Task zzc(Application application, String str, long j) {
        return zzbv.zza(fud.a(zza(application).zza().zza(), new zzdx(application, str, j, null)));
    }

    public static final Object zzd(Application application, String str, zw2 zw2Var) {
        return zzeh.zzd(zza(application), str, 0L, null, zzdq.zzb, zw2Var, 2, null);
    }

    public static final Task zze(Application application, String str) {
        return zzbv.zza(fud.a(zza(application).zza().zza(), new zzdy(application, str, null)));
    }
}
