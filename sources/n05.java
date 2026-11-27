// default package

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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class n05 implements Handler.Callback {
    public static final Status F = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status G = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object H = new Object();
    public static n05 I;
    public volatile boolean E;
    public int a;
    public boolean b;
    public ikb c;
    public qa4 d;
    public final Context e;
    public final i05 f;
    public final zhc h;
    public final AtomicInteger n;
    public final AtomicInteger r;
    public final ConcurrentHashMap s;
    public final ss w;
    public final ss x;
    public final b99 y;

    public n05(Context context, Looper looper) {
        i05 i05Var = i05.e;
        this.a = 10000;
        this.b = false;
        this.n = new AtomicInteger(1);
        this.r = new AtomicInteger(0);
        this.s = new ConcurrentHashMap(5, 0.75f, 1);
        this.w = new ss(0);
        this.x = new ss(0);
        this.E = true;
        this.e = context;
        b99 b99Var = new b99(looper, this);
        this.y = b99Var;
        this.f = i05Var;
        this.h = new zhc(i05Var);
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = die.d;
        if (bool == null) {
            bool = Boolean.valueOf(rve.a() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
            die.d = bool;
        }
        if (bool.booleanValue()) {
            this.E = false;
        }
        b99Var.sendMessage(b99Var.obtainMessage(6));
    }

    public static void a() {
        synchronized (H) {
            n05 n05Var = I;
            if (n05Var != null) {
                n05Var.r.incrementAndGet();
                b99 b99Var = n05Var.y;
                b99Var.sendMessageAtFrontOfQueue(b99Var.obtainMessage(10));
            }
        }
    }

    public static Status d(ho hoVar, ws2 ws2Var) {
        String str = hoVar.b.c;
        String valueOf = String.valueOf(ws2Var);
        StringBuilder sb = new StringBuilder(str.length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(17, sb.toString(), ws2Var.c, ws2Var);
    }

    public static n05 e(Context context) {
        n05 n05Var;
        synchronized (H) {
            n05Var = I;
            if (n05Var == null) {
                Looper looper = aef.a().getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = i05.d;
                n05 n05Var2 = new n05(applicationContext, looper);
                I = n05Var2;
                n05Var = n05Var2;
            }
        }
        return n05Var;
    }

    public final l6d b(h05 h05Var) {
        ho hoVar = h05Var.f;
        ConcurrentHashMap concurrentHashMap = this.s;
        l6d l6dVar = (l6d) concurrentHashMap.get(hoVar);
        if (l6dVar == null) {
            l6dVar = new l6d(this, h05Var);
            concurrentHashMap.put(hoVar, l6dVar);
        }
        if (l6dVar.b.w()) {
            this.x.add(hoVar);
        }
        l6dVar.o();
        return l6dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TaskCompletionSource taskCompletionSource, int i, h05 h05Var) {
        r6d r6dVar;
        n05 n05Var;
        long j;
        long j2;
        if (i == 0) {
            return;
        }
        ho hoVar = h05Var.f;
        if (f()) {
            an9 an9Var = (an9) zm9.I0().b;
            boolean z = true;
            if (an9Var != null) {
                if (an9Var.b) {
                    boolean z2 = an9Var.c;
                    l6d l6dVar = (l6d) this.s.get(hoVar);
                    if (l6dVar != null) {
                        d05 d05Var = l6dVar.b;
                        if (d05Var instanceof hg0) {
                            d05 d05Var2 = d05Var;
                            if (d05Var2.B != null && !d05Var2.r()) {
                                ys2 a = r6d.a(l6dVar, d05Var2, i);
                                if (a != null) {
                                    l6dVar.n++;
                                    z = a.c;
                                }
                            }
                        }
                    }
                    z = z2;
                }
            }
            if (z) {
                long currentTimeMillis = System.currentTimeMillis();
                j2 = SystemClock.elapsedRealtime();
                j = currentTimeMillis;
            } else {
                j = 0;
                j2 = 0;
            }
            n05Var = this;
            r6dVar = new r6d(n05Var, i, hoVar, j, j2);
            if (r6dVar == null) {
                Task task = taskCompletionSource.getTask();
                b99 b99Var = n05Var.y;
                Objects.requireNonNull(b99Var);
                task.addOnCompleteListener(new ne5(b99Var, (byte) 2), r6dVar);
                return;
            }
            return;
        }
        r6dVar = null;
        n05Var = this;
        if (r6dVar == null) {
        }
    }

    public final boolean f() {
        if (this.b) {
            return false;
        }
        an9 an9Var = (an9) zm9.I0().b;
        if (an9Var != null && !an9Var.b) {
            return false;
        }
        int f = this.h.f(203400000);
        return f == -1 || f == 0;
    }

    public final boolean g(ws2 ws2Var, int i) {
        PendingIntent pendingIntent;
        i05 i05Var = this.f;
        i05Var.getClass();
        Context context = this.e;
        if (!qq5.f(context)) {
            boolean b = ws2Var.b();
            int i2 = ws2Var.b;
            if (b) {
                pendingIntent = ws2Var.c;
            } else {
                pendingIntent = null;
                Intent a = i05Var.a(i2, context, null);
                if (a != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, a, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i3 = GoogleApiActivity.b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                i05Var.g(context, i2, PendingIntent.getActivity(context, 0, intent, s7d.a | TLObject.FLAG_27));
                Integer num = ws2Var.e;
                e6d e6dVar = new e6d(num == null ? -1 : num.intValue(), ws2Var.b, System.currentTimeMillis(), context.getPackageName(), false);
                qa4 qa4Var = i05Var.c;
                if (qa4Var == null) {
                    qa4Var = new qa4(context, qa4.n, wn.g, g05.c);
                    i05Var.c = qa4Var;
                }
                wjb b2 = xjb.b();
                b2.c = new a94[]{mid.b};
                b2.b = false;
                b2.a = new pq8((Object) e6dVar, (byte) 28);
                qa4Var.e(2, b2.a());
                return true;
            }
        }
        return false;
    }

    public final void h(ws2 ws2Var, int i) {
        if (g(ws2Var, i)) {
            return;
        }
        b99 b99Var = this.y;
        b99Var.sendMessage(b99Var.obtainMessage(5, i, 0, ws2Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x02ef  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        l6d l6dVar;
        boolean z;
        a94[] f;
        zn znVar = qa4.o;
        int i = message.what;
        jkb jkbVar = jkb.b;
        Context context = this.e;
        b99 b99Var = this.y;
        ConcurrentHashMap concurrentHashMap = this.s;
        switch (i) {
            case 1:
                this.a = (int) (true != ((Boolean) message.obj).booleanValue() ? 300000L : 10000L);
                b99Var.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    b99Var.sendMessageDelayed(b99Var.obtainMessage(12, (ho) it.next()), this.a);
                }
                return true;
            case 2:
                message.obj.getClass();
                grb.o();
                return false;
            case 3:
                for (l6d l6dVar2 : concurrentHashMap.values()) {
                    xve.d(l6dVar2.o.y);
                    l6dVar2.m = null;
                    l6dVar2.o();
                }
                return true;
            case 4:
            case 8:
            case 13:
                w6d w6dVar = (w6d) message.obj;
                h05 h05Var = w6dVar.c;
                o7d o7dVar = w6dVar.a;
                l6d l6dVar3 = (l6d) concurrentHashMap.get(h05Var.f);
                if (l6dVar3 == null) {
                    l6dVar3 = b(h05Var);
                }
                if (!l6dVar3.b.w() || this.r.get() == w6dVar.b) {
                    l6dVar3.m(o7dVar);
                    return true;
                }
                o7dVar.a(F);
                l6dVar3.n();
                return true;
            case 5:
                int i2 = message.arg1;
                ws2 ws2Var = (ws2) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        l6dVar = (l6d) it2.next();
                        if (l6dVar.i == i2) {
                        }
                    } else {
                        l6dVar = null;
                    }
                }
                if (l6dVar == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 65);
                    sb.append("Could not find API instance ");
                    sb.append(i2);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    return true;
                }
                int i3 = ws2Var.b;
                if (i3 != 13) {
                    l6dVar.g(d(l6dVar.c, ws2Var));
                    return true;
                }
                this.f.getClass();
                int i4 = c15.e;
                String d = ws2.d(i3);
                String str = ws2Var.d;
                StringBuilder sb2 = new StringBuilder(d.length() + 69 + String.valueOf(str).length());
                sb2.append("Error resolution was canceled by the user, original error message: ");
                sb2.append(d);
                sb2.append(": ");
                sb2.append(str);
                l6dVar.g(new Status(17, sb2.toString(), null, null));
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    qd0.b((Application) context.getApplicationContext());
                    qd0 qd0Var = qd0.e;
                    qd0Var.a(new k6d(this));
                    AtomicBoolean atomicBoolean = qd0Var.a;
                    AtomicBoolean atomicBoolean2 = qd0Var.b;
                    if (!atomicBoolean2.get()) {
                        if (go.H()) {
                            z = true;
                            if (!z) {
                                this.a = 300000;
                                return true;
                            }
                        } else {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                atomicBoolean.set(true);
                            }
                        }
                    }
                    z = atomicBoolean.get();
                    if (!z) {
                    }
                }
                return true;
            case 7:
                b((h05) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    l6d l6dVar4 = (l6d) concurrentHashMap.get(message.obj);
                    xve.d(l6dVar4.o.y);
                    if (l6dVar4.k) {
                        l6dVar4.o();
                        return true;
                    }
                }
                return true;
            case 10:
                ss ssVar = this.x;
                ssVar.getClass();
                ns nsVar = new ns(ssVar);
                while (nsVar.hasNext()) {
                    l6d l6dVar5 = (l6d) concurrentHashMap.remove((ho) nsVar.next());
                    if (l6dVar5 != null) {
                        l6dVar5.n();
                    }
                }
                ssVar.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    l6d l6dVar6 = (l6d) concurrentHashMap.get(message.obj);
                    n05 n05Var = l6dVar6.o;
                    xve.d(n05Var.y);
                    boolean z2 = l6dVar6.k;
                    if (z2) {
                        if (z2) {
                            n05 n05Var2 = l6dVar6.o;
                            ho hoVar = l6dVar6.c;
                            n05Var2.y.removeMessages(11, hoVar);
                            n05Var2.y.removeMessages(9, hoVar);
                            l6dVar6.k = false;
                        }
                        l6dVar6.g(n05Var.f.c(n05Var.e, j05.a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        l6dVar6.b.d("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    l6d l6dVar7 = (l6d) concurrentHashMap.get(message.obj);
                    xve.d(l6dVar7.o.y);
                    d05 d05Var = l6dVar7.b;
                    if (d05Var.q() && l6dVar7.f.isEmpty()) {
                        zhc zhcVar = l6dVar7.d;
                        if (((Map) zhcVar.b).isEmpty() && ((Map) zhcVar.c).isEmpty()) {
                            d05Var.d("Timing out service connection.");
                            return true;
                        }
                        l6dVar7.h();
                    }
                    return true;
                }
                return true;
            case 14:
                message.obj.getClass();
                grb.o();
                return false;
            case 15:
                m6d m6dVar = (m6d) message.obj;
                if (concurrentHashMap.containsKey(m6dVar.a)) {
                    l6d l6dVar8 = (l6d) concurrentHashMap.get(m6dVar.a);
                    if (l6dVar8.l.contains(m6dVar) && !l6dVar8.k) {
                        if (l6dVar8.b.q()) {
                            l6dVar8.d();
                            return true;
                        }
                        l6dVar8.o();
                        return true;
                    }
                }
                return true;
            case 16:
                m6d m6dVar2 = (m6d) message.obj;
                if (concurrentHashMap.containsKey(m6dVar2.a)) {
                    l6d l6dVar9 = (l6d) concurrentHashMap.get(m6dVar2.a);
                    if (l6dVar9.l.remove(m6dVar2)) {
                        n05 n05Var3 = l6dVar9.o;
                        n05Var3.y.removeMessages(15, m6dVar2);
                        n05Var3.y.removeMessages(16, m6dVar2);
                        a94 a94Var = m6dVar2.b;
                        LinkedList<o7d> linkedList = l6dVar9.a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        for (o7d o7dVar2 : linkedList) {
                            if ((o7dVar2 instanceof t6d) && (f = ((t6d) o7dVar2).f(l6dVar9)) != null) {
                                int length = f.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= length) {
                                        break;
                                    }
                                    if (!vue.a(f[i5], a94Var)) {
                                        i5++;
                                    } else if (i5 >= 0) {
                                        arrayList.add(o7dVar2);
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            o7d o7dVar3 = (o7d) arrayList.get(i6);
                            linkedList.remove(o7dVar3);
                            o7dVar3.b(new eac(a94Var));
                        }
                    }
                }
                return true;
            case 17:
                ikb ikbVar = this.c;
                if (ikbVar != null) {
                    if (ikbVar.a > 0 || f()) {
                        qa4 qa4Var = this.d;
                        if (qa4Var == null) {
                            qa4Var = new qa4(context, znVar, jkbVar, g05.c);
                            this.d = qa4Var;
                        }
                        qa4Var.i(ikbVar);
                    }
                    this.c = null;
                    return true;
                }
                return true;
            case 18:
                s6d s6dVar = (s6d) message.obj;
                long j = s6dVar.c;
                bg7 bg7Var = s6dVar.a;
                int i7 = s6dVar.b;
                if (j == 0) {
                    ikb ikbVar2 = new ikb(i7, Arrays.asList(bg7Var));
                    qa4 qa4Var2 = this.d;
                    if (qa4Var2 == null) {
                        qa4Var2 = new qa4(context, znVar, jkbVar, g05.c);
                        this.d = qa4Var2;
                    }
                    qa4Var2.i(ikbVar2);
                    return true;
                }
                ikb ikbVar3 = this.c;
                if (ikbVar3 != null) {
                    List list = ikbVar3.b;
                    if (ikbVar3.a != i7 || (list != null && list.size() >= s6dVar.d)) {
                        b99Var.removeMessages(17);
                        ikb ikbVar4 = this.c;
                        if (ikbVar4 != null) {
                            if (ikbVar4.a > 0 || f()) {
                                qa4 qa4Var3 = this.d;
                                if (qa4Var3 == null) {
                                    qa4Var3 = new qa4(context, znVar, jkbVar, g05.c);
                                    this.d = qa4Var3;
                                }
                                qa4Var3.i(ikbVar4);
                            }
                            this.c = null;
                        }
                    } else {
                        ikb ikbVar5 = this.c;
                        if (ikbVar5.b == null) {
                            ikbVar5.b = new ArrayList();
                        }
                        ikbVar5.b.add(bg7Var);
                    }
                }
                if (this.c == null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(bg7Var);
                    this.c = new ikb(i7, arrayList2);
                    b99Var.sendMessageDelayed(b99Var.obtainMessage(17), j);
                    return true;
                }
                return true;
            case 19:
                this.b = false;
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(String.valueOf(i).length() + 20);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }
}
