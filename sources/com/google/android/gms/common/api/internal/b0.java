package com.google.android.gms.common.api.internal;

import a8.ra;
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
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import m.q3;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class b0 implements e0 {
    public boolean D;
    public q6.i E;
    public boolean F;
    public boolean G;
    public final q3 H;
    public final Map I;
    public final a9.e J;
    public final g0 a;
    public final Lock b;
    public final Context c;
    public final n6.e d;
    public n6.a e;
    public int f;
    public int n;
    public r8.a w;
    public boolean x;
    public boolean y;
    public int h = 0;
    public final Bundle r = new Bundle();
    public final HashSet s = new HashSet();
    public final ArrayList K = new ArrayList();

    public b0(g0 g0Var, q3 q3Var, Map map, n6.e eVar, a9.e eVar2, Lock lock, Context context) {
        this.a = g0Var;
        this.H = q3Var;
        this.I = map;
        this.d = eVar;
        this.J = eVar2;
        this.b = lock;
        this.c = context;
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void A(int i7) {
        h(new n6.a(8, null, null));
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final boolean I() {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Future) arrayList.get(i7)).cancel(true);
        }
        arrayList.clear();
        i(true);
        this.a.h();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void R() {
        g0 g0Var = this.a;
        HashMap hashMap = g0Var.i;
        Map map = g0Var.f;
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
            q6.m.g(cVar);
            eVar.a.getClass();
            boolean booleanValue = ((Boolean) map2.get(eVar)).booleanValue();
            if (cVar.f()) {
                this.y = true;
                if (booleanValue) {
                    this.s.add(eVar.b);
                } else {
                    this.x = false;
                }
            }
            hashMap2.put(cVar, new w(this, eVar, booleanValue));
        }
        if (this.y) {
            q3 q3Var = this.H;
            q6.m.g(q3Var);
            a9.e eVar2 = this.J;
            q6.m.g(eVar2);
            d0 d0Var = g0Var.o;
            q3Var.g = Integer.valueOf(System.identityHashCode(d0Var));
            a0 a0Var = new a0(this);
            this.w = (r8.a) eVar2.a(this.c, d0Var.h, q3Var, (q8.a) q3Var.f, a0Var, a0Var);
        }
        this.n = map.size();
        this.K.add(h0.a.submit(new y(this, hashMap2, 0)));
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final d b(d dVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void c(Bundle bundle) {
        if (j(1)) {
            if (bundle != null) {
                this.r.putAll(bundle);
            }
            if (k()) {
                e();
            }
        }
    }

    public final void d() {
        if (this.n != 0) {
            return;
        }
        if (!this.y || this.D) {
            ArrayList arrayList = new ArrayList();
            this.h = 1;
            g0 g0Var = this.a;
            Map map = g0Var.f;
            this.n = map.size();
            for (com.google.android.gms.common.api.d dVar : map.keySet()) {
                if (!g0Var.i.containsKey(dVar)) {
                    arrayList.add((com.google.android.gms.common.api.c) map.get(dVar));
                } else if (k()) {
                    e();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.K.add(h0.a.submit(new y(this, arrayList, 1)));
        }
    }

    public final void e() {
        g0 g0Var = this.a;
        g0Var.a.lock();
        try {
            g0Var.o.h();
            g0Var.m = new v(g0Var);
            g0Var.m.R();
            g0Var.b.signalAll();
            g0Var.a.unlock();
            h0.a.execute(new ra(this, 15));
            r8.a aVar = this.w;
            if (aVar != null) {
                if (this.F) {
                    q6.i iVar = this.E;
                    q6.m.g(iVar);
                    boolean z9 = this.G;
                    try {
                        r8.e eVar = (r8.e) aVar.n();
                        Integer num = aVar.I;
                        q6.m.g(num);
                        int intValue = num.intValue();
                        Parcel j12 = eVar.j1();
                        n7.a.c(j12, iVar);
                        j12.writeInt(intValue);
                        j12.writeInt(z9 ? 1 : 0);
                        eVar.k1(j12, 9);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                i(false);
            }
            Iterator it = g0Var.i.keySet().iterator();
            while (it.hasNext()) {
                com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) g0Var.f.get((com.google.android.gms.common.api.d) it.next());
                q6.m.g(cVar);
                cVar.a();
            }
            Bundle bundle = this.r;
            if (true == bundle.isEmpty()) {
                bundle = null;
            }
            g0Var.p.k(bundle);
        } catch (Throwable th2) {
            g0Var.a.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2.d.b(r3.b, null, null) != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(n6.a aVar, com.google.android.gms.common.api.e eVar, boolean z9) {
        eVar.a.getClass();
        if (z9 && !aVar.b()) {
        }
        if (this.e == null || Integer.MAX_VALUE < this.f) {
            this.e = aVar;
            this.f = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        this.a.i.put(eVar.b, aVar);
    }

    public final void g() {
        this.y = false;
        g0 g0Var = this.a;
        g0Var.o.F = Collections.EMPTY_SET;
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            com.google.android.gms.common.api.d dVar = (com.google.android.gms.common.api.d) it.next();
            HashMap hashMap = g0Var.i;
            if (!hashMap.containsKey(dVar)) {
                hashMap.put(dVar, new n6.a(17, null, null));
            }
        }
    }

    public final void h(n6.a aVar) {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Future) arrayList.get(i7)).cancel(true);
        }
        arrayList.clear();
        i(!aVar.b());
        g0 g0Var = this.a;
        g0Var.h();
        g0Var.p.d(aVar);
    }

    public final void i(boolean z9) {
        r8.a aVar = this.w;
        if (aVar != null) {
            r8.a aVar2 = aVar;
            if (aVar2.s() && z9) {
                try {
                    r8.e eVar = (r8.e) aVar.n();
                    Integer num = aVar.I;
                    q6.m.g(num);
                    int intValue = num.intValue();
                    Parcel j12 = eVar.j1();
                    j12.writeInt(intValue);
                    eVar.k1(j12, 7);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            aVar2.a();
            q6.m.g(this.H);
            this.E = null;
        }
    }

    public final boolean j(int i7) {
        if (this.h == i7) {
            return true;
        }
        d0 d0Var = this.a.o;
        d0Var.getClass();
        StringWriter stringWriter = new StringWriter();
        d0Var.g("", null, new PrintWriter(stringWriter), null);
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i10 = this.n;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 22);
        sb2.append("mRemainingConnections=");
        sb2.append(i10);
        Log.w("GACConnecting", sb2.toString());
        String str = this.h != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        String str2 = i7 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        StringBuilder sb3 = new StringBuilder(str2.length() + str.length() + 70);
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(str);
        sb3.append(" but received callback for step ");
        sb3.append(str2);
        Log.e("GACConnecting", sb3.toString(), new Exception());
        h(new n6.a(8, null, null));
        return false;
    }

    public final boolean k() {
        int i7 = this.n - 1;
        this.n = i7;
        if (i7 > 0) {
            return false;
        }
        g0 g0Var = this.a;
        if (i7 >= 0) {
            n6.a aVar = this.e;
            if (aVar == null) {
                return true;
            }
            g0Var.n = this.f;
            h(aVar);
            return false;
        }
        d0 d0Var = g0Var.o;
        d0Var.getClass();
        StringWriter stringWriter = new StringWriter();
        d0Var.g("", null, new PrintWriter(stringWriter), null);
        Log.w("GACConnecting", stringWriter.toString());
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        h(new n6.a(8, null, null));
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void q(n6.a aVar, com.google.android.gms.common.api.e eVar, boolean z9) {
        if (j(1)) {
            f(aVar, eVar, z9);
            if (k()) {
                e();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void a() {
    }
}
