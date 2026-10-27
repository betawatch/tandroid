package com.google.firebase.messaging;

import aa.m0;
import ai.f0;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static final long k = TimeUnit.HOURS.toSeconds(8);
    public static a4.l l;
    public static j5.f m;
    public static ScheduledThreadPoolExecutor n;
    public final m9.h a;
    public final Context b;
    public final m0 c;
    public final i d;
    public final c2.b e;
    public final ScheduledThreadPoolExecutor f;
    public final ExecutorService g;
    public final ThreadPoolExecutor h;
    public final m i;
    public boolean j;

    public FirebaseMessaging(m9.h hVar, ra.b bVar, ra.b bVar2, sa.d dVar, j5.f fVar, oa.b bVar3) {
        hVar.a();
        Context context = hVar.a;
        final m mVar = new m();
        final int i10 = 0;
        mVar.b = 0;
        mVar.c = context;
        hVar.a();
        k6.a aVar = new k6.a(hVar.a);
        final m0 m0Var = new m0();
        m0Var.a = hVar;
        m0Var.b = mVar;
        m0Var.c = aVar;
        m0Var.d = bVar;
        m0Var.e = bVar2;
        m0Var.f = dVar;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new d5.v("Firebase-Messaging-Task"));
        final int i11 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new d5.v("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new d5.v("Firebase-Messaging-File-Io"));
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
        this.i = mVar;
        this.g = newSingleThreadExecutor;
        this.c = m0Var;
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
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new d5.v("Firebase-Messaging-Topics-Io"));
        int i12 = w.j;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.v
            @Override // java.util.concurrent.Callable
            public final Object call() {
                u uVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                m mVar2 = mVar;
                m0 m0Var2 = m0Var;
                synchronized (u.class) {
                    try {
                        WeakReference weakReference = u.d;
                        uVar = weakReference != null ? (u) weakReference.get() : null;
                        if (uVar == null) {
                            u uVar2 = new u(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor3);
                            uVar2.b();
                            u.d = new WeakReference(uVar2);
                            uVar = uVar2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new w(firebaseMessaging, mVar2, uVar, m0Var2, context3, scheduledThreadPoolExecutor3);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new a1.c(this, 15));
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
                    n = new ScheduledThreadPoolExecutor(1, new d5.v("TAG"));
                }
                n.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized a4.l c(Context context) {
        a4.l lVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (l == null) {
                    l = new a4.l(context);
                }
                lVar = l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVar;
    }

    public static synchronized FirebaseMessaging getInstance(m9.h hVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) hVar.b(FirebaseMessaging.class);
            o6.l.i(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        r d = d();
        if (!g(d)) {
            return d.a;
        }
        String c10 = m.c(this.a);
        i iVar = this.d;
        synchronized (iVar) {
            task = (Task) ((a0.f) iVar.b).get(c10);
            if (task == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + c10);
                }
                m0 m0Var = this.c;
                task = m0Var.m(m0Var.A(m.c((m9.h) m0Var.a), "*", new Bundle())).onSuccessTask(this.h, new androidx.car.app.utils.a((Object) this, c10, (Object) d, 3)).continueWithTask((Executor) iVar.a, new f0(8, iVar, c10));
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

    public final r d() {
        r b10;
        a4.l c10 = c(this.b);
        m9.h hVar = this.a;
        hVar.a();
        String d = "[DEFAULT]".equals(hVar.b) ? "" : hVar.d();
        String c11 = m.c(this.a);
        synchronized (c10) {
            b10 = r.b(((SharedPreferences) c10.b).getString(d + "|T|" + c11 + "|*", null));
        }
        return b10;
    }

    public final synchronized void e(boolean z10) {
        this.j = z10;
    }

    public final synchronized void f(long j10) {
        b(new s(this, Math.min(Math.max(30L, 2 * j10), k)), j10);
        this.j = true;
    }

    public final boolean g(r rVar) {
        if (rVar != null) {
            return System.currentTimeMillis() > rVar.c + r.d || !this.i.a().equals(rVar.b);
        }
        return true;
    }
}
