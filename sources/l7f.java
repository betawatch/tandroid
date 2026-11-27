// default package

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import org.telegram.messenger.WearAuthListenerService;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class l7f extends Handler {
    public boolean a;
    public final s4f b;
    public final /* synthetic */ WearAuthListenerService c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7f(WearAuthListenerService wearAuthListenerService, Looper looper) {
        super(looper);
        this.c = wearAuthListenerService;
        this.b = new s4f();
    }

    public final synchronized void a(String str) {
        if (this.a) {
            if (Log.isLoggable("WearableLS", 2)) {
                Log.v("WearableLS", "unbindService: " + str + ", " + String.valueOf(this.c.a));
            }
            try {
                this.c.unbindService(this.b);
            } catch (RuntimeException e) {
                Log.e("WearableLS", "Exception when unbinding from local service", e);
            }
            this.a = false;
        }
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        synchronized (this) {
            if (!this.a) {
                if (Log.isLoggable("WearableLS", 2)) {
                    Log.v("WearableLS", "bindService: ".concat(String.valueOf(this.c.a)));
                }
                WearAuthListenerService wearAuthListenerService = this.c;
                wearAuthListenerService.bindService(wearAuthListenerService.d, this.b, 1);
                this.a = true;
            }
        }
        try {
            super.dispatchMessage(message);
        } finally {
            if (!hasMessages(0)) {
                a("dispatch");
            }
        }
    }
}
