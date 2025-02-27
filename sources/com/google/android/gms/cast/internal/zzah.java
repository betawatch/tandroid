package com.google.android.gms.cast.internal;

import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.internal.cast.zzc;

/* loaded from: classes.dex */
public abstract class zzah extends com.google.android.gms.internal.cast.zzb implements zzai {
    public zzah() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                int readInt = parcel.readInt();
                zzc.zzb(parcel);
                zzk(readInt);
                return true;
            case 2:
                ApplicationMetadata applicationMetadata = (ApplicationMetadata) zzc.zza(parcel, ApplicationMetadata.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean zzf = zzc.zzf(parcel);
                zzc.zzb(parcel);
                zzb(applicationMetadata, readString, readString2, zzf);
                return true;
            case 3:
                int readInt2 = parcel.readInt();
                zzc.zzb(parcel);
                zzc(readInt2);
                return true;
            case 4:
                String readString3 = parcel.readString();
                double readDouble = parcel.readDouble();
                boolean zzf2 = zzc.zzf(parcel);
                zzc.zzb(parcel);
                zzn(readString3, readDouble, zzf2);
                return true;
            case 5:
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                zzc.zzb(parcel);
                zzp(readString4, readString5);
                return true;
            case 6:
                String readString6 = parcel.readString();
                byte[] createByteArray = parcel.createByteArray();
                zzc.zzb(parcel);
                zzh(readString6, createByteArray);
                return true;
            case 7:
                int readInt3 = parcel.readInt();
                zzc.zzb(parcel);
                zze(readInt3);
                return true;
            case 8:
                int readInt4 = parcel.readInt();
                zzc.zzb(parcel);
                zzg(readInt4);
                return true;
            case 9:
                int readInt5 = parcel.readInt();
                zzc.zzb(parcel);
                zzd(readInt5);
                return true;
            case 10:
                String readString7 = parcel.readString();
                long readLong = parcel.readLong();
                int readInt6 = parcel.readInt();
                zzc.zzb(parcel);
                zzm(readString7, readLong, readInt6);
                return true;
            case 11:
                String readString8 = parcel.readString();
                long readLong2 = parcel.readLong();
                zzc.zzb(parcel);
                zzl(readString8, readLong2);
                return true;
            case 12:
                zza zzaVar = (zza) zzc.zza(parcel, zza.CREATOR);
                zzc.zzb(parcel);
                zzf(zzaVar);
                return true;
            case 13:
                zzab zzabVar = (zzab) zzc.zza(parcel, zzab.CREATOR);
                zzc.zzb(parcel);
                zzj(zzabVar);
                return true;
            case 14:
                int readInt7 = parcel.readInt();
                zzc.zzb(parcel);
                zzi(readInt7);
                return true;
            case 15:
                int readInt8 = parcel.readInt();
                zzc.zzb(parcel);
                zzo(readInt8);
                return true;
            default:
                return false;
        }
    }
}
