package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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

    public static final Object zzb(Application application, String str, long j, px2 px2Var) {
        return zzeh.zzd(zza(application), str, j, null, null, px2Var, 12, null);
    }

    public static final Task zzc(Application application, String str, long j) {
        return zzbv.zza(srd.a(zza(application).zza().zza(), new zzdx(application, str, j, null)));
    }

    public static final Object zzd(Application application, String str, px2 px2Var) {
        return zzeh.zzd(zza(application), str, 0L, null, zzdq.zzb, px2Var, 2, null);
    }

    public static final Task zze(Application application, String str) {
        return zzbv.zza(srd.a(zza(application).zza().zza(), new zzdy(application, str, null)));
    }
}
