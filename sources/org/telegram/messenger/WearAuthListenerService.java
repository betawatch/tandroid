package org.telegram.messenger;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class WearAuthListenerService extends Service implements og1 {
    public static final /* synthetic */ int r = 0;
    public ComponentName a;
    public l7f b;
    public x9d c;
    public Intent d;
    public Looper e;
    public boolean h;
    public final Object f = new Object();
    public final sgd n = new sgd(new kdd());

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        return r3.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.CHANNEL_EVENT") != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.DATA_CHANGED") != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.MESSAGE_RECEIVED") != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.REQUEST_RECEIVED") != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.CAPABILITY_CHANGED") != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.BIND_LISTENER") != false) goto L26;
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
        Looper looper = this.e;
        if (looper == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            looper = handlerThread.getLooper();
            this.e = looper;
        }
        this.b = new l7f(this, looper);
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.d = intent;
        intent.setComponent(this.a);
        this.c = new x9d(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onDestroy: ".concat(String.valueOf(this.a)));
        }
        synchronized (this.f) {
            this.h = true;
            l7f l7fVar = this.b;
            if (l7fVar == null) {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=".concat(String.valueOf(this.a)));
            }
            l7fVar.getLooper().quit();
            l7fVar.a("quit");
        }
        super.onDestroy();
    }

    @Override // og1
    public final void a(fjd fjdVar) {
    }

    @Override // og1
    public final void b(fjd fjdVar) {
    }

    @Override // og1
    public final void c(fjd fjdVar) {
    }

    @Override // og1
    public final void d(fjd fjdVar) {
    }
}
