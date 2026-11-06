package com.google.firebase.messaging;

import a0.f;
import a3.h;
import a8.b1;
import a8.b8;
import a8.c1;
import a8.r7;
import ab.c0;
import ab.d0;
import ab.f0;
import ab.i0;
import ab.j0;
import ab.k;
import ab.l;
import ab.m;
import ab.n;
import ab.p;
import ab.q;
import ab.v;
import ab.x;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import f5.r;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m6.c;
import nb.a;
import o9.g;
import ua.b;
import va.d;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static d0 m;
    public static ScheduledThreadPoolExecutor o;
    public final g a;
    public final Context b;
    public final b8 c;
    public final r7 d;
    public final k e;
    public final q f;
    public final ScheduledThreadPoolExecutor g;
    public final ThreadPoolExecutor h;
    public final v i;
    public final d j;
    public boolean k;
    public static final long l = TimeUnit.HOURS.toSeconds(8);
    public static b n = new m(0);

    public FirebaseMessaging(g gVar, b bVar, b bVar2, d dVar, b bVar3, ra.b bVar4) {
        gVar.a();
        Context context = gVar.a;
        v vVar = new v();
        final int i7 = 0;
        vVar.b = 0;
        vVar.c = context;
        gVar.a();
        c cVar = new c(gVar.a);
        b8 b8Var = new b8();
        b8Var.a = gVar;
        b8Var.b = vVar;
        b8Var.c = cVar;
        b8Var.d = bVar;
        b8Var.e = bVar2;
        b8Var.f = dVar;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new r("Firebase-Messaging-Task"));
        final int i10 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new r("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new r("Firebase-Messaging-File-Io"));
        this.k = false;
        n = bVar3;
        this.a = gVar;
        q qVar = new q();
        qVar.d = this;
        qVar.b = bVar4;
        this.f = qVar;
        gVar.a();
        Context context2 = gVar.a;
        this.b = context2;
        l lVar = new l();
        this.i = vVar;
        this.c = b8Var;
        this.j = dVar;
        r7 r7Var = new r7(context2, gVar, dVar, b8Var, vVar);
        this.d = r7Var;
        this.e = new k(newSingleThreadExecutor);
        this.g = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        gVar.a();
        Context context3 = gVar.a;
        if (context3 instanceof Application) {
            ((Application) context3).registerActivityLifecycleCallbacks(lVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context3 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (r7Var.r()) {
            n nVar = new n(this);
            va.c cVar2 = (va.c) dVar;
            synchronized (cVar2) {
                cVar2.k.add(nVar);
            }
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: ab.o
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Task forException;
                int i11;
                switch (i7) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.b;
                        if (firebaseMessaging.f.s() && firebaseMessaging.j(firebaseMessaging.d())) {
                            firebaseMessaging.h();
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.b;
                        Context context4 = firebaseMessaging2.b;
                        x.g(context4);
                        b8 b8Var2 = firebaseMessaging2.c;
                        boolean g10 = firebaseMessaging2.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences a10 = c1.a(context4);
                            if (!a10.contains("proxy_retention") || a10.getBoolean("proxy_retention", false) != g10) {
                                m6.c cVar3 = (m6.c) b8Var2.c;
                                if (cVar3.c.i() >= 241100000) {
                                    Bundle k10 = a8.p0.k("proxy_retention", g10);
                                    m6.n i12 = m6.n.i(cVar3.b);
                                    synchronized (i12) {
                                        i11 = i12.a;
                                        i12.a = i11 + 1;
                                    }
                                    forException = i12.k(new m6.m(i11, 4, k10, 0));
                                } else {
                                    forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                forException.addOnSuccessListener(new d3.b(3), new y(0, context4, g10));
                            }
                        }
                        if (firebaseMessaging2.g()) {
                            firebaseMessaging2.e();
                            return;
                        }
                        return;
                }
            }
        });
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new r("Firebase-Messaging-Topics-Io"));
        int i11 = j0.i;
        Tasks.call(scheduledThreadPoolExecutor2, new i0(context2, scheduledThreadPoolExecutor2, vVar, gVar, this, dVar, 0)).addOnSuccessListener(scheduledThreadPoolExecutor, new p(this, i7));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: ab.o
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Task forException;
                int i112;
                switch (i10) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.b;
                        if (firebaseMessaging.f.s() && firebaseMessaging.j(firebaseMessaging.d())) {
                            firebaseMessaging.h();
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.b;
                        Context context4 = firebaseMessaging2.b;
                        x.g(context4);
                        b8 b8Var2 = firebaseMessaging2.c;
                        boolean g10 = firebaseMessaging2.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences a10 = c1.a(context4);
                            if (!a10.contains("proxy_retention") || a10.getBoolean("proxy_retention", false) != g10) {
                                m6.c cVar3 = (m6.c) b8Var2.c;
                                if (cVar3.c.i() >= 241100000) {
                                    Bundle k10 = a8.p0.k("proxy_retention", g10);
                                    m6.n i12 = m6.n.i(cVar3.b);
                                    synchronized (i12) {
                                        i112 = i12.a;
                                        i12.a = i112 + 1;
                                    }
                                    forException = i12.k(new m6.m(i112, 4, k10, 0));
                                } else {
                                    forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                forException.addOnSuccessListener(new d3.b(3), new y(0, context4, g10));
                            }
                        }
                        if (firebaseMessaging2.g()) {
                            firebaseMessaging2.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j3) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (o == null) {
                    o = new ScheduledThreadPoolExecutor(1, new r("TAG"));
                }
                o.schedule(runnable, j3, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized d0 c(Context context) {
        d0 d0Var;
        synchronized (FirebaseMessaging.class) {
            try {
                if (m == null) {
                    m = new d0(context);
                }
                d0Var = m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d0Var;
    }

    @Deprecated
    public static synchronized FirebaseMessaging getInstance(g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
            q6.m.h(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        c0 d = d();
        if (!j(d)) {
            return d.a;
        }
        String b10 = v.b(this.a);
        k kVar = this.e;
        synchronized (kVar) {
            task = (Task) ((f) kVar.b).get(b10);
            if (task == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + b10);
                }
                r7 r7Var = this.d;
                task = r7Var.C().continueWithTask(Executors.newSingleThreadExecutor(new r("Firebase-Messaging-Task")), new a1.c(r7Var, 3)).onSuccessTask(this.h, new h(this, b10, d, 1)).continueWithTask((Executor) kVar.a, new ab.g(1, kVar, b10));
                ((f) kVar.b).put(b10, task);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + b10);
            }
        }
        try {
            return (String) Tasks.await(task);
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException("FCM Registration failed!", e10);
        }
    }

    public final c0 d() {
        c0 b10;
        d0 c10 = c(this.b);
        g gVar = this.a;
        gVar.a();
        String d = "[DEFAULT]".equals(gVar.b) ? "" : gVar.d();
        String b11 = v.b(this.a);
        synchronized (c10) {
            b10 = c0.b(c10.a.getString(d + "|T|" + b11 + "|*", null));
        }
        return b10;
    }

    public final void e() {
        Task forException;
        int i7;
        c cVar = (c) this.c.c;
        if (cVar.c.i() >= 241100000) {
            m6.n i10 = m6.n.i(cVar.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (i10) {
                i7 = i10.a;
                i10.a = i7 + 1;
            }
            forException = i10.k(new m6.m(i7, 5, bundle, 1)).continueWith(m6.d.b, a.b);
        } else {
            forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        forException.addOnSuccessListener(this.g, new p(this, 1));
    }

    public final synchronized void f(boolean z9) {
        this.k = z9;
    }

    public final boolean g() {
        Context context = this.b;
        x.g(context);
        if (!x.h(context)) {
            return false;
        }
        if (this.a.b(p9.a.class) != null) {
            return true;
        }
        return b1.a() && n != null;
    }

    public final synchronized void h() {
        if (!this.k) {
            i(0L);
        }
    }

    public final synchronized void i(long j3) {
        b(new f0(this, Math.min(Math.max(30L, 2 * j3), l)), j3);
        this.k = true;
    }

    public final boolean j(c0 c0Var) {
        String str;
        if (c0Var != null) {
            String str2 = c0Var.a;
            String a10 = this.i.a();
            if (System.currentTimeMillis() <= c0Var.c + c0.d && a10.equals(c0Var.b)) {
                if (!this.d.r()) {
                    return str2.length() <= 22;
                }
                try {
                    str = (String) Tasks.await(((va.c) this.j).e());
                } catch (InterruptedException | ExecutionException unused) {
                    str = null;
                }
                return !str2.equalsIgnoreCase(str);
            }
        }
        return true;
    }
}
