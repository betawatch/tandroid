package com.google.android.gms.cast.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.zzbu;
import com.google.android.gms.internal.cast.zzc;

/* loaded from: classes.dex */
public final class zzag extends com.google.android.gms.internal.cast.zza implements IInterface {
    zzag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceController");
    }

    public final void zze() {
        zzd(17, zza());
    }

    public final void zzf() {
        zzd(1, zza());
    }

    public final void zzg(String str, String str2, zzbu zzbuVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzc.zzc(zza, zzbuVar);
        zzd(14, zza);
    }

    public final void zzh(String str, LaunchOptions launchOptions) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzc(zza, launchOptions);
        zzd(13, zza);
    }

    public final void zzj(zzai zzaiVar) {
        Parcel zza = zza();
        zzc.zze(zza, zzaiVar);
        zzd(18, zza);
    }

    public final void zzk(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzd(11, zza);
    }

    public final void zzm(String str, String str2, long j) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeLong(j);
        zzd(9, zza);
    }

    public final void zzp(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzd(5, zza);
    }

    public final void zzq() {
        zzd(19, zza());
    }

    public final void zzr(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzd(12, zza);
    }
}
