package com.google.android.gms.common.api.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h implements Handler.Callback {
    public static final Status A = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status B = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object C = new Object();
    public static h D;
    public long a;
    public boolean b;
    public x5.o c;
    public z5.b d;
    public final Context e;
    public final u5.d f;
    public final w4.e h;
    public final AtomicInteger n;
    public final AtomicInteger r;
    public final ConcurrentHashMap s;
    public final a0.g v;
    public final a0.g w;
    public final c2.u0 x;
    public volatile boolean y;

    public h(Context context, Looper looper) {
        u5.d dVar = u5.d.d;
        this.a = 10000L;
        this.b = false;
        this.n = new AtomicInteger(1);
        this.r = new AtomicInteger(0);
        this.s = new ConcurrentHashMap(5, 0.75f, 1);
        this.v = new a0.g(0);
        this.w = new a0.g(0);
        this.y = true;
        this.e = context;
        c2.u0 u0Var = new c2.u0(looper, this);
        this.x = u0Var;
        this.f = dVar;
        this.h = new w4.e((u5.e) dVar);
        PackageManager packageManager = context.getPackageManager();
        if (e6.b.e == null) {
            e6.b.e = Boolean.valueOf(e6.b.d() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (e6.b.e.booleanValue()) {
            this.y = false;
        }
        u0Var.sendMessage(u0Var.obtainMessage(6));
    }

    public static void a() {
        synchronized (C) {
            try {
                h hVar = D;
                if (hVar != null) {
                    hVar.r.incrementAndGet();
                    c2.u0 u0Var = hVar.x;
                    u0Var.sendMessageAtFrontOfQueue(u0Var.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Status d(b bVar, u5.a aVar) {
        return new Status(17, j3.r0.o("API: ", bVar.b.c, " is not available on this device. Connection failed with: ", String.valueOf(aVar)), aVar.c, aVar);
    }

    public static h g(Context context) {
        h hVar;
        synchronized (C) {
            try {
                if (D == null) {
                    Looper looper = x5.j0.a().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = u5.d.c;
                    D = new h(applicationContext, looper);
                }
                hVar = D;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public final boolean b() {
        if (this.b) {
            return false;
        }
        x5.n nVar = (x5.n) x5.m.a().a;
        if (nVar != null && !nVar.b) {
            return false;
        }
        int i9 = ((SparseIntArray) this.h.b).get(203400000, -1);
        return i9 == -1 || i9 == 0;
    }

    public final boolean c(u5.a aVar, int i9) {
        PendingIntent pendingIntent;
        u5.d dVar = this.f;
        dVar.getClass();
        Context context = this.e;
        if (!g6.a.e(context)) {
            boolean b10 = aVar.b();
            int i10 = aVar.b;
            if (b10) {
                pendingIntent = aVar.c;
            } else {
                pendingIntent = null;
                Intent b11 = dVar.b(context, null, i10);
                if (b11 != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, b11, Build.VERSION.SDK_INT >= 23 ? 201326592 : TLObject.FLAG_27);
                }
            }
            if (pendingIntent != null) {
                int i11 = GoogleApiActivity.b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i9);
                intent.putExtra("notify_manager", true);
                dVar.h(context, i10, PendingIntent.getActivity(context, 0, intent, u6.d.a | TLObject.FLAG_27));
                return true;
            }
        }
        return false;
    }

    public final p0 e(com.google.android.gms.common.api.j jVar) {
        b bVar = jVar.e;
        ConcurrentHashMap concurrentHashMap = this.s;
        p0 p0Var = (p0) concurrentHashMap.get(bVar);
        if (p0Var == null) {
            p0Var = new p0(this, jVar);
            concurrentHashMap.put(bVar, p0Var);
        }
        if (p0Var.b.p()) {
            this.w.add(bVar);
        }
        p0Var.k();
        return p0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(TaskCompletionSource taskCompletionSource, int i9, com.google.android.gms.common.api.j jVar) {
        y0 y0Var;
        h hVar;
        if (i9 == 0) {
            return;
        }
        b bVar = jVar.e;
        if (b()) {
            x5.n nVar = (x5.n) x5.m.a().a;
            boolean z10 = true;
            if (nVar != null) {
                if (nVar.b) {
                    boolean z11 = nVar.c;
                    p0 p0Var = (p0) this.s.get(bVar);
                    if (p0Var != null) {
                        com.google.android.gms.common.api.c cVar = p0Var.b;
                        if (cVar instanceof x5.g) {
                            x5.g gVar = (x5.g) cVar;
                            if (gVar.M != null && !gVar.f()) {
                                x5.e a2 = y0.a(p0Var, gVar, i9);
                                if (a2 != null) {
                                    p0Var.n++;
                                    z10 = a2.c;
                                }
                            }
                        }
                    }
                    z10 = z11;
                }
            }
            hVar = this;
            y0Var = new y0(hVar, i9, bVar, z10 ? System.currentTimeMillis() : 0L, z10 ? SystemClock.elapsedRealtime() : 0L);
            if (y0Var == null) {
                Task task = taskCompletionSource.getTask();
                c2.u0 u0Var = hVar.x;
                u0Var.getClass();
                task.addOnCompleteListener(new androidx.biometric.o(u0Var, 2), y0Var);
                return;
            }
            return;
        }
        y0Var = null;
        hVar = this;
        if (y0Var == null) {
        }
    }

    public final void h(u5.a aVar, int i9) {
        if (c(aVar, i9)) {
            return;
        }
        c2.u0 u0Var = this.x;
        u0Var.sendMessage(u0Var.obtainMessage(5, i9, 0, aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x02e6  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        p0 p0Var;
        boolean z10;
        u5.c[] g10;
        int i9 = message.what;
        com.google.android.gms.common.api.e eVar = z5.b.k;
        x5.p pVar = x5.p.b;
        Context context = this.e;
        c2.u0 u0Var = this.x;
        ConcurrentHashMap concurrentHashMap = this.s;
        switch (i9) {
            case 1:
                this.a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                u0Var.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    u0Var.sendMessageDelayed(u0Var.obtainMessage(12, (b) it.next()), this.a);
                }
                return true;
            case 2:
                throw aa.d.j(message.obj);
            case 3:
                for (p0 p0Var2 : concurrentHashMap.values()) {
                    x5.l.d(p0Var2.o.x);
                    p0Var2.m = null;
                    p0Var2.k();
                }
                return true;
            case 4:
            case 8:
            case 13:
                a1 a1Var = (a1) message.obj;
                com.google.android.gms.common.api.j jVar = a1Var.c;
                k1 k1Var = a1Var.a;
                p0 p0Var3 = (p0) concurrentHashMap.get(jVar.e);
                if (p0Var3 == null) {
                    p0Var3 = e(a1Var.c);
                }
                if (!p0Var3.b.p() || this.r.get() == a1Var.b) {
                    p0Var3.l(k1Var);
                    return true;
                }
                k1Var.a(A);
                p0Var3.o();
                return true;
            case 5:
                int i10 = message.arg1;
                u5.a aVar = (u5.a) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        p0Var = (p0) it2.next();
                        if (p0Var.i == i10) {
                        }
                    } else {
                        p0Var = null;
                    }
                }
                if (p0Var == null) {
                    Log.wtf("GoogleApiManager", j3.r0.m(i10, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                    return true;
                }
                int i11 = aVar.b;
                if (i11 != 13) {
                    p0Var.c(d(p0Var.c, aVar));
                    return true;
                }
                this.f.getClass();
                AtomicBoolean atomicBoolean = u5.g.a;
                p0Var.c(new Status(17, j3.r0.o("Error resolution was canceled by the user, original error message: ", u5.a.d(i11), ": ", aVar.d), null, null));
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    d.b((Application) context.getApplicationContext());
                    d dVar = d.e;
                    dVar.a(new o0(this));
                    AtomicBoolean atomicBoolean2 = dVar.a;
                    AtomicBoolean atomicBoolean3 = dVar.b;
                    if (!atomicBoolean3.get()) {
                        if (e6.d.b()) {
                            z10 = true;
                            if (!z10) {
                                this.a = 300000L;
                                return true;
                            }
                        } else {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!atomicBoolean3.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                atomicBoolean2.set(true);
                            }
                        }
                    }
                    z10 = atomicBoolean2.get();
                    if (!z10) {
                    }
                }
                return true;
            case 7:
                e((com.google.android.gms.common.api.j) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    p0 p0Var4 = (p0) concurrentHashMap.get(message.obj);
                    x5.l.d(p0Var4.o.x);
                    if (p0Var4.k) {
                        p0Var4.k();
                        return true;
                    }
                }
                return true;
            case 10:
                a0.g gVar = this.w;
                gVar.getClass();
                a0.b bVar = new a0.b(gVar);
                while (bVar.hasNext()) {
                    p0 p0Var5 = (p0) concurrentHashMap.remove((b) bVar.next());
                    if (p0Var5 != null) {
                        p0Var5.o();
                    }
                }
                gVar.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    p0 p0Var6 = (p0) concurrentHashMap.get(message.obj);
                    h hVar = p0Var6.o;
                    x5.l.d(hVar.x);
                    boolean z11 = p0Var6.k;
                    if (z11) {
                        b bVar2 = p0Var6.c;
                        c2.u0 u0Var2 = p0Var6.o.x;
                        if (z11) {
                            u0Var2.removeMessages(11, bVar2);
                            u0Var2.removeMessages(9, bVar2);
                            p0Var6.k = false;
                        }
                        p0Var6.c(hVar.f.d(hVar.e, u5.e.a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        p0Var6.b.d("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    p0 p0Var7 = (p0) concurrentHashMap.get(message.obj);
                    x5.l.d(p0Var7.o.x);
                    com.google.android.gms.common.api.c cVar = p0Var7.b;
                    if (cVar.i() && p0Var7.f.isEmpty()) {
                        g1 g1Var = p0Var7.d;
                        if (((Map) g1Var.a).isEmpty() && ((Map) g1Var.b).isEmpty()) {
                            cVar.d("Timing out service connection.");
                            return true;
                        }
                        p0Var7.h();
                    }
                    return true;
                }
                return true;
            case 14:
                throw aa.d.j(message.obj);
            case 15:
                q0 q0Var = (q0) message.obj;
                if (concurrentHashMap.containsKey(q0Var.a)) {
                    p0 p0Var8 = (p0) concurrentHashMap.get(q0Var.a);
                    if (p0Var8.l.contains(q0Var) && !p0Var8.k) {
                        if (p0Var8.b.i()) {
                            p0Var8.e();
                            return true;
                        }
                        p0Var8.k();
                        return true;
                    }
                }
                return true;
            case 16:
                q0 q0Var2 = (q0) message.obj;
                if (concurrentHashMap.containsKey(q0Var2.a)) {
                    p0 p0Var9 = (p0) concurrentHashMap.get(q0Var2.a);
                    ArrayList arrayList = p0Var9.l;
                    c2.u0 u0Var3 = p0Var9.o.x;
                    LinkedList<k1> linkedList = p0Var9.a;
                    if (arrayList.remove(q0Var2)) {
                        u0Var3.removeMessages(15, q0Var2);
                        u0Var3.removeMessages(16, q0Var2);
                        u5.c cVar2 = q0Var2.b;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (k1 k1Var2 : linkedList) {
                            if ((k1Var2 instanceof w0) && (g10 = ((w0) k1Var2).g(p0Var9)) != null) {
                                int length = g10.length;
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= length) {
                                        break;
                                    }
                                    if (!x5.l.l(g10[i12], cVar2)) {
                                        i12++;
                                    } else if (i12 >= 0) {
                                        arrayList2.add(k1Var2);
                                    }
                                }
                            }
                        }
                        int size = arrayList2.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            k1 k1Var3 = (k1) arrayList2.get(i13);
                            linkedList.remove(k1Var3);
                            k1Var3.b(new com.google.android.gms.common.api.r(cVar2));
                        }
                    }
                }
                return true;
            case 17:
                x5.o oVar = this.c;
                if (oVar != null) {
                    if (oVar.a > 0 || b()) {
                        if (this.d == null) {
                            this.d = new z5.b(context, eVar, pVar, com.google.android.gms.common.api.i.c);
                        }
                        this.d.f(oVar);
                    }
                    this.c = null;
                    return true;
                }
                return true;
            case 18:
                z0 z0Var = (z0) message.obj;
                long j10 = z0Var.c;
                x5.j jVar2 = z0Var.a;
                int i14 = z0Var.b;
                if (j10 == 0) {
                    x5.o oVar2 = new x5.o(i14, Arrays.asList(jVar2));
                    if (this.d == null) {
                        this.d = new z5.b(context, eVar, pVar, com.google.android.gms.common.api.i.c);
                    }
                    this.d.f(oVar2);
                    return true;
                }
                x5.o oVar3 = this.c;
                if (oVar3 != null) {
                    List list = oVar3.b;
                    if (oVar3.a != i14 || (list != null && list.size() >= z0Var.d)) {
                        u0Var.removeMessages(17);
                        x5.o oVar4 = this.c;
                        if (oVar4 != null) {
                            if (oVar4.a > 0 || b()) {
                                if (this.d == null) {
                                    this.d = new z5.b(context, eVar, pVar, com.google.android.gms.common.api.i.c);
                                }
                                this.d.f(oVar4);
                            }
                            this.c = null;
                        }
                    } else {
                        x5.o oVar5 = this.c;
                        if (oVar5.b == null) {
                            oVar5.b = new ArrayList();
                        }
                        oVar5.b.add(jVar2);
                    }
                }
                if (this.c == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(jVar2);
                    this.c = new x5.o(i14, arrayList3);
                    u0Var.sendMessageDelayed(u0Var.obtainMessage(17), z0Var.c);
                    return true;
                }
                return true;
            case 19:
                this.b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i9);
                return false;
        }
    }
}
