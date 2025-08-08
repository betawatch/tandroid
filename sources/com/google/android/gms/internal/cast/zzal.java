package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.GooglePlayServicesUtilLight;

/* loaded from: classes.dex */
public abstract class zzal extends zzb implements zzam {
    public zzal() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzao zzanVar;
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzanVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    zzanVar = queryLocalInterface instanceof zzao ? (zzao) queryLocalInterface : new zzan(readStrongBinder);
                }
                zzc.zzb(parcel);
                zze(bundle, zzanVar);
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle2 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                int readInt = parcel.readInt();
                zzc.zzb(parcel);
                zzd(bundle2, readInt);
                parcel2.writeNoException();
                return true;
            case 3:
                Bundle bundle3 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                zzg(bundle3);
                parcel2.writeNoException();
                return true;
            case 4:
                Bundle bundle4 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                int readInt2 = parcel.readInt();
                zzc.zzb(parcel);
                boolean zzm = zzm(bundle4, readInt2);
                parcel2.writeNoException();
                parcel2.writeInt(zzm ? 1 : 0);
                return true;
            case 5:
                String readString = parcel.readString();
                zzc.zzb(parcel);
                zzi(readString);
                parcel2.writeNoException();
                return true;
            case 6:
                zzh();
                parcel2.writeNoException();
                return true;
            case 7:
                boolean zzl = zzl();
                parcel2.writeNoException();
                int i3 = zzc.$r8$clinit;
                parcel2.writeInt(zzl ? 1 : 0);
                return true;
            case 8:
                String readString2 = parcel.readString();
                zzc.zzb(parcel);
                Bundle zzb = zzb(readString2);
                parcel2.writeNoException();
                zzc.zzd(parcel2, zzb);
                return true;
            case 9:
                String zzc = zzc();
                parcel2.writeNoException();
                parcel2.writeString(zzc);
                return true;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                return true;
            case 11:
                zzf();
                parcel2.writeNoException();
                return true;
            case 12:
                boolean zzk = zzk();
                parcel2.writeNoException();
                int i4 = zzc.$r8$clinit;
                parcel2.writeInt(zzk ? 1 : 0);
                return true;
            case 13:
                int readInt3 = parcel.readInt();
                zzc.zzb(parcel);
                zzj(readInt3);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
