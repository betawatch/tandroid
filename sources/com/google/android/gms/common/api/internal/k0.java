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
import m.p3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k0 extends com.google.android.gms.common.api.m implements w0 {
    public v0 D;
    public final a0.f E;
    public Set F;
    public final p3 G;
    public final a0.f H;
    public final a8.d I;
    public final za.c J;
    public final ArrayList K;
    public Integer L;
    public final h1 M;
    public final ReentrantLock b;
    public final n6.s c;
    public y0 d;
    public final int e;
    public final Context f;
    public final Looper h;
    public final LinkedList n;
    public volatile boolean r;
    public final long s;
    public final long w;
    public final i0 x;
    public final k6.d y;

    public k0(Context context, ReentrantLock reentrantLock, Looper looper, p3 p3Var, a0.f fVar, ArrayList arrayList, ArrayList arrayList2, a0.f fVar2, int i10, ArrayList arrayList3) {
        k6.d dVar = k6.d.d;
        a8.d dVar2 = n8.b.a;
        this.d = null;
        this.n = new LinkedList();
        this.s = 120000L;
        this.w = 5000L;
        this.F = new HashSet();
        this.J = new za.c(13);
        this.L = null;
        h0 h0Var = new h0();
        h0Var.a = this;
        this.f = context;
        this.b = reentrantLock;
        this.c = new n6.s(looper, h0Var);
        this.h = looper;
        int i11 = 0;
        this.x = new i0(this, looper, i11);
        this.y = dVar;
        this.e = -1;
        this.H = fVar;
        this.E = fVar2;
        this.K = arrayList3;
        this.M = new h1(0);
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) obj;
            n6.s sVar = this.c;
            sVar.getClass();
            n6.l.g(kVar);
            synchronized (sVar.r) {
                try {
                    if (sVar.b.contains(kVar)) {
                        Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + String.valueOf(kVar) + " is already registered");
                    } else {
                        sVar.b.add(kVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (sVar.a.a()) {
                com.google.android.gms.internal.cast.z zVar = sVar.n;
                zVar.sendMessage(zVar.obtainMessage(1, kVar));
            }
        }
        int size2 = arrayList2.size();
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            this.c.a((com.google.android.gms.common.api.l) obj2);
        }
        this.G = p3Var;
        this.I = dVar2;
    }

    public static int f(Collection collection, boolean z10) {
        Iterator it = collection.iterator();
        boolean z11 = false;
        boolean z12 = false;
        while (it.hasNext()) {
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) it.next();
            z11 |= cVar.q();
            z12 |= cVar.b();
        }
        if (z11) {
            return (z12 && z10) ? 2 : 1;
        }
        return 3;
    }

    public static /* bridge */ /* synthetic */ void g(k0 k0Var) {
        k0Var.b.lock();
        try {
            if (k0Var.r) {
                k0Var.j();
            }
        } finally {
            k0Var.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.m
    public final Looper a() {
        return this.h;
    }

    @Override // com.google.android.gms.common.api.m
    public final boolean b(a6.d dVar) {
        y0 y0Var = this.d;
        return y0Var != null && y0Var.d(dVar);
    }

    @Override // com.google.android.gms.common.api.m
    public final void c() {
        y0 y0Var = this.d;
        if (y0Var != null) {
            y0Var.e();
        }
    }

    public final void d() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            int i10 = 2;
            boolean z10 = false;
            if (this.e >= 0) {
                n6.l.i("Sign-in mode should have been set explicitly by auto-manage.", this.L != null);
            } else {
                Integer num = this.L;
                if (num == null) {
                    this.L = Integer.valueOf(f(this.E.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.L;
            n6.l.g(num2);
            int intValue = num2.intValue();
            reentrantLock.lock();
            try {
                if (intValue == 3 || intValue == 1) {
                    i10 = intValue;
                } else if (intValue != 2) {
                    i10 = intValue;
                    n6.l.a("Illegal sign-in mode: " + i10, z10);
                    i(i10);
                    j();
                    reentrantLock.unlock();
                    return;
                }
                n6.l.a("Illegal sign-in mode: " + i10, z10);
                i(i10);
                j();
                reentrantLock.unlock();
                return;
            } finally {
                reentrantLock.unlock();
            }
            z10 = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void e() {
        LinkedList<e> linkedList = this.n;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.M.a();
            y0 y0Var = this.d;
            if (y0Var != null) {
                y0Var.f();
            }
            Set<p> set = (Set) this.J.b;
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
                n6.s sVar = this.c;
                sVar.e = false;
                sVar.f.incrementAndGet();
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean h() {
        if (!this.r) {
            return false;
        }
        this.r = false;
        this.x.removeMessages(2);
        this.x.removeMessages(1);
        v0 v0Var = this.D;
        if (v0Var != null) {
            v0Var.a();
            this.D = null;
        }
        return true;
    }

    public final void i(int i10) {
        ReentrantLock reentrantLock;
        Integer num = this.L;
        if (num == null) {
            this.L = Integer.valueOf(i10);
        } else if (num.intValue() != i10) {
            int intValue = this.L.intValue();
            throw new IllegalStateException(a1.g.o(i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED", ". Mode was already set to ", intValue != 1 ? intValue != 2 ? intValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED", new StringBuilder("Cannot use sign-in mode: ")));
        }
        if (this.d != null) {
            return;
        }
        a0.f fVar = this.E;
        Iterator it = ((a0.e) fVar.values()).iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) it.next();
            z10 |= cVar.q();
            z11 |= cVar.b();
        }
        int intValue2 = this.L.intValue();
        ArrayList arrayList = this.K;
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
                    if (true == cVar3.b()) {
                        cVar2 = cVar3;
                    }
                    if (cVar3.q()) {
                        fVar2.put((com.google.android.gms.common.api.d) entry.getKey(), cVar3);
                    } else {
                        fVar3.put((com.google.android.gms.common.api.d) entry.getKey(), cVar3);
                    }
                }
                n6.l.i("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !fVar2.isEmpty());
                a0.f fVar4 = new a0.f(0);
                a0.f fVar5 = new a0.f(0);
                a0.f fVar6 = this.H;
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
                    p1 p1Var = (p1) arrayList.get(i11);
                    if (fVar4.containsKey(p1Var.a)) {
                        arrayList2.add(p1Var);
                    } else {
                        if (!fVar5.containsKey(p1Var.a)) {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                        arrayList3.add(p1Var);
                    }
                }
                this.d = new x(this.f, this, reentrantLock2, this.h, this.y, fVar2, fVar3, this.G, this.I, cVar2, arrayList2, arrayList3, fVar4, fVar5);
                return;
            }
            reentrantLock = reentrantLock2;
        }
        this.d = new n0(this.f, this, reentrantLock, this.h, this.y, this.E, this.G, this.H, this.I, arrayList, this);
    }

    public final void j() {
        this.c.e = true;
        y0 y0Var = this.d;
        n6.l.g(y0Var);
        y0Var.a();
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void t(k6.a aVar) {
        k6.d dVar = this.y;
        Context context = this.f;
        int i10 = aVar.b;
        dVar.getClass();
        AtomicBoolean atomicBoolean = k6.g.a;
        if (!(i10 == 18 ? true : i10 == 1 ? k6.g.c(context) : false)) {
            h();
        }
        if (this.r) {
            return;
        }
        n6.s sVar = this.c;
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
        n6.s sVar2 = this.c;
        sVar2.e = false;
        sVar2.f.incrementAndGet();
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void w(int i10) {
        if (i10 == 1) {
            if (!this.r) {
                this.r = true;
                if (this.D == null) {
                    try {
                        k6.d dVar = this.y;
                        Context applicationContext = this.f.getApplicationContext();
                        j0 j0Var = new j0(this);
                        dVar.getClass();
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        v0 v0Var = new v0(j0Var);
                        k7.c.e(applicationContext, v0Var, intentFilter);
                        v0Var.a = applicationContext;
                        if (!k6.g.c(applicationContext)) {
                            j0Var.a();
                            v0Var.a();
                            v0Var = null;
                        }
                        this.D = v0Var;
                    } catch (SecurityException unused) {
                    }
                }
                i0 i0Var = this.x;
                i0Var.sendMessageDelayed(i0Var.obtainMessage(1), this.s);
                i0 i0Var2 = this.x;
                i0Var2.sendMessageDelayed(i0Var2.obtainMessage(2), this.w);
            }
            i10 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) ((Set) this.M.a).toArray(new BasePendingResult[0])) {
            basePendingResult.e(h1.c);
        }
        n6.s sVar = this.c;
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
        n6.s sVar2 = this.c;
        sVar2.e = false;
        sVar2.f.incrementAndGet();
        if (i10 == 2) {
            j();
        }
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void z(Bundle bundle) {
        while (!this.n.isEmpty()) {
            e eVar = (e) this.n.remove();
            a0.f fVar = this.E;
            com.google.android.gms.common.api.e eVar2 = eVar.p;
            n6.l.a("GoogleApiClient is not configured to use " + (eVar2 != null ? eVar2.c : "the API") + " required for this call.", fVar.containsKey(eVar.o));
            this.b.lock();
            try {
                y0 y0Var = this.d;
                if (y0Var == null) {
                    throw new IllegalStateException("GoogleApiClient is not connected yet.");
                }
                if (this.r) {
                    this.n.add(eVar);
                    while (!this.n.isEmpty()) {
                        e eVar3 = (e) this.n.remove();
                        h1 h1Var = this.M;
                        ((Set) h1Var.a).add(eVar3);
                        eVar3.g.set((g1) h1Var.b);
                        eVar3.o(Status.h);
                    }
                } else {
                    y0Var.c(eVar);
                }
                this.b.unlock();
            } catch (Throwable th2) {
                this.b.unlock();
                throw th2;
            }
        }
        n6.s sVar = this.c;
        if (Looper.myLooper() != sVar.n.getLooper()) {
            throw new IllegalStateException("onConnectionSuccess must only be called on the Handler thread");
        }
        synchronized (sVar.r) {
            try {
                n6.l.j(!sVar.h);
                sVar.n.removeMessages(1);
                sVar.h = true;
                n6.l.j(sVar.c.isEmpty());
                ArrayList arrayList = new ArrayList(sVar.b);
                int i10 = sVar.f.get();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) obj;
                    if (!sVar.e || !sVar.a.a() || sVar.f.get() != i10) {
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
