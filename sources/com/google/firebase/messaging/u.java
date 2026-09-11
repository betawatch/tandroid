package com.google.firebase.messaging;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class u implements Runnable {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public u(FirebaseMessaging firebaseMessaging, long j3) {
        this.a = 0;
        this.e = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c5.w("firebase-iid-executor"));
        this.d = firebaseMessaging;
        this.b = j3;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.d).b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() {
        try {
            if (((FirebaseMessaging) this.d).a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e7) {
            String message = e7.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e7.getMessage() != null) {
                    throw e7;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e7.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.c;
                s b10 = s.b();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.d;
                if (b10.d(firebaseMessaging.b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.j = true;
                        }
                        if (!firebaseMessaging.i.e()) {
                            firebaseMessaging.e(false);
                            if (!s.b().d(firebaseMessaging.b)) {
                                return;
                            }
                        } else if (!s.b().c(firebaseMessaging.b) || a()) {
                            if (b()) {
                                firebaseMessaging.e(false);
                            } else {
                                firebaseMessaging.f(this.b);
                            }
                            if (!s.b().d(firebaseMessaging.b)) {
                                return;
                            }
                        } else {
                            androidx.mediarouter.app.g gVar = new androidx.mediarouter.app.g();
                            gVar.b = this;
                            gVar.a();
                            if (!s.b().d(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    } catch (IOException e7) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e7.getMessage() + ". Won't retry the operation.");
                        firebaseMessaging.e(false);
                        if (!s.b().d(firebaseMessaging.b)) {
                            return;
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th2) {
                    if (s.b().d(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                    throw th2;
                }
            default:
                w9.m mVar = (w9.m) this.e;
                w9.q qVar = mVar.n;
                if (qVar == null || !qVar.e.get()) {
                    long j3 = this.b / 1000;
                    String e10 = mVar.e();
                    if (e10 == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    n nVar = mVar.m;
                    Throwable th3 = (Throwable) this.c;
                    Thread thread = (Thread) this.d;
                    nVar.getClass();
                    String concat = "Persisting non-fatal event for session ".concat(e10);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", concat, null);
                    }
                    nVar.v(th3, thread, e10, "error", j3, false);
                    return;
                }
                return;
        }
    }

    public u(w9.m mVar, long j3, Throwable th2, Thread thread) {
        this.a = 1;
        this.e = mVar;
        this.b = j3;
        this.c = th2;
        this.d = thread;
    }
}
