package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zze implements Parcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzc();
    Messenger zza;

    public zze(IBinder iBinder) {
        this.zza = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return zza().equals(((zze) obj).zza());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return zza().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.zza;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }

    public final IBinder zza() {
        Messenger messenger = this.zza;
        messenger.getClass();
        return messenger.getBinder();
    }

    public final void zzb(Message message) {
        Messenger messenger = this.zza;
        messenger.getClass();
        messenger.send(message);
    }
}
