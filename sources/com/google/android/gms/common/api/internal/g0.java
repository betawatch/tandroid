package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import m.p3;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class g0 implements k0 {
    public n6.h E;
    public boolean F;
    public boolean G;
    public final p3 H;
    public final Map I;
    public final a8.d J;
    public final m0 a;
    public final Lock b;
    public final Context c;
    public final k6.e d;
    public k6.a e;
    public int f;
    public int n;
    public o8.a v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int h = 0;
    public final Bundle r = new Bundle();
    public final HashSet s = new HashSet();
    public final ArrayList K = new ArrayList();

    public g0(m0 m0Var, p3 p3Var, Map map, k6.e eVar, a8.d dVar, Lock lock, Context context) {
        this.a = m0Var;
        this.H = p3Var;
        this.I = map;
        this.d = eVar;
        this.J = dVar;
        this.b = lock;
        this.c = context;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final e A(e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void a() {
        this.x = false;
        m0 m0Var = this.a;
        j0 j0Var = m0Var.o;
        HashMap hashMap = m0Var.i;
        j0Var.F = Collections.EMPTY_SET;
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            com.google.android.gms.common.api.d dVar = (com.google.android.gms.common.api.d) it.next();
            if (!hashMap.containsKey(dVar)) {
                hashMap.put(dVar, new k6.a(17, null));
            }
        }
    }

    public final void b(boolean z10) {
        o8.a aVar = this.v;
        if (aVar != null) {
            if (aVar.j() && z10) {
                aVar.getClass();
                try {
                    o8.e eVar = (o8.e) aVar.u();
                    Integer num = aVar.X;
                    n6.l.h(num);
                    int intValue = num.intValue();
                    Parcel I0 = eVar.I0();
                    I0.writeInt(intValue);
                    eVar.J0(I0, 7);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            aVar.disconnect();
            n6.l.h(this.H);
            this.E = null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void c(Bundle bundle) {
        if (i(1)) {
            if (bundle != null) {
                this.r.putAll(bundle);
            }
            if (j()) {
                d();
            }
        }
    }

    public final void d() {
        m0 m0Var = this.a;
        m0Var.a.lock();
        try {
            m0Var.o.h();
            m0Var.m = new a0(m0Var);
            m0Var.m.x();
            m0Var.b.signalAll();
            m0Var.a.unlock();
            n0.a.execute(new androidx.activity.i(this, 12));
            o8.a aVar = this.v;
            if (aVar != null) {
                if (this.F) {
                    n6.h hVar = this.E;
                    n6.l.h(hVar);
                    boolean z10 = this.G;
                    aVar.getClass();
                    try {
                        o8.e eVar = (o8.e) aVar.u();
                        Integer num = aVar.X;
                        n6.l.h(num);
                        int intValue = num.intValue();
                        Parcel I0 = eVar.I0();
                        k7.a.d(I0, hVar);
                        I0.writeInt(intValue);
                        I0.writeInt(z10 ? 1 : 0);
                        eVar.J0(I0, 9);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                b(false);
            }
            Iterator it = this.a.i.keySet().iterator();
            while (it.hasNext()) {
                com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) this.a.f.get((com.google.android.gms.common.api.d) it.next());
                n6.l.h(cVar);
                cVar.disconnect();
            }
            this.a.p.v(this.r.isEmpty() ? null : this.r);
        } catch (Throwable th2) {
            m0Var.a.unlock();
            throw th2;
        }
    }

    public final void e(k6.a aVar) {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        arrayList.clear();
        b(!aVar.b());
        m0 m0Var = this.a;
        m0Var.h();
        m0Var.p.m(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2.d.b(null, null, r3.b) != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
        eVar.a.getClass();
        if (z10 && !aVar.b()) {
        }
        if (this.e == null || Integer.MAX_VALUE < this.f) {
            this.e = aVar;
            this.f = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        this.a.i.put(eVar.b, aVar);
    }

    public final void h() {
        if (this.n != 0) {
            return;
        }
        if (!this.x || this.y) {
            ArrayList arrayList = new ArrayList();
            this.h = 1;
            m0 m0Var = this.a;
            Map map = m0Var.f;
            Map map2 = m0Var.f;
            this.n = map.size();
            for (com.google.android.gms.common.api.d dVar : map2.keySet()) {
                if (!m0Var.i.containsKey(dVar)) {
                    arrayList.add((com.google.android.gms.common.api.c) map2.get(dVar));
                } else if (j()) {
                    d();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.K.add(n0.a.submit(new d0(this, arrayList, 1)));
        }
    }

    public final boolean i(int i10) {
        if (this.h == i10) {
            return true;
        }
        j0 j0Var = this.a.o;
        j0Var.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(j0Var.f);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(j0Var.r);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(j0Var.n.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(((Set) j0Var.M.a).size());
        x0 x0Var = j0Var.d;
        if (x0Var != null) {
            x0Var.g("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        Log.w("GACConnecting", "mRemainingConnections=" + this.n);
        StringBuilder v = a4.a.v("GoogleApiClient connecting is in step ", this.h != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN", " but received callback for step ");
        v.append(i10 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN");
        Log.e("GACConnecting", v.toString(), new Exception());
        e(new k6.a(8, null));
        return false;
    }

    public final boolean j() {
        m0 m0Var = this.a;
        int i10 = this.n - 1;
        this.n = i10;
        if (i10 > 0) {
            return false;
        }
        if (i10 >= 0) {
            k6.a aVar = this.e;
            if (aVar == null) {
                return true;
            }
            m0Var.n = this.f;
            e(aVar);
            return false;
        }
        j0 j0Var = m0Var.o;
        j0Var.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(j0Var.f);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(j0Var.r);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(j0Var.n.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(((Set) j0Var.M.a).size());
        x0 x0Var = j0Var.d;
        if (x0Var != null) {
            x0Var.g("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        e(new k6.a(8, null));
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void u(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
        if (i(1)) {
            g(aVar, eVar, z10);
            if (j()) {
                d();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void w(int i10) {
        e(new k6.a(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void x() {
        m0 m0Var = this.a;
        HashMap hashMap = m0Var.i;
        j0 j0Var = m0Var.o;
        Map map = m0Var.f;
        hashMap.clear();
        this.x = false;
        this.e = null;
        this.h = 0;
        this.w = true;
        this.y = false;
        this.F = false;
        HashMap hashMap2 = new HashMap();
        Map map2 = this.I;
        for (com.google.android.gms.common.api.e eVar : map2.keySet()) {
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) map.get(eVar.b);
            n6.l.h(cVar);
            com.google.android.gms.common.api.c cVar2 = cVar;
            eVar.a.getClass();
            boolean booleanValue = ((Boolean) map2.get(eVar)).booleanValue();
            if (cVar2.p()) {
                this.x = true;
                if (booleanValue) {
                    this.s.add(eVar.b);
                } else {
                    this.w = false;
                }
            }
            hashMap2.put(cVar2, new b0(this, eVar, booleanValue));
        }
        if (this.x) {
            p3 p3Var = this.H;
            n6.l.h(p3Var);
            n6.l.h(this.J);
            p3Var.h = Integer.valueOf(System.identityHashCode(j0Var));
            f0 f0Var = new f0(this);
            this.v = (o8.a) this.J.a(this.c, j0Var.h, p3Var, (n8.a) p3Var.f, f0Var, f0Var);
        }
        this.n = map.size();
        this.K.add(n0.a.submit(new d0(this, hashMap2, 0)));
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final boolean z() {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        arrayList.clear();
        b(true);
        this.a.h();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void f() {
    }
}
