package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzff {
    private final Map zza = new HashMap();

    zzff() {
    }

    public final void zzb(IBinder iBinder) {
        zzfb zzfbVar;
        synchronized (this.zza) {
            if (iBinder == null) {
                zzfbVar = null;
            } else {
                try {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzfbVar = queryLocalInterface instanceof zzfb ? (zzfb) queryLocalInterface : new zzfb(iBinder);
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzib zzibVar = new zzib();
            for (Map.Entry entry : this.zza.entrySet()) {
                WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(entry.getValue());
                try {
                    zzfbVar.zzd(zzibVar, new zzd(null));
                    if (Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "onPostInitHandler: added: " + String.valueOf(entry.getKey()) + "/null");
                    }
                } catch (RemoteException unused) {
                    Log.w("WearableClient", "onPostInitHandler: Didn't add: " + String.valueOf(entry.getKey()) + "/null");
                }
            }
        }
    }
}
