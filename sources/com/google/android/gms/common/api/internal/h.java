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
import com.google.android.gms.internal.vision.e2;
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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class h implements Handler.Callback {
    public static final Status E = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status F = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object G = new Object();
    public static h H;
    public long a;
    public boolean b;
    public n6.o c;
    public p6.b d;
    public final Context e;
    public final k6.d f;
    public final n4.y h;
    public final AtomicInteger n;
    public final AtomicInteger r;
    public final ConcurrentHashMap s;
    public final a0.g v;
    public final a0.g w;
    public final com.google.android.gms.internal.cast.c0 x;
    public volatile boolean y;

    public h(Context context, Looper looper) {
        k6.d dVar = k6.d.d;
        this.a = 10000L;
        this.b = false;
        this.n = new AtomicInteger(1);
        this.r = new AtomicInteger(0);
        this.s = new ConcurrentHashMap(5, 0.75f, 1);
        this.v = new a0.g(0);
        this.w = new a0.g(0);
        this.y = true;
        this.e = context;
        com.google.android.gms.internal.cast.c0 c0Var = new com.google.android.gms.internal.cast.c0(looper, this);
        this.x = c0Var;
        this.f = dVar;
        this.h = new n4.y((k6.e) dVar);
        PackageManager packageManager = context.getPackageManager();
        if (u6.b.e == null) {
            u6.b.e = Boolean.valueOf(u6.b.d() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (u6.b.e.booleanValue()) {
            this.y = false;
        }
        c0Var.sendMessage(c0Var.obtainMessage(6));
    }

    public static void a() {
        synchronized (G) {
            try {
                h hVar = H;
                if (hVar != null) {
                    hVar.r.incrementAndGet();
                    com.google.android.gms.internal.cast.c0 c0Var = hVar.x;
                    c0Var.sendMessageAtFrontOfQueue(c0Var.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Status d(b bVar, k6.a aVar) {
        return new Status(17, e2.j("API: ", bVar.b.c, " is not available on this device. Connection failed with: ", String.valueOf(aVar)), aVar.c, aVar);
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
                Intent b11 = dVar.b(context, null, i11);
                if (b11 != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, b11, Build.VERSION.SDK_INT >= 23 ? 201326592 : TLObject.FLAG_27);
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
            n6.n nVar = (n6.n) n6.m.a().a;
            boolean z10 = true;
            if (nVar != null) {
                if (nVar.b) {
                    boolean z11 = nVar.c;
                    p0 p0Var = (p0) this.s.get(bVar);
                    if (p0Var != null) {
                        com.google.android.gms.common.api.c cVar = p0Var.b;
                        if (cVar instanceof n6.g) {
                            n6.g gVar = (n6.g) cVar;
                            if (gVar.Q != null && !gVar.f()) {
                                n6.e a2 = y0.a(p0Var, gVar, i10);
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
            y0Var = new y0(hVar, i10, bVar, z10 ? System.currentTimeMillis() : 0L, z10 ? SystemClock.elapsedRealtime() : 0L);
            if (y0Var == null) {
                Task task = taskCompletionSource.getTask();
                com.google.android.gms.internal.cast.c0 c0Var = hVar.x;
                c0Var.getClass();
                task.addOnCompleteListener(new androidx.biometric.n(c0Var, 2), y0Var);
                return;
            }
            return;
        }
        y0Var = null;
        hVar = this;
        if (y0Var == null) {
        }
    }

    public final void h(k6.a aVar, int i10) {
        if (c(aVar, i10)) {
            return;
        }
        com.google.android.gms.internal.cast.c0 c0Var = this.x;
        c0Var.sendMessage(c0Var.obtainMessage(5, i10, 0, aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x02e6  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        p0 p0Var;
        boolean z10;
        k6.c[] g10;
        int i10 = message.what;
        com.google.android.gms.common.api.e eVar = p6.b.k;
        n6.p pVar = n6.p.b;
        Context context = this.e;
        com.google.android.gms.internal.cast.c0 c0Var = this.x;
        ConcurrentHashMap concurrentHashMap = this.s;
        switch (i10) {
            case 1:
                this.a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                c0Var.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    c0Var.sendMessageDelayed(c0Var.obtainMessage(12, (b) it.next()), this.a);
                }
                return true;
            case 2:
                throw a4.a.j(message.obj);
            case 3:
                for (p0 p0Var2 : concurrentHashMap.values()) {
                    n6.l.d(p0Var2.o.x);
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
                k1Var.a(E);
                p0Var3.o();
                return true;
            case 5:
                int i11 = message.arg1;
                k6.a aVar = (k6.a) message.obj;
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
                    Log.wtf("GoogleApiManager", i2.g.j(i11, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                    return true;
                }
                int i12 = aVar.b;
                if (i12 != 13) {
                    p0Var.c(d(p0Var.c, aVar));
                    return true;
                }
                this.f.getClass();
                AtomicBoolean atomicBoolean = k6.g.a;
                p0Var.c(new Status(17, e2.j("Error resolution was canceled by the user, original error message: ", k6.a.d(i12), ": ", aVar.d), null, null));
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    d.b((Application) context.getApplicationContext());
                    d dVar = d.e;
                    dVar.a(new o0(this));
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
                    p0 p0Var4 = (p0) concurrentHashMap.get(message.obj);
                    n6.l.d(p0Var4.o.x);
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
                    n6.l.d(hVar.x);
                    boolean z11 = p0Var6.k;
                    if (z11) {
                        b bVar2 = p0Var6.c;
                        com.google.android.gms.internal.cast.c0 c0Var2 = p0Var6.o.x;
                        if (z11) {
                            c0Var2.removeMessages(11, bVar2);
                            c0Var2.removeMessages(9, bVar2);
                            p0Var6.k = false;
                        }
                        p0Var6.c(hVar.f.d(hVar.e, k6.e.a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        p0Var6.b.d("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    p0 p0Var7 = (p0) concurrentHashMap.get(message.obj);
                    n6.l.d(p0Var7.o.x);
                    com.google.android.gms.common.api.c cVar = p0Var7.b;
                    if (cVar.j() && p0Var7.f.isEmpty()) {
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
                throw a4.a.j(message.obj);
            case 15:
                q0 q0Var = (q0) message.obj;
                if (concurrentHashMap.containsKey(q0Var.a)) {
                    p0 p0Var8 = (p0) concurrentHashMap.get(q0Var.a);
                    if (p0Var8.l.contains(q0Var) && !p0Var8.k) {
                        if (p0Var8.b.j()) {
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
                    com.google.android.gms.internal.cast.c0 c0Var3 = p0Var9.o.x;
                    LinkedList<k1> linkedList = p0Var9.a;
                    if (arrayList.remove(q0Var2)) {
                        c0Var3.removeMessages(15, q0Var2);
                        c0Var3.removeMessages(16, q0Var2);
                        k6.c cVar2 = q0Var2.b;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (k1 k1Var2 : linkedList) {
                            if ((k1Var2 instanceof w0) && (g10 = ((w0) k1Var2).g(p0Var9)) != null) {
                                int length = g10.length;
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= length) {
                                        break;
                                    }
                                    if (!n6.l.l(g10[i13], cVar2)) {
                                        i13++;
                                    } else if (i13 >= 0) {
                                        arrayList2.add(k1Var2);
                                    }
                                }
                            }
                        }
                        int size = arrayList2.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            k1 k1Var3 = (k1) arrayList2.get(i14);
                            linkedList.remove(k1Var3);
                            k1Var3.b(new com.google.android.gms.common.api.r(cVar2));
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
                z0 z0Var = (z0) message.obj;
                long j3 = z0Var.c;
                n6.j jVar2 = z0Var.a;
                int i15 = z0Var.b;
                if (j3 == 0) {
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
                    if (oVar3.a != i15 || (list != null && list.size() >= z0Var.d)) {
                        c0Var.removeMessages(17);
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
                    c0Var.sendMessageDelayed(c0Var.obtainMessage(17), z0Var.c);
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
