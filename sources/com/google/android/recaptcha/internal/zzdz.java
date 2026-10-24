package com.google.android.recaptcha.internal;

import android.app.Application;
import be.f0;
import com.google.android.gms.tasks.Task;
import kd.c;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        return zzbv.zza(f0.c(zza(application).zza().zza(), new zzdx(application, str, j10, null)));
    }

    public static final Object zzd(Application application, String str, c cVar) {
        return zzeh.zzd(zza(application), str, 0L, null, zzdq.zzb, cVar, 2, null);
    }

    public static final Task zze(Application application, String str) {
        return zzbv.zza(f0.c(zza(application).zza().zza(), new zzdy(application, str, null)));
    }
}
