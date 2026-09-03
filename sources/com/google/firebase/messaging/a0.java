package com.google.firebase.messaging;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a0 implements Runnable {
    public static final Object f = new Object();
    public static Boolean h;
    public static Boolean n;
    public final Context a;
    public final n b;
    public final PowerManager.WakeLock c;
    public final y d;
    public final long e;

    public a0(y yVar, Context context, n nVar, long j10) {
        this.d = yVar;
        this.a = context;
        this.e = j10;
        this.b = nVar;
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
        boolean z4 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z4 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z4;
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
        boolean z4;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z4 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return z4;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        y yVar = this.d;
        Context context = this.a;
        boolean c3 = c(context);
        PowerManager.WakeLock wakeLock = this.c;
        if (c3) {
            wakeLock.acquire(f.a);
        }
        try {
            try {
                try {
                    yVar.f(true);
                    if (!this.b.e()) {
                        yVar.f(false);
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
                        if (yVar.g()) {
                            yVar.f(false);
                        } else {
                            yVar.h(this.e);
                        }
                        if (c(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    new z(this, this).a();
                    if (c(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (IOException e6) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e6.getMessage());
                    yVar.f(false);
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
