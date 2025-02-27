package com.google.android.gms.cast.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.cast.zzc;

/* loaded from: classes.dex */
public final class zzaj extends com.google.android.gms.internal.cast.zza implements IInterface {
    zzaj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastService");
    }

    public final void zzf(zzaf zzafVar, String[] strArr) {
        Parcel zza = zza();
        zzc.zze(zza, zzafVar);
        zza.writeStringArray(strArr);
        zzd(5, zza);
    }

    public final void zzg(zzaf zzafVar, String[] strArr) {
        Parcel zza = zza();
        zzc.zze(zza, zzafVar);
        zza.writeStringArray(strArr);
        zzd(7, zza);
    }

    public final void zzh(zzaf zzafVar, String[] strArr) {
        Parcel zza = zza();
        zzc.zze(zza, zzafVar);
        zza.writeStringArray(strArr);
        zzd(6, zza);
    }
}
