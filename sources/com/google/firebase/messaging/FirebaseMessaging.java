package com.google.firebase.messaging;

import ah.h0;
import ai.t2;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static final long k = TimeUnit.HOURS.toSeconds(8);
    public static a6.i l;
    public static i5.f m;
    public static ScheduledThreadPoolExecutor n;
    public final l9.h a;
    public final Context b;
    public final l c;
    public final i d;
    public final c2.b e;
    public final ScheduledThreadPoolExecutor f;
    public final ExecutorService g;
    public final ThreadPoolExecutor h;
    public final n i;
    public boolean j;

    public FirebaseMessaging(l9.h hVar, qa.b bVar, qa.b bVar2, ra.d dVar, i5.f fVar, na.b bVar3) {
        hVar.a();
        Context context = hVar.a;
        final n nVar = new n();
        final int i10 = 0;
        nVar.b = 0;
        nVar.c = context;
        hVar.a();
        j6.a aVar = new j6.a(hVar.a);
        final l lVar = new l();
        lVar.a = hVar;
        lVar.b = nVar;
        lVar.c = aVar;
        lVar.d = bVar;
        lVar.e = bVar2;
        lVar.f = dVar;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new c5.w("Firebase-Messaging-Task"));
        final int i11 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new c5.w("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c5.w("Firebase-Messaging-File-Io"));
        this.j = false;
        m = fVar;
        this.a = hVar;
        c2.b bVar4 = new c2.b();
        bVar4.d = this;
        bVar4.b = bVar3;
        this.e = bVar4;
        hVar.a();
        final Context context2 = hVar.a;
        this.b = context2;
        j jVar = new j();
        this.i = nVar;
        this.g = newSingleThreadExecutor;
        this.c = lVar;
        this.d = new i(newSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        hVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(jVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.k
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                boolean z10;
                Context applicationContext;
                PackageManager packageManager;
                ApplicationInfo applicationInfo;
                Bundle bundle;
                switch (i10) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.b;
                        if (firebaseMessaging.e.q() && firebaseMessaging.g(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.j) {
                                    firebaseMessaging.f(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        Context context3 = this.b.b;
                        Context applicationContext2 = context3.getApplicationContext();
                        if (applicationContext2 == null) {
                            applicationContext2 = context3;
                        }
                        if (applicationContext2.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                            return;
                        }
                        try {
                            applicationContext = context3.getApplicationContext();
                            packageManager = applicationContext.getPackageManager();
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                            z10 = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                            if (Build.VERSION.SDK_INT >= 29) {
                                Tasks.forResult(null);
                                return;
                            }
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            b2.d.a(context3, z10, taskCompletionSource);
                            taskCompletionSource.getTask();
                            return;
                        }
                        z10 = true;
                        if (Build.VERSION.SDK_INT >= 29) {
                        }
                        break;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new c5.w("Firebase-Messaging-Topics-Io"));
        int i12 = y.j;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.x
            @Override // java.util.concurrent.Callable
            public final Object call() {
                w wVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                n nVar2 = nVar;
                l lVar2 = lVar;
                synchronized (w.class) {
                    try {
                        WeakReference weakReference = w.d;
                        wVar = weakReference != null ? (w) weakReference.get() : null;
                        if (wVar == null) {
                            w wVar2 = new w(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor3);
                            wVar2.b();
                            w.d = new WeakReference(wVar2);
                            wVar = wVar2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new y(firebaseMessaging, nVar2, wVar, lVar2, context3, scheduledThreadPoolExecutor3);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new a1.c(this, 22));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.k
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                boolean z10;
                Context applicationContext;
                PackageManager packageManager;
                ApplicationInfo applicationInfo;
                Bundle bundle;
                switch (i11) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.b;
                        if (firebaseMessaging.e.q() && firebaseMessaging.g(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.j) {
                                    firebaseMessaging.f(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        Context context3 = this.b.b;
                        Context applicationContext2 = context3.getApplicationContext();
                        if (applicationContext2 == null) {
                            applicationContext2 = context3;
                        }
                        if (applicationContext2.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                            return;
                        }
                        try {
                            applicationContext = context3.getApplicationContext();
                            packageManager = applicationContext.getPackageManager();
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                            z10 = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                            if (Build.VERSION.SDK_INT >= 29) {
                                Tasks.forResult(null);
                                return;
                            }
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            b2.d.a(context3, z10, taskCompletionSource);
                            taskCompletionSource.getTask();
                            return;
                        }
                        z10 = true;
                        if (Build.VERSION.SDK_INT >= 29) {
                        }
                        break;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (n == null) {
                    n = new ScheduledThreadPoolExecutor(1, new c5.w("TAG"));
                }
                n.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized a6.i c(Context context) {
        a6.i iVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (l == null) {
                    l = new a6.i(context, 13);
                }
                iVar = l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    public static synchronized FirebaseMessaging getInstance(l9.h hVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) hVar.b(FirebaseMessaging.class);
            n6.l.i(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        t d = d();
        if (!g(d)) {
            return d.a;
        }
        String c10 = n.c(this.a);
        i iVar = this.d;
        synchronized (iVar) {
            task = (Task) ((a0.f) iVar.b).get(c10);
            if (task == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + c10);
                }
                l lVar = this.c;
                task = lVar.q(lVar.J(n.c((l9.h) lVar.a), "*", new Bundle())).onSuccessTask(this.h, new t2(this, c10, d, 5)).continueWithTask((Executor) iVar.a, new h0(9, iVar, c10));
                ((a0.f) iVar.b).put(c10, task);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + c10);
            }
        }
        try {
            return (String) Tasks.await(task);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final t d() {
        t b10;
        a6.i c10 = c(this.b);
        l9.h hVar = this.a;
        hVar.a();
        String d = "[DEFAULT]".equals(hVar.b) ? "" : hVar.d();
        String c11 = n.c(this.a);
        synchronized (c10) {
            b10 = t.b(((SharedPreferences) c10.b).getString(d + "|T|" + c11 + "|*", null));
        }
        return b10;
    }

    public final synchronized void e(boolean z10) {
        this.j = z10;
    }

    public final synchronized void f(long j10) {
        b(new u(this, Math.min(Math.max(30L, 2 * j10), k)), j10);
        this.j = true;
    }

    public final boolean g(t tVar) {
        if (tVar != null) {
            return System.currentTimeMillis() > tVar.c + t.d || !this.i.a().equals(tVar.b);
        }
        return true;
    }
}
