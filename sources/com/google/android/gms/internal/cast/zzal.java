package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzal extends zzb implements zzam {
    public zzal() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.os.Parcel] */
    @Override // com.google.android.gms.internal.cast.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzao zzanVar;
        ?? r3;
        boolean z;
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
                r3 = zzm;
                parcel2.writeInt(r3);
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
                z = zzl();
                parcel2.writeNoException();
                int i3 = zzc.$r8$clinit;
                r3 = z;
                parcel2.writeInt(r3);
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
                r3 = 12451000;
                parcel2.writeInt(r3);
                return true;
            case 11:
                zzf();
                parcel2.writeNoException();
                return true;
            case 12:
                z = zzk();
                parcel2.writeNoException();
                int i32 = zzc.$r8$clinit;
                r3 = z;
                parcel2.writeInt(r3);
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
