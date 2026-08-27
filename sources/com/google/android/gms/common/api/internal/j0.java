package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import m.t3;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j0 extends com.google.android.gms.common.api.m implements v0 {
    public final a0.f A;
    public Set B;
    public final t3 C;
    public final a0.f D;
    public final a6.b E;
    public final a9.i F;
    public final ArrayList G;
    public Integer H;
    public final g1 I;
    public final ReentrantLock b;
    public final y5.s c;
    public x0 d;
    public final int e;
    public final Context f;
    public final Looper h;
    public final LinkedList n;
    public volatile boolean r;
    public final long s;
    public final long v;
    public final h0 w;
    public final v5.d x;
    public u0 y;

    public j0(Context context, ReentrantLock reentrantLock, Looper looper, t3 t3Var, a0.f fVar, ArrayList arrayList, ArrayList arrayList2, a0.f fVar2, int i10, ArrayList arrayList3) {
        v5.d dVar = v5.d.d;
        a6.b bVar = y7.b.a;
        this.d = null;
        this.n = new LinkedList();
        this.s = 120000L;
        this.v = 5000L;
        this.B = new HashSet();
        this.F = new a9.i(9);
        this.H = null;
        ga.c cVar = new ga.c(this, 8);
        this.f = context;
        this.b = reentrantLock;
        this.c = new y5.s(looper, cVar);
        this.h = looper;
        int i11 = 0;
        this.w = new h0(this, looper, i11);
        this.x = dVar;
        this.e = -1;
        this.D = fVar;
        this.A = fVar2;
        this.G = arrayList3;
        this.I = new g1(0);
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) obj;
            y5.s sVar = this.c;
            sVar.getClass();
            y5.l.h(kVar);
            synchronized (sVar.r) {
                try {
                    if (sVar.b.contains(kVar)) {
                        Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + String.valueOf(kVar) + " is already registered");
                    } else {
                        sVar.b.add(kVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (sVar.a.f()) {
                c2.t0 t0Var = sVar.n;
                t0Var.sendMessage(t0Var.obtainMessage(1, kVar));
            }
        }
        int size2 = arrayList2.size();
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            this.c.a((com.google.android.gms.common.api.l) obj2);
        }
        this.C = t3Var;
        this.E = bVar;
    }

    public static int f(Collection collection, boolean z10) {
        Iterator it = collection.iterator();
        boolean z11 = false;
        boolean z12 = false;
        while (it.hasNext()) {
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) it.next();
            z11 |= cVar.o();
            z12 |= cVar.a();
        }
        if (z11) {
            return (z12 && z10) ? 2 : 1;
        }
        return 3;
    }

    public static /* bridge */ /* synthetic */ void g(j0 j0Var) {
        j0Var.b.lock();
        try {
            if (j0Var.r) {
                j0Var.j();
            }
        } finally {
            j0Var.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void C(v5.a aVar) {
        v5.d dVar = this.x;
        Context context = this.f;
        int i10 = aVar.b;
        dVar.getClass();
        AtomicBoolean atomicBoolean = v5.g.a;
        if (!(i10 == 18 ? true : i10 == 1 ? v5.g.c(context) : false)) {
            h();
        }
        if (this.r) {
            return;
        }
        y5.s sVar = this.c;
        if (Looper.myLooper() != sVar.n.getLooper()) {
            throw new IllegalStateException("onConnectionFailure must only be called on the Handler thread");
        }
        sVar.n.removeMessages(1);
        synchronized (sVar.r) {
            try {
                ArrayList arrayList = new ArrayList(sVar.d);
                int i11 = sVar.f.get();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    com.google.android.gms.common.api.l lVar = (com.google.android.gms.common.api.l) obj;
                    if (sVar.e && sVar.f.get() == i11) {
                        if (sVar.d.contains(lVar)) {
                            lVar.onConnectionFailed(aVar);
                        }
                    }
                }
            } finally {
            }
        }
        y5.s sVar2 = this.c;
        sVar2.e = false;
        sVar2.f.incrementAndGet();
    }

    @Override // com.google.android.gms.common.api.m
    public final void a() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            int i10 = 2;
            boolean z10 = false;
            if (this.e >= 0) {
                y5.l.j("Sign-in mode should have been set explicitly by auto-manage.", this.H != null);
            } else {
                Integer num = this.H;
                if (num == null) {
                    this.H = Integer.valueOf(f(this.A.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.H;
            y5.l.h(num2);
            int intValue = num2.intValue();
            reentrantLock.lock();
            try {
                if (intValue == 3 || intValue == 1) {
                    i10 = intValue;
                } else if (intValue != 2) {
                    i10 = intValue;
                    y5.l.a("Illegal sign-in mode: " + i10, z10);
                    i(i10);
                    j();
                    reentrantLock.unlock();
                    return;
                }
                y5.l.a("Illegal sign-in mode: " + i10, z10);
                i(i10);
                j();
                reentrantLock.unlock();
                return;
            } finally {
                reentrantLock.unlock();
            }
            z10 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.m
    public final void b() {
        LinkedList<e> linkedList = this.n;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.I.a();
            x0 x0Var = this.d;
            if (x0Var != null) {
                x0Var.f();
            }
            Set<p> set = (Set) this.F.b;
            for (p pVar : set) {
                pVar.b = null;
                pVar.c = null;
            }
            set.clear();
            for (e eVar : linkedList) {
                eVar.g.set(null);
                eVar.c();
            }
            linkedList.clear();
            if (this.d != null) {
                h();
                y5.s sVar = this.c;
                sVar.e = false;
                sVar.f.incrementAndGet();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.m
    public final Looper c() {
        return this.h;
    }

    @Override // com.google.android.gms.common.api.m
    public final boolean d(k5.d dVar) {
        x0 x0Var = this.d;
        return x0Var != null && x0Var.d(dVar);
    }

    @Override // com.google.android.gms.common.api.m
    public final void e() {
        x0 x0Var = this.d;
        if (x0Var != null) {
            x0Var.e();
        }
    }

    public final boolean h() {
        if (!this.r) {
            return false;
        }
        this.r = false;
        this.w.removeMessages(2);
        this.w.removeMessages(1);
        u0 u0Var = this.y;
        if (u0Var != null) {
            u0Var.a();
            this.y = null;
        }
        return true;
    }

    public final void i(int i10) {
        ReentrantLock reentrantLock;
        Integer num = this.H;
        if (num == null) {
            this.H = Integer.valueOf(i10);
        } else if (num.intValue() != i10) {
            int intValue = this.H.intValue();
            throw new IllegalStateException(a9.p.n(i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED", ". Mode was already set to ", intValue != 1 ? intValue != 2 ? intValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED", new StringBuilder("Cannot use sign-in mode: ")));
        }
        if (this.d != null) {
            return;
        }
        a0.f fVar = this.A;
        Iterator it = ((a0.e) fVar.values()).iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) it.next();
            z10 |= cVar.o();
            z11 |= cVar.a();
        }
        int intValue2 = this.H.intValue();
        ArrayList arrayList = this.G;
        ReentrantLock reentrantLock2 = this.b;
        if (intValue2 == 1) {
            reentrantLock = reentrantLock2;
            if (!z10) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (z11) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else {
            if (intValue2 == 2 && z10) {
                a0.f fVar2 = new a0.f(0);
                a0.f fVar3 = new a0.f(0);
                Iterator it2 = ((a0.a) fVar.entrySet()).iterator();
                com.google.android.gms.common.api.c cVar2 = null;
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    com.google.android.gms.common.api.c cVar3 = (com.google.android.gms.common.api.c) entry.getValue();
                    if (true == cVar3.a()) {
                        cVar2 = cVar3;
                    }
                    if (cVar3.o()) {
                        fVar2.put((com.google.android.gms.common.api.d) entry.getKey(), cVar3);
                    } else {
                        fVar3.put((com.google.android.gms.common.api.d) entry.getKey(), cVar3);
                    }
                }
                y5.l.j("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !fVar2.isEmpty());
                a0.f fVar4 = new a0.f(0);
                a0.f fVar5 = new a0.f(0);
                a0.f fVar6 = this.D;
                Iterator it3 = ((a0.c) fVar6.keySet()).iterator();
                while (it3.hasNext()) {
                    com.google.android.gms.common.api.e eVar = (com.google.android.gms.common.api.e) it3.next();
                    com.google.android.gms.common.api.d dVar = eVar.b;
                    if (fVar2.containsKey(dVar)) {
                        fVar4.put(eVar, (Boolean) fVar6.get(eVar));
                    } else {
                        if (!fVar3.containsKey(dVar)) {
                            throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                        }
                        fVar5.put(eVar, (Boolean) fVar6.get(eVar));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    o1 o1Var = (o1) arrayList.get(i11);
                    if (fVar4.containsKey(o1Var.a)) {
                        arrayList2.add(o1Var);
                    } else {
                        if (!fVar5.containsKey(o1Var.a)) {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                        arrayList3.add(o1Var);
                    }
                }
                this.d = new x(this.f, this, reentrantLock2, this.h, this.x, fVar2, fVar3, this.C, this.E, cVar2, arrayList2, arrayList3, fVar4, fVar5);
                return;
            }
            reentrantLock = reentrantLock2;
        }
        this.d = new m0(this.f, this, reentrantLock, this.h, this.x, this.A, this.C, this.D, this.E, arrayList, this);
    }

    public final void j() {
        this.c.e = true;
        x0 x0Var = this.d;
        y5.l.h(x0Var);
        x0Var.a();
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void r(int i10) {
        if (i10 == 1) {
            if (!this.r) {
                this.r = true;
                if (this.y == null) {
                    try {
                        v5.d dVar = this.x;
                        Context applicationContext = this.f.getApplicationContext();
                        i0 i0Var = new i0(this);
                        dVar.getClass();
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        u0 u0Var = new u0(i0Var);
                        v6.c.g(applicationContext, u0Var, intentFilter);
                        u0Var.a = applicationContext;
                        if (!v5.g.c(applicationContext)) {
                            i0Var.a();
                            u0Var.a();
                            u0Var = null;
                        }
                        this.y = u0Var;
                    } catch (SecurityException unused) {
                    }
                }
                h0 h0Var = this.w;
                h0Var.sendMessageDelayed(h0Var.obtainMessage(1), this.s);
                h0 h0Var2 = this.w;
                h0Var2.sendMessageDelayed(h0Var2.obtainMessage(2), this.v);
            }
            i10 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) ((Set) this.I.a).toArray(new BasePendingResult[0])) {
            basePendingResult.e(g1.c);
        }
        y5.s sVar = this.c;
        if (Looper.myLooper() != sVar.n.getLooper()) {
            throw new IllegalStateException("onUnintentionalDisconnection must only be called on the Handler thread");
        }
        sVar.n.removeMessages(1);
        synchronized (sVar.r) {
            try {
                sVar.h = true;
                ArrayList arrayList = new ArrayList(sVar.b);
                int i11 = sVar.f.get();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) obj;
                    if (!sVar.e || sVar.f.get() != i11) {
                        break;
                    } else if (sVar.b.contains(kVar)) {
                        kVar.onConnectionSuspended(i10);
                    }
                }
                sVar.c.clear();
                sVar.h = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        y5.s sVar2 = this.c;
        sVar2.e = false;
        sVar2.f.incrementAndGet();
        if (i10 == 2) {
            j();
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void s(Bundle bundle) {
        while (!this.n.isEmpty()) {
            e eVar = (e) this.n.remove();
            a0.f fVar = this.A;
            com.google.android.gms.common.api.e eVar2 = eVar.p;
            y5.l.a("GoogleApiClient is not configured to use " + (eVar2 != null ? eVar2.c : "the API") + " required for this call.", fVar.containsKey(eVar.o));
            this.b.lock();
            try {
                x0 x0Var = this.d;
                if (x0Var == null) {
                    throw new IllegalStateException("GoogleApiClient is not connected yet.");
                }
                if (this.r) {
                    this.n.add(eVar);
                    while (!this.n.isEmpty()) {
                        e eVar3 = (e) this.n.remove();
                        g1 g1Var = this.I;
                        ((Set) g1Var.a).add(eVar3);
                        eVar3.g.set((f1) g1Var.b);
                        eVar3.o(Status.h);
                    }
                } else {
                    x0Var.c(eVar);
                }
                this.b.unlock();
            } catch (Throwable th) {
                this.b.unlock();
                throw th;
            }
        }
        y5.s sVar = this.c;
        if (Looper.myLooper() != sVar.n.getLooper()) {
            throw new IllegalStateException("onConnectionSuccess must only be called on the Handler thread");
        }
        synchronized (sVar.r) {
            try {
                y5.l.k(!sVar.h);
                sVar.n.removeMessages(1);
                sVar.h = true;
                y5.l.k(sVar.c.isEmpty());
                ArrayList arrayList = new ArrayList(sVar.b);
                int i10 = sVar.f.get();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) obj;
                    if (!sVar.e || !sVar.a.f() || sVar.f.get() != i10) {
                        break;
                    } else if (!sVar.c.contains(kVar)) {
                        kVar.onConnected(bundle);
                    }
                }
                sVar.c.clear();
                sVar.h = false;
            } finally {
            }
        }
    }
}
