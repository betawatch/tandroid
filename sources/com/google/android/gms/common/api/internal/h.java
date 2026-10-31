package com.google.android.gms.common.api.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h implements Handler.Callback {
    public static final Status E = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status F = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object G = new Object();
    public static h H;
    public volatile boolean D;
    public long a;
    public boolean b;
    public n6.o c;
    public p6.b d;
    public final Context e;
    public final k6.d f;
    public final m4.c h;
    public final AtomicInteger n;
    public final AtomicInteger r;
    public final ConcurrentHashMap s;
    public final a0.g w;
    public final a0.g x;
    public final com.google.android.gms.internal.cast.z y;

    public h(Context context, Looper looper) {
        k6.d dVar = k6.d.d;
        this.a = 10000L;
        this.b = false;
        this.n = new AtomicInteger(1);
        this.r = new AtomicInteger(0);
        this.s = new ConcurrentHashMap(5, 0.75f, 1);
        this.w = new a0.g(0);
        this.x = new a0.g(0);
        this.D = true;
        this.e = context;
        com.google.android.gms.internal.cast.z zVar = new com.google.android.gms.internal.cast.z(looper, this);
        this.y = zVar;
        this.f = dVar;
        this.h = new m4.c((k6.e) dVar);
        PackageManager packageManager = context.getPackageManager();
        if (u6.b.e == null) {
            u6.b.e = Boolean.valueOf(u6.b.d() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (u6.b.e.booleanValue()) {
            this.D = false;
        }
        zVar.sendMessage(zVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (G) {
            try {
                h hVar = H;
                if (hVar != null) {
                    hVar.r.incrementAndGet();
                    com.google.android.gms.internal.cast.z zVar = hVar.y;
                    zVar.sendMessageAtFrontOfQueue(zVar.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Status d(b bVar, k6.a aVar) {
        return new Status(17, c3.i0.n("API: ", bVar.b.c, " is not available on this device. Connection failed with: ", String.valueOf(aVar)), aVar.c, aVar);
    }

    public static h g(Context context) {
        h hVar;
        synchronized (G) {
            try {
                if (H == null) {
                    Looper looper = n6.j0.a().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = k6.d.c;
                    H = new h(applicationContext, looper);
                }
                hVar = H;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    public final boolean b() {
        if (this.b) {
            return false;
        }
        n6.n nVar = (n6.n) n6.m.a().a;
        if (nVar != null && !nVar.b) {
            return false;
        }
        int i10 = ((SparseIntArray) this.h.b).get(203400000, -1);
        return i10 == -1 || i10 == 0;
    }

    public final boolean c(k6.a aVar, int i10) {
        PendingIntent pendingIntent;
        k6.d dVar = this.f;
        dVar.getClass();
        Context context = this.e;
        if (!w6.a.b(context)) {
            boolean b10 = aVar.b();
            int i11 = aVar.b;
            if (b10) {
                pendingIntent = aVar.c;
            } else {
                pendingIntent = null;
                Intent b11 = dVar.b(i11, context, null);
                if (b11 != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, b11, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i12 = GoogleApiActivity.b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", true);
                dVar.h(context, i11, PendingIntent.getActivity(context, 0, intent, k7.d.a | TLObject.FLAG_27));
                return true;
            }
        }
        return false;
    }

    public final q0 e(com.google.android.gms.common.api.j jVar) {
        b bVar = jVar.e;
        ConcurrentHashMap concurrentHashMap = this.s;
        q0 q0Var = (q0) concurrentHashMap.get(bVar);
        if (q0Var == null) {
            q0Var = new q0(this, jVar);
            concurrentHashMap.put(bVar, q0Var);
        }
        if (q0Var.b.q()) {
            this.x.add(bVar);
        }
        q0Var.k();
        return q0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(TaskCompletionSource taskCompletionSource, int i10, com.google.android.gms.common.api.j jVar) {
        z0 z0Var;
        h hVar;
        if (i10 == 0) {
            return;
        }
        b bVar = jVar.e;
        if (b()) {
            n6.n nVar = (n6.n) n6.m.a().a;
            boolean z10 = true;
            if (nVar != null) {
                if (nVar.b) {
                    boolean z11 = nVar.c;
                    q0 q0Var = (q0) this.s.get(bVar);
                    if (q0Var != null) {
                        com.google.android.gms.common.api.c cVar = q0Var.b;
                        if (cVar instanceof n6.g) {
                            n6.g gVar = (n6.g) cVar;
                            if (gVar.Q != null && !gVar.g()) {
                                n6.e a2 = z0.a(q0Var, gVar, i10);
                                if (a2 != null) {
                                    q0Var.n++;
                                    z10 = a2.c;
                                }
                            }
                        }
                    }
                    z10 = z11;
                }
            }
            hVar = this;
            z0Var = new z0(hVar, i10, bVar, z10 ? System.currentTimeMillis() : 0L, z10 ? SystemClock.elapsedRealtime() : 0L);
            if (z0Var == null) {
                Task task = taskCompletionSource.getTask();
                com.google.android.gms.internal.cast.z zVar = hVar.y;
                zVar.getClass();
                task.addOnCompleteListener(new androidx.biometric.n(zVar, 2), z0Var);
                return;
            }
            return;
        }
        z0Var = null;
        hVar = this;
        if (z0Var == null) {
        }
    }

    public final void h(k6.a aVar, int i10) {
        if (c(aVar, i10)) {
            return;
        }
        com.google.android.gms.internal.cast.z zVar = this.y;
        zVar.sendMessage(zVar.obtainMessage(5, i10, 0, aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x02e2  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        q0 q0Var;
        boolean z10;
        k6.c[] g10;
        int i10 = message.what;
        com.google.android.gms.common.api.e eVar = p6.b.k;
        n6.p pVar = n6.p.b;
        Context context = this.e;
        com.google.android.gms.internal.cast.z zVar = this.y;
        ConcurrentHashMap concurrentHashMap = this.s;
        switch (i10) {
            case 1:
                this.a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                zVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    zVar.sendMessageDelayed(zVar.obtainMessage(12, (b) it.next()), this.a);
                }
                return true;
            case 2:
                throw c3.i0.l(message.obj);
            case 3:
                for (q0 q0Var2 : concurrentHashMap.values()) {
                    n6.l.c(q0Var2.o.y);
                    q0Var2.m = null;
                    q0Var2.k();
                }
                return true;
            case 4:
            case 8:
            case 13:
                b1 b1Var = (b1) message.obj;
                com.google.android.gms.common.api.j jVar = b1Var.c;
                l1 l1Var = b1Var.a;
                q0 q0Var3 = (q0) concurrentHashMap.get(jVar.e);
                if (q0Var3 == null) {
                    q0Var3 = e(b1Var.c);
                }
                if (!q0Var3.b.q() || this.r.get() == b1Var.b) {
                    q0Var3.l(l1Var);
                    return true;
                }
                l1Var.a(E);
                q0Var3.o();
                return true;
            case 5:
                int i11 = message.arg1;
                k6.a aVar = (k6.a) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        q0Var = (q0) it2.next();
                        if (q0Var.i == i11) {
                        }
                    } else {
                        q0Var = null;
                    }
                }
                if (q0Var == null) {
                    Log.wtf("GoogleApiManager", i0.a.j(i11, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                    return true;
                }
                int i12 = aVar.b;
                if (i12 != 13) {
                    q0Var.c(d(q0Var.c, aVar));
                    return true;
                }
                this.f.getClass();
                AtomicBoolean atomicBoolean = k6.g.a;
                q0Var.c(new Status(17, c3.i0.n("Error resolution was canceled by the user, original error message: ", k6.a.d(i12), ": ", aVar.d), null, null));
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    d.b((Application) context.getApplicationContext());
                    d dVar = d.e;
                    dVar.a(new p0(this));
                    AtomicBoolean atomicBoolean2 = dVar.a;
                    AtomicBoolean atomicBoolean3 = dVar.b;
                    if (!atomicBoolean3.get()) {
                        if (u6.d.b()) {
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
                    q0 q0Var4 = (q0) concurrentHashMap.get(message.obj);
                    n6.l.c(q0Var4.o.y);
                    if (q0Var4.k) {
                        q0Var4.k();
                        return true;
                    }
                }
                return true;
            case 10:
                a0.g gVar = this.x;
                gVar.getClass();
                a0.b bVar = new a0.b(gVar);
                while (bVar.hasNext()) {
                    q0 q0Var5 = (q0) concurrentHashMap.remove((b) bVar.next());
                    if (q0Var5 != null) {
                        q0Var5.o();
                    }
                }
                gVar.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    q0 q0Var6 = (q0) concurrentHashMap.get(message.obj);
                    h hVar = q0Var6.o;
                    n6.l.c(hVar.y);
                    boolean z11 = q0Var6.k;
                    if (z11) {
                        b bVar2 = q0Var6.c;
                        com.google.android.gms.internal.cast.z zVar2 = q0Var6.o.y;
                        if (z11) {
                            zVar2.removeMessages(11, bVar2);
                            zVar2.removeMessages(9, bVar2);
                            q0Var6.k = false;
                        }
                        q0Var6.c(hVar.f.d(hVar.e, k6.e.a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        q0Var6.b.e("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    q0 q0Var7 = (q0) concurrentHashMap.get(message.obj);
                    n6.l.c(q0Var7.o.y);
                    com.google.android.gms.common.api.c cVar = q0Var7.b;
                    if (cVar.k() && q0Var7.f.isEmpty()) {
                        h1 h1Var = q0Var7.d;
                        if (((Map) h1Var.a).isEmpty() && ((Map) h1Var.b).isEmpty()) {
                            cVar.e("Timing out service connection.");
                            return true;
                        }
                        q0Var7.h();
                    }
                    return true;
                }
                return true;
            case 14:
                throw c3.i0.l(message.obj);
            case 15:
                r0 r0Var = (r0) message.obj;
                if (concurrentHashMap.containsKey(r0Var.a)) {
                    q0 q0Var8 = (q0) concurrentHashMap.get(r0Var.a);
                    if (q0Var8.l.contains(r0Var) && !q0Var8.k) {
                        if (q0Var8.b.k()) {
                            q0Var8.e();
                            return true;
                        }
                        q0Var8.k();
                        return true;
                    }
                }
                return true;
            case 16:
                r0 r0Var2 = (r0) message.obj;
                if (concurrentHashMap.containsKey(r0Var2.a)) {
                    q0 q0Var9 = (q0) concurrentHashMap.get(r0Var2.a);
                    ArrayList arrayList = q0Var9.l;
                    com.google.android.gms.internal.cast.z zVar3 = q0Var9.o.y;
                    LinkedList<l1> linkedList = q0Var9.a;
                    if (arrayList.remove(r0Var2)) {
                        zVar3.removeMessages(15, r0Var2);
                        zVar3.removeMessages(16, r0Var2);
                        k6.c cVar2 = r0Var2.b;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (l1 l1Var2 : linkedList) {
                            if ((l1Var2 instanceof x0) && (g10 = ((x0) l1Var2).g(q0Var9)) != null) {
                                int length = g10.length;
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= length) {
                                        break;
                                    }
                                    if (!n6.l.k(g10[i13], cVar2)) {
                                        i13++;
                                    } else if (i13 >= 0) {
                                        arrayList2.add(l1Var2);
                                    }
                                }
                            }
                        }
                        int size = arrayList2.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            l1 l1Var3 = (l1) arrayList2.get(i14);
                            linkedList.remove(l1Var3);
                            l1Var3.b(new com.google.android.gms.common.api.r(cVar2));
                        }
                    }
                }
                return true;
            case 17:
                n6.o oVar = this.c;
                if (oVar != null) {
                    if (oVar.a > 0 || b()) {
                        if (this.d == null) {
                            this.d = new p6.b(context, eVar, pVar, com.google.android.gms.common.api.i.c);
                        }
                        this.d.f(oVar);
                    }
                    this.c = null;
                    return true;
                }
                return true;
            case 18:
                a1 a1Var = (a1) message.obj;
                long j10 = a1Var.c;
                n6.j jVar2 = a1Var.a;
                int i15 = a1Var.b;
                if (j10 == 0) {
                    n6.o oVar2 = new n6.o(i15, Arrays.asList(jVar2));
                    if (this.d == null) {
                        this.d = new p6.b(context, eVar, pVar, com.google.android.gms.common.api.i.c);
                    }
                    this.d.f(oVar2);
                    return true;
                }
                n6.o oVar3 = this.c;
                if (oVar3 != null) {
                    List list = oVar3.b;
                    if (oVar3.a != i15 || (list != null && list.size() >= a1Var.d)) {
                        zVar.removeMessages(17);
                        n6.o oVar4 = this.c;
                        if (oVar4 != null) {
                            if (oVar4.a > 0 || b()) {
                                if (this.d == null) {
                                    this.d = new p6.b(context, eVar, pVar, com.google.android.gms.common.api.i.c);
                                }
                                this.d.f(oVar4);
                            }
                            this.c = null;
                        }
                    } else {
                        n6.o oVar5 = this.c;
                        if (oVar5.b == null) {
                            oVar5.b = new ArrayList();
                        }
                        oVar5.b.add(jVar2);
                    }
                }
                if (this.c == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(jVar2);
                    this.c = new n6.o(i15, arrayList3);
                    zVar.sendMessageDelayed(zVar.obtainMessage(17), a1Var.c);
                    return true;
                }
                return true;
            case 19:
                this.b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }
}
