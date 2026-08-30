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
import m.s3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class j0 extends com.google.android.gms.common.api.m implements v0 {
    public final a0.f B;
    public Set C;
    public final s3 D;
    public final a0.f E;
    public final a8.j F;
    public final androidx.biometric.f0 G;
    public final ArrayList H;
    public Integer I;
    public final h1 J;
    public final ReentrantLock b;
    public final b6.t c;
    public x0 d;
    public final int e;
    public final Context f;
    public final Looper h;
    public final LinkedList n;
    public volatile boolean r;
    public final long s;
    public final long v;
    public final h0 w;
    public final y5.d x;
    public u0 y;

    public j0(Context context, ReentrantLock reentrantLock, Looper looper, s3 s3Var, a0.f fVar, ArrayList arrayList, ArrayList arrayList2, a0.f fVar2, int i10, ArrayList arrayList3) {
        y5.d dVar = y5.d.d;
        a8.j jVar = b8.b.a;
        this.d = null;
        this.n = new LinkedList();
        this.s = 120000L;
        this.v = 5000L;
        this.C = new HashSet();
        this.G = new androidx.biometric.f0(5);
        this.I = null;
        ja.c cVar = new ja.c(this, 5);
        this.f = context;
        this.b = reentrantLock;
        this.c = new b6.t(looper, cVar);
        this.h = looper;
        int i11 = 0;
        this.w = new h0(this, looper, i11);
        this.x = dVar;
        this.e = -1;
        this.E = fVar;
        this.B = fVar2;
        this.H = arrayList3;
        this.J = new h1(0);
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) obj;
            b6.t tVar = this.c;
            tVar.getClass();
            b6.m.h(kVar);
            synchronized (tVar.r) {
                try {
                    if (tVar.b.contains(kVar)) {
                        Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + String.valueOf(kVar) + " is already registered");
                    } else {
                        tVar.b.add(kVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (tVar.a.r0()) {
                a7.e eVar = tVar.n;
                eVar.sendMessage(eVar.obtainMessage(1, kVar));
            }
        }
        int size2 = arrayList2.size();
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            this.c.a((com.google.android.gms.common.api.l) obj2);
        }
        this.D = s3Var;
        this.F = jVar;
    }

    public static int f(Collection collection, boolean z4) {
        Iterator it = collection.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) it.next();
            z10 |= cVar.p();
            z11 |= cVar.a();
        }
        if (z10) {
            return (z11 && z4) ? 2 : 1;
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

    @Override // com.google.android.gms.common.api.m
    public final void a() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            int i10 = 2;
            boolean z4 = false;
            if (this.e >= 0) {
                b6.m.j("Sign-in mode should have been set explicitly by auto-manage.", this.I != null);
            } else {
                Integer num = this.I;
                if (num == null) {
                    this.I = Integer.valueOf(f(this.B.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.I;
            b6.m.h(num2);
            int intValue = num2.intValue();
            reentrantLock.lock();
            try {
                if (intValue == 3 || intValue == 1) {
                    i10 = intValue;
                } else if (intValue != 2) {
                    i10 = intValue;
                    b6.m.a("Illegal sign-in mode: " + i10, z4);
                    i(i10);
                    j();
                    reentrantLock.unlock();
                    return;
                }
                b6.m.a("Illegal sign-in mode: " + i10, z4);
                i(i10);
                j();
                reentrantLock.unlock();
                return;
            } finally {
                reentrantLock.unlock();
            }
            z4 = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.m
    public final void b() {
        LinkedList<e> linkedList = this.n;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.J.a();
            x0 x0Var = this.d;
            if (x0Var != null) {
                x0Var.e();
            }
            Set<p> set = (Set) this.G.b;
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
                b6.t tVar = this.c;
                tVar.e = false;
                tVar.f.incrementAndGet();
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.m
    public final Looper c() {
        return this.h;
    }

    @Override // com.google.android.gms.common.api.m
    public final boolean d(o5.d dVar) {
        x0 x0Var = this.d;
        return x0Var != null && x0Var.g(dVar);
    }

    @Override // com.google.android.gms.common.api.m
    public final void e() {
        x0 x0Var = this.d;
        if (x0Var != null) {
            x0Var.d();
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
        Integer num = this.I;
        if (num == null) {
            this.I = Integer.valueOf(i10);
        } else if (num.intValue() != i10) {
            int intValue = this.I.intValue();
            throw new IllegalStateException(android.support.v4.media.a.p(i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED", ". Mode was already set to ", intValue != 1 ? intValue != 2 ? intValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED", new StringBuilder("Cannot use sign-in mode: ")));
        }
        if (this.d != null) {
            return;
        }
        a0.f fVar = this.B;
        Iterator it = ((a0.e) fVar.values()).iterator();
        boolean z4 = false;
        boolean z10 = false;
        while (it.hasNext()) {
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) it.next();
            z4 |= cVar.p();
            z10 |= cVar.a();
        }
        int intValue2 = this.I.intValue();
        ArrayList arrayList = this.H;
        ReentrantLock reentrantLock2 = this.b;
        if (intValue2 == 1) {
            reentrantLock = reentrantLock2;
            if (!z4) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (z10) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else {
            if (intValue2 == 2 && z4) {
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
                    if (cVar3.p()) {
                        fVar2.put((com.google.android.gms.common.api.d) entry.getKey(), cVar3);
                    } else {
                        fVar3.put((com.google.android.gms.common.api.d) entry.getKey(), cVar3);
                    }
                }
                b6.m.j("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !fVar2.isEmpty());
                a0.f fVar4 = new a0.f(0);
                a0.f fVar5 = new a0.f(0);
                a0.f fVar6 = this.E;
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
                    q1 q1Var = (q1) arrayList.get(i11);
                    if (fVar4.containsKey(q1Var.a)) {
                        arrayList2.add(q1Var);
                    } else {
                        if (!fVar5.containsKey(q1Var.a)) {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                        arrayList3.add(q1Var);
                    }
                }
                this.d = new x(this.f, this, reentrantLock2, this.h, this.x, fVar2, fVar3, this.D, this.F, cVar2, arrayList2, arrayList3, fVar4, fVar5);
                return;
            }
            reentrantLock = reentrantLock2;
        }
        this.d = new m0(this.f, this, reentrantLock, this.h, this.x, this.B, this.D, this.E, this.F, arrayList, this);
    }

    public final void j() {
        this.c.e = true;
        x0 x0Var = this.d;
        b6.m.h(x0Var);
        x0Var.a();
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void n(int i10) {
        if (i10 == 1) {
            if (!this.r) {
                this.r = true;
                if (this.y == null) {
                    try {
                        y5.d dVar = this.x;
                        Context applicationContext = this.f.getApplicationContext();
                        i0 i0Var = new i0(this);
                        dVar.getClass();
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        u0 u0Var = new u0(i0Var);
                        y6.c.g(applicationContext, u0Var, intentFilter);
                        u0Var.a = applicationContext;
                        if (!y5.g.c(applicationContext)) {
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
        for (BasePendingResult basePendingResult : (BasePendingResult[]) ((Set) this.J.a).toArray(new BasePendingResult[0])) {
            basePendingResult.e(h1.c);
        }
        b6.t tVar = this.c;
        if (Looper.myLooper() != tVar.n.getLooper()) {
            throw new IllegalStateException("onUnintentionalDisconnection must only be called on the Handler thread");
        }
        tVar.n.removeMessages(1);
        synchronized (tVar.r) {
            try {
                tVar.h = true;
                ArrayList arrayList = new ArrayList(tVar.b);
                int i11 = tVar.f.get();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) obj;
                    if (!tVar.e || tVar.f.get() != i11) {
                        break;
                    } else if (tVar.b.contains(kVar)) {
                        kVar.onConnectionSuspended(i10);
                    }
                }
                tVar.c.clear();
                tVar.h = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        b6.t tVar2 = this.c;
        tVar2.e = false;
        tVar2.f.incrementAndGet();
        if (i10 == 2) {
            j();
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void o(Bundle bundle) {
        while (!this.n.isEmpty()) {
            e eVar = (e) this.n.remove();
            a0.f fVar = this.B;
            com.google.android.gms.common.api.e eVar2 = eVar.p;
            b6.m.a("GoogleApiClient is not configured to use " + (eVar2 != null ? eVar2.c : "the API") + " required for this call.", fVar.containsKey(eVar.o));
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
                        h1 h1Var = this.J;
                        ((Set) h1Var.a).add(eVar3);
                        eVar3.g.set((g1) h1Var.b);
                        eVar3.o(Status.h);
                    }
                } else {
                    x0Var.c(eVar);
                }
                this.b.unlock();
            } catch (Throwable th2) {
                this.b.unlock();
                throw th2;
            }
        }
        b6.t tVar = this.c;
        if (Looper.myLooper() != tVar.n.getLooper()) {
            throw new IllegalStateException("onConnectionSuccess must only be called on the Handler thread");
        }
        synchronized (tVar.r) {
            try {
                b6.m.k(!tVar.h);
                tVar.n.removeMessages(1);
                tVar.h = true;
                b6.m.k(tVar.c.isEmpty());
                ArrayList arrayList = new ArrayList(tVar.b);
                int i10 = tVar.f.get();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) obj;
                    if (!tVar.e || !tVar.a.r0() || tVar.f.get() != i10) {
                        break;
                    } else if (!tVar.c.contains(kVar)) {
                        kVar.onConnected(bundle);
                    }
                }
                tVar.c.clear();
                tVar.h = false;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void v(y5.a aVar) {
        y5.d dVar = this.x;
        Context context = this.f;
        int i10 = aVar.b;
        dVar.getClass();
        AtomicBoolean atomicBoolean = y5.g.a;
        if (!(i10 == 18 ? true : i10 == 1 ? y5.g.c(context) : false)) {
            h();
        }
        if (this.r) {
            return;
        }
        b6.t tVar = this.c;
        if (Looper.myLooper() != tVar.n.getLooper()) {
            throw new IllegalStateException("onConnectionFailure must only be called on the Handler thread");
        }
        tVar.n.removeMessages(1);
        synchronized (tVar.r) {
            try {
                ArrayList arrayList = new ArrayList(tVar.d);
                int i11 = tVar.f.get();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    com.google.android.gms.common.api.l lVar = (com.google.android.gms.common.api.l) obj;
                    if (tVar.e && tVar.f.get() == i11) {
                        if (tVar.d.contains(lVar)) {
                            lVar.onConnectionFailed(aVar);
                        }
                    }
                }
            } finally {
            }
        }
        b6.t tVar2 = this.c;
        tVar2.e = false;
        tVar2.f.incrementAndGet();
    }
}
