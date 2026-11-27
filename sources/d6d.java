// default package

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class d6d extends m05 implements p6d {
    public qgb E;
    public final qs F;
    public Set G;
    public final oxb H;
    public final qs I;
    public final rr5 J;
    public final aj3 K;
    public final ArrayList L;
    public Integer M;
    public final qx6 N;
    public final ReentrantLock b;
    public final u7d c;
    public q6d d;
    public final int e;
    public final Context f;
    public final Looper h;
    public final LinkedList n;
    public volatile boolean r;
    public final int s;
    public final short w;
    public final b6d x;
    public final i05 y;

    public d6d(Context context, ReentrantLock reentrantLock, Looper looper, oxb oxbVar, qs qsVar, ArrayList arrayList, ArrayList arrayList2, qs qsVar2, int i, ArrayList arrayList3) {
        i05 i05Var = i05.e;
        rr5 rr5Var = e7d.a;
        this.d = null;
        this.n = new LinkedList();
        this.s = 120000;
        this.w = (short) 5000;
        this.G = new HashSet();
        this.K = new aj3((byte) 16);
        this.M = null;
        pq8 pq8Var = new pq8((Object) this, (byte) 27);
        this.f = context;
        this.b = reentrantLock;
        this.c = new u7d(looper, pq8Var);
        this.h = looper;
        int i2 = 0;
        this.x = new b6d(this, looper, (byte) 0);
        this.y = i05Var;
        this.e = -1;
        this.I = qsVar;
        this.F = qsVar2;
        this.L = arrayList3;
        this.N = new qx6((byte) 2);
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            k05 k05Var = (k05) obj;
            u7d u7dVar = this.c;
            u7dVar.getClass();
            xve.h(k05Var);
            synchronized (u7dVar.r) {
                ArrayList arrayList4 = u7dVar.b;
                if (arrayList4.contains(k05Var)) {
                    String valueOf = String.valueOf(k05Var);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 62);
                    sb.append("registerConnectionCallbacks(): listener ");
                    sb.append(valueOf);
                    sb.append(" is already registered");
                    Log.w("GmsClientEvents", sb.toString());
                } else {
                    arrayList4.add(k05Var);
                }
            }
            if (u7dVar.a.s()) {
                b99 b99Var = u7dVar.n;
                b99Var.sendMessage(b99Var.obtainMessage(1, k05Var));
            }
        }
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            this.c.a((l05) obj2);
        }
        this.H = oxbVar;
        this.J = rr5Var;
    }

    public static int f(Collection collection, boolean z) {
        Iterator it = collection.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            d05 d05Var = (d05) it.next();
            z2 |= d05Var.w();
            z3 |= d05Var instanceof q8d;
        }
        if (z2) {
            return (z3 && z) ? 2 : 1;
        }
        return 3;
    }

    @Override // m05
    public final boolean a(m8d m8dVar) {
        q6d q6dVar = this.d;
        return q6dVar != null && q6dVar.b(m8dVar);
    }

    @Override // m05
    public final void b() {
        q6d q6dVar = this.d;
        if (q6dVar != null) {
            q6dVar.f();
        }
    }

    public final void c() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            int i = this.e;
            Integer num = this.M;
            int i2 = 2;
            boolean z = false;
            if (i >= 0) {
                xve.j("Sign-in mode should have been set explicitly by auto-manage.", num != null);
            } else if (num == null) {
                this.M = Integer.valueOf(f(this.F.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            Integer num2 = this.M;
            xve.h(num2);
            int intValue = num2.intValue();
            reentrantLock.lock();
            if (intValue == 3 || intValue == 1) {
                i2 = intValue;
            } else if (intValue != 2) {
                i2 = intValue;
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 22);
                sb.append("Illegal sign-in mode: ");
                sb.append(i2);
                xve.a(sb.toString(), z);
                h(i2);
                i();
                reentrantLock.unlock();
            }
            z = true;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 22);
            sb2.append("Illegal sign-in mode: ");
            sb2.append(i2);
            xve.a(sb2.toString(), z);
            h(i2);
            i();
            reentrantLock.unlock();
        } catch (Throwable th) {
            throw th;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.N.R();
            q6d q6dVar = this.d;
            if (q6dVar != null) {
                q6dVar.d();
            }
            Set set = (Set) this.K.b;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((a86) it.next()).b = null;
            }
            set.clear();
            LinkedList<jg0> linkedList = this.n;
            for (jg0 jg0Var : linkedList) {
                jg0Var.g.set(null);
                jg0Var.c();
            }
            linkedList.clear();
            if (this.d != null) {
                e();
                u7d u7dVar = this.c;
                u7dVar.e = false;
                u7dVar.f.incrementAndGet();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    public final boolean e() {
        if (!this.r) {
            return false;
        }
        this.r = false;
        b6d b6dVar = this.x;
        b6dVar.removeMessages(2);
        b6dVar.removeMessages(1);
        qgb qgbVar = this.E;
        if (qgbVar != null) {
            qgbVar.b();
            this.E = null;
        }
        return true;
    }

    public final /* synthetic */ void g() {
        this.b.lock();
        try {
            if (this.r) {
                i();
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // p6d
    public final void g1(Bundle bundle) {
        while (true) {
            LinkedList linkedList = this.n;
            if (linkedList.isEmpty()) {
                u7d u7dVar = this.c;
                b99 b99Var = u7dVar.n;
                if (Looper.myLooper() != b99Var.getLooper()) {
                    grb.i("onConnectionSuccess must only be called on the Handler thread");
                    return;
                }
                synchronized (u7dVar.r) {
                    xve.k(!u7dVar.h);
                    b99Var.removeMessages(1);
                    u7dVar.h = true;
                    ArrayList arrayList = u7dVar.c;
                    xve.k(arrayList.isEmpty());
                    ArrayList arrayList2 = new ArrayList(u7dVar.b);
                    AtomicInteger atomicInteger = u7dVar.f;
                    int i = atomicInteger.get();
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        k05 k05Var = (k05) obj;
                        if (!u7dVar.e || !u7dVar.a.s() || atomicInteger.get() != i) {
                            break;
                        } else if (!arrayList.contains(k05Var)) {
                            k05Var.onConnected(bundle);
                        }
                    }
                    arrayList.clear();
                    u7dVar.h = false;
                }
                return;
            }
            jg0 jg0Var = (jg0) linkedList.remove();
            qs qsVar = this.F;
            zn znVar = jg0Var.p;
            boolean containsKey = qsVar.containsKey(jg0Var.o);
            String str = znVar != null ? znVar.c : "the API";
            StringBuilder sb = new StringBuilder(str.length() + 65);
            sb.append("GoogleApiClient is not configured to use ");
            sb.append(str);
            sb.append(" required for this call.");
            xve.a(sb.toString(), containsKey);
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                q6d q6dVar = this.d;
                if (q6dVar == null) {
                    throw new IllegalStateException("GoogleApiClient is not connected yet.");
                }
                if (this.r) {
                    LinkedList linkedList2 = this.n;
                    linkedList2.add(jg0Var);
                    while (!linkedList2.isEmpty()) {
                        jg0 jg0Var2 = (jg0) linkedList2.remove();
                        qx6 qx6Var = this.N;
                        ((Set) qx6Var.b).add(jg0Var2);
                        jg0Var2.g.set((b7d) qx6Var.c);
                        jg0Var2.o(Status.h);
                    }
                    reentrantLock.unlock();
                } else {
                    q6dVar.c(jg0Var);
                }
            } finally {
                this.b.unlock();
            }
        }
    }

    public final void h(int i) {
        ReentrantLock reentrantLock;
        Integer num = this.M;
        if (num == null) {
            this.M = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            int intValue = this.M.intValue();
            String str = intValue != 1 ? intValue != 2 ? intValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            String str2 = i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            StringBuilder sb = new StringBuilder(str.length() + str2.length() + 51);
            sb.append("Cannot use sign-in mode: ");
            sb.append(str2);
            sb.append(". Mode was already set to ");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
        if (this.d != null) {
            return;
        }
        qs qsVar = this.F;
        Iterator it = ((ks) qsVar.values()).iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            d05 d05Var = (d05) it.next();
            z |= d05Var.w();
            z2 |= d05Var instanceof q8d;
        }
        int intValue2 = this.M.intValue();
        ArrayList arrayList = this.L;
        ReentrantLock reentrantLock2 = this.b;
        if (intValue2 == 1) {
            reentrantLock = reentrantLock2;
            if (!z) {
                grb.i("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                return;
            } else {
                if (z2) {
                    grb.i("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    return;
                }
                qsVar = qsVar;
            }
        } else {
            if (intValue2 == 2 && z) {
                qs qsVar2 = new qs(0);
                qs qsVar3 = new qs(0);
                Iterator it2 = ((ms) qsVar.entrySet()).iterator();
                d05 d05Var2 = null;
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    d05 d05Var3 = (d05) entry.getValue();
                    d05 d05Var4 = d05Var3;
                    d05Var4.getClass();
                    if (true == (d05Var4 instanceof q8d)) {
                        d05Var2 = d05Var3;
                    }
                    if (d05Var3.w()) {
                        qsVar2.put((xn) entry.getKey(), d05Var3);
                    } else {
                        qsVar3.put((xn) entry.getKey(), d05Var3);
                    }
                }
                xve.j("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !qsVar2.isEmpty());
                qs qsVar4 = new qs(0);
                qs qsVar5 = new qs(0);
                qs qsVar6 = this.I;
                Iterator it3 = ((os) qsVar6.keySet()).iterator();
                while (it3.hasNext()) {
                    zn znVar = (zn) it3.next();
                    xn xnVar = znVar.b;
                    if (qsVar2.containsKey(xnVar)) {
                        qsVar4.put(znVar, (Boolean) qsVar6.get(znVar));
                    } else {
                        if (!qsVar3.containsKey(xnVar)) {
                            grb.i("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                            return;
                        }
                        qsVar5.put(znVar, (Boolean) qsVar6.get(znVar));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    y7d y7dVar = (y7d) arrayList.get(i2);
                    zn znVar2 = y7dVar.a;
                    if (qsVar4.containsKey(znVar2)) {
                        arrayList2.add(y7dVar);
                    } else {
                        if (!qsVar5.containsKey(znVar2)) {
                            grb.i("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                            return;
                        }
                        arrayList3.add(y7dVar);
                    }
                }
                this.d = new b8d(this.f, this, reentrantLock2, this.h, this.y, qsVar2, qsVar3, this.H, this.J, d05Var2, arrayList2, arrayList3, qsVar4, qsVar5);
                return;
            }
            reentrantLock = reentrantLock2;
        }
        this.d = new i6d(this.f, this, reentrantLock, this.h, this.y, qsVar, this.H, this.I, this.J, arrayList, this);
    }

    public final void i() {
        this.c.e = true;
        q6d q6dVar = this.d;
        xve.h(q6dVar);
        q6dVar.a();
    }

    @Override // p6d
    public final void w(ws2 ws2Var) {
        i05 i05Var = this.y;
        Context context = this.f;
        int i = ws2Var.b;
        i05Var.getClass();
        int i2 = c15.e;
        if (!(i == 18 ? true : i == 1 ? c15.d(context) : false)) {
            e();
        }
        if (this.r) {
            return;
        }
        u7d u7dVar = this.c;
        b99 b99Var = u7dVar.n;
        if (Looper.myLooper() != b99Var.getLooper()) {
            grb.i("onConnectionFailure must only be called on the Handler thread");
            return;
        }
        b99Var.removeMessages(1);
        synchronized (u7dVar.r) {
            ArrayList arrayList = u7dVar.d;
            ArrayList arrayList2 = new ArrayList(arrayList);
            AtomicInteger atomicInteger = u7dVar.f;
            int i3 = atomicInteger.get();
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                l05 l05Var = (l05) obj;
                if (!u7dVar.e || atomicInteger.get() != i3) {
                    break;
                } else if (arrayList.contains(l05Var)) {
                    l05Var.onConnectionFailed(ws2Var);
                }
            }
        }
        u7dVar.e = false;
        u7dVar.f.incrementAndGet();
    }

    @Override // p6d
    public final void z0(int i) {
        if (i == 1) {
            if (!this.r) {
                this.r = true;
                if (this.E == null) {
                    try {
                        i05 i05Var = this.y;
                        Context applicationContext = this.f.getApplicationContext();
                        c6d c6dVar = new c6d(this);
                        i05Var.getClass();
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        qgb qgbVar = new qgb(c6dVar);
                        sr.n(applicationContext, qgbVar, intentFilter);
                        qgbVar.b = applicationContext;
                        if (!c15.d(applicationContext)) {
                            c6dVar.a();
                            qgbVar.b();
                            qgbVar = null;
                        }
                        this.E = qgbVar;
                    } catch (SecurityException unused) {
                    }
                }
                b6d b6dVar = this.x;
                b6dVar.sendMessageDelayed(b6dVar.obtainMessage(1), this.s);
                b6dVar.sendMessageDelayed(b6dVar.obtainMessage(2), this.w);
            }
            i = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) ((Set) this.N.b).toArray(new BasePendingResult[0])) {
            basePendingResult.e(qx6.f);
        }
        u7d u7dVar = this.c;
        b99 b99Var = u7dVar.n;
        if (Looper.myLooper() != b99Var.getLooper()) {
            grb.i("onUnintentionalDisconnection must only be called on the Handler thread");
            return;
        }
        b99Var.removeMessages(1);
        synchronized (u7dVar.r) {
            u7dVar.h = true;
            ArrayList arrayList = u7dVar.b;
            ArrayList arrayList2 = new ArrayList(arrayList);
            AtomicInteger atomicInteger = u7dVar.f;
            int i2 = atomicInteger.get();
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                k05 k05Var = (k05) obj;
                if (!u7dVar.e || atomicInteger.get() != i2) {
                    break;
                } else if (arrayList.contains(k05Var)) {
                    k05Var.onConnectionSuspended(i);
                }
            }
            u7dVar.c.clear();
            u7dVar.h = false;
        }
        u7dVar.e = false;
        u7dVar.f.incrementAndGet();
        if (i == 2) {
            i();
        }
    }
}
