package i8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class p extends Handler {
    public boolean a;
    public final o b;
    public final /* synthetic */ k c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k kVar, Looper looper) {
        super(looper);
        this.c = kVar;
        this.b = new o();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (this.a) {
            if (Log.isLoggable("WearableLS", 2)) {
                componentName = this.c.zza;
                Log.v("WearableLS", "unbindService: " + str + ", " + String.valueOf(componentName));
            }
            try {
                this.c.unbindService(this.b);
            } catch (RuntimeException e9) {
                Log.e("WearableLS", "Exception when unbinding from local service", e9);
            }
            this.a = false;
        }
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.b, 1);
                    this.a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            super.dispatchMessage(message);
            if (hasMessages(0)) {
                return;
            }
            a("dispatch");
        } catch (Throwable th2) {
            if (!hasMessages(0)) {
                a("dispatch");
            }
            throw th2;
        }
    }
}
