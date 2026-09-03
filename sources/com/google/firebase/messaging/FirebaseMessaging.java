package com.google.firebase.messaging;

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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static final long k = TimeUnit.HOURS.toSeconds(8);
    public static ja.c l;
    public static v2.f m;
    public static ScheduledThreadPoolExecutor n;
    public final w8.g a;
    public final Context b;
    public final a9.a c;
    public final j d;
    public final cb.m e;
    public final ScheduledThreadPoolExecutor f;
    public final ExecutorService g;
    public final ThreadPoolExecutor h;
    public final n i;
    public boolean j;

    public FirebaseMessaging(w8.g gVar, ba.b bVar, ba.b bVar2, ca.d dVar, v2.f fVar, y9.b bVar3) {
        gVar.a();
        Context context = gVar.a;
        final n nVar = new n();
        final int i10 = 0;
        nVar.b = 0;
        nVar.c = context;
        gVar.a();
        x5.a aVar = new x5.a(gVar.a);
        final a9.a aVar2 = new a9.a();
        aVar2.a = gVar;
        aVar2.b = nVar;
        aVar2.c = aVar;
        aVar2.d = bVar;
        aVar2.e = bVar2;
        aVar2.f = dVar;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new i9.u("Firebase-Messaging-Task"));
        final int i11 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new i9.u("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new i9.u("Firebase-Messaging-File-Io"));
        this.j = false;
        m = fVar;
        this.a = gVar;
        cb.m mVar = new cb.m();
        mVar.d = this;
        mVar.b = bVar3;
        this.e = mVar;
        gVar.a();
        final Context context2 = gVar.a;
        this.b = context2;
        k kVar = new k();
        this.i = nVar;
        this.g = newSingleThreadExecutor;
        this.c = aVar2;
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
                boolean z4;
                Context applicationContext;
                PackageManager packageManager;
                ApplicationInfo applicationInfo;
                Bundle bundle;
                switch (i10) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.b;
                        if (firebaseMessaging.e.o() && firebaseMessaging.g(firebaseMessaging.d())) {
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
                            z4 = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                            if (Build.VERSION.SDK_INT >= 29) {
                                Tasks.forResult(null);
                                return;
                            }
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            p.a(context3, z4, taskCompletionSource);
                            taskCompletionSource.getTask();
                            return;
                        }
                        z4 = true;
                        if (Build.VERSION.SDK_INT >= 29) {
                        }
                        break;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new i9.u("Firebase-Messaging-Topics-Io"));
        int i12 = x.j;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.w
            @Override // java.util.concurrent.Callable
            public final Object call() {
                v vVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                n nVar2 = nVar;
                a9.a aVar3 = aVar2;
                synchronized (v.class) {
                    try {
                        WeakReference weakReference = v.d;
                        vVar = weakReference != null ? (v) weakReference.get() : null;
                        if (vVar == null) {
                            v vVar2 = new v(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor3);
                            vVar2.b();
                            v.d = new WeakReference(vVar2);
                            vVar = vVar2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new x(firebaseMessaging, nVar2, vVar, aVar3, context3, scheduledThreadPoolExecutor3);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new a1.c(this, 5));
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
                boolean z4;
                Context applicationContext;
                PackageManager packageManager;
                ApplicationInfo applicationInfo;
                Bundle bundle;
                switch (i11) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.b;
                        if (firebaseMessaging.e.o() && firebaseMessaging.g(firebaseMessaging.d())) {
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
                            z4 = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                            if (Build.VERSION.SDK_INT >= 29) {
                                Tasks.forResult(null);
                                return;
                            }
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            p.a(context3, z4, taskCompletionSource);
                            taskCompletionSource.getTask();
                            return;
                        }
                        z4 = true;
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
                    n = new ScheduledThreadPoolExecutor(1, new i9.u("TAG"));
                }
                n.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized ja.c c(Context context) {
        ja.c cVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (l == null) {
                    l = new ja.c(context);
                }
                cVar = l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public static synchronized FirebaseMessaging getInstance(w8.g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
            b6.m.i(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        s d = d();
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
                a9.a aVar = this.c;
                task = aVar.n(aVar.B(n.c((w8.g) aVar.a), "*", new Bundle())).onSuccessTask(this.h, new androidx.car.app.utils.a((Object) this, c3, (Object) d, 2)).continueWithTask((Executor) jVar.a, new c1.b(3, jVar, c3));
                ((a0.f) jVar.b).put(c3, task);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + c3);
            }
        }
        try {
            return (String) Tasks.await(task);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final s d() {
        s b10;
        ja.c c3 = c(this.b);
        w8.g gVar = this.a;
        gVar.a();
        String d = "[DEFAULT]".equals(gVar.b) ? "" : gVar.d();
        String c10 = n.c(this.a);
        synchronized (c3) {
            b10 = s.b(((SharedPreferences) c3.b).getString(d + "|T|" + c10 + "|*", null));
        }
        return b10;
    }

    public final synchronized void e(boolean z4) {
        this.j = z4;
    }

    public final synchronized void f(long j10) {
        b(new t(this, Math.min(Math.max(30L, 2 * j10), k)), j10);
        this.j = true;
    }

    public final boolean g(s sVar) {
        if (sVar != null) {
            return System.currentTimeMillis() > sVar.c + s.d || !this.i.a().equals(sVar.b);
        }
        return true;
    }
}
