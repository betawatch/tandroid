package com.google.firebase.messaging;

import ah.h0;
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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static final long k = TimeUnit.HOURS.toSeconds(8);
    public static ya.c l;
    public static i5.f m;
    public static ScheduledThreadPoolExecutor n;
    public final l9.h a;
    public final Context b;
    public final m c;
    public final j d;
    public final c2.b e;
    public final ScheduledThreadPoolExecutor f;
    public final ExecutorService g;
    public final ThreadPoolExecutor h;
    public final o i;
    public boolean j;

    public FirebaseMessaging(l9.h hVar, qa.b bVar, qa.b bVar2, ra.d dVar, i5.f fVar, na.b bVar3) {
        hVar.a();
        Context context = hVar.a;
        final o oVar = new o();
        final int i10 = 0;
        oVar.b = 0;
        oVar.c = context;
        hVar.a();
        j6.a aVar = new j6.a(hVar.a);
        final m mVar = new m();
        mVar.a = hVar;
        mVar.b = oVar;
        mVar.c = aVar;
        mVar.d = bVar;
        mVar.e = bVar2;
        mVar.f = dVar;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new c5.x("Firebase-Messaging-Task"));
        final int i11 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new c5.x("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c5.x("Firebase-Messaging-File-Io"));
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
        k kVar = new k();
        this.i = oVar;
        this.g = newSingleThreadExecutor;
        this.c = mVar;
        this.d = new j(newSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        hVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(kVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.l
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
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new c5.x("Firebase-Messaging-Topics-Io"));
        int i12 = y.j;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.x
            @Override // java.util.concurrent.Callable
            public final Object call() {
                w wVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                o oVar2 = oVar;
                m mVar2 = mVar;
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
                return new y(firebaseMessaging, oVar2, wVar, mVar2, context3, scheduledThreadPoolExecutor3);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new a1.c(this, 15));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.l
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
                    n = new ScheduledThreadPoolExecutor(1, new c5.x("TAG"));
                }
                n.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized ya.c c(Context context) {
        ya.c cVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (l == null) {
                    l = new ya.c(context);
                }
                cVar = l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
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
        String c10 = o.c(this.a);
        j jVar = this.d;
        synchronized (jVar) {
            task = (Task) ((a0.f) jVar.b).get(c10);
            if (task == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + c10);
                }
                m mVar = this.c;
                task = mVar.o(mVar.D(o.c((l9.h) mVar.a), "*", new Bundle())).onSuccessTask(this.h, new androidx.car.app.utils.a(4, this, d, c10)).continueWithTask((Executor) jVar.a, new h0(7, jVar, c10));
                ((a0.f) jVar.b).put(c10, task);
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
        ya.c c10 = c(this.b);
        l9.h hVar = this.a;
        hVar.a();
        String d = "[DEFAULT]".equals(hVar.b) ? "" : hVar.d();
        String c11 = o.c(this.a);
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
