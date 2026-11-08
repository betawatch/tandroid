package org.telegram.messenger;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class WearAuthListenerService extends Service implements a9.a {
    public static final /* synthetic */ int r = 0;
    public ComponentName a;
    public a9.g b;
    public a9.d c;
    public Intent d;
    public Looper e;
    public boolean h;
    public final Object f = new Object();
    public final b9.d n = new b9.d(new qb.a(this));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        return r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.CHANNEL_EVENT") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.DATA_CHANGED") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.MESSAGE_RECEIVED") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.REQUEST_RECEIVED") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.CAPABILITY_CHANGED") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.BIND_LISTENER") != false) goto L28;
     */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IBinder onBind(Intent intent) {
        String action;
        if (intent != null && (action = intent.getAction()) != null) {
            switch (action.hashCode()) {
                case -1487371046:
                    break;
                case -1140095138:
                    break;
                case -786751258:
                    break;
                case 915816236:
                    break;
                case 1003809169:
                    break;
                case 1460975593:
                    break;
                default:
                    if (Log.isLoggable("WearableLS", 3)) {
                        Log.d("WearableLS", "onBind: Provided bind intent (" + intent.toString() + ") is not allowed");
                        break;
                    }
                    break;
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.a = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onCreate: ".concat(String.valueOf(this.a)));
        }
        if (this.e == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.e = handlerThread.getLooper();
        }
        this.b = new a9.g(this, this.e);
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.d = intent;
        intent.setComponent(this.a);
        this.c = new a9.d(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onDestroy: ".concat(String.valueOf(this.a)));
        }
        synchronized (this.f) {
            this.h = true;
            a9.g gVar = this.b;
            if (gVar == null) {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=".concat(String.valueOf(this.a)));
            }
            gVar.getLooper().quit();
            gVar.a("quit");
        }
        super.onDestroy();
    }

    @Override // a9.a
    public final void a(b9.f fVar) {
    }

    @Override // a9.a
    public final void b(b9.f fVar) {
    }

    @Override // a9.a
    public final void c(b9.f fVar) {
    }

    @Override // a9.a
    public final void d(b9.f fVar) {
    }
}
