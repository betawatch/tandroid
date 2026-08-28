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
import m.t3;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g0 implements k0 {
    public x5.h A;
    public boolean B;
    public boolean C;
    public final t3 D;
    public final Map E;
    public final b7.d F;
    public final m0 a;
    public final Lock b;
    public final Context c;
    public final u5.e d;
    public u5.a e;
    public int f;
    public int n;
    public y7.a v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int h = 0;
    public final Bundle r = new Bundle();
    public final HashSet s = new HashSet();
    public final ArrayList G = new ArrayList();

    public g0(m0 m0Var, t3 t3Var, Map map, u5.e eVar, b7.d dVar, Lock lock, Context context) {
        this.a = m0Var;
        this.D = t3Var;
        this.E = map;
        this.d = eVar;
        this.F = dVar;
        this.b = lock;
        this.c = context;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final boolean A() {
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((Future) arrayList.get(i9)).cancel(true);
        }
        arrayList.clear();
        c(true);
        this.a.h();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final e C(e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void a() {
        this.x = false;
        m0 m0Var = this.a;
        j0 j0Var = m0Var.o;
        HashMap hashMap = m0Var.i;
        j0Var.B = Collections.EMPTY_SET;
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            com.google.android.gms.common.api.d dVar = (com.google.android.gms.common.api.d) it.next();
            if (!hashMap.containsKey(dVar)) {
                hashMap.put(dVar, new u5.a(17, null));
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void b(Bundle bundle) {
        if (h(1)) {
            if (bundle != null) {
                this.r.putAll(bundle);
            }
            if (i()) {
                d();
            }
        }
    }

    public final void c(boolean z10) {
        y7.a aVar = this.v;
        if (aVar != null) {
            if (aVar.i() && z10) {
                aVar.getClass();
                try {
                    y7.e eVar = (y7.e) aVar.u();
                    Integer num = aVar.T;
                    x5.l.h(num);
                    int intValue = num.intValue();
                    Parcel G0 = eVar.G0();
                    G0.writeInt(intValue);
                    eVar.H0(G0, 7);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            aVar.disconnect();
            x5.l.h(this.D);
            this.A = null;
        }
    }

    public final void d() {
        m0 m0Var = this.a;
        m0Var.a.lock();
        try {
            m0Var.o.h();
            m0Var.m = new a0(m0Var);
            m0Var.m.v();
            m0Var.b.signalAll();
            m0Var.a.unlock();
            n0.a.execute(new androidx.activity.i(this, 12));
            y7.a aVar = this.v;
            if (aVar != null) {
                if (this.B) {
                    x5.h hVar = this.A;
                    x5.l.h(hVar);
                    boolean z10 = this.C;
                    aVar.getClass();
                    try {
                        y7.e eVar = (y7.e) aVar.u();
                        Integer num = aVar.T;
                        x5.l.h(num);
                        int intValue = num.intValue();
                        Parcel G0 = eVar.G0();
                        u6.a.d(G0, hVar);
                        G0.writeInt(intValue);
                        G0.writeInt(z10 ? 1 : 0);
                        eVar.H0(G0, 9);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                c(false);
            }
            Iterator it = this.a.i.keySet().iterator();
            while (it.hasNext()) {
                com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) this.a.f.get((com.google.android.gms.common.api.d) it.next());
                x5.l.h(cVar);
                cVar.disconnect();
            }
            this.a.p.s(this.r.isEmpty() ? null : this.r);
        } catch (Throwable th) {
            m0Var.a.unlock();
            throw th;
        }
    }

    public final void e(u5.a aVar) {
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((Future) arrayList.get(i9)).cancel(true);
        }
        arrayList.clear();
        c(!aVar.b());
        m0 m0Var = this.a;
        m0Var.h();
        m0Var.p.t(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2.d.b(null, null, r3.b) != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(u5.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
        eVar.a.getClass();
        if (z10 && !aVar.b()) {
        }
        if (this.e == null || Integer.MAX_VALUE < this.f) {
            this.e = aVar;
            this.f = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        this.a.i.put(eVar.b, aVar);
    }

    public final void g() {
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
                } else if (i()) {
                    d();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.G.add(n0.a.submit(new d0(this, arrayList, 1)));
        }
    }

    public final boolean h(int i9) {
        if (this.h == i9) {
            return true;
        }
        j0 j0Var = this.a.o;
        j0Var.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(j0Var.f);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(j0Var.r);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(j0Var.n.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(((Set) j0Var.I.a).size());
        x0 x0Var = j0Var.d;
        if (x0Var != null) {
            x0Var.g("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        Log.w("GACConnecting", "mRemainingConnections=" + this.n);
        StringBuilder t10 = aa.d.t("GoogleApiClient connecting is in step ", this.h != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN", " but received callback for step ");
        t10.append(i9 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN");
        Log.e("GACConnecting", t10.toString(), new Exception());
        e(new u5.a(8, null));
        return false;
    }

    public final boolean i() {
        m0 m0Var = this.a;
        int i9 = this.n - 1;
        this.n = i9;
        if (i9 > 0) {
            return false;
        }
        if (i9 >= 0) {
            u5.a aVar = this.e;
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
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(((Set) j0Var.I.a).size());
        x0 x0Var = j0Var.d;
        if (x0Var != null) {
            x0Var.g("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        e(new u5.a(8, null));
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void p(u5.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
        if (h(1)) {
            f(aVar, eVar, z10);
            if (i()) {
                d();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void r(int i9) {
        e(new u5.a(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void v() {
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
        this.B = false;
        HashMap hashMap2 = new HashMap();
        Map map2 = this.E;
        for (com.google.android.gms.common.api.e eVar : map2.keySet()) {
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) map.get(eVar.b);
            x5.l.h(cVar);
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
            t3 t3Var = this.D;
            x5.l.h(t3Var);
            x5.l.h(this.F);
            t3Var.h = Integer.valueOf(System.identityHashCode(j0Var));
            f0 f0Var = new f0(this);
            this.v = (y7.a) this.F.a(this.c, j0Var.h, t3Var, (x7.a) t3Var.f, f0Var, f0Var);
        }
        this.n = map.size();
        this.G.add(n0.a.submit(new d0(this, hashMap2, 0)));
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void j() {
    }
}
