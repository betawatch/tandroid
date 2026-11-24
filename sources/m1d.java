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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class m1d extends gy4 implements y1d {
    public ucb E;
    public final ps F;
    public Set G;
    public final ntb H;
    public final ps I;
    public final op5 J;
    public final s34 K;
    public final ArrayList L;
    public Integer M;
    public final lv6 N;
    public final ReentrantLock b;
    public final d3d c;
    public z1d d;
    public final int e;
    public final Context f;
    public final Looper h;
    public final LinkedList n;
    public volatile boolean r;
    public final int s;
    public final short w;
    public final k1d x;
    public final cy4 y;

    public m1d(Context context, ReentrantLock reentrantLock, Looper looper, ntb ntbVar, ps psVar, ArrayList arrayList, ArrayList arrayList2, ps psVar2, int i, ArrayList arrayList3) {
        cy4 cy4Var = cy4.e;
        op5 op5Var = n2d.a;
        this.d = null;
        this.n = new LinkedList();
        this.s = 120000;
        this.w = (short) 5000;
        this.G = new HashSet();
        this.K = new s34((byte) 11);
        this.M = null;
        ny4 ny4Var = new ny4();
        ny4Var.a = this;
        this.f = context;
        this.b = reentrantLock;
        this.c = new d3d(looper, ny4Var);
        this.h = looper;
        int i2 = 0;
        this.x = new k1d(this, looper, (byte) 0);
        this.y = cy4Var;
        this.e = -1;
        this.I = psVar;
        this.F = psVar2;
        this.L = arrayList3;
        this.N = new lv6((byte) 2);
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ey4 ey4Var = (ey4) obj;
            d3d d3dVar = this.c;
            d3dVar.getClass();
            fre.h(ey4Var);
            synchronized (d3dVar.r) {
                ArrayList arrayList4 = d3dVar.b;
                if (arrayList4.contains(ey4Var)) {
                    String valueOf = String.valueOf(ey4Var);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 62);
                    sb.append("registerConnectionCallbacks(): listener ");
                    sb.append(valueOf);
                    sb.append(" is already registered");
                    Log.w("GmsClientEvents", sb.toString());
                } else {
                    arrayList4.add(ey4Var);
                }
            }
            if (d3dVar.a.a()) {
                o59 o59Var = d3dVar.n;
                o59Var.sendMessage(o59Var.obtainMessage(1, ey4Var));
            }
        }
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            this.c.a((fy4) obj2);
        }
        this.H = ntbVar;
        this.J = op5Var;
    }

    public static int f(Collection collection, boolean z) {
        Iterator it = collection.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            xx4 xx4Var = (xx4) it.next();
            z2 |= xx4Var.w();
            z3 |= xx4Var instanceof z3d;
        }
        if (z2) {
            return (z3 && z) ? 2 : 1;
        }
        return 3;
    }

    @Override // y1d
    public final void R0(Bundle bundle) {
        while (true) {
            LinkedList linkedList = this.n;
            if (linkedList.isEmpty()) {
                d3d d3dVar = this.c;
                o59 o59Var = d3dVar.n;
                if (Looper.myLooper() != o59Var.getLooper()) {
                    sc8.j("onConnectionSuccess must only be called on the Handler thread");
                    return;
                }
                synchronized (d3dVar.r) {
                    fre.k(!d3dVar.h);
                    o59Var.removeMessages(1);
                    d3dVar.h = true;
                    ArrayList arrayList = d3dVar.c;
                    fre.k(arrayList.isEmpty());
                    ArrayList arrayList2 = new ArrayList(d3dVar.b);
                    AtomicInteger atomicInteger = d3dVar.f;
                    int i = atomicInteger.get();
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        ey4 ey4Var = (ey4) obj;
                        if (!d3dVar.e || !d3dVar.a.a() || atomicInteger.get() != i) {
                            break;
                        } else if (!arrayList.contains(ey4Var)) {
                            ey4Var.onConnected(bundle);
                        }
                    }
                    arrayList.clear();
                    d3dVar.h = false;
                }
                return;
            }
            ig0 ig0Var = (ig0) linkedList.remove();
            ps psVar = this.F;
            yn ynVar = ig0Var.p;
            boolean containsKey = psVar.containsKey(ig0Var.o);
            String str = ynVar != null ? ynVar.c : "the API";
            StringBuilder sb = new StringBuilder(str.length() + 65);
            sb.append("GoogleApiClient is not configured to use ");
            sb.append(str);
            sb.append(" required for this call.");
            fre.a(sb.toString(), containsKey);
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                z1d z1dVar = this.d;
                if (z1dVar == null) {
                    throw new IllegalStateException("GoogleApiClient is not connected yet.");
                }
                if (this.r) {
                    LinkedList linkedList2 = this.n;
                    linkedList2.add(ig0Var);
                    while (!linkedList2.isEmpty()) {
                        ig0 ig0Var2 = (ig0) linkedList2.remove();
                        lv6 lv6Var = this.N;
                        ((Set) lv6Var.b).add(ig0Var2);
                        ig0Var2.g.set((k2d) lv6Var.c);
                        ig0Var2.o(Status.h);
                    }
                    reentrantLock.unlock();
                } else {
                    z1dVar.e(ig0Var);
                }
            } finally {
                this.b.unlock();
            }
        }
    }

    @Override // gy4
    public final boolean a(v3d v3dVar) {
        z1d z1dVar = this.d;
        return z1dVar != null && z1dVar.b(v3dVar);
    }

    @Override // gy4
    public final void b() {
        z1d z1dVar = this.d;
        if (z1dVar != null) {
            z1dVar.f();
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
                fre.j("Sign-in mode should have been set explicitly by auto-manage.", num != null);
            } else if (num == null) {
                this.M = Integer.valueOf(f(this.F.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            Integer num2 = this.M;
            fre.h(num2);
            int intValue = num2.intValue();
            reentrantLock.lock();
            if (intValue == 3 || intValue == 1) {
                i2 = intValue;
            } else if (intValue != 2) {
                i2 = intValue;
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 22);
                sb.append("Illegal sign-in mode: ");
                sb.append(i2);
                fre.a(sb.toString(), z);
                h(i2);
                i();
                reentrantLock.unlock();
            }
            z = true;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 22);
            sb2.append("Illegal sign-in mode: ");
            sb2.append(i2);
            fre.a(sb2.toString(), z);
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
            this.N.O();
            z1d z1dVar = this.d;
            if (z1dVar != null) {
                z1dVar.c();
            }
            Set set = (Set) this.K.b;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((w56) it.next()).b = null;
            }
            set.clear();
            LinkedList<ig0> linkedList = this.n;
            for (ig0 ig0Var : linkedList) {
                ig0Var.g.set(null);
                ig0Var.c();
            }
            linkedList.clear();
            if (this.d != null) {
                e();
                d3d d3dVar = this.c;
                d3dVar.e = false;
                d3dVar.f.incrementAndGet();
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
        k1d k1dVar = this.x;
        k1dVar.removeMessages(2);
        k1dVar.removeMessages(1);
        ucb ucbVar = this.E;
        if (ucbVar != null) {
            ucbVar.b();
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
        ps psVar = this.F;
        Iterator it = ((js) psVar.values()).iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            xx4 xx4Var = (xx4) it.next();
            z |= xx4Var.w();
            z2 |= xx4Var instanceof z3d;
        }
        int intValue2 = this.M.intValue();
        ArrayList arrayList = this.L;
        ReentrantLock reentrantLock2 = this.b;
        if (intValue2 == 1) {
            reentrantLock = reentrantLock2;
            if (!z) {
                sc8.j("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                return;
            } else {
                if (z2) {
                    sc8.j("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    return;
                }
                psVar = psVar;
            }
        } else {
            if (intValue2 == 2 && z) {
                ps psVar2 = new ps(0);
                ps psVar3 = new ps(0);
                Iterator it2 = ((ls) psVar.entrySet()).iterator();
                xx4 xx4Var2 = null;
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    xx4 xx4Var3 = (xx4) entry.getValue();
                    xx4 xx4Var4 = xx4Var3;
                    xx4Var4.getClass();
                    if (true == (xx4Var4 instanceof z3d)) {
                        xx4Var2 = xx4Var3;
                    }
                    if (xx4Var3.w()) {
                        psVar2.put((wn) entry.getKey(), xx4Var3);
                    } else {
                        psVar3.put((wn) entry.getKey(), xx4Var3);
                    }
                }
                fre.j("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !psVar2.isEmpty());
                ps psVar4 = new ps(0);
                ps psVar5 = new ps(0);
                ps psVar6 = this.I;
                Iterator it3 = ((ns) psVar6.keySet()).iterator();
                while (it3.hasNext()) {
                    yn ynVar = (yn) it3.next();
                    wn wnVar = ynVar.b;
                    if (psVar2.containsKey(wnVar)) {
                        psVar4.put(ynVar, (Boolean) psVar6.get(ynVar));
                    } else {
                        if (!psVar3.containsKey(wnVar)) {
                            sc8.j("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                            return;
                        }
                        psVar5.put(ynVar, (Boolean) psVar6.get(ynVar));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    h3d h3dVar = (h3d) arrayList.get(i2);
                    yn ynVar2 = h3dVar.a;
                    if (psVar4.containsKey(ynVar2)) {
                        arrayList2.add(h3dVar);
                    } else {
                        if (!psVar5.containsKey(ynVar2)) {
                            sc8.j("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                            return;
                        }
                        arrayList3.add(h3dVar);
                    }
                }
                this.d = new k3d(this.f, this, reentrantLock2, this.h, this.y, psVar2, psVar3, this.H, this.J, xx4Var2, arrayList2, arrayList3, psVar4, psVar5);
                return;
            }
            reentrantLock = reentrantLock2;
        }
        this.d = new r1d(this.f, this, reentrantLock, this.h, this.y, psVar, this.H, this.I, this.J, arrayList, this);
    }

    public final void i() {
        this.c.e = true;
        z1d z1dVar = this.d;
        fre.h(z1dVar);
        z1dVar.a();
    }

    @Override // y1d
    public final void n0(int i) {
        if (i == 1) {
            if (!this.r) {
                this.r = true;
                if (this.E == null) {
                    try {
                        cy4 cy4Var = this.y;
                        Context applicationContext = this.f.getApplicationContext();
                        l1d l1dVar = new l1d(this);
                        cy4Var.getClass();
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        ucb ucbVar = new ucb(l1dVar);
                        rr.n(applicationContext, ucbVar, intentFilter);
                        ucbVar.b = applicationContext;
                        if (!yy4.d(applicationContext)) {
                            l1dVar.a();
                            ucbVar.b();
                            ucbVar = null;
                        }
                        this.E = ucbVar;
                    } catch (SecurityException unused) {
                    }
                }
                k1d k1dVar = this.x;
                k1dVar.sendMessageDelayed(k1dVar.obtainMessage(1), this.s);
                k1dVar.sendMessageDelayed(k1dVar.obtainMessage(2), this.w);
            }
            i = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) ((Set) this.N.b).toArray(new BasePendingResult[0])) {
            basePendingResult.e(lv6.f);
        }
        d3d d3dVar = this.c;
        o59 o59Var = d3dVar.n;
        if (Looper.myLooper() != o59Var.getLooper()) {
            sc8.j("onUnintentionalDisconnection must only be called on the Handler thread");
            return;
        }
        o59Var.removeMessages(1);
        synchronized (d3dVar.r) {
            d3dVar.h = true;
            ArrayList arrayList = d3dVar.b;
            ArrayList arrayList2 = new ArrayList(arrayList);
            AtomicInteger atomicInteger = d3dVar.f;
            int i2 = atomicInteger.get();
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                ey4 ey4Var = (ey4) obj;
                if (!d3dVar.e || atomicInteger.get() != i2) {
                    break;
                } else if (arrayList.contains(ey4Var)) {
                    ey4Var.onConnectionSuspended(i);
                }
            }
            d3dVar.c.clear();
            d3dVar.h = false;
        }
        d3dVar.e = false;
        d3dVar.f.incrementAndGet();
        if (i == 2) {
            i();
        }
    }

    @Override // y1d
    public final void o(ds2 ds2Var) {
        cy4 cy4Var = this.y;
        Context context = this.f;
        int i = ds2Var.b;
        cy4Var.getClass();
        int i2 = yy4.e;
        if (!(i == 18 ? true : i == 1 ? yy4.d(context) : false)) {
            e();
        }
        if (this.r) {
            return;
        }
        d3d d3dVar = this.c;
        o59 o59Var = d3dVar.n;
        if (Looper.myLooper() != o59Var.getLooper()) {
            sc8.j("onConnectionFailure must only be called on the Handler thread");
            return;
        }
        o59Var.removeMessages(1);
        synchronized (d3dVar.r) {
            ArrayList arrayList = d3dVar.d;
            ArrayList arrayList2 = new ArrayList(arrayList);
            AtomicInteger atomicInteger = d3dVar.f;
            int i3 = atomicInteger.get();
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                fy4 fy4Var = (fy4) obj;
                if (!d3dVar.e || atomicInteger.get() != i3) {
                    break;
                } else if (arrayList.contains(fy4Var)) {
                    fy4Var.onConnectionFailed(ds2Var);
                }
            }
        }
        d3dVar.e = false;
        d3dVar.f.incrementAndGet();
    }
}
