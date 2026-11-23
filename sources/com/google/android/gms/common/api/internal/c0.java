package com.google.android.gms.common.api.internal;

import a8.sa;
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
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class c0 implements f0 {
    public boolean E;
    public q6.i F;
    public boolean G;
    public boolean H;
    public final ga.d I;
    public final Map J;
    public final a9.e K;
    public final h0 a;
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
    public final ArrayList L = new ArrayList();

    public c0(h0 h0Var, ga.d dVar, Map map, n6.e eVar, a9.e eVar2, Lock lock, Context context) {
        this.a = h0Var;
        this.I = dVar;
        this.J = map;
        this.d = eVar;
        this.K = eVar2;
        this.b = lock;
        this.c = context;
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final d b(d dVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final void c(Bundle bundle) {
        if (k(1)) {
            if (bundle != null) {
                this.r.putAll(bundle);
            }
            if (l()) {
                e();
            }
        }
    }

    public final void d() {
        if (this.n != 0) {
            return;
        }
        if (!this.y || this.E) {
            ArrayList arrayList = new ArrayList();
            this.h = 1;
            h0 h0Var = this.a;
            Map map = h0Var.f;
            this.n = map.size();
            for (com.google.android.gms.common.api.d dVar : map.keySet()) {
                if (!h0Var.i.containsKey(dVar)) {
                    arrayList.add((com.google.android.gms.common.api.c) map.get(dVar));
                } else if (l()) {
                    e();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.L.add(i0.a.submit(new z(this, arrayList, 1)));
        }
    }

    public final void e() {
        h0 h0Var = this.a;
        h0Var.a.lock();
        try {
            h0Var.o.g();
            h0Var.m = new w(h0Var);
            h0Var.m.s();
            h0Var.b.signalAll();
            h0Var.a.unlock();
            i0.a.execute(new sa(this, 18));
            r8.a aVar = this.w;
            if (aVar != null) {
                if (this.G) {
                    q6.i iVar = this.F;
                    q6.m.h(iVar);
                    boolean z10 = this.H;
                    try {
                        r8.e eVar = (r8.e) aVar.n();
                        Integer num = aVar.I;
                        q6.m.h(num);
                        int intValue = num.intValue();
                        Parcel j12 = eVar.j1();
                        n7.a.c(j12, iVar);
                        j12.writeInt(intValue);
                        j12.writeInt(z10 ? 1 : 0);
                        eVar.k1(j12, 9);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                i(false);
            }
            Iterator it = h0Var.i.keySet().iterator();
            while (it.hasNext()) {
                com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) h0Var.f.get((com.google.android.gms.common.api.d) it.next());
                q6.m.h(cVar);
                cVar.a();
            }
            Bundle bundle = this.r;
            if (true == bundle.isEmpty()) {
                bundle = null;
            }
            h0Var.p.o(bundle);
        } catch (Throwable th2) {
            h0Var.a.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2.d.b(r3.b, null, null) != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(n6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
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
        this.y = false;
        h0 h0Var = this.a;
        h0Var.o.G = Collections.EMPTY_SET;
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            com.google.android.gms.common.api.d dVar = (com.google.android.gms.common.api.d) it.next();
            HashMap hashMap = h0Var.i;
            if (!hashMap.containsKey(dVar)) {
                hashMap.put(dVar, new n6.a(17, null, null));
            }
        }
    }

    public final void h(n6.a aVar) {
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Future) arrayList.get(i7)).cancel(true);
        }
        arrayList.clear();
        i(!aVar.b());
        h0 h0Var = this.a;
        h0Var.h();
        h0Var.p.h(aVar);
    }

    public final void i(boolean z10) {
        r8.a aVar = this.w;
        if (aVar != null) {
            r8.a aVar2 = aVar;
            if (aVar2.s() && z10) {
                try {
                    r8.e eVar = (r8.e) aVar.n();
                    Integer num = aVar.I;
                    q6.m.h(num);
                    int intValue = num.intValue();
                    Parcel j12 = eVar.j1();
                    j12.writeInt(intValue);
                    eVar.k1(j12, 7);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            aVar2.a();
            q6.m.h(this.I);
            this.F = null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final void j(n6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
        if (k(1)) {
            f(aVar, eVar, z10);
            if (l()) {
                e();
            }
        }
    }

    public final boolean k(int i7) {
        if (this.h == i7) {
            return true;
        }
        e0 e0Var = this.a.o;
        e0Var.getClass();
        StringWriter stringWriter = new StringWriter();
        e0Var.f("", null, new PrintWriter(stringWriter), null);
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

    public final boolean l() {
        int i7 = this.n - 1;
        this.n = i7;
        if (i7 > 0) {
            return false;
        }
        h0 h0Var = this.a;
        if (i7 >= 0) {
            n6.a aVar = this.e;
            if (aVar == null) {
                return true;
            }
            h0Var.n = this.f;
            h(aVar);
            return false;
        }
        e0 e0Var = h0Var.o;
        e0Var.getClass();
        StringWriter stringWriter = new StringWriter();
        e0Var.f("", null, new PrintWriter(stringWriter), null);
        Log.w("GACConnecting", stringWriter.toString());
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        h(new n6.a(8, null, null));
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final void o(int i7) {
        h(new n6.a(8, null, null));
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final boolean p() {
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Future) arrayList.get(i7)).cancel(true);
        }
        arrayList.clear();
        i(true);
        this.a.h();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final void s() {
        h0 h0Var = this.a;
        HashMap hashMap = h0Var.i;
        Map map = h0Var.f;
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
            q6.m.h(cVar);
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
            hashMap2.put(cVar, new x(this, eVar, booleanValue));
        }
        if (this.y) {
            ga.d dVar = this.I;
            q6.m.h(dVar);
            a9.e eVar2 = this.K;
            q6.m.h(eVar2);
            e0 e0Var = h0Var.o;
            dVar.h = Integer.valueOf(System.identityHashCode(e0Var));
            b0 b0Var = new b0(this);
            this.w = (r8.a) eVar2.a(this.c, e0Var.h, dVar, (q8.a) dVar.f, b0Var, b0Var);
        }
        this.n = map.size();
        this.L.add(i0.a.submit(new z(this, hashMap2, 0)));
    }

    @Override // com.google.android.gms.common.api.internal.f0
    public final void a() {
    }
}
