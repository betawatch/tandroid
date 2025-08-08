package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.internal.cast.zzb;
import com.google.android.gms.internal.cast.zzc;

/* loaded from: classes.dex */
public abstract class zzaf extends zzb implements zzag {
    public zzaf() {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzc.zzb(parcel);
            zzc(readString, readString2);
            parcel2.writeNoException();
        } else if (i == 2) {
            String readString3 = parcel.readString();
            LaunchOptions launchOptions = (LaunchOptions) zzc.zza(parcel, LaunchOptions.CREATOR);
            zzc.zzb(parcel);
            zzd(readString3, launchOptions);
            parcel2.writeNoException();
        } else if (i == 3) {
            String readString4 = parcel.readString();
            zzc.zzb(parcel);
            zze(readString4);
            parcel2.writeNoException();
        } else if (i == 4) {
            int readInt = parcel.readInt();
            zzc.zzb(parcel);
            zzb(readInt);
            parcel2.writeNoException();
        } else {
            if (i != 5) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        }
        return true;
    }
}
