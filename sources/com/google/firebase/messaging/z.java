package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class z {
    public static final long i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;
    public final Context a;
    public final o b;
    public final m c;
    public final FirebaseMessaging d;
    public final ScheduledThreadPoolExecutor f;
    public final x h;
    public final a0.f e = new a0.f(0);
    public boolean g = false;

    public z(FirebaseMessaging firebaseMessaging, o oVar, x xVar, m mVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = oVar;
        this.h = xVar;
        this.c = mVar;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static boolean d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void b(String str) {
        String a2 = this.d.a();
        m mVar = this.c;
        mVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(mVar.m(mVar.A(a2, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        String a2 = this.d.a();
        m mVar = this.c;
        mVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(mVar.m(mVar.A(a2, "/topics/" + str, bundle)));
    }

    public final void e(w wVar) {
        synchronized (this.e) {
            try {
                String str = wVar.c;
                if (this.e.containsKey(str)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.e.get(str);
                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                    if (taskCompletionSource != null) {
                        taskCompletionSource.setResult(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.e.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void f(boolean z10) {
        this.g = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a A[Catch: IOException -> 0x005e, TRY_LEAVE, TryCatch #1 {IOException -> 0x005e, blocks: (B:8:0x0029, B:13:0x0084, B:15:0x008a, B:19:0x003a, B:21:0x0042, B:23:0x004b, B:26:0x0060, B:28:0x0068, B:30:0x0071), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        w a2;
        while (true) {
            synchronized (this) {
                try {
                    a2 = this.h.a();
                    if (a2 == null) {
                        break;
                    }
                } finally {
                }
            }
            try {
                String str = a2.b;
                String str2 = a2.a;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        c(str2);
                        if (d()) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                        }
                        this.h.c(a2);
                        e(a2);
                    }
                    if (!d()) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + a2 + ".");
                    }
                    this.h.c(a2);
                    e(a2);
                } else {
                    if (str.equals("S")) {
                        b(str2);
                        if (d()) {
                            Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                        }
                        this.h.c(a2);
                        e(a2);
                    }
                    if (!d()) {
                    }
                    this.h.c(a2);
                    e(a2);
                }
            } catch (IOException e10) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e10.getMessage())) {
                    if (e10.getMessage() != null) {
                        throw e10;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                Log.e("FirebaseMessaging", "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.");
                return false;
            }
        }
        if (d()) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void h(long j10) {
        this.f.schedule(new b0(this, this.a, this.b, Math.min(Math.max(30L, 2 * j10), i)), j10, TimeUnit.SECONDS);
        f(true);
    }
}
