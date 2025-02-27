package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.cast.zza;
import com.google.android.gms.internal.cast.zzc;

/* loaded from: classes.dex */
public final class zzax extends zza implements zzay {
    zzax(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    @Override // com.google.android.gms.cast.framework.zzay
    public final IObjectWrapper zzf() {
        Parcel zzb = zzb(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzb.readStrongBinder());
        zzb.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.cast.framework.zzay
    public final IObjectWrapper zzg() {
        Parcel zzb = zzb(7, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzb.readStrongBinder());
        zzb.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.cast.framework.zzay
    public final void zzh(zzao zzaoVar) {
        Parcel zza = zza();
        zzc.zze(zza, zzaoVar);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzay
    public final void zzi(zzba zzbaVar) {
        Parcel zza = zza();
        zzc.zze(zza, zzbaVar);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzay
    public final void zzj(boolean z, boolean z2) {
        Parcel zza = zza();
        int i = zzc.$r8$clinit;
        zza.writeInt(1);
        zza.writeInt(z2 ? 1 : 0);
        zzc(6, zza);
    }
}
