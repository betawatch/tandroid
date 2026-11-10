package com.google.firebase.messaging;

import a8.b1;
import ab.h;
import ab.z;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.a0;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import d6.i;
import f5.r;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import m6.c;
import m6.m;
import m6.n;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class FirebaseMessagingService extends h {
    public static final ArrayDeque h = new ArrayDeque(10);
    public c f;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c5  */
    @Override // ab.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Intent intent) {
        String stringExtra;
        c cVar;
        int i7;
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
                if (this.f == null) {
                    this.f = new c(getApplicationContext());
                }
                cVar = this.f;
                if (cVar.c.i() >= 233700000) {
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
                n i10 = n.i(cVar.b);
                synchronized (i10) {
                    i7 = i10.a;
                    i10.a = i7 + 1;
                }
                i10.k(new m(i7, 3, bundle, 0));
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
                b1.b(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.content.wakelockid");
                if (i.l0(extras)) {
                    i iVar = new i(extras);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new r("Firebase-Messaging-Network-Io"));
                    try {
                        if (new a0(this, iVar, newSingleThreadExecutor, 5).k()) {
                            break;
                        } else {
                            newSingleThreadExecutor.shutdown();
                            if (b1.d(intent)) {
                                b1.c("_nf", intent.getExtras());
                            }
                        }
                    } finally {
                        newSingleThreadExecutor.shutdown();
                    }
                }
                c(new z(extras));
                break;
            case "send_error":
                if (intent.getStringExtra("google.message_id") == null) {
                    intent.getStringExtra("message_id");
                }
                String stringExtra4 = intent.getStringExtra("error");
                new ab.a0(stringExtra4);
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
        if (this.f == null) {
        }
        cVar = this.f;
        if (cVar.c.i() >= 233700000) {
        }
    }

    public void c(z zVar) {
    }

    public void d(String str) {
    }
}
