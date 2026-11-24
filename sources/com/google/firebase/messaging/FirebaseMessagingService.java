package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class FirebaseMessagingService extends Service {
    public static final ArrayDeque h = new ArrayDeque(10);
    public final ExecutorService a;
    public n0d b;
    public final Object c;
    public int d;
    public int e;
    public fo9 f;

    public FirebaseMessagingService() {
        op7 op7Var = new op7("Firebase-Messaging-Intent-Handle");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), op7Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.c = new Object();
        this.e = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            mfd.b(intent);
        }
        synchronized (this.c) {
            int i = this.e - 1;
            this.e = i;
            if (i == 0) {
                stopSelfResult(this.d);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Intent intent) {
        String stringExtra;
        fo9 fo9Var;
        int i;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                d(intent.getStringExtra("token"));
                return;
            }
            if ("com.google.firebase.messaging.FCM_REGISTERED".equals(action)) {
                intent.getStringExtra("token");
                return;
            } else {
                if ("com.google.firebase.messaging.FCM_UNREGISTERED".equals(action)) {
                    intent.getStringExtra("token");
                    return;
                }
                Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
                return;
            }
        }
        String stringExtra2 = intent.getStringExtra("google.message_id");
        if (!TextUtils.isEmpty(stringExtra2)) {
            ArrayDeque arrayDeque = h;
            if (arrayDeque.contains(stringExtra2)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received duplicate message: " + stringExtra2);
                }
                fo9Var = this.f;
                if (fo9Var == null) {
                    fo9Var = new fo9(getApplicationContext());
                    this.f = fo9Var;
                }
                if (fo9Var.c.b() >= 233700000) {
                    Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                    return;
                }
                Bundle bundle = new Bundle();
                String stringExtra3 = intent.getStringExtra("google.message_id");
                if (stringExtra3 == null) {
                    stringExtra3 = intent.getStringExtra("message_id");
                }
                bundle.putString("google.message_id", stringExtra3);
                Integer valueOf = intent.hasExtra("google.product_id") ? Integer.valueOf(intent.getIntExtra("google.product_id", 0)) : null;
                if (valueOf != null) {
                    bundle.putInt("google.product_id", valueOf.intValue());
                }
                jif t = jif.t(fo9Var.b);
                synchronized (t) {
                    i = t.a;
                    t.a = i + 1;
                }
                t.u(new fdf(i, 3, bundle, (byte) 0));
                return;
            }
            if (arrayDeque.size() >= 10) {
                arrayDeque.remove();
            }
            arrayDeque.add(stringExtra2);
        }
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                break;
            case "gcm":
                are.b(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.content.wakelockid");
                if (ai4.G(extras)) {
                    ai4 ai4Var = new ai4(extras);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new op7("Firebase-Messaging-Network-Io"));
                    try {
                        if (!new in3(this, ai4Var, newSingleThreadExecutor).y()) {
                            if (are.d(intent)) {
                                are.c("_nf", intent.getExtras());
                            }
                        }
                    } finally {
                        newSingleThreadExecutor.shutdown();
                    }
                }
                c(new l89(extras));
                break;
            case "send_error":
                if (intent.getStringExtra("google.message_id") == null) {
                    intent.getStringExtra("message_id");
                }
                String stringExtra4 = intent.getStringExtra("error");
                new v40(stringExtra4);
                if (stringExtra4 != null) {
                    stringExtra4.toLowerCase(Locale.US).getClass();
                    break;
                }
                break;
            case "send_event":
                intent.getStringExtra("google.message_id");
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra));
                break;
        }
        fo9Var = this.f;
        if (fo9Var == null) {
        }
        if (fo9Var.c.b() >= 233700000) {
        }
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        n0d n0dVar;
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        n0dVar = this.b;
        if (n0dVar == null) {
            n0dVar = new n0d(new k44(this, (byte) 0));
            this.b = n0dVar;
        }
        return n0dVar;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.e++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) e7a.v().d).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.execute(new pz2(this, intent2, taskCompletionSource, (byte) 20));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener(new kc((byte) 1), new x92((Object) this, (Object) intent, (byte) 27));
        return 3;
    }

    public void c(l89 l89Var) {
    }

    public void d(String str) {
    }
}
