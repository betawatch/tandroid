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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static i09 l;
    public static vw8 m = new vq2((byte) 5);
    public static ScheduledThreadPoolExecutor n;
    public final ji4 a;
    public final Context b;
    public final fp c;
    public final am2 d;
    public final ym4 e;
    public final vh4 f;
    public final ScheduledThreadPoolExecutor g;
    public final ThreadPoolExecutor h;
    public final tf7 i;
    public final ri4 j;
    public boolean k;

    public FirebaseMessaging(ji4 ji4Var, vw8 vw8Var, vw8 vw8Var2, ri4 ri4Var, vw8 vw8Var3, feb febVar) {
        ji4Var.a();
        Context context = ji4Var.a;
        tf7 tf7Var = new tf7();
        final byte b = 0;
        tf7Var.a = (byte) 0;
        tf7Var.d = context;
        ji4Var.a();
        up9 up9Var = new up9(ji4Var.a);
        fp fpVar = new fp();
        fpVar.a = ji4Var;
        fpVar.b = tf7Var;
        fpVar.c = up9Var;
        fpVar.d = vw8Var;
        fpVar.e = vw8Var2;
        fpVar.f = ri4Var;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new kq7("Firebase-Messaging-Task"));
        final byte b2 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new kq7("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new kq7("Firebase-Messaging-File-Io"));
        this.k = false;
        m = vw8Var3;
        this.a = ji4Var;
        vh4 vh4Var = new vh4();
        vh4Var.d = this;
        vh4Var.b = febVar;
        this.f = vh4Var;
        ji4Var.a();
        Context context2 = ji4Var.a;
        this.b = context2;
        z84 z84Var = new z84();
        this.i = tf7Var;
        this.c = fpVar;
        this.j = ri4Var;
        am2 am2Var = new am2(context2, ji4Var, ri4Var, fpVar, tf7Var);
        this.d = am2Var;
        this.e = new ym4(newSingleThreadExecutor);
        this.g = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        ji4Var.a();
        Context context3 = ji4Var.a;
        if (context3 instanceof Application) {
            ((Application) context3).registerActivityLifecycleCallbacks(z84Var);
        } else {
            Log.w("FirebaseMessaging", "Context " + context3 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (am2Var.A()) {
            ui4 ui4Var = new ui4(this);
            qi4 qi4Var = (qi4) ri4Var;
            synchronized (qi4Var) {
                qi4Var.j.add(ui4Var);
            }
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: vi4
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
                        if (firebaseMessaging.f.x() && firebaseMessaging.j(firebaseMessaging.d())) {
                            firebaseMessaging.h();
                            return;
                        }
                        return;
                    default:
                        Context context4 = firebaseMessaging.b;
                        sr.j(context4);
                        fp fpVar2 = firebaseMessaging.c;
                        boolean g = firebaseMessaging.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences a = kwe.a(context4);
                            if (!a.contains("proxy_retention") || a.getBoolean("proxy_retention", false) != g) {
                                up9 up9Var2 = (up9) fpVar2.c;
                                if (up9Var2.c.b() >= 241100000) {
                                    Bundle l2 = bs2.l("proxy_retention", g);
                                    ykf t = ykf.t(up9Var2.b);
                                    synchronized (t) {
                                        i = t.a;
                                        t.a = i + 1;
                                    }
                                    forException = t.u(new uff(i, 4, l2, (byte) 0));
                                } else {
                                    forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                forException.addOnSuccessListener(new ic((byte) 1), new t41((byte) 12, context4, g));
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
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new kq7("Firebase-Messaging-Topics-Io"));
        Tasks.call(scheduledThreadPoolExecutor2, new p0c(context2, scheduledThreadPoolExecutor2, tf7Var, ji4Var, this, ri4Var, (byte) 0)).addOnSuccessListener(scheduledThreadPoolExecutor, new wi4(this, b));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: vi4
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
                        if (firebaseMessaging.f.x() && firebaseMessaging.j(firebaseMessaging.d())) {
                            firebaseMessaging.h();
                            return;
                        }
                        return;
                    default:
                        Context context4 = firebaseMessaging.b;
                        sr.j(context4);
                        fp fpVar2 = firebaseMessaging.c;
                        boolean g = firebaseMessaging.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences a = kwe.a(context4);
                            if (!a.contains("proxy_retention") || a.getBoolean("proxy_retention", false) != g) {
                                up9 up9Var2 = (up9) fpVar2.c;
                                if (up9Var2.c.b() >= 241100000) {
                                    Bundle l2 = bs2.l("proxy_retention", g);
                                    ykf t = ykf.t(up9Var2.b);
                                    synchronized (t) {
                                        i = t.a;
                                        t.a = i + 1;
                                    }
                                    forException = t.u(new uff(i, 4, l2, (byte) 0));
                                } else {
                                    forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                forException.addOnSuccessListener(new ic((byte) 1), new t41((byte) 12, context4, g));
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
                scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new kq7("TAG"));
                n = scheduledThreadPoolExecutor;
            }
            scheduledThreadPoolExecutor.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public static synchronized i09 c(Context context) {
        i09 i09Var;
        synchronized (FirebaseMessaging.class) {
            i09Var = l;
            if (i09Var == null) {
                i09Var = new i09(context);
                l = i09Var;
            }
        }
        return i09Var;
    }

    @Deprecated
    public static synchronized FirebaseMessaging getInstance(ji4 ji4Var) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) ji4Var.b(FirebaseMessaging.class);
            xve.i(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        n20 d = d();
        if (!j(d)) {
            return (String) d.b;
        }
        String b = tf7.b(this.a);
        ym4 ym4Var = this.e;
        synchronized (ym4Var) {
            task = (Task) ((qs) ym4Var.c).get(b);
            if (task == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + b);
                }
                am2 am2Var = this.d;
                task = am2Var.L().continueWithTask(Executors.newSingleThreadExecutor(new kq7("Firebase-Messaging-Task")), new e05((Object) am2Var, (byte) 0)).onSuccessTask(this.h, new fu2((Object) this, (Object) b, (Object) d, (byte) 12)).continueWithTask((ExecutorService) ym4Var.b, new m88((Object) ym4Var, (Object) b, (byte) 20));
                ((qs) ym4Var.c).put(b, task);
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

    public final n20 d() {
        n20 c;
        i09 c2 = c(this.b);
        ji4 ji4Var = this.a;
        ji4Var.a();
        String d = "[DEFAULT]".equals(ji4Var.b) ? "" : ji4Var.d();
        String b = tf7.b(this.a);
        synchronized (c2) {
            c = n20.c(((SharedPreferences) c2.b).getString(d + "|T|" + b + "|*", null));
        }
        return c;
    }

    public final void e() {
        Task forException;
        int i;
        up9 up9Var = (up9) this.c.c;
        byte b = 1;
        if (up9Var.c.b() >= 241100000) {
            ykf t = ykf.t(up9Var.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (t) {
                i = t.a;
                t.a = i + 1;
            }
            forException = t.u(new uff(i, 5, bundle, (byte) 1)).continueWith(no3.d, rad.a);
        } else {
            forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        forException.addOnSuccessListener(this.g, new wi4(this, b));
    }

    public final synchronized void f(boolean z) {
        this.k = z;
    }

    public final boolean g() {
        Context context = this.b;
        sr.j(context);
        if (!sr.k(context)) {
            return false;
        }
        if (this.a.b(rj.class) == null) {
            return rte.a() && m != null;
        }
        return true;
    }

    public final synchronized void h() {
        if (!this.k) {
            i(0L);
        }
    }

    public final synchronized void i(long j) {
        b(new pr0(this, Math.min(Math.max(30L, j << 1), 28800L)), j);
        this.k = true;
    }

    public final boolean j(n20 n20Var) {
        String str;
        if (n20Var != null) {
            String str2 = (String) n20Var.b;
            String a = this.i.a();
            if (System.currentTimeMillis() <= n20Var.a + 604800000 && a.equals((String) n20Var.c)) {
                if (!this.d.A()) {
                    return str2.length() <= 22;
                }
                try {
                    str = (String) Tasks.await(((qi4) this.j).e());
                } catch (InterruptedException | ExecutionException unused) {
                    str = null;
                }
                return !str2.equalsIgnoreCase(str);
            }
        }
        return true;
    }
}
