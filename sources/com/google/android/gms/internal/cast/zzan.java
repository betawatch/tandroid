package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzan extends zza implements zzao {
    zzan(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
    }

    @Override // com.google.android.gms.internal.cast.zzao
    public final int zze() {
        Parcel zzb = zzb(7, zza());
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.cast.zzao
    public final void zzf(String str, Bundle bundle) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzc(zza, bundle);
        zzc(1, zza);
    }

    @Override // com.google.android.gms.internal.cast.zzao
    public final void zzg(String str, Bundle bundle) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzc(zza, bundle);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.internal.cast.zzao
    public final void zzh(String str, Bundle bundle) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzc(zza, bundle);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.cast.zzao
    public final void zzi(String str, Bundle bundle) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzc(zza, bundle);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.internal.cast.zzao
    public final void zzj(String str, String str2, Bundle bundle) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzc.zzc(zza, bundle);
        zzc(8, zza);
    }

    @Override // com.google.android.gms.internal.cast.zzao
    public final void zzk(String str, Bundle bundle, int i) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzc(zza, bundle);
        zza.writeInt(i);
        zzc(6, zza);
    }
}
