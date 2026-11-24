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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class hy4 implements Handler.Callback {
    public static final Status F = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status G = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object H = new Object();
    public static hy4 I;
    public volatile boolean E;
    public int a;
    public boolean b;
    public mgb c;
    public u84 d;
    public final Context e;
    public final cy4 f;
    public final aec h;
    public final AtomicInteger n;
    public final AtomicInteger r;
    public final ConcurrentHashMap s;
    public final rs w;
    public final rs x;
    public final o59 y;

    public hy4(Context context, Looper looper) {
        cy4 cy4Var = cy4.e;
        this.a = 10000;
        this.b = false;
        this.n = new AtomicInteger(1);
        this.r = new AtomicInteger(0);
        this.s = new ConcurrentHashMap(5, 0.75f, 1);
        this.w = new rs(0);
        this.x = new rs(0);
        this.E = true;
        this.e = context;
        o59 o59Var = new o59(looper, this);
        this.y = o59Var;
        this.f = cy4Var;
        this.h = new aec(cy4Var);
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = mde.d;
        if (bool == null) {
            bool = Boolean.valueOf(xqe.a() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
            mde.d = bool;
        }
        if (bool.booleanValue()) {
            this.E = false;
        }
        o59Var.sendMessage(o59Var.obtainMessage(6));
    }

    public static void a() {
        synchronized (H) {
            hy4 hy4Var = I;
            if (hy4Var != null) {
                hy4Var.r.incrementAndGet();
                o59 o59Var = hy4Var.y;
                o59Var.sendMessageAtFrontOfQueue(o59Var.obtainMessage(10));
            }
        }
    }

    public static Status d(go goVar, ds2 ds2Var) {
        String str = goVar.b.c;
        String valueOf = String.valueOf(ds2Var);
        StringBuilder sb = new StringBuilder(str.length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(17, sb.toString(), ds2Var.c, ds2Var);
    }

    public static hy4 e(Context context) {
        hy4 hy4Var;
        synchronized (H) {
            hy4Var = I;
            if (hy4Var == null) {
                Looper looper = j9f.a().getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = cy4.d;
                hy4 hy4Var2 = new hy4(applicationContext, looper);
                I = hy4Var2;
                hy4Var = hy4Var2;
            }
        }
        return hy4Var;
    }

    public final u1d b(by4 by4Var) {
        go goVar = by4Var.f;
        ConcurrentHashMap concurrentHashMap = this.s;
        u1d u1dVar = (u1d) concurrentHashMap.get(goVar);
        if (u1dVar == null) {
            u1dVar = new u1d(this, by4Var);
            concurrentHashMap.put(goVar, u1dVar);
        }
        if (u1dVar.b.w()) {
            this.x.add(goVar);
        }
        u1dVar.o();
        return u1dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TaskCompletionSource taskCompletionSource, int i, by4 by4Var) {
        a2d a2dVar;
        hy4 hy4Var;
        long j;
        long j2;
        if (i == 0) {
            return;
        }
        go goVar = by4Var.f;
        if (f()) {
            mj9 mj9Var = (mj9) lj9.z().b;
            boolean z = true;
            if (mj9Var != null) {
                if (mj9Var.b) {
                    boolean z2 = mj9Var.c;
                    u1d u1dVar = (u1d) this.s.get(goVar);
                    if (u1dVar != null) {
                        xx4 xx4Var = u1dVar.b;
                        if (xx4Var instanceof gg0) {
                            xx4 xx4Var2 = xx4Var;
                            if (xx4Var2.B != null && !xx4Var2.r()) {
                                fs2 a = a2d.a(u1dVar, xx4Var2, i);
                                if (a != null) {
                                    u1dVar.n++;
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
            hy4Var = this;
            a2dVar = new a2d(hy4Var, i, goVar, j, j2);
            if (a2dVar == null) {
                Task task = taskCompletionSource.getTask();
                o59 o59Var = hy4Var.y;
                Objects.requireNonNull(o59Var);
                task.addOnCompleteListener(new mc5(o59Var, (byte) 2), a2dVar);
                return;
            }
            return;
        }
        a2dVar = null;
        hy4Var = this;
        if (a2dVar == null) {
        }
    }

    public final boolean f() {
        if (this.b) {
            return false;
        }
        mj9 mj9Var = (mj9) lj9.z().b;
        if (mj9Var != null && !mj9Var.b) {
            return false;
        }
        int g = this.h.g(203400000);
        return g == -1 || g == 0;
    }

    public final boolean g(ds2 ds2Var, int i) {
        PendingIntent pendingIntent;
        cy4 cy4Var = this.f;
        cy4Var.getClass();
        Context context = this.e;
        if (!no5.f(context)) {
            boolean b = ds2Var.b();
            int i2 = ds2Var.b;
            if (b) {
                pendingIntent = ds2Var.c;
            } else {
                pendingIntent = null;
                Intent a = cy4Var.a(i2, context, null);
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
                cy4Var.g(context, i2, PendingIntent.getActivity(context, 0, intent, b3d.a | TLObject.FLAG_27));
                Integer num = ds2Var.e;
                n1d n1dVar = new n1d(num == null ? -1 : num.intValue(), ds2Var.b, System.currentTimeMillis(), context.getPackageName(), false);
                u84 u84Var = cy4Var.c;
                if (u84Var == null) {
                    u84Var = new u84(context, u84.n, vn.g, ay4.c);
                    cy4Var.c = u84Var;
                }
                agb b2 = bgb.b();
                b2.c = new f84[]{udd.b};
                b2.b = false;
                b2.a = new g29((Object) n1dVar, (byte) 23);
                u84Var.e(2, b2.a());
                return true;
            }
        }
        return false;
    }

    public final void h(ds2 ds2Var, int i) {
        if (g(ds2Var, i)) {
            return;
        }
        o59 o59Var = this.y;
        o59Var.sendMessage(o59Var.obtainMessage(5, i, 0, ds2Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x02ef  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        u1d u1dVar;
        boolean z;
        f84[] f;
        yn ynVar = u84.o;
        int i = message.what;
        ngb ngbVar = ngb.b;
        Context context = this.e;
        o59 o59Var = this.y;
        ConcurrentHashMap concurrentHashMap = this.s;
        switch (i) {
            case 1:
                this.a = (int) (true != ((Boolean) message.obj).booleanValue() ? 300000L : 10000L);
                o59Var.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    o59Var.sendMessageDelayed(o59Var.obtainMessage(12, (go) it.next()), this.a);
                }
                return true;
            case 2:
                message.obj.getClass();
                fyb.g();
                return false;
            case 3:
                for (u1d u1dVar2 : concurrentHashMap.values()) {
                    fre.d(u1dVar2.o.y);
                    u1dVar2.m = null;
                    u1dVar2.o();
                }
                return true;
            case 4:
            case 8:
            case 13:
                f2d f2dVar = (f2d) message.obj;
                by4 by4Var = f2dVar.c;
                x2d x2dVar = f2dVar.a;
                u1d u1dVar3 = (u1d) concurrentHashMap.get(by4Var.f);
                if (u1dVar3 == null) {
                    u1dVar3 = b(by4Var);
                }
                if (!u1dVar3.b.w() || this.r.get() == f2dVar.b) {
                    u1dVar3.m(x2dVar);
                    return true;
                }
                x2dVar.a(F);
                u1dVar3.n();
                return true;
            case 5:
                int i2 = message.arg1;
                ds2 ds2Var = (ds2) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        u1dVar = (u1d) it2.next();
                        if (u1dVar.i == i2) {
                        }
                    } else {
                        u1dVar = null;
                    }
                }
                if (u1dVar == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 65);
                    sb.append("Could not find API instance ");
                    sb.append(i2);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    return true;
                }
                int i3 = ds2Var.b;
                if (i3 != 13) {
                    u1dVar.g(d(u1dVar.c, ds2Var));
                    return true;
                }
                this.f.getClass();
                int i4 = yy4.e;
                String d = ds2.d(i3);
                String str = ds2Var.d;
                StringBuilder sb2 = new StringBuilder(d.length() + 69 + String.valueOf(str).length());
                sb2.append("Error resolution was canceled by the user, original error message: ");
                sb2.append(d);
                sb2.append(": ");
                sb2.append(str);
                u1dVar.g(new Status(17, sb2.toString(), null, null));
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    od0.b((Application) context.getApplicationContext());
                    od0 od0Var = od0.e;
                    od0Var.a(new t1d(this));
                    AtomicBoolean atomicBoolean = od0Var.a;
                    AtomicBoolean atomicBoolean2 = od0Var.b;
                    if (!atomicBoolean2.get()) {
                        if (fo.H()) {
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
                b((by4) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    u1d u1dVar4 = (u1d) concurrentHashMap.get(message.obj);
                    fre.d(u1dVar4.o.y);
                    if (u1dVar4.k) {
                        u1dVar4.o();
                        return true;
                    }
                }
                return true;
            case 10:
                rs rsVar = this.x;
                rsVar.getClass();
                ms msVar = new ms(rsVar);
                while (msVar.hasNext()) {
                    u1d u1dVar5 = (u1d) concurrentHashMap.remove((go) msVar.next());
                    if (u1dVar5 != null) {
                        u1dVar5.n();
                    }
                }
                rsVar.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    u1d u1dVar6 = (u1d) concurrentHashMap.get(message.obj);
                    hy4 hy4Var = u1dVar6.o;
                    fre.d(hy4Var.y);
                    boolean z2 = u1dVar6.k;
                    if (z2) {
                        if (z2) {
                            hy4 hy4Var2 = u1dVar6.o;
                            go goVar = u1dVar6.c;
                            hy4Var2.y.removeMessages(11, goVar);
                            hy4Var2.y.removeMessages(9, goVar);
                            u1dVar6.k = false;
                        }
                        u1dVar6.g(hy4Var.f.c(hy4Var.e, dy4.a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        u1dVar6.b.d("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    u1d u1dVar7 = (u1d) concurrentHashMap.get(message.obj);
                    fre.d(u1dVar7.o.y);
                    xx4 xx4Var = u1dVar7.b;
                    if (xx4Var.q() && u1dVar7.f.isEmpty()) {
                        aec aecVar = u1dVar7.d;
                        if (((Map) aecVar.b).isEmpty() && ((Map) aecVar.c).isEmpty()) {
                            xx4Var.d("Timing out service connection.");
                            return true;
                        }
                        u1dVar7.h();
                    }
                    return true;
                }
                return true;
            case 14:
                message.obj.getClass();
                fyb.g();
                return false;
            case 15:
                v1d v1dVar = (v1d) message.obj;
                if (concurrentHashMap.containsKey(v1dVar.a)) {
                    u1d u1dVar8 = (u1d) concurrentHashMap.get(v1dVar.a);
                    if (u1dVar8.l.contains(v1dVar) && !u1dVar8.k) {
                        if (u1dVar8.b.q()) {
                            u1dVar8.d();
                            return true;
                        }
                        u1dVar8.o();
                        return true;
                    }
                }
                return true;
            case 16:
                v1d v1dVar2 = (v1d) message.obj;
                if (concurrentHashMap.containsKey(v1dVar2.a)) {
                    u1d u1dVar9 = (u1d) concurrentHashMap.get(v1dVar2.a);
                    if (u1dVar9.l.remove(v1dVar2)) {
                        hy4 hy4Var3 = u1dVar9.o;
                        hy4Var3.y.removeMessages(15, v1dVar2);
                        hy4Var3.y.removeMessages(16, v1dVar2);
                        f84 f84Var = v1dVar2.b;
                        LinkedList<x2d> linkedList = u1dVar9.a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        for (x2d x2dVar2 : linkedList) {
                            if ((x2dVar2 instanceof c2d) && (f = ((c2d) x2dVar2).f(u1dVar9)) != null) {
                                int length = f.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= length) {
                                        break;
                                    }
                                    if (!cqe.a(f[i5], f84Var)) {
                                        i5++;
                                    } else if (i5 >= 0) {
                                        arrayList.add(x2dVar2);
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            x2d x2dVar3 = (x2d) arrayList.get(i6);
                            linkedList.remove(x2dVar3);
                            x2dVar3.b(new e6c(f84Var));
                        }
                    }
                }
                return true;
            case 17:
                mgb mgbVar = this.c;
                if (mgbVar != null) {
                    if (mgbVar.a > 0 || f()) {
                        u84 u84Var = this.d;
                        if (u84Var == null) {
                            u84Var = new u84(context, ynVar, ngbVar, ay4.c);
                            this.d = u84Var;
                        }
                        u84Var.i(mgbVar);
                    }
                    this.c = null;
                    return true;
                }
                return true;
            case 18:
                b2d b2dVar = (b2d) message.obj;
                long j = b2dVar.c;
                sd7 sd7Var = b2dVar.a;
                int i7 = b2dVar.b;
                if (j == 0) {
                    mgb mgbVar2 = new mgb(i7, Arrays.asList(sd7Var));
                    u84 u84Var2 = this.d;
                    if (u84Var2 == null) {
                        u84Var2 = new u84(context, ynVar, ngbVar, ay4.c);
                        this.d = u84Var2;
                    }
                    u84Var2.i(mgbVar2);
                    return true;
                }
                mgb mgbVar3 = this.c;
                if (mgbVar3 != null) {
                    List list = mgbVar3.b;
                    if (mgbVar3.a != i7 || (list != null && list.size() >= b2dVar.d)) {
                        o59Var.removeMessages(17);
                        mgb mgbVar4 = this.c;
                        if (mgbVar4 != null) {
                            if (mgbVar4.a > 0 || f()) {
                                u84 u84Var3 = this.d;
                                if (u84Var3 == null) {
                                    u84Var3 = new u84(context, ynVar, ngbVar, ay4.c);
                                    this.d = u84Var3;
                                }
                                u84Var3.i(mgbVar4);
                            }
                            this.c = null;
                        }
                    } else {
                        mgb mgbVar5 = this.c;
                        if (mgbVar5.b == null) {
                            mgbVar5.b = new ArrayList();
                        }
                        mgbVar5.b.add(sd7Var);
                    }
                }
                if (this.c == null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(sd7Var);
                    this.c = new mgb(i7, arrayList2);
                    o59Var.sendMessageDelayed(o59Var.obtainMessage(17), j);
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
