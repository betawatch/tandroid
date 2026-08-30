package com.google.firebase.messaging;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class u implements Runnable {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public u(FirebaseMessaging firebaseMessaging, long j10) {
        this.a = 0;
        this.e = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new i9.u("firebase-iid-executor"));
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
                r A = r.A();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.d;
                if (A.C(firebaseMessaging.b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.j = true;
                        }
                        if (!firebaseMessaging.i.e()) {
                            firebaseMessaging.e(false);
                            if (!r.A().C(firebaseMessaging.b)) {
                                return;
                            }
                        } else if (!r.A().B(firebaseMessaging.b) || a()) {
                            if (b()) {
                                firebaseMessaging.e(false);
                            } else {
                                firebaseMessaging.f(this.b);
                            }
                            if (!r.A().C(firebaseMessaging.b)) {
                                return;
                            }
                        } else {
                            androidx.mediarouter.app.h hVar = new androidx.mediarouter.app.h();
                            hVar.b = this;
                            hVar.a();
                            if (!r.A().C(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                        firebaseMessaging.e(false);
                        if (!r.A().C(firebaseMessaging.b)) {
                            return;
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th2) {
                    if (r.A().C(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                    throw th2;
                }
            default:
                i9.n nVar = (i9.n) this.e;
                i9.r rVar = nVar.n;
                if (rVar == null || !rVar.e.get()) {
                    long j10 = this.b / 1000;
                    String e6 = nVar.e();
                    if (e6 == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    a9.a aVar = nVar.m;
                    Throwable th3 = (Throwable) this.c;
                    Thread thread = (Thread) this.d;
                    aVar.getClass();
                    String concat = "Persisting non-fatal event for session ".concat(e6);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", concat, null);
                    }
                    aVar.t(th3, thread, e6, "error", j10, false);
                    return;
                }
                return;
        }
    }

    public u(i9.n nVar, long j10, Throwable th2, Thread thread) {
        this.a = 1;
        this.e = nVar;
        this.b = j10;
        this.c = th2;
        this.d = thread;
    }
}
