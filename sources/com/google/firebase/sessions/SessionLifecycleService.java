package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import kotlin.jvm.internal.i;
import za.l0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class SessionLifecycleService extends Service {
    public final HandlerThread a = new HandlerThread("FirebaseSessions_HandlerThread");
    public l0 b;
    public Messenger c;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger messenger = Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
        if (messenger != null) {
            Message obtain = Message.obtain(null, 4, 0, 0);
            obtain.replyTo = messenger;
            l0 l0Var = this.b;
            if (l0Var != null) {
                l0Var.sendMessage(obtain);
            }
        }
        Messenger messenger2 = this.c;
        if (messenger2 != null) {
            return messenger2.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.a;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        i.d(looper, "handlerThread.looper");
        this.b = new l0(looper);
        this.c = new Messenger(this.b);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.a.quit();
    }
}
