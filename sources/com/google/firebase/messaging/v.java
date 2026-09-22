package com.google.firebase.messaging;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class v implements Runnable {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public v(FirebaseMessaging firebaseMessaging, long j3) {
        this.a = 0;
        this.e = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c5.v("firebase-iid-executor"));
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
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
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
                t c10 = t.c();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.d;
                if (c10.e(firebaseMessaging.b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.j = true;
                        }
                        if (!firebaseMessaging.i.e()) {
                            firebaseMessaging.e(false);
                            if (!t.c().e(firebaseMessaging.b)) {
                                return;
                            }
                        } else if (!t.c().d(firebaseMessaging.b) || a()) {
                            if (b()) {
                                firebaseMessaging.e(false);
                            } else {
                                firebaseMessaging.f(this.b);
                            }
                            if (!t.c().e(firebaseMessaging.b)) {
                                return;
                            }
                        } else {
                            androidx.mediarouter.app.g gVar = new androidx.mediarouter.app.g();
                            gVar.b = this;
                            gVar.a();
                            if (!t.c().e(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                        firebaseMessaging.e(false);
                        if (!t.c().e(firebaseMessaging.b)) {
                            return;
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th2) {
                    if (t.c().e(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                    throw th2;
                }
            default:
                w9.n nVar = (w9.n) this.e;
                w9.r rVar = nVar.n;
                if (rVar == null || !rVar.e.get()) {
                    long j3 = this.b / 1000;
                    String e7 = nVar.e();
                    if (e7 == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    n nVar2 = nVar.m;
                    Throwable th3 = (Throwable) this.c;
                    Thread thread = (Thread) this.d;
                    nVar2.getClass();
                    String concat = "Persisting non-fatal event for session ".concat(e7);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", concat, null);
                    }
                    nVar2.v(th3, thread, e7, "error", j3, false);
                    return;
                }
                return;
        }
    }

    public v(w9.n nVar, long j3, Throwable th2, Thread thread) {
        this.a = 1;
        this.e = nVar;
        this.b = j3;
        this.c = th2;
        this.d = thread;
    }
}
