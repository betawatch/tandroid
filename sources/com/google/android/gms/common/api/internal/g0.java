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
import m.r3;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g0 implements k0 {
    public b6.i B;
    public boolean C;
    public boolean D;
    public final r3 E;
    public final Map F;
    public final a8.j G;
    public final m0 a;
    public final Lock b;
    public final Context c;
    public final y5.e d;
    public y5.a e;
    public int f;
    public int n;
    public c8.a v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int h = 0;
    public final Bundle r = new Bundle();
    public final HashSet s = new HashSet();
    public final ArrayList H = new ArrayList();

    public g0(m0 m0Var, r3 r3Var, Map map, y5.e eVar, a8.j jVar, Lock lock, Context context) {
        this.a = m0Var;
        this.E = r3Var;
        this.F = map;
        this.d = eVar;
        this.G = jVar;
        this.b = lock;
        this.c = context;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void C() {
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
        this.C = false;
        HashMap hashMap2 = new HashMap();
        Map map2 = this.F;
        for (com.google.android.gms.common.api.e eVar : map2.keySet()) {
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) map.get(eVar.b);
            b6.m.h(cVar);
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
            r3 r3Var = this.E;
            b6.m.h(r3Var);
            b6.m.h(this.G);
            r3Var.h = Integer.valueOf(System.identityHashCode(j0Var));
            f0 f0Var = new f0(this);
            this.v = (c8.a) this.G.a(this.c, j0Var.h, r3Var, (b8.a) r3Var.f, f0Var, f0Var);
        }
        this.n = map.size();
        this.H.add(n0.a.submit(new d0(this, hashMap2, 0)));
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final boolean G() {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        arrayList.clear();
        c(true);
        this.a.h();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final e L(e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void a() {
        this.x = false;
        m0 m0Var = this.a;
        j0 j0Var = m0Var.o;
        HashMap hashMap = m0Var.i;
        j0Var.C = Collections.EMPTY_SET;
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            com.google.android.gms.common.api.d dVar = (com.google.android.gms.common.api.d) it.next();
            if (!hashMap.containsKey(dVar)) {
                hashMap.put(dVar, new y5.a(17, null));
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void b(Bundle bundle) {
        if (j(1)) {
            if (bundle != null) {
                this.r.putAll(bundle);
            }
            if (k()) {
                d();
            }
        }
    }

    public final void c(boolean z4) {
        c8.a aVar = this.v;
        if (aVar != null) {
            if (aVar.h() && z4) {
                aVar.getClass();
                try {
                    c8.e eVar = (c8.e) aVar.u();
                    Integer num = aVar.U;
                    b6.m.h(num);
                    int intValue = num.intValue();
                    Parcel G0 = eVar.G0();
                    G0.writeInt(intValue);
                    eVar.H0(G0, 7);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            aVar.disconnect();
            b6.m.h(this.E);
            this.B = null;
        }
    }

    public final void d() {
        m0 m0Var = this.a;
        m0Var.a.lock();
        try {
            m0Var.o.h();
            m0Var.m = new a0(m0Var);
            m0Var.m.C();
            m0Var.b.signalAll();
            m0Var.a.unlock();
            n0.a.execute(new androidx.activity.i(this, 9));
            c8.a aVar = this.v;
            if (aVar != null) {
                if (this.C) {
                    b6.i iVar = this.B;
                    b6.m.h(iVar);
                    boolean z4 = this.D;
                    aVar.getClass();
                    try {
                        c8.e eVar = (c8.e) aVar.u();
                        Integer num = aVar.U;
                        b6.m.h(num);
                        int intValue = num.intValue();
                        Parcel G0 = eVar.G0();
                        y6.a.d(G0, iVar);
                        G0.writeInt(intValue);
                        G0.writeInt(z4 ? 1 : 0);
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
                b6.m.h(cVar);
                cVar.disconnect();
            }
            this.a.p.q(this.r.isEmpty() ? null : this.r);
        } catch (Throwable th2) {
            m0Var.a.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void f(y5.a aVar, com.google.android.gms.common.api.e eVar, boolean z4) {
        if (j(1)) {
            h(aVar, eVar, z4);
            if (k()) {
                d();
            }
        }
    }

    public final void g(y5.a aVar) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        arrayList.clear();
        c(!aVar.e());
        m0 m0Var = this.a;
        m0Var.h();
        m0Var.p.B(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2.d.b(null, null, r3.b) != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(y5.a aVar, com.google.android.gms.common.api.e eVar, boolean z4) {
        eVar.a.getClass();
        if (z4 && !aVar.e()) {
        }
        if (this.e == null || Integer.MAX_VALUE < this.f) {
            this.e = aVar;
            this.f = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        this.a.i.put(eVar.b, aVar);
    }

    public final void i() {
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
                } else if (k()) {
                    d();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.H.add(n0.a.submit(new d0(this, arrayList, 1)));
        }
    }

    public final boolean j(int i10) {
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
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(((Set) j0Var.J.a).size());
        x0 x0Var = j0Var.d;
        if (x0Var != null) {
            x0Var.f("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        Log.w("GACConnecting", "mRemainingConnections=" + this.n);
        StringBuilder t6 = android.support.v4.media.a.t("GoogleApiClient connecting is in step ", this.h != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN", " but received callback for step ");
        t6.append(i10 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN");
        Log.e("GACConnecting", t6.toString(), new Exception());
        g(new y5.a(8, null));
        return false;
    }

    public final boolean k() {
        m0 m0Var = this.a;
        int i10 = this.n - 1;
        this.n = i10;
        if (i10 > 0) {
            return false;
        }
        if (i10 >= 0) {
            y5.a aVar = this.e;
            if (aVar == null) {
                return true;
            }
            m0Var.n = this.f;
            g(aVar);
            return false;
        }
        j0 j0Var = m0Var.o;
        j0Var.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(j0Var.f);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(j0Var.r);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(j0Var.n.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(((Set) j0Var.J.a).size());
        x0 x0Var = j0Var.d;
        if (x0Var != null) {
            x0Var.f("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        g(new y5.a(8, null));
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void z(int i10) {
        g(new y5.a(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public final void e() {
    }
}
