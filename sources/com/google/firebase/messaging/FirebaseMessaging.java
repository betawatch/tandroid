package com.google.firebase.messaging;

import ac.a;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import c5.s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import i5.f;
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
import l9.h;
import n6.l;
import org.telegram.ui.ActionBar.p4;
import org.telegram.ui.web.k0;
import qa.b;
import ra.d;
import vh.w3;
import xa.g;
import xa.o;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static final long k = TimeUnit.HOURS.toSeconds(8);
    public static w3 l;
    public static f m;
    public static ScheduledThreadPoolExecutor n;
    public final h a;
    public final Context b;
    public final j2.f c;
    public final g d;
    public final a e;
    public final ScheduledThreadPoolExecutor f;
    public final ExecutorService g;
    public final ThreadPoolExecutor h;
    public final p4 i;
    public boolean j;

    public FirebaseMessaging(h hVar, b bVar, b bVar2, d dVar, f fVar, na.b bVar3) {
        hVar.a();
        Context context = hVar.a;
        final p4 p4Var = new p4();
        final int i10 = 0;
        p4Var.b = 0;
        p4Var.d = context;
        hVar.a();
        j6.a aVar = new j6.a(hVar.a);
        final j2.f fVar2 = new j2.f();
        fVar2.a = hVar;
        fVar2.b = p4Var;
        fVar2.c = aVar;
        fVar2.d = bVar;
        fVar2.e = bVar2;
        fVar2.f = dVar;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new s("Firebase-Messaging-Task"));
        final int i11 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new s("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new s("Firebase-Messaging-File-Io"));
        this.j = false;
        m = fVar;
        this.a = hVar;
        a aVar2 = new a();
        aVar2.d = this;
        aVar2.b = bVar3;
        this.e = aVar2;
        hVar.a();
        final Context context2 = hVar.a;
        this.b = context2;
        xa.h hVar2 = new xa.h();
        this.i = p4Var;
        this.g = newSingleThreadExecutor;
        this.c = fVar2;
        this.d = new g(newSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        hVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(hVar2);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: xa.i
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
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
                        if (firebaseMessaging.e.r() && firebaseMessaging.g(firebaseMessaging.d())) {
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
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new s("Firebase-Messaging-Topics-Io"));
        int i12 = xa.s.j;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: xa.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                q qVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                p4 p4Var2 = p4Var;
                j2.f fVar3 = fVar2;
                synchronized (q.class) {
                    try {
                        WeakReference weakReference = q.d;
                        qVar = weakReference != null ? (q) weakReference.get() : null;
                        if (qVar == null) {
                            q qVar2 = new q(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor3);
                            qVar2.b();
                            q.d = new WeakReference(qVar2);
                            qVar = qVar2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new s(firebaseMessaging, p4Var2, qVar, fVar3, context3, scheduledThreadPoolExecutor3);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new wh.b(this, 3));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: xa.i
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
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
                        if (firebaseMessaging.e.r() && firebaseMessaging.g(firebaseMessaging.d())) {
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
                    n = new ScheduledThreadPoolExecutor(1, new s("TAG"));
                }
                n.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized w3 c(Context context) {
        w3 w3Var;
        synchronized (FirebaseMessaging.class) {
            try {
                if (l == null) {
                    l = new w3(context);
                }
                w3Var = l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return w3Var;
    }

    public static synchronized FirebaseMessaging getInstance(h hVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) hVar.b(FirebaseMessaging.class);
            l.h(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        o d = d();
        if (!g(d)) {
            return d.a;
        }
        String c10 = p4.c(this.a);
        g gVar = this.d;
        synchronized (gVar) {
            task = (Task) ((a0.f) gVar.b).get(c10);
            if (task == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + c10);
                }
                j2.f fVar = this.c;
                task = fVar.n(fVar.C(p4.c((h) fVar.a), "*", new Bundle())).onSuccessTask(this.h, new q5.a(this, c10, d, 11)).continueWithTask((Executor) gVar.a, new k0(26, gVar, c10));
                ((a0.f) gVar.b).put(c10, task);
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

    public final o d() {
        o b10;
        w3 c10 = c(this.b);
        h hVar = this.a;
        hVar.a();
        String d = "[DEFAULT]".equals(hVar.b) ? "" : hVar.d();
        String c11 = p4.c(this.a);
        synchronized (c10) {
            b10 = o.b(((SharedPreferences) c10.a).getString(d + "|T|" + c11 + "|*", null));
        }
        return b10;
    }

    public final synchronized void e(boolean z10) {
        this.j = z10;
    }

    public final synchronized void f(long j10) {
        b(new x9.l(this, Math.min(Math.max(30L, 2 * j10), k)), j10);
        this.j = true;
    }

    public final boolean g(o oVar) {
        if (oVar != null) {
            return System.currentTimeMillis() > oVar.c + o.d || !this.i.a().equals(oVar.b);
        }
        return true;
    }
}
