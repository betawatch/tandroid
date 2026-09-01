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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class h implements Handler.Callback {
    public static final Status B = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status C = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object D = new Object();
    public static h E;
    public long a;
    public boolean b;
    public b6.p c;
    public d6.b d;
    public final Context e;
    public final y5.d f;
    public final bf.b h;
    public final AtomicInteger n;
    public final AtomicInteger r;
    public final ConcurrentHashMap s;
    public final a0.g v;
    public final a0.g w;
    public final a7.e x;
    public volatile boolean y;

    public h(Context context, Looper looper) {
        y5.d dVar = y5.d.d;
        this.a = 10000L;
        this.b = false;
        this.n = new AtomicInteger(1);
        this.r = new AtomicInteger(0);
        this.s = new ConcurrentHashMap(5, 0.75f, 1);
        this.v = new a0.g(0);
        this.w = new a0.g(0);
        this.y = true;
        this.e = context;
        a7.e eVar = new a7.e(looper, this);
        this.x = eVar;
        this.f = dVar;
        this.h = new bf.b((y5.e) dVar);
        PackageManager packageManager = context.getPackageManager();
        if (i6.b.e == null) {
            i6.b.e = Boolean.valueOf(i6.b.d() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (i6.b.e.booleanValue()) {
            this.y = false;
        }
        eVar.sendMessage(eVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (D) {
            try {
                h hVar = E;
                if (hVar != null) {
                    hVar.r.incrementAndGet();
                    a7.e eVar = hVar.x;
                    eVar.sendMessageAtFrontOfQueue(eVar.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Status d(b bVar, y5.a aVar) {
        return new Status(17, e2.c.k("API: ", bVar.b.c, " is not available on this device. Connection failed with: ", String.valueOf(aVar)), aVar.c, aVar);
    }

    public static h g(Context context) {
        h hVar;
        synchronized (D) {
            try {
                if (E == null) {
                    Looper looper = b6.k0.a().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = y5.d.c;
                    E = new h(applicationContext, looper);
                }
                hVar = E;
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
        b6.o oVar = (b6.o) b6.n.a().a;
        if (oVar != null && !oVar.b) {
            return false;
        }
        int i10 = ((SparseIntArray) this.h.b).get(203400000, -1);
        return i10 == -1 || i10 == 0;
    }

    public final boolean c(y5.a aVar, int i10) {
        PendingIntent pendingIntent;
        y5.d dVar = this.f;
        dVar.getClass();
        Context context = this.e;
        if (!k6.a.f(context)) {
            boolean e6 = aVar.e();
            int i11 = aVar.b;
            if (e6) {
                pendingIntent = aVar.c;
            } else {
                pendingIntent = null;
                Intent b10 = dVar.b(context, null, i11);
                if (b10 != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, b10, Build.VERSION.SDK_INT >= 23 ? 201326592 : TLObject.FLAG_27);
                }
            }
            if (pendingIntent != null) {
                int i12 = GoogleApiActivity.b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", true);
                dVar.h(context, i11, PendingIntent.getActivity(context, 0, intent, y6.d.a | TLObject.FLAG_27));
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
    public final void f(TaskCompletionSource taskCompletionSource, int i10, com.google.android.gms.common.api.j jVar) {
        y0 y0Var;
        h hVar;
        if (i10 == 0) {
            return;
        }
        b bVar = jVar.e;
        if (b()) {
            b6.o oVar = (b6.o) b6.n.a().a;
            boolean z4 = true;
            if (oVar != null) {
                if (oVar.b) {
                    boolean z10 = oVar.c;
                    p0 p0Var = (p0) this.s.get(bVar);
                    if (p0Var != null) {
                        com.google.android.gms.common.api.c cVar = p0Var.b;
                        if (cVar instanceof b6.g) {
                            b6.g gVar = (b6.g) cVar;
                            if (gVar.N != null && !gVar.e()) {
                                b6.e a2 = y0.a(p0Var, gVar, i10);
                                if (a2 != null) {
                                    p0Var.n++;
                                    z4 = a2.c;
                                }
                            }
                        }
                    }
                    z4 = z10;
                }
            }
            hVar = this;
            y0Var = new y0(hVar, i10, bVar, z4 ? System.currentTimeMillis() : 0L, z4 ? SystemClock.elapsedRealtime() : 0L);
            if (y0Var == null) {
                Task task = taskCompletionSource.getTask();
                a7.e eVar = hVar.x;
                eVar.getClass();
                task.addOnCompleteListener(new androidx.biometric.p(eVar, 2), y0Var);
                return;
            }
            return;
        }
        y0Var = null;
        hVar = this;
        if (y0Var == null) {
        }
    }

    public final void h(y5.a aVar, int i10) {
        if (c(aVar, i10)) {
            return;
        }
        a7.e eVar = this.x;
        eVar.sendMessage(eVar.obtainMessage(5, i10, 0, aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x02e6  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        p0 p0Var;
        boolean z4;
        y5.c[] g10;
        int i10 = message.what;
        com.google.android.gms.common.api.e eVar = d6.b.k;
        b6.q qVar = b6.q.b;
        Context context = this.e;
        a7.e eVar2 = this.x;
        ConcurrentHashMap concurrentHashMap = this.s;
        switch (i10) {
            case 1:
                this.a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                eVar2.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    eVar2.sendMessageDelayed(eVar2.obtainMessage(12, (b) it.next()), this.a);
                }
                return true;
            case 2:
                throw android.support.v4.media.a.j(message.obj);
            case 3:
                for (p0 p0Var2 : concurrentHashMap.values()) {
                    b6.m.d(p0Var2.o.x);
                    p0Var2.m = null;
                    p0Var2.k();
                }
                return true;
            case 4:
            case 8:
            case 13:
                a1 a1Var = (a1) message.obj;
                com.google.android.gms.common.api.j jVar = a1Var.c;
                l1 l1Var = a1Var.a;
                p0 p0Var3 = (p0) concurrentHashMap.get(jVar.e);
                if (p0Var3 == null) {
                    p0Var3 = e(a1Var.c);
                }
                if (!p0Var3.b.p() || this.r.get() == a1Var.b) {
                    p0Var3.l(l1Var);
                    return true;
                }
                l1Var.a(B);
                p0Var3.o();
                return true;
            case 5:
                int i11 = message.arg1;
                y5.a aVar = (y5.a) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        p0Var = (p0) it2.next();
                        if (p0Var.i == i11) {
                        }
                    } else {
                        p0Var = null;
                    }
                }
                if (p0Var == null) {
                    Log.wtf("GoogleApiManager", l.d.k(i11, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                    return true;
                }
                int i12 = aVar.b;
                if (i12 != 13) {
                    p0Var.c(d(p0Var.c, aVar));
                    return true;
                }
                this.f.getClass();
                AtomicBoolean atomicBoolean = y5.g.a;
                p0Var.c(new Status(17, e2.c.k("Error resolution was canceled by the user, original error message: ", y5.a.g(i12), ": ", aVar.d), null, null));
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    d.b((Application) context.getApplicationContext());
                    d dVar = d.e;
                    dVar.a(new o0(this));
                    AtomicBoolean atomicBoolean2 = dVar.a;
                    AtomicBoolean atomicBoolean3 = dVar.b;
                    if (!atomicBoolean3.get()) {
                        if (i6.d.b()) {
                            z4 = true;
                            if (!z4) {
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
                    z4 = atomicBoolean2.get();
                    if (!z4) {
                    }
                }
                return true;
            case 7:
                e((com.google.android.gms.common.api.j) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    p0 p0Var4 = (p0) concurrentHashMap.get(message.obj);
                    b6.m.d(p0Var4.o.x);
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
                    b6.m.d(hVar.x);
                    boolean z10 = p0Var6.k;
                    if (z10) {
                        b bVar2 = p0Var6.c;
                        a7.e eVar3 = p0Var6.o.x;
                        if (z10) {
                            eVar3.removeMessages(11, bVar2);
                            eVar3.removeMessages(9, bVar2);
                            p0Var6.k = false;
                        }
                        p0Var6.c(hVar.f.d(hVar.e, y5.e.a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        p0Var6.b.c("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    p0 p0Var7 = (p0) concurrentHashMap.get(message.obj);
                    b6.m.d(p0Var7.o.x);
                    com.google.android.gms.common.api.c cVar = p0Var7.b;
                    if (cVar.h() && p0Var7.f.isEmpty()) {
                        h1 h1Var = p0Var7.d;
                        if (((Map) h1Var.a).isEmpty() && ((Map) h1Var.b).isEmpty()) {
                            cVar.c("Timing out service connection.");
                            return true;
                        }
                        p0Var7.h();
                    }
                    return true;
                }
                return true;
            case 14:
                throw android.support.v4.media.a.j(message.obj);
            case 15:
                q0 q0Var = (q0) message.obj;
                if (concurrentHashMap.containsKey(q0Var.a)) {
                    p0 p0Var8 = (p0) concurrentHashMap.get(q0Var.a);
                    if (p0Var8.l.contains(q0Var) && !p0Var8.k) {
                        if (p0Var8.b.h()) {
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
                    a7.e eVar4 = p0Var9.o.x;
                    LinkedList<l1> linkedList = p0Var9.a;
                    if (arrayList.remove(q0Var2)) {
                        eVar4.removeMessages(15, q0Var2);
                        eVar4.removeMessages(16, q0Var2);
                        y5.c cVar2 = q0Var2.b;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (l1 l1Var2 : linkedList) {
                            if ((l1Var2 instanceof w0) && (g10 = ((w0) l1Var2).g(p0Var9)) != null) {
                                int length = g10.length;
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= length) {
                                        break;
                                    }
                                    if (!b6.m.l(g10[i13], cVar2)) {
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
                b6.p pVar = this.c;
                if (pVar != null) {
                    if (pVar.a > 0 || b()) {
                        if (this.d == null) {
                            this.d = new d6.b(context, eVar, qVar, com.google.android.gms.common.api.i.c);
                        }
                        this.d.f(pVar);
                    }
                    this.c = null;
                    return true;
                }
                return true;
            case 18:
                z0 z0Var = (z0) message.obj;
                long j10 = z0Var.c;
                b6.k kVar = z0Var.a;
                int i15 = z0Var.b;
                if (j10 == 0) {
                    b6.p pVar2 = new b6.p(i15, Arrays.asList(kVar));
                    if (this.d == null) {
                        this.d = new d6.b(context, eVar, qVar, com.google.android.gms.common.api.i.c);
                    }
                    this.d.f(pVar2);
                    return true;
                }
                b6.p pVar3 = this.c;
                if (pVar3 != null) {
                    List list = pVar3.b;
                    if (pVar3.a != i15 || (list != null && list.size() >= z0Var.d)) {
                        eVar2.removeMessages(17);
                        b6.p pVar4 = this.c;
                        if (pVar4 != null) {
                            if (pVar4.a > 0 || b()) {
                                if (this.d == null) {
                                    this.d = new d6.b(context, eVar, qVar, com.google.android.gms.common.api.i.c);
                                }
                                this.d.f(pVar4);
                            }
                            this.c = null;
                        }
                    } else {
                        b6.p pVar5 = this.c;
                        if (pVar5.b == null) {
                            pVar5.b = new ArrayList();
                        }
                        pVar5.b.add(kVar);
                    }
                }
                if (this.c == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(kVar);
                    this.c = new b6.p(i15, arrayList3);
                    eVar2.sendMessageDelayed(eVar2.obtainMessage(17), z0Var.c);
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
