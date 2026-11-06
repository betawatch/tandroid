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
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
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
import org.telegram.ui.Components.uy;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class g implements Handler.Callback {
    public static final Status E = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status F = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object G = new Object();
    public static g H;
    public volatile boolean D;
    public long a;
    public boolean b;
    public q6.p c;
    public s6.d d;
    public final Context e;
    public final n6.d f;
    public final j2.n h;
    public final AtomicInteger n;
    public final AtomicInteger r;
    public final ConcurrentHashMap s;
    public final a0.g w;
    public final a0.g x;
    public final com.google.android.gms.internal.cast.y y;

    public g(Context context, Looper looper) {
        n6.d dVar = n6.d.e;
        this.a = 10000L;
        this.b = false;
        this.n = new AtomicInteger(1);
        this.r = new AtomicInteger(0);
        this.s = new ConcurrentHashMap(5, 0.75f, 1);
        this.w = new a0.g(0);
        this.x = new a0.g(0);
        this.D = true;
        this.e = context;
        com.google.android.gms.internal.cast.y yVar = new com.google.android.gms.internal.cast.y(looper, this);
        this.y = yVar;
        this.f = dVar;
        this.h = new j2.n((n6.e) dVar);
        PackageManager packageManager = context.getPackageManager();
        if (x6.b.e == null) {
            x6.b.e = Boolean.valueOf(x6.b.d() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (x6.b.e.booleanValue()) {
            this.D = false;
        }
        yVar.sendMessage(yVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (G) {
            try {
                g gVar = H;
                if (gVar != null) {
                    gVar.r.incrementAndGet();
                    com.google.android.gms.internal.cast.y yVar = gVar.y;
                    yVar.sendMessageAtFrontOfQueue(yVar.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Status d(a aVar, n6.a aVar2) {
        String str = aVar.b.c;
        String valueOf = String.valueOf(aVar2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length());
        sb2.append("API: ");
        sb2.append(str);
        sb2.append(" is not available on this device. Connection failed with: ");
        sb2.append(valueOf);
        return new Status(17, sb2.toString(), aVar2.c, aVar2);
    }

    public static g e(Context context) {
        g gVar;
        synchronized (G) {
            try {
                if (H == null) {
                    Looper looper = q6.l0.a().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = n6.d.d;
                    H = new g(applicationContext, looper);
                }
                gVar = H;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public final j0 b(com.google.android.gms.common.api.j jVar) {
        a aVar = jVar.f;
        ConcurrentHashMap concurrentHashMap = this.s;
        j0 j0Var = (j0) concurrentHashMap.get(aVar);
        if (j0Var == null) {
            j0Var = new j0(this, jVar);
            concurrentHashMap.put(aVar, j0Var);
        }
        if (j0Var.b.f()) {
            this.x.add(aVar);
        }
        j0Var.o();
        return j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TaskCompletionSource taskCompletionSource, int i7, com.google.android.gms.common.api.j jVar) {
        q0 q0Var;
        g gVar;
        if (i7 == 0) {
            return;
        }
        a aVar = jVar.f;
        if (f()) {
            q6.o oVar = (q6.o) q6.n.a().a;
            boolean z9 = true;
            if (oVar != null) {
                if (oVar.b) {
                    boolean z10 = oVar.c;
                    j0 j0Var = (j0) this.s.get(aVar);
                    if (j0Var != null) {
                        Object obj = j0Var.b;
                        if (obj instanceof q6.d) {
                            q6.d dVar = (q6.d) obj;
                            if (dVar.B != null && !dVar.t()) {
                                q6.f a10 = q0.a(j0Var, dVar, i7);
                                if (a10 != null) {
                                    j0Var.n++;
                                    z9 = a10.c;
                                }
                            }
                        }
                    }
                    z9 = z10;
                }
            }
            gVar = this;
            q0Var = new q0(gVar, i7, aVar, z9 ? System.currentTimeMillis() : 0L, z9 ? SystemClock.elapsedRealtime() : 0L);
            if (q0Var == null) {
                Task task = taskCompletionSource.getTask();
                com.google.android.gms.internal.cast.y yVar = gVar.y;
                Objects.requireNonNull(yVar);
                task.addOnCompleteListener(new androidx.biometric.o(yVar, 2), q0Var);
                return;
            }
            return;
        }
        q0Var = null;
        gVar = this;
        if (q0Var == null) {
        }
    }

    public final boolean f() {
        if (this.b) {
            return false;
        }
        q6.o oVar = (q6.o) q6.n.a().a;
        if (oVar != null && !oVar.b) {
            return false;
        }
        int k02 = this.h.k0(203400000);
        return k02 == -1 || k02 == 0;
    }

    public final boolean g(n6.a aVar, int i7) {
        PendingIntent pendingIntent;
        n6.d dVar = this.f;
        dVar.getClass();
        Context context = this.e;
        if (!z6.a.e(context)) {
            boolean b10 = aVar.b();
            int i10 = aVar.b;
            if (b10) {
                pendingIntent = aVar.c;
            } else {
                pendingIntent = null;
                Intent b11 = dVar.b(i10, context, null);
                if (b11 != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, b11, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i11 = GoogleApiActivity.b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i7);
                intent.putExtra("notify_manager", true);
                dVar.f(context, i10, PendingIntent.getActivity(context, 0, intent, n7.c.a | TLObject.FLAG_27));
                dVar.getClass();
                Integer num = aVar.e;
                q6.r rVar = new q6.r(num == null ? -1 : num.intValue(), aVar.b, System.currentTimeMillis(), context.getPackageName(), false);
                if (dVar.c == null) {
                    dVar.c = new s6.d(context, s6.d.l, com.google.android.gms.common.api.b.j, com.google.android.gms.common.api.i.c);
                }
                s6.d dVar2 = dVar.c;
                dVar2.getClass();
                s b12 = t.b();
                b12.d = new n6.c[]{n7.b.b};
                b12.b = false;
                b12.c = new uy(rVar, 16);
                dVar2.e(2, b12.a());
                return true;
            }
        }
        return false;
    }

    public final void h(n6.a aVar, int i7) {
        if (g(aVar, i7)) {
            return;
        }
        com.google.android.gms.internal.cast.y yVar = this.y;
        yVar.sendMessage(yVar.obtainMessage(5, i7, 0, aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x02fb  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        j0 j0Var;
        boolean z9;
        n6.c[] f10;
        com.google.android.gms.common.api.e eVar = s6.d.m;
        int i7 = message.what;
        q6.q qVar = q6.q.b;
        Context context = this.e;
        com.google.android.gms.internal.cast.y yVar = this.y;
        ConcurrentHashMap concurrentHashMap = this.s;
        switch (i7) {
            case 1:
                this.a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                yVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    yVar.sendMessageDelayed(yVar.obtainMessage(12, (a) it.next()), this.a);
                }
                return true;
            case 2:
                message.obj.getClass();
                throw new ClassCastException();
            case 3:
                for (j0 j0Var2 : concurrentHashMap.values()) {
                    q6.m.c(j0Var2.o.y);
                    j0Var2.m = null;
                    j0Var2.o();
                }
                return true;
            case 4:
            case 8:
            case 13:
                t0 t0Var = (t0) message.obj;
                com.google.android.gms.common.api.j jVar = t0Var.c;
                c1 c1Var = t0Var.a;
                j0 j0Var3 = (j0) concurrentHashMap.get(jVar.f);
                if (j0Var3 == null) {
                    j0Var3 = b(jVar);
                }
                if (!j0Var3.b.f() || this.r.get() == t0Var.b) {
                    j0Var3.m(c1Var);
                    return true;
                }
                c1Var.a(E);
                j0Var3.n();
                return true;
            case 5:
                int i10 = message.arg1;
                n6.a aVar = (n6.a) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        j0Var = (j0) it2.next();
                        if (j0Var.i == i10) {
                        }
                    } else {
                        j0Var = null;
                    }
                }
                if (j0Var == null) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 65);
                    sb2.append("Could not find API instance ");
                    sb2.append(i10);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    return true;
                }
                int i11 = aVar.b;
                if (i11 != 13) {
                    j0Var.g(d(j0Var.c, aVar));
                    return true;
                }
                this.f.getClass();
                AtomicBoolean atomicBoolean = n6.g.a;
                String d = n6.a.d(i11);
                String str = aVar.d;
                StringBuilder sb3 = new StringBuilder(String.valueOf(d).length() + 69 + String.valueOf(str).length());
                sb3.append("Error resolution was canceled by the user, original error message: ");
                sb3.append(d);
                sb3.append(": ");
                sb3.append(str);
                j0Var.g(new Status(17, sb3.toString(), null, null));
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    c.b((Application) context.getApplicationContext());
                    c cVar = c.e;
                    cVar.a(new i0(this));
                    AtomicBoolean atomicBoolean2 = cVar.a;
                    AtomicBoolean atomicBoolean3 = cVar.b;
                    if (!atomicBoolean3.get()) {
                        if (x6.d.b()) {
                            z9 = true;
                            if (!z9) {
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
                    z9 = atomicBoolean2.get();
                    if (!z9) {
                    }
                }
                return true;
            case 7:
                b((com.google.android.gms.common.api.j) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    j0 j0Var4 = (j0) concurrentHashMap.get(message.obj);
                    q6.m.c(j0Var4.o.y);
                    if (j0Var4.k) {
                        j0Var4.o();
                        return true;
                    }
                }
                return true;
            case 10:
                a0.g gVar = this.x;
                gVar.getClass();
                a0.b bVar = new a0.b(gVar);
                while (bVar.hasNext()) {
                    j0 j0Var5 = (j0) concurrentHashMap.remove((a) bVar.next());
                    if (j0Var5 != null) {
                        j0Var5.n();
                    }
                }
                gVar.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    j0 j0Var6 = (j0) concurrentHashMap.get(message.obj);
                    g gVar2 = j0Var6.o;
                    q6.m.c(gVar2.y);
                    boolean z10 = j0Var6.k;
                    if (z10) {
                        if (z10) {
                            g gVar3 = j0Var6.o;
                            a aVar2 = j0Var6.c;
                            gVar3.y.removeMessages(11, aVar2);
                            gVar3.y.removeMessages(9, aVar2);
                            j0Var6.k = false;
                        }
                        j0Var6.g(gVar2.f.d(gVar2.e, n6.e.a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        ((q6.d) j0Var6.b).j("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    j0 j0Var7 = (j0) concurrentHashMap.get(message.obj);
                    q6.m.c(j0Var7.o.y);
                    q6.d dVar = (q6.d) j0Var7.b;
                    if (dVar.s() && j0Var7.f.isEmpty()) {
                        y0 y0Var = j0Var7.d;
                        if (((Map) y0Var.a).isEmpty() && ((Map) y0Var.b).isEmpty()) {
                            dVar.j("Timing out service connection.");
                            return true;
                        }
                        j0Var7.h();
                    }
                    return true;
                }
                return true;
            case 14:
                message.obj.getClass();
                throw new ClassCastException();
            case 15:
                k0 k0Var = (k0) message.obj;
                if (concurrentHashMap.containsKey(k0Var.a)) {
                    j0 j0Var8 = (j0) concurrentHashMap.get(k0Var.a);
                    if (j0Var8.l.contains(k0Var) && !j0Var8.k) {
                        if (((q6.d) j0Var8.b).s()) {
                            j0Var8.d();
                            return true;
                        }
                        j0Var8.o();
                        return true;
                    }
                }
                return true;
            case 16:
                k0 k0Var2 = (k0) message.obj;
                if (concurrentHashMap.containsKey(k0Var2.a)) {
                    j0 j0Var9 = (j0) concurrentHashMap.get(k0Var2.a);
                    if (j0Var9.l.remove(k0Var2)) {
                        g gVar4 = j0Var9.o;
                        gVar4.y.removeMessages(15, k0Var2);
                        gVar4.y.removeMessages(16, k0Var2);
                        n6.c cVar2 = k0Var2.b;
                        LinkedList<c1> linkedList = j0Var9.a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        for (c1 c1Var2 : linkedList) {
                            if ((c1Var2 instanceof s0) && (f10 = ((s0) c1Var2).f(j0Var9)) != null) {
                                int length = f10.length;
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= length) {
                                        break;
                                    }
                                    if (!q6.m.k(f10[i12], cVar2)) {
                                        i12++;
                                    } else if (i12 >= 0) {
                                        arrayList.add(c1Var2);
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            c1 c1Var3 = (c1) arrayList.get(i13);
                            linkedList.remove(c1Var3);
                            c1Var3.b(new com.google.android.gms.common.api.r(cVar2));
                        }
                    }
                }
                return true;
            case 17:
                q6.p pVar = this.c;
                if (pVar != null) {
                    if (pVar.a > 0 || f()) {
                        if (this.d == null) {
                            this.d = new s6.d(context, eVar, qVar, com.google.android.gms.common.api.i.c);
                        }
                        this.d.f(pVar);
                    }
                    this.c = null;
                    return true;
                }
                return true;
            case 18:
                r0 r0Var = (r0) message.obj;
                long j3 = r0Var.c;
                q6.k kVar = r0Var.a;
                int i14 = r0Var.b;
                if (j3 == 0) {
                    q6.p pVar2 = new q6.p(i14, Arrays.asList(kVar));
                    if (this.d == null) {
                        this.d = new s6.d(context, eVar, qVar, com.google.android.gms.common.api.i.c);
                    }
                    this.d.f(pVar2);
                    return true;
                }
                q6.p pVar3 = this.c;
                if (pVar3 != null) {
                    List list = pVar3.b;
                    if (pVar3.a != i14 || (list != null && list.size() >= r0Var.d)) {
                        yVar.removeMessages(17);
                        q6.p pVar4 = this.c;
                        if (pVar4 != null) {
                            if (pVar4.a > 0 || f()) {
                                if (this.d == null) {
                                    this.d = new s6.d(context, eVar, qVar, com.google.android.gms.common.api.i.c);
                                }
                                this.d.f(pVar4);
                            }
                            this.c = null;
                        }
                    } else {
                        q6.p pVar5 = this.c;
                        if (pVar5.b == null) {
                            pVar5.b = new ArrayList();
                        }
                        pVar5.b.add(kVar);
                    }
                }
                if (this.c == null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(kVar);
                    this.c = new q6.p(i14, arrayList2);
                    yVar.sendMessageDelayed(yVar.obtainMessage(17), j3);
                    return true;
                }
                return true;
            case 19:
                this.b = false;
                return true;
            default:
                StringBuilder sb4 = new StringBuilder(String.valueOf(i7).length() + 20);
                sb4.append("Unknown message id: ");
                sb4.append(i7);
                Log.w("GoogleApiManager", sb4.toString());
                return false;
        }
    }
}
