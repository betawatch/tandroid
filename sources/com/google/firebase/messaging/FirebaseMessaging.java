package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import bg.c2;
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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static final long k = TimeUnit.HOURS.toSeconds(8);
    public static u l;
    public static v2.f m;
    public static ScheduledThreadPoolExecutor n;
    public final u8.g a;
    public final Context b;
    public final c2 c;
    public final j d;
    public final ab.m e;
    public final ScheduledThreadPoolExecutor f;
    public final ExecutorService g;
    public final ThreadPoolExecutor h;
    public final n i;
    public boolean j;

    public FirebaseMessaging(u8.g gVar, z9.b bVar, z9.b bVar2, aa.d dVar, v2.f fVar, w9.b bVar3) {
        gVar.a();
        Context context = gVar.a;
        final n nVar = new n(context);
        gVar.a();
        v5.a aVar = new v5.a(gVar.a);
        final c2 c2Var = new c2();
        c2Var.a = gVar;
        c2Var.b = nVar;
        c2Var.c = aVar;
        c2Var.d = bVar;
        c2Var.e = bVar2;
        c2Var.f = dVar;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new g9.w("Firebase-Messaging-Task"));
        final int i10 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new g9.w("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new g9.w("Firebase-Messaging-File-Io"));
        final int i11 = 0;
        this.j = false;
        m = fVar;
        this.a = gVar;
        ab.m mVar = new ab.m();
        mVar.d = this;
        mVar.b = bVar3;
        this.e = mVar;
        gVar.a();
        final Context context2 = gVar.a;
        this.b = context2;
        k kVar = new k();
        this.i = nVar;
        this.g = newSingleThreadExecutor;
        this.c = c2Var;
        this.d = new j(newSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        gVar.a();
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
                switch (i11) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.b;
                        if (firebaseMessaging.e.l() && firebaseMessaging.g(firebaseMessaging.d())) {
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
                            p.a(context3, z10, taskCompletionSource);
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
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new g9.w("Firebase-Messaging-Topics-Io"));
        int i12 = z.j;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                x xVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                n nVar2 = nVar;
                c2 c2Var2 = c2Var;
                synchronized (x.class) {
                    try {
                        WeakReference weakReference = x.d;
                        xVar = weakReference != null ? (x) weakReference.get() : null;
                        if (xVar == null) {
                            x xVar2 = new x(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor3);
                            xVar2.b();
                            x.d = new WeakReference(xVar2);
                            xVar = xVar2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new z(firebaseMessaging, nVar2, xVar, c2Var2, context3, scheduledThreadPoolExecutor3);
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
                switch (i10) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.b;
                        if (firebaseMessaging.e.l() && firebaseMessaging.g(firebaseMessaging.d())) {
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
                            p.a(context3, z10, taskCompletionSource);
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
                    n = new ScheduledThreadPoolExecutor(1, new g9.w("TAG"));
                }
                n.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized u c(Context context) {
        u uVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (l == null) {
                    l = new u(context);
                }
                uVar = l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public static synchronized FirebaseMessaging getInstance(u8.g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
            z5.l.i(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        t d = d();
        if (!g(d)) {
            return d.a;
        }
        String c3 = n.c(this.a);
        j jVar = this.d;
        synchronized (jVar) {
            task = (Task) ((a0.f) jVar.b).get(c3);
            if (task == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + c3);
                }
                c2 c2Var = this.c;
                task = c2Var.n(c2Var.A(n.c((u8.g) c2Var.a), "*", new Bundle())).onSuccessTask(this.h, new androidx.car.app.utils.a(3, this, d, c3)).continueWithTask((Executor) jVar.a, new a9.s(5, jVar, c3));
                ((a0.f) jVar.b).put(c3, task);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + c3);
            }
        }
        try {
            return (String) Tasks.await(task);
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    public final t d() {
        t b10;
        u c3 = c(this.b);
        u8.g gVar = this.a;
        gVar.a();
        String d = "[DEFAULT]".equals(gVar.b) ? "" : gVar.d();
        String c6 = n.c(this.a);
        synchronized (c3) {
            b10 = t.b(c3.a.getString(d + "|T|" + c6 + "|*", null));
        }
        return b10;
    }

    public final synchronized void e(boolean z10) {
        this.j = z10;
    }

    public final synchronized void f(long j10) {
        b(new v(this, Math.min(Math.max(30L, 2 * j10), k)), j10);
        this.j = true;
    }

    public final boolean g(t tVar) {
        if (tVar != null) {
            return System.currentTimeMillis() > tVar.c + t.d || !this.i.a().equals(tVar.b);
        }
        return true;
    }
}
