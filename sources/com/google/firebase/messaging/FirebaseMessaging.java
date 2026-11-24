package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static cf9 l;
    public static nv8 m = new nr2((byte) 5);
    public static ScheduledThreadPoolExecutor n;
    public final li4 a;
    public final Context b;
    public final eq c;
    public final sm2 d;
    public final mj4 e;
    public final yh4 f;
    public final ScheduledThreadPoolExecutor g;
    public final ThreadPoolExecutor h;
    public final mf7 i;
    public final ti4 j;
    public boolean k;

    public FirebaseMessaging(li4 li4Var, nv8 nv8Var, nv8 nv8Var2, ti4 ti4Var, nv8 nv8Var3, jcb jcbVar) {
        li4Var.a();
        Context context = li4Var.a;
        mf7 mf7Var = new mf7();
        final byte b = 0;
        mf7Var.a = (byte) 0;
        mf7Var.d = context;
        li4Var.a();
        fo9 fo9Var = new fo9(li4Var.a);
        eq eqVar = new eq();
        eqVar.a = li4Var;
        eqVar.b = mf7Var;
        eqVar.c = fo9Var;
        eqVar.d = nv8Var;
        eqVar.e = nv8Var2;
        eqVar.f = ti4Var;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new op7("Firebase-Messaging-Task"));
        final byte b2 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new op7("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new op7("Firebase-Messaging-File-Io"));
        this.k = false;
        m = nv8Var3;
        this.a = li4Var;
        yh4 yh4Var = new yh4();
        yh4Var.d = this;
        yh4Var.b = jcbVar;
        this.f = yh4Var;
        li4Var.a();
        Context context2 = li4Var.a;
        this.b = context2;
        n94 n94Var = new n94();
        this.i = mf7Var;
        this.c = eqVar;
        this.j = ti4Var;
        sm2 sm2Var = new sm2(context2, li4Var, ti4Var, eqVar, mf7Var);
        this.d = sm2Var;
        this.e = new mj4(newSingleThreadExecutor);
        this.g = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        li4Var.a();
        Context context3 = li4Var.a;
        if (context3 instanceof Application) {
            ((Application) context3).registerActivityLifecycleCallbacks(n94Var);
        } else {
            Log.w("FirebaseMessaging", "Context " + context3 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (sm2Var.z()) {
            wi4 wi4Var = new wi4(this);
            si4 si4Var = (si4) ti4Var;
            synchronized (si4Var) {
                si4Var.j.add(wi4Var);
            }
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: xi4
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Task forException;
                int i;
                byte b3 = b;
                FirebaseMessaging firebaseMessaging = this.b;
                switch (b3) {
                    case 0:
                        if (firebaseMessaging.f.z() && firebaseMessaging.j(firebaseMessaging.d())) {
                            firebaseMessaging.h();
                            return;
                        }
                        return;
                    default:
                        Context context4 = firebaseMessaging.b;
                        rs.j(context4);
                        eq eqVar2 = firebaseMessaging.c;
                        boolean g = firebaseMessaging.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences a = vte.a(context4);
                            if (!a.contains("proxy_retention") || a.getBoolean("proxy_retention", false) != g) {
                                fo9 fo9Var2 = (fo9) eqVar2.c;
                                if (fo9Var2.c.b() >= 241100000) {
                                    Bundle l2 = ts2.l("proxy_retention", g);
                                    jif t = jif.t(fo9Var2.b);
                                    synchronized (t) {
                                        i = t.a;
                                        t.a = i + 1;
                                    }
                                    forException = t.u(new fdf(i, 4, l2, (byte) 0));
                                } else {
                                    forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                forException.addOnSuccessListener(new kc((byte) 1), new s51((byte) 12, context4, g));
                            }
                        }
                        if (firebaseMessaging.g()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new op7("Firebase-Messaging-Topics-Io"));
        Tasks.call(scheduledThreadPoolExecutor2, new qyb(context2, scheduledThreadPoolExecutor2, mf7Var, li4Var, this, ti4Var, (byte) 0)).addOnSuccessListener(scheduledThreadPoolExecutor, new yi4(this, b));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: xi4
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Task forException;
                int i;
                byte b3 = b2;
                FirebaseMessaging firebaseMessaging = this.b;
                switch (b3) {
                    case 0:
                        if (firebaseMessaging.f.z() && firebaseMessaging.j(firebaseMessaging.d())) {
                            firebaseMessaging.h();
                            return;
                        }
                        return;
                    default:
                        Context context4 = firebaseMessaging.b;
                        rs.j(context4);
                        eq eqVar2 = firebaseMessaging.c;
                        boolean g = firebaseMessaging.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences a = vte.a(context4);
                            if (!a.contains("proxy_retention") || a.getBoolean("proxy_retention", false) != g) {
                                fo9 fo9Var2 = (fo9) eqVar2.c;
                                if (fo9Var2.c.b() >= 241100000) {
                                    Bundle l2 = ts2.l("proxy_retention", g);
                                    jif t = jif.t(fo9Var2.b);
                                    synchronized (t) {
                                        i = t.a;
                                        t.a = i + 1;
                                    }
                                    forException = t.u(new fdf(i, 4, l2, (byte) 0));
                                } else {
                                    forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                forException.addOnSuccessListener(new kc((byte) 1), new s51((byte) 12, context4, g));
                            }
                        }
                        if (firebaseMessaging.g()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = n;
            if (scheduledThreadPoolExecutor == null) {
                scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new op7("TAG"));
                n = scheduledThreadPoolExecutor;
            }
            scheduledThreadPoolExecutor.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public static synchronized cf9 c(Context context) {
        cf9 cf9Var;
        synchronized (FirebaseMessaging.class) {
            cf9Var = l;
            if (cf9Var == null) {
                cf9Var = new cf9(context);
                l = cf9Var;
            }
        }
        return cf9Var;
    }

    @Deprecated
    public static synchronized FirebaseMessaging getInstance(li4 li4Var) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) li4Var.b(FirebaseMessaging.class);
            ite.i(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        m30 d = d();
        if (!j(d)) {
            return (String) d.b;
        }
        String b = mf7.b(this.a);
        mj4 mj4Var = this.e;
        synchronized (mj4Var) {
            task = (Task) ((qt) mj4Var.c).get(b);
            if (task == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + b);
                }
                sm2 sm2Var = this.d;
                task = sm2Var.L().continueWithTask(Executors.newSingleThreadExecutor(new op7("Firebase-Messaging-Task")), new wx4((Object) sm2Var, (byte) 1)).onSuccessTask(this.h, new wu2((Object) this, (Object) b, (Object) d, (byte) 12)).continueWithTask((ExecutorService) mj4Var.b, new xr8(mj4Var, b, (byte) 6));
                ((qt) mj4Var.c).put(b, task);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + b);
            }
        }
        try {
            return (String) Tasks.await(task);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException("FCM Registration failed!", e);
        }
    }

    public final m30 d() {
        m30 c;
        cf9 c2 = c(this.b);
        li4 li4Var = this.a;
        li4Var.a();
        String d = "[DEFAULT]".equals(li4Var.b) ? "" : li4Var.d();
        String b = mf7.b(this.a);
        synchronized (c2) {
            c = m30.c(((SharedPreferences) c2.b).getString(d + "|T|" + b + "|*", null));
        }
        return c;
    }

    public final void e() {
        Task forException;
        int i;
        fo9 fo9Var = (fo9) this.c.c;
        byte b = 1;
        if (fo9Var.c.b() >= 241100000) {
            jif t = jif.t(fo9Var.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (t) {
                i = t.a;
                t.a = i + 1;
            }
            forException = t.u(new fdf(i, 5, bundle, (byte) 1)).continueWith(gp3.d, a8d.a);
        } else {
            forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        forException.addOnSuccessListener(this.g, new yi4(this, b));
    }

    public final synchronized void f(boolean z) {
        this.k = z;
    }

    public final boolean g() {
        Context context = this.b;
        rs.j(context);
        if (!rs.k(context)) {
            return false;
        }
        if (this.a.b(qk.class) == null) {
            return are.a() && m != null;
        }
        return true;
    }

    public final synchronized void h() {
        if (!this.k) {
            i(0L);
        }
    }

    public final synchronized void i(long j) {
        b(new ps0(this, Math.min(Math.max(30L, j << 1), 28800L)), j);
        this.k = true;
    }

    public final boolean j(m30 m30Var) {
        String str;
        if (m30Var != null) {
            String str2 = (String) m30Var.b;
            String a = this.i.a();
            if (System.currentTimeMillis() <= m30Var.a + 604800000 && a.equals((String) m30Var.c)) {
                if (!this.d.z()) {
                    return str2.length() <= 22;
                }
                try {
                    str = (String) Tasks.await(((si4) this.j).e());
                } catch (InterruptedException | ExecutionException unused) {
                    str = null;
                }
                return !str2.equalsIgnoreCase(str);
            }
        }
        return true;
    }
}
