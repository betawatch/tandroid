package com.google.android.gms.internal.recaptchabase;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.recaptchabase.ExecuteRequest;
import com.google.android.gms.recaptchabase.InitRequest;

/* loaded from: classes.dex */
public final class zzf extends zza implements IInterface {
    zzf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
    }

    public final void zzc(zze zzeVar, ExecuteRequest executeRequest) {
        Parcel zza = zza();
        zzc.zzd(zza, zzeVar);
        zzc.zzc(zza, executeRequest);
        zzb(2, zza);
    }

    public final void zzd(zze zzeVar, InitRequest initRequest) {
        Parcel zza = zza();
        zzc.zzd(zza, zzeVar);
        zzc.zzc(zza, initRequest);
        zzb(1, zza);
    }
}
