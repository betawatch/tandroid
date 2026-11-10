package com.google.firebase.iid;

import a8.b1;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import f5.r;
import j$.util.Objects;
import java.lang.ref.SoftReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import m6.h;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {
    public static SoftReference a;
    public static SoftReference b;

    public static int a(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (!Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            Log.e("CloudMessagingReceiver", "Unknown notification action");
            return 500;
        }
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(extras);
        if (!b1.d(putExtras)) {
            return -1;
        }
        b1.c("_nd", putExtras.getExtras());
        return -1;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ExecutorService executorService;
        if (intent == null) {
            return;
        }
        boolean isOrderedBroadcast = isOrderedBroadcast();
        BroadcastReceiver.PendingResult goAsync = goAsync();
        synchronized (FirebaseInstanceIdReceiver.class) {
            try {
                SoftReference softReference = a;
                ExecutorService executorService2 = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorService2 == null) {
                    executorService2 = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new r("firebase-iid-executor")));
                    a = new SoftReference(executorService2);
                }
                executorService = executorService2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        executorService.execute(new h(this, intent, context, isOrderedBroadcast, goAsync));
    }
}
