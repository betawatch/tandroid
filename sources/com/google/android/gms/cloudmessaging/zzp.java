package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
final class zzp {
    private final Messenger zza;
    private final zze zzb;

    zzp(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (zzo.zza(interfaceDescriptor, "android.os.IMessenger")) {
            this.zza = new Messenger(iBinder);
            this.zzb = null;
        } else {
            if (!zzo.zza(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.zzb = new zze(iBinder);
            this.zza = null;
        }
    }

    final void zza(Message message) {
        Messenger messenger = this.zza;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zze zzeVar = this.zzb;
        if (zzeVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        zzeVar.zzb(message);
    }
}
