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
import kotlin.jvm.internal.j;
import la.m0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class SessionLifecycleService extends Service {
    public final HandlerThread a = new HandlerThread("FirebaseSessions_HandlerThread");
    public m0 b;
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
            m0 m0Var = this.b;
            if (m0Var != null) {
                m0Var.sendMessage(obtain);
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
        j.d(looper, "handlerThread.looper");
        this.b = new m0(looper);
        this.c = new Messenger(this.b);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.a.quit();
    }
}
