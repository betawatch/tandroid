package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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

    public static final Object zzb(Application application, String str, long j, fw2 fw2Var) {
        return zzeh.zzd(zza(application), str, j, null, null, fw2Var, 12, null);
    }

    public static final Task zzc(Application application, String str, long j) {
        return zzbv.zza(ppd.a(zza(application).zza().zza(), new zzdx(application, str, j, null)));
    }

    public static final Object zzd(Application application, String str, fw2 fw2Var) {
        return zzeh.zzd(zza(application), str, 0L, null, zzdq.zzb, fw2Var, 2, null);
    }

    public static final Task zze(Application application, String str) {
        return zzbv.zza(ppd.a(zza(application).zza().zza(), new zzdy(application, str, null)));
    }
}
