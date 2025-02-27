package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.cast.zza;
import com.google.android.gms.internal.cast.zzc;

/* loaded from: classes.dex */
public final class zzah extends zza implements zzaj {
    zzah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext");
    }

    @Override // com.google.android.gms.cast.framework.zzaj
    public final Bundle zze() {
        Parcel zzb = zzb(1, zza());
        Bundle bundle = (Bundle) zzc.zza(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.cast.framework.zzaj
    public final zzaq zzf() {
        zzaq zzapVar;
        Parcel zzb = zzb(6, zza());
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzapVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
            zzapVar = queryLocalInterface instanceof zzaq ? (zzaq) queryLocalInterface : new zzap(readStrongBinder);
        }
        zzb.recycle();
        return zzapVar;
    }

    @Override // com.google.android.gms.cast.framework.zzaj
    public final zzay zzg() {
        zzay zzaxVar;
        Parcel zzb = zzb(5, zza());
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzaxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            zzaxVar = queryLocalInterface instanceof zzay ? (zzay) queryLocalInterface : new zzax(readStrongBinder);
        }
        zzb.recycle();
        return zzaxVar;
    }

    @Override // com.google.android.gms.cast.framework.zzaj
    public final void zzh(zzae zzaeVar) {
        Parcel zza = zza();
        zzc.zze(zza, zzaeVar);
        zzc(3, zza);
    }
}
