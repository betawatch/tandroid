package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.cast.zzb;
import com.google.android.gms.internal.cast.zzc;

/* loaded from: classes.dex */
public abstract class zzbb extends zzb implements zzbc {
    public zzbb() {
        super("com.google.android.gms.cast.framework.ISessionProvider");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // com.google.android.gms.internal.cast.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        ?? r1;
        if (i != 1) {
            if (i == 2) {
                boolean zzd = zzd();
                parcel2.writeNoException();
                int i3 = zzc.$r8$clinit;
                r1 = zzd;
            } else if (i == 3) {
                String zzc = zzc();
                parcel2.writeNoException();
                parcel2.writeString(zzc);
            } else {
                if (i != 4) {
                    return false;
                }
                parcel2.writeNoException();
                r1 = 12451000;
            }
            parcel2.writeInt(r1);
        } else {
            String readString = parcel.readString();
            zzc.zzb(parcel);
            IObjectWrapper zzb = zzb(readString);
            parcel2.writeNoException();
            zzc.zze(parcel2, zzb);
        }
        return true;
    }
}
