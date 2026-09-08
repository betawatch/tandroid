package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class b0 {
    public static final long a = TimeUnit.MINUTES.toMillis(1);
    public static final Object b = new Object();
    public static p8.a c;

    public static void a(Context context) {
        if (c == null) {
            p8.a aVar = new p8.a(context);
            c = aVar;
            synchronized (aVar.a) {
                aVar.g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (b) {
            try {
                if (c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    c.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(Context context, e0 e0Var, Intent intent) {
        synchronized (b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    c.a(a);
                }
                e0Var.b(intent).addOnCompleteListener(new a1.c(intent, 16));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ComponentName d(Context context, Intent intent) {
        synchronized (b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    c.a(a);
                }
                return startService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
