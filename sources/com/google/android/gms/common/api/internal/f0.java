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
import m.s3;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class f0 implements j0 {
    public n6.h E;
    public boolean F;
    public boolean G;
    public final s3 H;
    public final Map I;
    public final a8.d J;
    public final l0 a;
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

    public f0(l0 l0Var, s3 s3Var, Map map, k6.e eVar, a8.d dVar, Lock lock, Context context) {
        this.a = l0Var;
        this.H = s3Var;
        this.I = map;
        this.d = eVar;
        this.J = dVar;
        this.b = lock;
        this.c = context;
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final boolean B() {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        arrayList.clear();
        d(true);
        this.a.h();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final e D(e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void a(Bundle bundle) {
        if (i(1)) {
            if (bundle != null) {
                this.r.putAll(bundle);
            }
            if (j()) {
                e();
            }
        }
    }

    public final void c() {
        this.x = false;
        l0 l0Var = this.a;
        i0 i0Var = l0Var.o;
        HashMap hashMap = l0Var.i;
        i0Var.F = Collections.EMPTY_SET;
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            com.google.android.gms.common.api.d dVar = (com.google.android.gms.common.api.d) it.next();
            if (!hashMap.containsKey(dVar)) {
                hashMap.put(dVar, new k6.a(17, null));
            }
        }
    }

    public final void d(boolean z10) {
        o8.a aVar = this.v;
        if (aVar != null) {
            if (aVar.j() && z10) {
                aVar.getClass();
                try {
                    o8.e eVar = (o8.e) aVar.u();
                    Integer num = aVar.X;
                    n6.l.h(num);
                    int intValue = num.intValue();
                    Parcel H0 = eVar.H0();
                    H0.writeInt(intValue);
                    eVar.I0(H0, 7);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            aVar.disconnect();
            n6.l.h(this.H);
            this.E = null;
        }
    }

    public final void e() {
        l0 l0Var = this.a;
        l0Var.a.lock();
        try {
            l0Var.o.i();
            l0Var.m = new z(l0Var);
            l0Var.m.y();
            l0Var.b.signalAll();
            l0Var.a.unlock();
            m0.a.execute(new androidx.activity.i(this, 12));
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
                        Parcel H0 = eVar.H0();
                        k7.a.d(H0, hVar);
                        H0.writeInt(intValue);
                        H0.writeInt(z10 ? 1 : 0);
                        eVar.I0(H0, 9);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                d(false);
            }
            Iterator it = this.a.i.keySet().iterator();
            while (it.hasNext()) {
                com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) this.a.f.get((com.google.android.gms.common.api.d) it.next());
                n6.l.h(cVar);
                cVar.disconnect();
            }
            this.a.p.p(this.r.isEmpty() ? null : this.r);
        } catch (Throwable th2) {
            l0Var.a.unlock();
            throw th2;
        }
    }

    public final void f(k6.a aVar) {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        arrayList.clear();
        d(!aVar.b());
        l0 l0Var = this.a;
        l0Var.h();
        l0Var.p.g(aVar);
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
            l0 l0Var = this.a;
            Map map = l0Var.f;
            Map map2 = l0Var.f;
            this.n = map.size();
            for (com.google.android.gms.common.api.d dVar : map2.keySet()) {
                if (!l0Var.i.containsKey(dVar)) {
                    arrayList.add((com.google.android.gms.common.api.c) map2.get(dVar));
                } else if (j()) {
                    e();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.K.add(m0.a.submit(new c0(this, arrayList, 1)));
        }
    }

    public final boolean i(int i10) {
        if (this.h == i10) {
            return true;
        }
        i0 i0Var = this.a.o;
        i0Var.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(i0Var.f);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(i0Var.r);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(i0Var.n.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(((Set) i0Var.M.a).size());
        w0 w0Var = i0Var.d;
        if (w0Var != null) {
            w0Var.g("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        Log.w("GACConnecting", "mRemainingConnections=" + this.n);
        StringBuilder v = a1.g.v("GoogleApiClient connecting is in step ", this.h != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN", " but received callback for step ");
        v.append(i10 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN");
        Log.e("GACConnecting", v.toString(), new Exception());
        f(new k6.a(8, null));
        return false;
    }

    public final boolean j() {
        l0 l0Var = this.a;
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
            l0Var.n = this.f;
            f(aVar);
            return false;
        }
        i0 i0Var = l0Var.o;
        i0Var.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(i0Var.f);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(i0Var.r);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(i0Var.n.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(((Set) i0Var.M.a).size());
        w0 w0Var = i0Var.d;
        if (w0Var != null) {
            w0Var.g("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        f(new k6.a(8, null));
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void q(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
        if (i(1)) {
            g(aVar, eVar, z10);
            if (j()) {
                e();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void w(int i10) {
        f(new k6.a(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void y() {
        l0 l0Var = this.a;
        HashMap hashMap = l0Var.i;
        i0 i0Var = l0Var.o;
        Map map = l0Var.f;
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
            hashMap2.put(cVar2, new a0(this, eVar, booleanValue));
        }
        if (this.x) {
            s3 s3Var = this.H;
            n6.l.h(s3Var);
            n6.l.h(this.J);
            s3Var.h = Integer.valueOf(System.identityHashCode(i0Var));
            e0 e0Var = new e0(this);
            this.v = (o8.a) this.J.a(this.c, i0Var.h, s3Var, (n8.a) s3Var.f, e0Var, e0Var);
        }
        this.n = map.size();
        this.K.add(m0.a.submit(new c0(this, hashMap2, 0)));
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final void b() {
    }
}
