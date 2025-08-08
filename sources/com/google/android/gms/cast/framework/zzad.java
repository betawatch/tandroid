package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.cast.zzb;
import com.google.android.gms.internal.cast.zzc;

/* loaded from: classes.dex */
public abstract class zzad extends zzb implements zzae {
    public zzad() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            IObjectWrapper zzb = zzb();
            parcel2.writeNoException();
            zzc.zze(parcel2, zzb);
        } else if (i == 2) {
            zzd();
            parcel2.writeNoException();
        } else if (i == 3) {
            zzc();
            parcel2.writeNoException();
        } else {
            if (i != 4) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        }
        return true;
    }
}
