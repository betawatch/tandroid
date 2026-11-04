package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import b4.n;
import b8.ke;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import e5.r;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l2.e;
import l6.c;
import l6.l;
import n9.h;
import nb.a;
import org.telegram.ui.ActionBar.h4;
import org.telegram.ui.Components.he0;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Wallet.i7;
import org.telegram.ui.na1;
import p6.m;
import t9.f;
import ta.b;
import ua.d;
import x7.a7;
import x7.b7;
import za.g;
import za.i;
import za.k;
import za.q;
import za.u;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static he0 m;
    public static ScheduledThreadPoolExecutor o;
    public final h a;
    public final Context b;
    public final e c;
    public final ke d;
    public final g e;
    public final n f;
    public final ScheduledThreadPoolExecutor g;
    public final ThreadPoolExecutor h;
    public final h4 i;
    public final ua.e j;
    public boolean k;
    public static final long l = TimeUnit.HOURS.toSeconds(8);
    public static b n = new f(6);

    public FirebaseMessaging(h hVar, b bVar, b bVar2, ua.e eVar, b bVar3, qa.b bVar4) {
        hVar.a();
        Context context = hVar.a;
        h4 h4Var = new h4();
        final int i3 = 0;
        h4Var.b = 0;
        h4Var.d = context;
        hVar.a();
        c cVar = new c(hVar.a);
        e eVar2 = new e();
        eVar2.a = hVar;
        eVar2.b = h4Var;
        eVar2.c = cVar;
        eVar2.d = bVar;
        eVar2.e = bVar2;
        eVar2.f = eVar;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new r("Firebase-Messaging-Task"));
        final int i10 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new r("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new r("Firebase-Messaging-File-Io"));
        this.k = false;
        n = bVar3;
        this.a = hVar;
        n nVar = new n();
        nVar.d = this;
        nVar.b = bVar4;
        this.f = nVar;
        hVar.a();
        Context context2 = hVar.a;
        this.b = context2;
        za.h hVar2 = new za.h();
        this.i = h4Var;
        this.c = eVar2;
        this.j = eVar;
        ke keVar = new ke(context2, hVar, eVar, eVar2, h4Var);
        this.d = keVar;
        this.e = new g(newSingleThreadExecutor);
        this.g = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        hVar.a();
        Context context3 = hVar.a;
        if (context3 instanceof Application) {
            ((Application) context3).registerActivityLifecycleCallbacks(hVar2);
        } else {
            Log.w("FirebaseMessaging", "Context " + context3 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (keVar.s()) {
            i iVar = new i(this);
            d dVar = (d) eVar;
            synchronized (dVar) {
                dVar.k.add(iVar);
            }
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: za.j
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Task forException;
                int i11;
                switch (i3) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.b;
                        if (firebaseMessaging.f.t() && firebaseMessaging.j(firebaseMessaging.d())) {
                            firebaseMessaging.h();
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.b;
                        Context context4 = firebaseMessaging2.b;
                        d2.d.g(context4);
                        l2.e eVar3 = firebaseMessaging2.c;
                        boolean g7 = firebaseMessaging2.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences a10 = b7.a(context4);
                            if (!a10.contains("proxy_retention") || a10.getBoolean("proxy_retention", false) != g7) {
                                l6.c cVar2 = (l6.c) eVar3.c;
                                if (cVar2.c.i() >= 241100000) {
                                    Bundle k10 = a1.g.k("proxy_retention", g7);
                                    l6.n i12 = l6.n.i(cVar2.b);
                                    synchronized (i12) {
                                        i11 = i12.a;
                                        i12.a = i11 + 1;
                                    }
                                    forException = i12.k(new l6.l(i11, 4, k10, 0));
                                } else {
                                    forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                forException.addOnSuccessListener(new c3.b(3), new ei.f(13, context4, g7));
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
        int i11 = u.i;
        Tasks.call(scheduledThreadPoolExecutor2, new i7(context2, scheduledThreadPoolExecutor2, h4Var, hVar, this, eVar, 1)).addOnSuccessListener(scheduledThreadPoolExecutor, new k(this, i3));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: za.j
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
                        if (firebaseMessaging.f.t() && firebaseMessaging.j(firebaseMessaging.d())) {
                            firebaseMessaging.h();
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.b;
                        Context context4 = firebaseMessaging2.b;
                        d2.d.g(context4);
                        l2.e eVar3 = firebaseMessaging2.c;
                        boolean g7 = firebaseMessaging2.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences a10 = b7.a(context4);
                            if (!a10.contains("proxy_retention") || a10.getBoolean("proxy_retention", false) != g7) {
                                l6.c cVar2 = (l6.c) eVar3.c;
                                if (cVar2.c.i() >= 241100000) {
                                    Bundle k10 = a1.g.k("proxy_retention", g7);
                                    l6.n i12 = l6.n.i(cVar2.b);
                                    synchronized (i12) {
                                        i112 = i12.a;
                                        i12.a = i112 + 1;
                                    }
                                    forException = i12.k(new l6.l(i112, 4, k10, 0));
                                } else {
                                    forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                forException.addOnSuccessListener(new c3.b(3), new ei.f(13, context4, g7));
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

    public static void b(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (o == null) {
                    o = new ScheduledThreadPoolExecutor(1, new r("TAG"));
                }
                o.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized he0 c(Context context) {
        he0 he0Var;
        synchronized (FirebaseMessaging.class) {
            try {
                if (m == null) {
                    m = new he0(context);
                }
                he0Var = m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return he0Var;
    }

    @Deprecated
    public static synchronized FirebaseMessaging getInstance(h hVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) hVar.b(FirebaseMessaging.class);
            m.h(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        q d = d();
        if (!j(d)) {
            return d.a;
        }
        String b10 = h4.b(this.a);
        g gVar = this.e;
        synchronized (gVar) {
            task = (Task) ((a0.f) gVar.b).get(b10);
            if (task == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + b10);
                }
                ke keVar = this.d;
                task = keVar.G().continueWithTask(Executors.newSingleThreadExecutor(new r("Firebase-Messaging-Task")), new xg.c(keVar, 7)).onSuccessTask(this.h, new hr(this, b10, d, 15)).continueWithTask((Executor) gVar.a, new na1(29, gVar, b10));
                ((a0.f) gVar.b).put(b10, task);
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

    public final q d() {
        q b10;
        he0 c2 = c(this.b);
        h hVar = this.a;
        hVar.a();
        String d = "[DEFAULT]".equals(hVar.b) ? "" : hVar.d();
        String b11 = h4.b(this.a);
        synchronized (c2) {
            b10 = q.b(c2.a.getString(d + "|T|" + b11 + "|*", null));
        }
        return b10;
    }

    public final void e() {
        Task forException;
        int i3;
        c cVar = (c) this.c.c;
        if (cVar.c.i() >= 241100000) {
            l6.n i10 = l6.n.i(cVar.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (i10) {
                i3 = i10.a;
                i10.a = i3 + 1;
            }
            forException = i10.k(new l(i3, 5, bundle, 1)).continueWith(l6.d.b, a.b);
        } else {
            forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        forException.addOnSuccessListener(this.g, new k(this, 1));
    }

    public final synchronized void f(boolean z10) {
        this.k = z10;
    }

    public final boolean g() {
        Context context = this.b;
        d2.d.g(context);
        if (!d2.d.h(context)) {
            return false;
        }
        if (this.a.b(o9.a.class) != null) {
            return true;
        }
        return a7.a() && n != null;
    }

    public final synchronized void h() {
        if (!this.k) {
            i(0L);
        }
    }

    public final synchronized void i(long j10) {
        b(new za.r(this, Math.min(Math.max(30L, 2 * j10), l)), j10);
        this.k = true;
    }

    public final boolean j(q qVar) {
        String str;
        if (qVar != null) {
            String str2 = qVar.a;
            String a10 = this.i.a();
            if (System.currentTimeMillis() <= qVar.c + q.d && a10.equals(qVar.b)) {
                if (!this.d.s()) {
                    return str2.length() <= 22;
                }
                try {
                    str = (String) Tasks.await(((d) this.j).e());
                } catch (InterruptedException | ExecutionException unused) {
                    str = null;
                }
                return !str2.equalsIgnoreCase(str);
            }
        }
        return true;
    }
}
