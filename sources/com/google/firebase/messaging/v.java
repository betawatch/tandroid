package com.google.firebase.messaging;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class v implements Runnable {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public v(FirebaseMessaging firebaseMessaging, long j10) {
        this.a = 0;
        this.e = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new e9.v("firebase-iid-executor"));
        this.d = firebaseMessaging;
        this.b = j10;
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
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
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
                t v = t.v();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.d;
                if (v.x(firebaseMessaging.b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.j = true;
                        }
                        if (!firebaseMessaging.i.e()) {
                            firebaseMessaging.e(false);
                            if (!t.v().x(firebaseMessaging.b)) {
                                return;
                            }
                        } else if (!t.v().w(firebaseMessaging.b) || a()) {
                            if (b()) {
                                firebaseMessaging.e(false);
                            } else {
                                firebaseMessaging.f(this.b);
                            }
                            if (!t.v().x(firebaseMessaging.b)) {
                                return;
                            }
                        } else {
                            androidx.mediarouter.app.h hVar = new androidx.mediarouter.app.h();
                            hVar.b = this;
                            hVar.a();
                            if (!t.v().x(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    } catch (IOException e10) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                        firebaseMessaging.e(false);
                        if (!t.v().x(firebaseMessaging.b)) {
                            return;
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (t.v().x(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
            default:
                e9.o oVar = (e9.o) this.e;
                e9.s sVar = oVar.n;
                if (sVar == null || !sVar.e.get()) {
                    long j10 = this.b / 1000;
                    String e11 = oVar.e();
                    if (e11 == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    m mVar = oVar.m;
                    Throwable th2 = (Throwable) this.c;
                    Thread thread = (Thread) this.d;
                    mVar.getClass();
                    String concat = "Persisting non-fatal event for session ".concat(e11);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", concat, null);
                    }
                    mVar.t(th2, thread, e11, "error", j10, false);
                    return;
                }
                return;
        }
    }

    public v(e9.o oVar, long j10, Throwable th, Thread thread) {
        this.a = 1;
        this.e = oVar;
        this.b = j10;
        this.c = th;
        this.d = thread;
    }
}
