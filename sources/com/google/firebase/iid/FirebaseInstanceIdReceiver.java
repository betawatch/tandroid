package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import i9.u;
import j7.x6;
import java.lang.ref.SoftReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.telegram.ui.ActionBar.v;
import x5.j;
import x5.k;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {
    public static SoftReference a;

    public static int a(Context context, Intent intent) {
        int i10;
        Task e6;
        int i11 = 500;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        if (TextUtils.isEmpty(stringExtra)) {
            e6 = Tasks.forResult(null);
        } else {
            Bundle bundle = new Bundle();
            String stringExtra2 = intent.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Integer valueOf = intent.hasExtra("google.product_id") ? Integer.valueOf(intent.getIntExtra("google.product_id", 0)) : null;
            if (valueOf != null) {
                bundle.putInt("google.product_id", valueOf.intValue());
            }
            bundle.putBoolean("supports_message_handled", true);
            k d = k.d(context);
            synchronized (d) {
                i10 = d.a;
                d.a = i10 + 1;
            }
            e6 = d.e(new j(i10, 2, bundle, 0));
        }
        try {
            i11 = ((Integer) Tasks.await(new com.google.firebase.messaging.j(context).b(intent))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
        }
        try {
            Tasks.await(e6, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e11.toString()));
        }
        return i11;
    }

    public static int b(Intent intent) {
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
        String action = intent.getAction();
        if (action != "com.google.firebase.messaging.NOTIFICATION_DISMISS" && (action == null || !action.equals("com.google.firebase.messaging.NOTIFICATION_DISMISS"))) {
            Log.e("CloudMessagingReceiver", "Unknown notification action");
            return 500;
        }
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(extras);
        if (!x6.b(putExtras)) {
            return -1;
        }
        x6.a("_nd", putExtras.getExtras());
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
                    executorService2 = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new u("firebase-iid-executor")));
                    a = new SoftReference(executorService2);
                }
                executorService = executorService2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        executorService.execute(new v(this, intent, context, isOrderedBroadcast, goAsync));
    }
}
