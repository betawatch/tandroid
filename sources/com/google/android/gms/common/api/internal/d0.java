package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import m.q3;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class d0 extends com.google.android.gms.common.api.m implements o0 {
    public ab.e0 D;
    public final a0.f E;
    public Set F;
    public final q3 G;
    public final a0.f H;
    public final a9.e I;
    public final cb.c J;
    public final ArrayList K;
    public Integer L;
    public final y0 M;
    public final ReentrantLock b;
    public final q6.u c;
    public p0 d;
    public final int e;
    public final Context f;
    public final Looper h;
    public final LinkedList n;
    public volatile boolean r;
    public final long s;
    public final long w;
    public final c0 x;
    public final n6.d y;

    public d0(Context context, ReentrantLock reentrantLock, Looper looper, q3 q3Var, a0.f fVar, ArrayList arrayList, ArrayList arrayList2, a0.f fVar2, int i7, ArrayList arrayList3) {
        n6.d dVar = n6.d.e;
        a9.e eVar = q8.b.a;
        this.d = null;
        this.n = new LinkedList();
        this.s = 120000L;
        this.w = 5000L;
        this.F = new HashSet();
        this.J = new cb.c(14);
        this.L = null;
        aa.n nVar = new aa.n(this, 10);
        this.f = context;
        this.b = reentrantLock;
        this.c = new q6.u(looper, nVar);
        this.h = looper;
        this.x = new c0(this, looper, 0);
        this.y = dVar;
        this.e = -1;
        this.H = fVar;
        this.E = fVar2;
        this.K = arrayList3;
        int i10 = 0;
        this.M = new y0(0);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) obj;
            q6.u uVar = this.c;
            uVar.getClass();
            q6.m.g(kVar);
            synchronized (uVar.r) {
                try {
                    ArrayList arrayList4 = uVar.b;
                    if (arrayList4.contains(kVar)) {
                        String valueOf = String.valueOf(kVar);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 62);
                        sb2.append("registerConnectionCallbacks(): listener ");
                        sb2.append(valueOf);
                        sb2.append(" is already registered");
                        Log.w("GmsClientEvents", sb2.toString());
                    } else {
                        arrayList4.add(kVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (uVar.a.j()) {
                com.google.android.gms.internal.cast.y yVar = uVar.n;
                yVar.sendMessage(yVar.obtainMessage(1, kVar));
            }
        }
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            this.c.a((com.google.android.gms.common.api.l) obj2);
        }
        this.G = q3Var;
        this.I = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int j(Collection collection, boolean z9) {
        Iterator it = collection.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) it.next();
            z10 |= cVar.f();
            z11 |= ((q6.d) cVar) instanceof d6.e;
        }
        if (z10) {
            return (z11 && z9) ? 2 : 1;
        }
        return 3;
    }

    @Override // com.google.android.gms.common.api.m
    public final Looper a() {
        return this.h;
    }

    @Override // com.google.android.gms.common.api.m
    public final boolean b(d6.d dVar) {
        p0 p0Var = this.d;
        return p0Var != null && p0Var.e(dVar);
    }

    @Override // com.google.android.gms.common.api.m
    public final void c() {
        p0 p0Var = this.d;
        if (p0Var != null) {
            p0Var.f();
        }
    }

    @Override // com.google.android.gms.common.api.internal.o0
    public final void d(n6.a aVar) {
        n6.d dVar = this.y;
        Context context = this.f;
        int i7 = aVar.b;
        dVar.getClass();
        AtomicBoolean atomicBoolean = n6.g.a;
        if (!(i7 == 18 ? true : i7 == 1 ? n6.g.c(context) : false)) {
            h();
        }
        if (this.r) {
            return;
        }
        q6.u uVar = this.c;
        com.google.android.gms.internal.cast.y yVar = uVar.n;
        if (Looper.myLooper() != yVar.getLooper()) {
            throw new IllegalStateException("onConnectionFailure must only be called on the Handler thread");
        }
        yVar.removeMessages(1);
        synchronized (uVar.r) {
            try {
                ArrayList arrayList = uVar.d;
                ArrayList arrayList2 = new ArrayList(arrayList);
                AtomicInteger atomicInteger = uVar.f;
                int i10 = atomicInteger.get();
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    com.google.android.gms.common.api.l lVar = (com.google.android.gms.common.api.l) obj;
                    if (uVar.e && atomicInteger.get() == i10) {
                        if (arrayList.contains(lVar)) {
                            lVar.onConnectionFailed(aVar);
                        }
                    }
                }
            } finally {
            }
        }
        uVar.e = false;
        uVar.f.incrementAndGet();
    }

    public final void e() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            int i7 = 2;
            boolean z9 = false;
            if (this.e >= 0) {
                q6.m.i("Sign-in mode should have been set explicitly by auto-manage.", this.L != null);
            } else {
                Integer num = this.L;
                if (num == null) {
                    this.L = Integer.valueOf(j(this.E.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.L;
            q6.m.g(num2);
            int intValue = num2.intValue();
            reentrantLock.lock();
            try {
                if (intValue == 3 || intValue == 1) {
                    i7 = intValue;
                } else if (intValue != 2) {
                    i7 = intValue;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 22);
                    sb2.append("Illegal sign-in mode: ");
                    sb2.append(i7);
                    q6.m.a(sb2.toString(), z9);
                    m(i7);
                    n();
                    reentrantLock.unlock();
                    return;
                }
                StringBuilder sb22 = new StringBuilder(String.valueOf(i7).length() + 22);
                sb22.append("Illegal sign-in mode: ");
                sb22.append(i7);
                q6.m.a(sb22.toString(), z9);
                m(i7);
                n();
                reentrantLock.unlock();
                return;
            } finally {
                reentrantLock.unlock();
            }
            z9 = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void f() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.M.a();
            p0 p0Var = this.d;
            if (p0Var != null) {
                p0Var.c();
            }
            Set set = (Set) this.J.b;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((o) it.next()).b = null;
            }
            set.clear();
            LinkedList<d> linkedList = this.n;
            for (d dVar : linkedList) {
                dVar.g.set(null);
                dVar.c();
            }
            linkedList.clear();
            if (this.d != null) {
                h();
                q6.u uVar = this.c;
                uVar.e = false;
                uVar.f.incrementAndGet();
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            this.b.unlock();
            throw th2;
        }
    }

    public final void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.r);
        printWriter.append(" mWorkQueue.size()=").print(this.n.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(((Set) this.M.a).size());
        p0 p0Var = this.d;
        if (p0Var != null) {
            p0Var.d(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final boolean h() {
        if (!this.r) {
            return false;
        }
        this.r = false;
        c0 c0Var = this.x;
        c0Var.removeMessages(2);
        c0Var.removeMessages(1);
        ab.e0 e0Var = this.D;
        if (e0Var != null) {
            e0Var.b();
            this.D = null;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.o0
    public final void i(int i7) {
        if (i7 == 1) {
            if (!this.r) {
                this.r = true;
                if (this.D == null) {
                    try {
                        n6.d dVar = this.y;
                        Context applicationContext = this.f.getApplicationContext();
                        cb.c cVar = new cb.c(this);
                        dVar.getClass();
                        this.D = n6.d.g(applicationContext, cVar);
                    } catch (SecurityException unused) {
                    }
                }
                c0 c0Var = this.x;
                c0Var.sendMessageDelayed(c0Var.obtainMessage(1), this.s);
                c0Var.sendMessageDelayed(c0Var.obtainMessage(2), this.w);
            }
            i7 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) ((Set) this.M.a).toArray(new BasePendingResult[0])) {
            basePendingResult.e(y0.c);
        }
        q6.u uVar = this.c;
        com.google.android.gms.internal.cast.y yVar = uVar.n;
        if (Looper.myLooper() != yVar.getLooper()) {
            throw new IllegalStateException("onUnintentionalDisconnection must only be called on the Handler thread");
        }
        yVar.removeMessages(1);
        synchronized (uVar.r) {
            try {
                uVar.h = true;
                ArrayList arrayList = uVar.b;
                ArrayList arrayList2 = new ArrayList(arrayList);
                AtomicInteger atomicInteger = uVar.f;
                int i10 = atomicInteger.get();
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) obj;
                    if (!uVar.e || atomicInteger.get() != i10) {
                        break;
                    } else if (arrayList.contains(kVar)) {
                        kVar.onConnectionSuspended(i7);
                    }
                }
                uVar.c.clear();
                uVar.h = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        uVar.e = false;
        uVar.f.incrementAndGet();
        if (i7 == 2) {
            n();
        }
    }

    @Override // com.google.android.gms.common.api.internal.o0
    public final void k(Bundle bundle) {
        while (true) {
            LinkedList linkedList = this.n;
            if (linkedList.isEmpty()) {
                q6.u uVar = this.c;
                com.google.android.gms.internal.cast.y yVar = uVar.n;
                if (Looper.myLooper() != yVar.getLooper()) {
                    throw new IllegalStateException("onConnectionSuccess must only be called on the Handler thread");
                }
                synchronized (uVar.r) {
                    try {
                        q6.m.j(!uVar.h);
                        yVar.removeMessages(1);
                        uVar.h = true;
                        ArrayList arrayList = uVar.c;
                        q6.m.j(arrayList.isEmpty());
                        ArrayList arrayList2 = new ArrayList(uVar.b);
                        AtomicInteger atomicInteger = uVar.f;
                        int i7 = atomicInteger.get();
                        int size = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) obj;
                            if (!uVar.e || !uVar.a.j() || atomicInteger.get() != i7) {
                                break;
                            } else if (!arrayList.contains(kVar)) {
                                kVar.onConnected(bundle);
                            }
                        }
                        arrayList.clear();
                        uVar.h = false;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            }
            d dVar = (d) linkedList.remove();
            a0.f fVar = this.E;
            com.google.android.gms.common.api.e eVar = dVar.p;
            boolean containsKey = fVar.containsKey(dVar.o);
            String str = eVar != null ? eVar.c : "the API";
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 65);
            sb2.append("GoogleApiClient is not configured to use ");
            sb2.append(str);
            sb2.append(" required for this call.");
            q6.m.a(sb2.toString(), containsKey);
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                p0 p0Var = this.d;
                if (p0Var == null) {
                    throw new IllegalStateException("GoogleApiClient is not connected yet.");
                }
                if (this.r) {
                    LinkedList linkedList2 = this.n;
                    linkedList2.add(dVar);
                    while (!linkedList2.isEmpty()) {
                        d dVar2 = (d) linkedList2.remove();
                        y0 y0Var = this.M;
                        ((Set) y0Var.a).add(dVar2);
                        dVar2.g.set((x0) y0Var.b);
                        dVar2.o(Status.h);
                    }
                    reentrantLock.unlock();
                } else {
                    p0Var.b(dVar);
                }
            } finally {
                this.b.unlock();
            }
        }
    }

    public final /* synthetic */ void l() {
        this.b.lock();
        try {
            if (this.r) {
                n();
            }
        } finally {
            this.b.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(int i7) {
        ReentrantLock reentrantLock;
        Integer num = this.L;
        if (num == null) {
            this.L = Integer.valueOf(i7);
        } else if (num.intValue() != i7) {
            int intValue = this.L.intValue();
            String str = intValue != 1 ? intValue != 2 ? intValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            String str2 = i7 != 1 ? i7 != 2 ? i7 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            StringBuilder sb2 = new StringBuilder(str.length() + str2.length() + 51);
            sb2.append("Cannot use sign-in mode: ");
            sb2.append(str2);
            sb2.append(". Mode was already set to ");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
        if (this.d != null) {
            return;
        }
        a0.f fVar = this.E;
        Iterator it = ((a0.e) fVar.values()).iterator();
        boolean z9 = false;
        boolean z10 = false;
        while (it.hasNext()) {
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) it.next();
            z9 |= cVar.f();
            z10 |= ((q6.d) cVar) instanceof d6.e;
        }
        int intValue2 = this.L.intValue();
        ArrayList arrayList = this.K;
        ReentrantLock reentrantLock2 = this.b;
        if (intValue2 == 1) {
            reentrantLock = reentrantLock2;
            if (!z9) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (z10) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            fVar = fVar;
        } else {
            if (intValue2 == 2 && z9) {
                a0.f fVar2 = new a0.f(0);
                a0.f fVar3 = new a0.f(0);
                Iterator it2 = ((a0.a) fVar.entrySet()).iterator();
                com.google.android.gms.common.api.c cVar2 = null;
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    com.google.android.gms.common.api.c cVar3 = (com.google.android.gms.common.api.c) entry.getValue();
                    q6.d dVar = (q6.d) cVar3;
                    dVar.getClass();
                    if (true == (dVar instanceof d6.e)) {
                        cVar2 = cVar3;
                    }
                    if (cVar3.f()) {
                        fVar2.put((com.google.android.gms.common.api.d) entry.getKey(), cVar3);
                    } else {
                        fVar3.put((com.google.android.gms.common.api.d) entry.getKey(), cVar3);
                    }
                }
                q6.m.i("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !fVar2.isEmpty());
                a0.f fVar4 = new a0.f(0);
                a0.f fVar5 = new a0.f(0);
                a0.f fVar6 = this.H;
                Iterator it3 = ((a0.c) fVar6.keySet()).iterator();
                while (it3.hasNext()) {
                    com.google.android.gms.common.api.e eVar = (com.google.android.gms.common.api.e) it3.next();
                    Object obj = eVar.b;
                    if (fVar2.containsKey(obj)) {
                        fVar4.put(eVar, (Boolean) fVar6.get(eVar));
                    } else {
                        if (!fVar3.containsKey(obj)) {
                            throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                        }
                        fVar5.put(eVar, (Boolean) fVar6.get(eVar));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    e1 e1Var = (e1) arrayList.get(i10);
                    com.google.android.gms.common.api.e eVar2 = e1Var.a;
                    if (fVar4.containsKey(eVar2)) {
                        arrayList2.add(e1Var);
                    } else {
                        if (!fVar5.containsKey(eVar2)) {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                        arrayList3.add(e1Var);
                    }
                }
                this.d = new f1(this.f, this, reentrantLock2, this.h, this.y, fVar2, fVar3, this.G, this.I, cVar2, arrayList2, arrayList3, fVar4, fVar5);
                return;
            }
            reentrantLock = reentrantLock2;
        }
        this.d = new g0(this.f, this, reentrantLock, this.h, this.y, fVar, this.G, this.H, this.I, arrayList, this);
    }

    public final void n() {
        this.c.e = true;
        p0 p0Var = this.d;
        q6.m.g(p0Var);
        p0Var.a();
    }
}
