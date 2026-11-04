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
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import m.o3;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b0 implements e0 {
    public boolean E;
    public p6.i F;
    public boolean G;
    public boolean H;
    public final o3 I;
    public final Map J;
    public final a6.b K;
    public final g0 a;
    public final Lock b;
    public final Context c;
    public final m6.e d;
    public m6.a e;
    public int f;
    public int n;
    public q8.a w;
    public boolean x;
    public boolean y;
    public int h = 0;
    public final Bundle r = new Bundle();
    public final HashSet s = new HashSet();
    public final ArrayList L = new ArrayList();

    public b0(g0 g0Var, o3 o3Var, Map map, m6.e eVar, a6.b bVar, Lock lock, Context context) {
        this.a = g0Var;
        this.I = o3Var;
        this.J = map;
        this.d = eVar;
        this.K = bVar;
        this.b = lock;
        this.c = context;
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final boolean B() {
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((Future) arrayList.get(i3)).cancel(true);
        }
        arrayList.clear();
        h(true);
        this.a.h();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void D(m6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
        if (i(1)) {
            e(aVar, eVar, z10);
            if (j()) {
                d();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void L() {
        g0 g0Var = this.a;
        HashMap hashMap = g0Var.i;
        Map map = g0Var.f;
        hashMap.clear();
        this.y = false;
        this.e = null;
        this.h = 0;
        this.x = true;
        this.E = false;
        this.G = false;
        HashMap hashMap2 = new HashMap();
        Map map2 = this.J;
        for (com.google.android.gms.common.api.e eVar : map2.keySet()) {
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) map.get(eVar.b);
            p6.m.g(cVar);
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
            o3 o3Var = this.I;
            p6.m.g(o3Var);
            a6.b bVar = this.K;
            p6.m.g(bVar);
            d0 d0Var = g0Var.o;
            o3Var.g = Integer.valueOf(System.identityHashCode(d0Var));
            a0 a0Var = new a0(this);
            this.w = (q8.a) bVar.a(this.c, d0Var.h, o3Var, (p8.a) o3Var.f, a0Var, a0Var);
        }
        this.n = map.size();
        this.L.add(h0.a.submit(new y(this, hashMap2, 0)));
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final d b(d dVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void c() {
        if (this.n != 0) {
            return;
        }
        if (!this.y || this.E) {
            ArrayList arrayList = new ArrayList();
            this.h = 1;
            g0 g0Var = this.a;
            Map map = g0Var.f;
            this.n = map.size();
            for (com.google.android.gms.common.api.d dVar : map.keySet()) {
                if (!g0Var.i.containsKey(dVar)) {
                    arrayList.add((com.google.android.gms.common.api.c) map.get(dVar));
                } else if (j()) {
                    d();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.L.add(h0.a.submit(new y(this, arrayList, 1)));
        }
    }

    public final void d() {
        g0 g0Var = this.a;
        g0Var.a.lock();
        try {
            g0Var.o.i();
            g0Var.m = new v(g0Var);
            g0Var.m.L();
            g0Var.b.signalAll();
            g0Var.a.unlock();
            h0.a.execute(new a3.o(this, 14));
            q8.a aVar = this.w;
            if (aVar != null) {
                if (this.G) {
                    p6.i iVar = this.F;
                    p6.m.g(iVar);
                    boolean z10 = this.H;
                    try {
                        q8.e eVar = (q8.e) aVar.m();
                        Integer num = aVar.I;
                        p6.m.g(num);
                        int intValue = num.intValue();
                        Parcel J0 = eVar.J0();
                        m7.a.c(J0, iVar);
                        J0.writeInt(intValue);
                        J0.writeInt(z10 ? 1 : 0);
                        eVar.K0(J0, 9);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                h(false);
            }
            Iterator it = g0Var.i.keySet().iterator();
            while (it.hasNext()) {
                com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) g0Var.f.get((com.google.android.gms.common.api.d) it.next());
                p6.m.g(cVar);
                cVar.a();
            }
            Bundle bundle = this.r;
            if (true == bundle.isEmpty()) {
                bundle = null;
            }
            g0Var.p.o(bundle);
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
    public final void e(m6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
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
        this.y = false;
        g0 g0Var = this.a;
        g0Var.o.G = Collections.EMPTY_SET;
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            com.google.android.gms.common.api.d dVar = (com.google.android.gms.common.api.d) it.next();
            HashMap hashMap = g0Var.i;
            if (!hashMap.containsKey(dVar)) {
                hashMap.put(dVar, new m6.a(17, null, null));
            }
        }
    }

    public final void g(m6.a aVar) {
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((Future) arrayList.get(i3)).cancel(true);
        }
        arrayList.clear();
        h(!aVar.b());
        g0 g0Var = this.a;
        g0Var.h();
        g0Var.p.a(aVar);
    }

    public final void h(boolean z10) {
        q8.a aVar = this.w;
        if (aVar != null) {
            q8.a aVar2 = aVar;
            if (aVar2.r() && z10) {
                try {
                    q8.e eVar = (q8.e) aVar.m();
                    Integer num = aVar.I;
                    p6.m.g(num);
                    int intValue = num.intValue();
                    Parcel J0 = eVar.J0();
                    J0.writeInt(intValue);
                    eVar.K0(J0, 7);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            aVar2.a();
            p6.m.g(this.I);
            this.F = null;
        }
    }

    public final boolean i(int i3) {
        if (this.h == i3) {
            return true;
        }
        d0 d0Var = this.a.o;
        d0Var.getClass();
        StringWriter stringWriter = new StringWriter();
        d0Var.h("", null, new PrintWriter(stringWriter), null);
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i10 = this.n;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 22);
        sb2.append("mRemainingConnections=");
        sb2.append(i10);
        Log.w("GACConnecting", sb2.toString());
        String str = this.h != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        String str2 = i3 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        StringBuilder sb3 = new StringBuilder(str2.length() + str.length() + 70);
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(str);
        sb3.append(" but received callback for step ");
        sb3.append(str2);
        Log.e("GACConnecting", sb3.toString(), new Exception());
        g(new m6.a(8, null, null));
        return false;
    }

    public final boolean j() {
        int i3 = this.n - 1;
        this.n = i3;
        if (i3 > 0) {
            return false;
        }
        g0 g0Var = this.a;
        if (i3 >= 0) {
            m6.a aVar = this.e;
            if (aVar == null) {
                return true;
            }
            g0Var.n = this.f;
            g(aVar);
            return false;
        }
        d0 d0Var = g0Var.o;
        d0Var.getClass();
        StringWriter stringWriter = new StringWriter();
        d0Var.h("", null, new PrintWriter(stringWriter), null);
        Log.w("GACConnecting", stringWriter.toString());
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        g(new m6.a(8, null, null));
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void l(Bundle bundle) {
        if (i(1)) {
            if (bundle != null) {
                this.r.putAll(bundle);
            }
            if (j()) {
                d();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void x(int i3) {
        g(new m6.a(8, null, null));
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final void a() {
    }
}
