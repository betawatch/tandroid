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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g0 implements l0 {
    public boolean D;
    public n6.h E;
    public boolean F;
    public boolean G;
    public final p3 H;
    public final Map I;
    public final a8.d J;
    public final n0 a;
    public final Lock b;
    public final Context c;
    public final k6.e d;
    public k6.a e;
    public int f;
    public int n;
    public o8.a w;
    public boolean x;
    public boolean y;
    public int h = 0;
    public final Bundle r = new Bundle();
    public final HashSet s = new HashSet();
    public final ArrayList K = new ArrayList();

    public g0(n0 n0Var, p3 p3Var, Map map, k6.e eVar, a8.d dVar, Lock lock, Context context) {
        this.a = n0Var;
        this.H = p3Var;
        this.I = map;
        this.d = eVar;
        this.J = dVar;
        this.b = lock;
        this.c = context;
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public final void I(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
        if (g(1)) {
            e(aVar, eVar, z10);
            if (h()) {
                c();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public final void K(int i10) {
        d(new k6.a(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public final void Q() {
        n0 n0Var = this.a;
        HashMap hashMap = n0Var.i;
        k0 k0Var = n0Var.o;
        Map map = n0Var.f;
        hashMap.clear();
        this.y = false;
        this.e = null;
        this.h = 0;
        this.x = true;
        this.D = false;
        this.F = false;
        HashMap hashMap2 = new HashMap();
        Map map2 = this.I;
        for (com.google.android.gms.common.api.e eVar : map2.keySet()) {
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) map.get(eVar.b);
            n6.l.g(cVar);
            com.google.android.gms.common.api.c cVar2 = cVar;
            eVar.a.getClass();
            boolean booleanValue = ((Boolean) map2.get(eVar)).booleanValue();
            if (cVar2.q()) {
                this.y = true;
                if (booleanValue) {
                    this.s.add(eVar.b);
                } else {
                    this.x = false;
                }
            }
            hashMap2.put(cVar2, new b0(this, eVar, booleanValue));
        }
        if (this.y) {
            p3 p3Var = this.H;
            n6.l.g(p3Var);
            n6.l.g(this.J);
            p3Var.h = Integer.valueOf(System.identityHashCode(k0Var));
            f0 f0Var = new f0(this);
            this.w = (o8.a) this.J.a(this.c, k0Var.h, p3Var, (n8.a) p3Var.f, f0Var, f0Var);
        }
        this.n = map.size();
        this.K.add(o0.a.submit(new d0(this, hashMap2, 0)));
    }

    public final void a() {
        this.y = false;
        n0 n0Var = this.a;
        k0 k0Var = n0Var.o;
        HashMap hashMap = n0Var.i;
        k0Var.F = Collections.EMPTY_SET;
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            com.google.android.gms.common.api.d dVar = (com.google.android.gms.common.api.d) it.next();
            if (!hashMap.containsKey(dVar)) {
                hashMap.put(dVar, new k6.a(17, null));
            }
        }
    }

    public final void b(boolean z10) {
        o8.a aVar = this.w;
        if (aVar != null) {
            if (aVar.k() && z10) {
                aVar.getClass();
                try {
                    o8.e eVar = (o8.e) aVar.v();
                    Integer num = aVar.X;
                    n6.l.g(num);
                    int intValue = num.intValue();
                    Parcel J0 = eVar.J0();
                    J0.writeInt(intValue);
                    eVar.K0(J0, 7);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            aVar.j();
            n6.l.g(this.H);
            this.E = null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public final boolean b0() {
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

    public final void c() {
        n0 n0Var = this.a;
        n0Var.a.lock();
        try {
            n0Var.o.h();
            n0Var.m = new a0(n0Var);
            n0Var.m.Q();
            n0Var.b.signalAll();
            n0Var.a.unlock();
            o0.a.execute(new androidx.activity.i(this, 11));
            o8.a aVar = this.w;
            if (aVar != null) {
                if (this.F) {
                    n6.h hVar = this.E;
                    n6.l.g(hVar);
                    boolean z10 = this.G;
                    aVar.getClass();
                    try {
                        o8.e eVar = (o8.e) aVar.v();
                        Integer num = aVar.X;
                        n6.l.g(num);
                        int intValue = num.intValue();
                        Parcel J0 = eVar.J0();
                        k7.a.d(J0, hVar);
                        J0.writeInt(intValue);
                        J0.writeInt(z10 ? 1 : 0);
                        eVar.K0(J0, 9);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                b(false);
            }
            Iterator it = this.a.i.keySet().iterator();
            while (it.hasNext()) {
                com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) this.a.f.get((com.google.android.gms.common.api.d) it.next());
                n6.l.g(cVar);
                cVar.j();
            }
            this.a.p.z(this.r.isEmpty() ? null : this.r);
        } catch (Throwable th2) {
            n0Var.a.unlock();
            throw th2;
        }
    }

    public final void d(k6.a aVar) {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        arrayList.clear();
        b(!aVar.b());
        n0 n0Var = this.a;
        n0Var.h();
        n0Var.p.t(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2.d.b(r3.b, null, null) != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
        eVar.a.getClass();
        if (z10 && !aVar.b()) {
        }
        if (this.e == null || Integer.MAX_VALUE < this.f) {
            this.e = aVar;
            this.f = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        this.a.i.put(eVar.b, aVar);
    }

    public final void f() {
        if (this.n != 0) {
            return;
        }
        if (!this.y || this.D) {
            ArrayList arrayList = new ArrayList();
            this.h = 1;
            n0 n0Var = this.a;
            Map map = n0Var.f;
            Map map2 = n0Var.f;
            this.n = map.size();
            for (com.google.android.gms.common.api.d dVar : map2.keySet()) {
                if (!n0Var.i.containsKey(dVar)) {
                    arrayList.add((com.google.android.gms.common.api.c) map2.get(dVar));
                } else if (h()) {
                    c();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.K.add(o0.a.submit(new d0(this, arrayList, 1)));
        }
    }

    public final boolean g(int i10) {
        if (this.h == i10) {
            return true;
        }
        k0 k0Var = this.a.o;
        k0Var.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(k0Var.f);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(k0Var.r);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(k0Var.n.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(((Set) k0Var.M.a).size());
        y0 y0Var = k0Var.d;
        if (y0Var != null) {
            y0Var.g("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        Log.w("GACConnecting", "mRemainingConnections=" + this.n);
        StringBuilder u10 = a1.g.u("GoogleApiClient connecting is in step ", this.h != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN", " but received callback for step ");
        u10.append(i10 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN");
        Log.e("GACConnecting", u10.toString(), new Exception());
        d(new k6.a(8, null));
        return false;
    }

    public final boolean h() {
        n0 n0Var = this.a;
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
            n0Var.n = this.f;
            d(aVar);
            return false;
        }
        k0 k0Var = n0Var.o;
        k0Var.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(k0Var.f);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(k0Var.r);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(k0Var.n.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(((Set) k0Var.M.a).size());
        y0 y0Var = k0Var.d;
        if (y0Var != null) {
            y0Var.g("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        d(new k6.a(8, null));
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public final e j0(e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public final void l(Bundle bundle) {
        if (g(1)) {
            if (bundle != null) {
                this.r.putAll(bundle);
            }
            if (h()) {
                c();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.l0
    public final void q() {
    }
}
