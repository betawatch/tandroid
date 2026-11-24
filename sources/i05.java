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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class i05 implements Handler.Callback {
    public static final Status F = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status G = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object H = new Object();
    public static i05 I;
    public volatile boolean E;
    public int a;
    public boolean b;
    public nib c;
    public ua4 d;
    public final Context e;
    public final d05 f;
    public final rhb h;
    public final AtomicInteger n;
    public final AtomicInteger r;
    public final ConcurrentHashMap s;
    public final st w;
    public final st x;
    public final q79 y;

    public i05(Context context, Looper looper) {
        d05 d05Var = d05.e;
        this.a = 10000;
        this.b = false;
        this.n = new AtomicInteger(1);
        this.r = new AtomicInteger(0);
        this.s = new ConcurrentHashMap(5, 0.75f, 1);
        this.w = new st(0);
        this.x = new st(0);
        this.E = true;
        this.e = context;
        q79 q79Var = new q79(looper, this);
        this.y = q79Var;
        this.f = d05Var;
        this.h = new rhb(d05Var);
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = nfe.d;
        if (bool == null) {
            bool = Boolean.valueOf(ate.a() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
            nfe.d = bool;
        }
        if (bool.booleanValue()) {
            this.E = false;
        }
        q79Var.sendMessage(q79Var.obtainMessage(6));
    }

    public static void a() {
        synchronized (H) {
            i05 i05Var = I;
            if (i05Var != null) {
                i05Var.r.incrementAndGet();
                q79 q79Var = i05Var.y;
                q79Var.sendMessageAtFrontOfQueue(q79Var.obtainMessage(10));
            }
        }
    }

    public static Status d(gp gpVar, ot2 ot2Var) {
        String str = gpVar.b.c;
        String valueOf = String.valueOf(ot2Var);
        StringBuilder sb = new StringBuilder(str.length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(17, sb.toString(), ot2Var.c, ot2Var);
    }

    public static i05 e(Context context) {
        i05 i05Var;
        synchronized (H) {
            i05Var = I;
            if (i05Var == null) {
                Looper looper = lbf.a().getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = d05.d;
                i05 i05Var2 = new i05(applicationContext, looper);
                I = i05Var2;
                i05Var = i05Var2;
            }
        }
        return i05Var;
    }

    public final w3d b(c05 c05Var) {
        gp gpVar = c05Var.f;
        ConcurrentHashMap concurrentHashMap = this.s;
        w3d w3dVar = (w3d) concurrentHashMap.get(gpVar);
        if (w3dVar == null) {
            w3dVar = new w3d(this, c05Var);
            concurrentHashMap.put(gpVar, w3dVar);
        }
        if (w3dVar.b.w()) {
            this.x.add(gpVar);
        }
        w3dVar.o();
        return w3dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TaskCompletionSource taskCompletionSource, int i, c05 c05Var) {
        c4d c4dVar;
        i05 i05Var;
        long j;
        long j2;
        if (i == 0) {
            return;
        }
        gp gpVar = c05Var.f;
        if (f()) {
            ol9 ol9Var = (ol9) nl9.C0().b;
            boolean z = true;
            if (ol9Var != null) {
                if (ol9Var.b) {
                    boolean z2 = ol9Var.c;
                    w3d w3dVar = (w3d) this.s.get(gpVar);
                    if (w3dVar != null) {
                        zz4 zz4Var = w3dVar.b;
                        if (zz4Var instanceof hh0) {
                            zz4 zz4Var2 = zz4Var;
                            if (zz4Var2.B != null && !zz4Var2.r()) {
                                qt2 a = c4d.a(w3dVar, zz4Var2, i);
                                if (a != null) {
                                    w3dVar.n++;
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
            i05Var = this;
            c4dVar = new c4d(i05Var, i, gpVar, j, j2);
            if (c4dVar == null) {
                Task task = taskCompletionSource.getTask();
                q79 q79Var = i05Var.y;
                Objects.requireNonNull(q79Var);
                task.addOnCompleteListener(new ke5(q79Var, (byte) 2), c4dVar);
                return;
            }
            return;
        }
        c4dVar = null;
        i05Var = this;
        if (c4dVar == null) {
        }
    }

    public final boolean f() {
        if (this.b) {
            return false;
        }
        ol9 ol9Var = (ol9) nl9.C0().b;
        if (ol9Var != null && !ol9Var.b) {
            return false;
        }
        int o = this.h.o(203400000);
        return o == -1 || o == 0;
    }

    public final boolean g(ot2 ot2Var, int i) {
        PendingIntent pendingIntent;
        d05 d05Var = this.f;
        d05Var.getClass();
        Context context = this.e;
        if (!nq5.f(context)) {
            boolean b = ot2Var.b();
            int i2 = ot2Var.b;
            if (b) {
                pendingIntent = ot2Var.c;
            } else {
                pendingIntent = null;
                Intent a = d05Var.a(i2, context, null);
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
                d05Var.g(context, i2, PendingIntent.getActivity(context, 0, intent, d5d.a | TLObject.FLAG_27));
                Integer num = ot2Var.e;
                p3d p3dVar = new p3d(num == null ? -1 : num.intValue(), ot2Var.b, System.currentTimeMillis(), context.getPackageName(), false);
                ua4 ua4Var = d05Var.c;
                if (ua4Var == null) {
                    ua4Var = new ua4(context, ua4.n, wo.g, b05.c);
                    d05Var.c = ua4Var;
                }
                bib b2 = cib.b();
                b2.c = new o94[]{wfd.b};
                b2.b = false;
                b2.a = new et8((Object) p3dVar, (byte) 25);
                ua4Var.e(2, b2.a());
                return true;
            }
        }
        return false;
    }

    public final void h(ot2 ot2Var, int i) {
        if (g(ot2Var, i)) {
            return;
        }
        q79 q79Var = this.y;
        q79Var.sendMessage(q79Var.obtainMessage(5, i, 0, ot2Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x02ef  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        w3d w3dVar;
        boolean z;
        o94[] f;
        zo zoVar = ua4.o;
        int i = message.what;
        oib oibVar = oib.b;
        Context context = this.e;
        q79 q79Var = this.y;
        ConcurrentHashMap concurrentHashMap = this.s;
        switch (i) {
            case 1:
                this.a = (int) (true != ((Boolean) message.obj).booleanValue() ? 300000L : 10000L);
                q79Var.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    q79Var.sendMessageDelayed(q79Var.obtainMessage(12, (gp) it.next()), this.a);
                }
                return true;
            case 2:
                message.obj.getClass();
                rjb.p();
                return false;
            case 3:
                for (w3d w3dVar2 : concurrentHashMap.values()) {
                    ite.d(w3dVar2.o.y);
                    w3dVar2.m = null;
                    w3dVar2.o();
                }
                return true;
            case 4:
            case 8:
            case 13:
                h4d h4dVar = (h4d) message.obj;
                c05 c05Var = h4dVar.c;
                z4d z4dVar = h4dVar.a;
                w3d w3dVar3 = (w3d) concurrentHashMap.get(c05Var.f);
                if (w3dVar3 == null) {
                    w3dVar3 = b(c05Var);
                }
                if (!w3dVar3.b.w() || this.r.get() == h4dVar.b) {
                    w3dVar3.m(z4dVar);
                    return true;
                }
                z4dVar.a(F);
                w3dVar3.n();
                return true;
            case 5:
                int i2 = message.arg1;
                ot2 ot2Var = (ot2) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        w3dVar = (w3d) it2.next();
                        if (w3dVar.i == i2) {
                        }
                    } else {
                        w3dVar = null;
                    }
                }
                if (w3dVar == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 65);
                    sb.append("Could not find API instance ");
                    sb.append(i2);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    return true;
                }
                int i3 = ot2Var.b;
                if (i3 != 13) {
                    w3dVar.g(d(w3dVar.c, ot2Var));
                    return true;
                }
                this.f.getClass();
                int i4 = x05.e;
                String d = ot2.d(i3);
                String str = ot2Var.d;
                StringBuilder sb2 = new StringBuilder(d.length() + 69 + String.valueOf(str).length());
                sb2.append("Error resolution was canceled by the user, original error message: ");
                sb2.append(d);
                sb2.append(": ");
                sb2.append(str);
                w3dVar.g(new Status(17, sb2.toString(), null, null));
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    oe0.b((Application) context.getApplicationContext());
                    oe0 oe0Var = oe0.e;
                    oe0Var.a(new v3d(this));
                    AtomicBoolean atomicBoolean = oe0Var.a;
                    AtomicBoolean atomicBoolean2 = oe0Var.b;
                    if (!atomicBoolean2.get()) {
                        if (fp.H()) {
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
                b((c05) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    w3d w3dVar4 = (w3d) concurrentHashMap.get(message.obj);
                    ite.d(w3dVar4.o.y);
                    if (w3dVar4.k) {
                        w3dVar4.o();
                        return true;
                    }
                }
                return true;
            case 10:
                st stVar = this.x;
                stVar.getClass();
                nt ntVar = new nt(stVar);
                while (ntVar.hasNext()) {
                    w3d w3dVar5 = (w3d) concurrentHashMap.remove((gp) ntVar.next());
                    if (w3dVar5 != null) {
                        w3dVar5.n();
                    }
                }
                stVar.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    w3d w3dVar6 = (w3d) concurrentHashMap.get(message.obj);
                    i05 i05Var = w3dVar6.o;
                    ite.d(i05Var.y);
                    boolean z2 = w3dVar6.k;
                    if (z2) {
                        if (z2) {
                            i05 i05Var2 = w3dVar6.o;
                            gp gpVar = w3dVar6.c;
                            i05Var2.y.removeMessages(11, gpVar);
                            i05Var2.y.removeMessages(9, gpVar);
                            w3dVar6.k = false;
                        }
                        w3dVar6.g(i05Var.f.c(i05Var.e, e05.a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        w3dVar6.b.d("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    w3d w3dVar7 = (w3d) concurrentHashMap.get(message.obj);
                    ite.d(w3dVar7.o.y);
                    zz4 zz4Var = w3dVar7.b;
                    if (zz4Var.q() && w3dVar7.f.isEmpty()) {
                        rhb rhbVar = w3dVar7.d;
                        if (((Map) rhbVar.b).isEmpty() && ((Map) rhbVar.c).isEmpty()) {
                            zz4Var.d("Timing out service connection.");
                            return true;
                        }
                        w3dVar7.h();
                    }
                    return true;
                }
                return true;
            case 14:
                message.obj.getClass();
                rjb.p();
                return false;
            case 15:
                x3d x3dVar = (x3d) message.obj;
                if (concurrentHashMap.containsKey(x3dVar.a)) {
                    w3d w3dVar8 = (w3d) concurrentHashMap.get(x3dVar.a);
                    if (w3dVar8.l.contains(x3dVar) && !w3dVar8.k) {
                        if (w3dVar8.b.q()) {
                            w3dVar8.d();
                            return true;
                        }
                        w3dVar8.o();
                        return true;
                    }
                }
                return true;
            case 16:
                x3d x3dVar2 = (x3d) message.obj;
                if (concurrentHashMap.containsKey(x3dVar2.a)) {
                    w3d w3dVar9 = (w3d) concurrentHashMap.get(x3dVar2.a);
                    if (w3dVar9.l.remove(x3dVar2)) {
                        i05 i05Var3 = w3dVar9.o;
                        i05Var3.y.removeMessages(15, x3dVar2);
                        i05Var3.y.removeMessages(16, x3dVar2);
                        o94 o94Var = x3dVar2.b;
                        LinkedList<z4d> linkedList = w3dVar9.a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        for (z4d z4dVar2 : linkedList) {
                            if ((z4dVar2 instanceof e4d) && (f = ((e4d) z4dVar2).f(w3dVar9)) != null) {
                                int length = f.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= length) {
                                        break;
                                    }
                                    if (!fse.a(f[i5], o94Var)) {
                                        i5++;
                                    } else if (i5 >= 0) {
                                        arrayList.add(z4dVar2);
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            z4d z4dVar3 = (z4d) arrayList.get(i6);
                            linkedList.remove(z4dVar3);
                            z4dVar3.b(new e8c(o94Var));
                        }
                    }
                }
                return true;
            case 17:
                nib nibVar = this.c;
                if (nibVar != null) {
                    if (nibVar.a > 0 || f()) {
                        ua4 ua4Var = this.d;
                        if (ua4Var == null) {
                            ua4Var = new ua4(context, zoVar, oibVar, b05.c);
                            this.d = ua4Var;
                        }
                        ua4Var.i(nibVar);
                    }
                    this.c = null;
                    return true;
                }
                return true;
            case 18:
                d4d d4dVar = (d4d) message.obj;
                long j = d4dVar.c;
                uf7 uf7Var = d4dVar.a;
                int i7 = d4dVar.b;
                if (j == 0) {
                    nib nibVar2 = new nib(i7, Arrays.asList(uf7Var));
                    ua4 ua4Var2 = this.d;
                    if (ua4Var2 == null) {
                        ua4Var2 = new ua4(context, zoVar, oibVar, b05.c);
                        this.d = ua4Var2;
                    }
                    ua4Var2.i(nibVar2);
                    return true;
                }
                nib nibVar3 = this.c;
                if (nibVar3 != null) {
                    List list = nibVar3.b;
                    if (nibVar3.a != i7 || (list != null && list.size() >= d4dVar.d)) {
                        q79Var.removeMessages(17);
                        nib nibVar4 = this.c;
                        if (nibVar4 != null) {
                            if (nibVar4.a > 0 || f()) {
                                ua4 ua4Var3 = this.d;
                                if (ua4Var3 == null) {
                                    ua4Var3 = new ua4(context, zoVar, oibVar, b05.c);
                                    this.d = ua4Var3;
                                }
                                ua4Var3.i(nibVar4);
                            }
                            this.c = null;
                        }
                    } else {
                        nib nibVar5 = this.c;
                        if (nibVar5.b == null) {
                            nibVar5.b = new ArrayList();
                        }
                        nibVar5.b.add(uf7Var);
                    }
                }
                if (this.c == null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(uf7Var);
                    this.c = new nib(i7, arrayList2);
                    q79Var.sendMessageDelayed(q79Var.obtainMessage(17), j);
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
