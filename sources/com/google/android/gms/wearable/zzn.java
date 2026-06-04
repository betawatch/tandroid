package com.google.android.gms.wearable;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.wearable.zzi;

/* loaded from: classes.dex */
final class zzn extends zzi {
    final /* synthetic */ WearableListenerService zza;
    private boolean zzb;
    private final zzm zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzn(WearableListenerService wearableListenerService, Looper looper) {
        super(looper);
        this.zza = wearableListenerService;
        this.zzc = new zzm(wearableListenerService, null);
    }

    private final synchronized void zzc() {
        Intent intent;
        ComponentName componentName;
        try {
            if (this.zzb) {
                return;
            }
            if (Log.isLoggable("WearableLS", 2)) {
                componentName = this.zza.zza;
                Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
            }
            WearableListenerService wearableListenerService = this.zza;
            intent = wearableListenerService.zzd;
            wearableListenerService.bindService(intent, this.zzc, 1);
            this.zzb = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzd(String str) {
        ComponentName componentName;
        if (this.zzb) {
            if (Log.isLoggable("WearableLS", 2)) {
                componentName = this.zza.zza;
                Log.v("WearableLS", "unbindService: " + str + ", " + String.valueOf(componentName));
            }
            try {
                this.zza.unbindService(this.zzc);
            } catch (RuntimeException e) {
                Log.e("WearableLS", "Exception when unbinding from local service", e);
            }
            this.zzb = false;
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzi
    protected final void zza(Message message) {
        zzc();
        try {
            super.zza(message);
            if (hasMessages(0)) {
                return;
            }
            zzd("dispatch");
        } catch (Throwable th) {
            if (!hasMessages(0)) {
                zzd("dispatch");
            }
            throw th;
        }
    }

    final void zzb() {
        getLooper().quit();
        zzd("quit");
    }
}
