package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.cast.zza;
import com.google.android.gms.internal.cast.zzc;

/* loaded from: classes.dex */
public final class zzak extends zza implements zzam {
    zzak(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final void zze(boolean z, int i) {
        Parcel zza = zza();
        int i2 = zzc.$r8$clinit;
        zza.writeInt(z ? 1 : 0);
        zza.writeInt(0);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final void zzf(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        Parcel zza = zza();
        zzc.zzc(zza, applicationMetadata);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeInt(z ? 1 : 0);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final void zzg(int i) {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final void zzh(Bundle bundle) {
        Parcel zza = zza();
        zzc.zzc(zza, null);
        zzc(1, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final void zzi(ConnectionResult connectionResult) {
        Parcel zza = zza();
        zzc.zzc(zza, connectionResult);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzam
    public final void zzj(int i) {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc(2, zza);
    }
}
