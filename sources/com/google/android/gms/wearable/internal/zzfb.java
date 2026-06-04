package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.wearable.zzc;

/* loaded from: classes.dex */
public final class zzfb extends com.google.android.gms.internal.wearable.zza implements IInterface {
    zzfb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableService");
    }

    public final void zzd(zzex zzexVar, zzd zzdVar) {
        Parcel zza = zza();
        zzc.zze(zza, zzexVar);
        zzc.zzd(zza, zzdVar);
        zzJ(16, zza);
    }

    public final void zzz(zzex zzexVar, String str, String str2, byte[] bArr) {
        Parcel zza = zza();
        zzc.zze(zza, zzexVar);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeByteArray(bArr);
        zzJ(12, zza);
    }
}
