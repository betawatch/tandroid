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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static qj4 l;
    public static mt8 m = new cq2((byte) 5);
    public static ScheduledThreadPoolExecutor n;
    public final jg4 a;
    public final Context b;
    public final ep c;
    public final gl2 d;
    public final sk4 e;
    public final xf4 f;
    public final ScheduledThreadPoolExecutor g;
    public final ThreadPoolExecutor h;
    public final kd7 i;
    public final rg4 j;
    public boolean k;

    public FirebaseMessaging(jg4 jg4Var, mt8 mt8Var, mt8 mt8Var2, rg4 rg4Var, mt8 mt8Var3, hab habVar) {
        jg4Var.a();
        Context context = jg4Var.a;
        kd7 kd7Var = new kd7();
        final byte b = 0;
        kd7Var.a = (byte) 0;
        kd7Var.d = context;
        jg4Var.a();
        fm9 fm9Var = new fm9(jg4Var.a);
        ep epVar = new ep();
        epVar.a = jg4Var;
        epVar.b = kd7Var;
        epVar.c = fm9Var;
        epVar.d = mt8Var;
        epVar.e = mt8Var2;
        epVar.f = rg4Var;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new kn7("Firebase-Messaging-Task"));
        final byte b2 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new kn7("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new kn7("Firebase-Messaging-File-Io"));
        this.k = false;
        m = mt8Var3;
        this.a = jg4Var;
        xf4 xf4Var = new xf4();
        xf4Var.d = this;
        xf4Var.b = habVar;
        this.f = xf4Var;
        jg4Var.a();
        Context context2 = jg4Var.a;
        this.b = context2;
        e84 e84Var = new e84();
        this.i = kd7Var;
        this.c = epVar;
        this.j = rg4Var;
        gl2 gl2Var = new gl2(context2, jg4Var, rg4Var, epVar, kd7Var);
        this.d = gl2Var;
        this.e = new sk4(newSingleThreadExecutor);
        this.g = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        jg4Var.a();
        Context context3 = jg4Var.a;
        if (context3 instanceof Application) {
            ((Application) context3).registerActivityLifecycleCallbacks(e84Var);
        } else {
            Log.w("FirebaseMessaging", "Context " + context3 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (gl2Var.w()) {
            ug4 ug4Var = new ug4(this);
            qg4 qg4Var = (qg4) rg4Var;
            synchronized (qg4Var) {
                qg4Var.j.add(ug4Var);
            }
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: vg4
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
                        rr.j(context4);
                        ep epVar2 = firebaseMessaging.c;
                        boolean g = firebaseMessaging.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences a = sre.a(context4);
                            if (!a.contains("proxy_retention") || a.getBoolean("proxy_retention", false) != g) {
                                fm9 fm9Var2 = (fm9) epVar2.c;
                                if (fm9Var2.c.b() >= 241100000) {
                                    Bundle l2 = ir2.l("proxy_retention", g);
                                    igf t = igf.t(fm9Var2.b);
                                    synchronized (t) {
                                        i = t.a;
                                        t.a = i + 1;
                                    }
                                    forException = t.u(new ebf(i, 4, l2, (byte) 0));
                                } else {
                                    forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                forException.addOnSuccessListener(new hc((byte) 1), new l41((byte) 12, context4, g));
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
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new kn7("Firebase-Messaging-Topics-Io"));
        Tasks.call(scheduledThreadPoolExecutor2, new nwb(context2, scheduledThreadPoolExecutor2, kd7Var, jg4Var, this, rg4Var, (byte) 0)).addOnSuccessListener(scheduledThreadPoolExecutor, new wg4(this, b));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: vg4
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
                        rr.j(context4);
                        ep epVar2 = firebaseMessaging.c;
                        boolean g = firebaseMessaging.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences a = sre.a(context4);
                            if (!a.contains("proxy_retention") || a.getBoolean("proxy_retention", false) != g) {
                                fm9 fm9Var2 = (fm9) epVar2.c;
                                if (fm9Var2.c.b() >= 241100000) {
                                    Bundle l2 = ir2.l("proxy_retention", g);
                                    igf t = igf.t(fm9Var2.b);
                                    synchronized (t) {
                                        i = t.a;
                                        t.a = i + 1;
                                    }
                                    forException = t.u(new ebf(i, 4, l2, (byte) 0));
                                } else {
                                    forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                forException.addOnSuccessListener(new hc((byte) 1), new l41((byte) 12, context4, g));
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
                scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new kn7("TAG"));
                n = scheduledThreadPoolExecutor;
            }
            scheduledThreadPoolExecutor.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public static synchronized qj4 c(Context context) {
        qj4 qj4Var;
        synchronized (FirebaseMessaging.class) {
            qj4Var = l;
            if (qj4Var == null) {
                qj4Var = new qj4(context);
                l = qj4Var;
            }
        }
        return qj4Var;
    }

    @Deprecated
    public static synchronized FirebaseMessaging getInstance(jg4 jg4Var) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) jg4Var.b(FirebaseMessaging.class);
            fre.i(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        m20 d = d();
        if (!j(d)) {
            return (String) d.b;
        }
        String b = kd7.b(this.a);
        sk4 sk4Var = this.e;
        synchronized (sk4Var) {
            task = (Task) ((ps) sk4Var.c).get(b);
            if (task == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + b);
                }
                gl2 gl2Var = this.d;
                task = gl2Var.M().continueWithTask(Executors.newSingleThreadExecutor(new kn7("Firebase-Messaging-Task")), new kx3(gl2Var, (byte) 28)).onSuccessTask(this.h, new lt2((Object) this, (Object) b, (Object) d, (byte) 12)).continueWithTask((ExecutorService) sk4Var.b, new kq8(sk4Var, b, (byte) 5));
                ((ps) sk4Var.c).put(b, task);
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

    public final m20 d() {
        m20 c;
        qj4 c2 = c(this.b);
        jg4 jg4Var = this.a;
        jg4Var.a();
        String d = "[DEFAULT]".equals(jg4Var.b) ? "" : jg4Var.d();
        String b = kd7.b(this.a);
        synchronized (c2) {
            c = m20.c(c2.a.getString(d + "|T|" + b + "|*", null));
        }
        return c;
    }

    public final void e() {
        Task forException;
        int i;
        fm9 fm9Var = (fm9) this.c.c;
        byte b = 1;
        if (fm9Var.c.b() >= 241100000) {
            igf t = igf.t(fm9Var.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (t) {
                i = t.a;
                t.a = i + 1;
            }
            forException = t.u(new ebf(i, 5, bundle, (byte) 1)).continueWith(wn3.d, y5d.a);
        } else {
            forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        forException.addOnSuccessListener(this.g, new wg4(this, b));
    }

    public final synchronized void f(boolean z) {
        this.k = z;
    }

    public final boolean g() {
        Context context = this.b;
        rr.j(context);
        if (!rr.k(context)) {
            return false;
        }
        if (this.a.b(qj.class) == null) {
            return xoe.a() && m != null;
        }
        return true;
    }

    public final synchronized void h() {
        if (!this.k) {
            i(0L);
        }
    }

    public final synchronized void i(long j) {
        b(new vcb(this, Math.min(Math.max(30L, j << 1), 28800L)), j);
        this.k = true;
    }

    public final boolean j(m20 m20Var) {
        String str;
        if (m20Var != null) {
            String str2 = (String) m20Var.b;
            String a = this.i.a();
            if (System.currentTimeMillis() <= m20Var.a + 604800000 && a.equals((String) m20Var.c)) {
                if (!this.d.w()) {
                    return str2.length() <= 22;
                }
                try {
                    str = (String) Tasks.await(((qg4) this.j).e());
                } catch (InterruptedException | ExecutionException unused) {
                    str = null;
                }
                return !str2.equalsIgnoreCase(str);
            }
        }
        return true;
    }
}
