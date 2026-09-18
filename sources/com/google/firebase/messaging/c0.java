package com.google.firebase.messaging;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class c0 implements Runnable {
    public static final Object f = new Object();
    public static Boolean h;
    public static Boolean n;
    public final Context a;
    public final p b;
    public final PowerManager.WakeLock c;
    public final a0 d;
    public final long e;

    public c0(a0 a0Var, Context context, p pVar, long j3) {
        this.d = a0Var;
        this.a = context;
        this.e = j3;
        this.b = pVar;
        this.c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (f) {
            try {
                Boolean bool = n;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                n = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z10;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        synchronized (f) {
            try {
                Boolean bool = h;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                h = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean e() {
        boolean z10;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z10 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        a0 a0Var = this.d;
        Context context = this.a;
        boolean c10 = c(context);
        PowerManager.WakeLock wakeLock = this.c;
        if (c10) {
            wakeLock.acquire(f.a);
        }
        try {
            try {
                try {
                    a0Var.f(true);
                    if (!this.b.e()) {
                        a0Var.f(false);
                        if (c(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (!a(context) || e()) {
                        if (a0Var.g()) {
                            a0Var.f(false);
                        } else {
                            a0Var.h(this.e);
                        }
                        if (c(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    new b0(this, this).a();
                    if (c(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (IOException e) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    a0Var.f(false);
                    if (c(context)) {
                        wakeLock.release();
                    }
                }
            } catch (RuntimeException unused3) {
                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
            }
        } catch (Throwable th2) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th2;
        }
    }
}
