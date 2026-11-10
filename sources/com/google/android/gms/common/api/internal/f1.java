package com.google.android.gms.common.api.internal;

import a8.ra;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import m.q3;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class f1 implements p0 {
    public final Context a;
    public final d0 b;
    public final Looper c;
    public final g0 d;
    public final g0 e;
    public final Map f;
    public final com.google.android.gms.common.api.c j;
    public Bundle k;
    public final Lock o;
    public final Set i = Collections.newSetFromMap(new WeakHashMap());
    public n6.a l = null;
    public n6.a m = null;
    public boolean n = false;
    public int p = 0;

    public f1(Context context, d0 d0Var, ReentrantLock reentrantLock, Looper looper, n6.e eVar, a0.f fVar, a0.f fVar2, q3 q3Var, a9.e eVar2, com.google.android.gms.common.api.c cVar, ArrayList arrayList, ArrayList arrayList2, a0.f fVar3, a0.f fVar4) {
        this.a = context;
        this.b = d0Var;
        this.o = reentrantLock;
        this.c = looper;
        this.j = cVar;
        this.d = new g0(context, d0Var, reentrantLock, looper, eVar, fVar2, null, fVar4, null, arrayList2, new aa.n(this, 11));
        this.e = new g0(context, d0Var, reentrantLock, looper, eVar, fVar, q3Var, fVar3, eVar2, arrayList, new cb.c(this, 16));
        a0.f fVar5 = new a0.f(0);
        Iterator it = ((a0.c) fVar2.keySet()).iterator();
        while (it.hasNext()) {
            fVar5.put((com.google.android.gms.common.api.d) it.next(), this.d);
        }
        Iterator it2 = ((a0.c) fVar.keySet()).iterator();
        while (it2.hasNext()) {
            fVar5.put((com.google.android.gms.common.api.d) it2.next(), this.e);
        }
        this.f = DesugarCollections.unmodifiableMap(fVar5);
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public final void a() {
        this.p = 2;
        this.n = false;
        this.m = null;
        this.l = null;
        this.d.a();
        this.e.a();
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public final d b(d dVar) {
        g0 g0Var = (g0) this.f.get(dVar.o);
        q6.m.h(g0Var, "GoogleApiClient is not configured to use the API required for this call.");
        if (!g0Var.equals(this.e)) {
            g0 g0Var2 = this.d;
            g0Var2.getClass();
            dVar.l();
            return g0Var2.m.b(dVar);
        }
        if (i()) {
            com.google.android.gms.common.api.c cVar = this.j;
            dVar.o(new Status(4, null, cVar == null ? null : PendingIntent.getActivity(this.a, System.identityHashCode(this.b), cVar.e(), n7.c.a | TLObject.FLAG_27), null));
            return dVar;
        }
        g0 g0Var3 = this.e;
        g0Var3.getClass();
        dVar.l();
        return g0Var3.m.b(dVar);
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public final void c() {
        this.m = null;
        this.l = null;
        this.p = 0;
        this.d.c();
        this.e.c();
        h();
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.e.d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.d.d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public final boolean e(d6.d dVar) {
        Lock lock;
        this.o.lock();
        try {
            lock = this.o;
            lock.lock();
            try {
                boolean z9 = true;
                boolean z10 = this.p == 2;
                lock.unlock();
                if (!z10) {
                    if (g()) {
                    }
                    z9 = false;
                    return z9;
                }
                g0 g0Var = this.e;
                if (!(g0Var.m instanceof v)) {
                    this.i.add(dVar);
                    if (this.p == 0) {
                        this.p = 1;
                    }
                    this.m = null;
                    g0Var.a();
                    return z9;
                }
                z9 = false;
                return z9;
            } finally {
                lock.unlock();
            }
        } finally {
            lock = this.o;
        }
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public final void f() {
        Lock lock = this.o;
        lock.lock();
        try {
            lock.lock();
            try {
                boolean z9 = this.p == 2;
                lock.unlock();
                this.e.c();
                this.m = new n6.a(4, null, null);
                if (z9) {
                    new com.google.android.gms.internal.cast.y(this.c, 2).post(new ra(this, 19));
                } else {
                    h();
                }
            } finally {
                lock.unlock();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r3.p == 1) goto L11;
     */
    @Override // com.google.android.gms.common.api.internal.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        this.o.lock();
        try {
            boolean z9 = false;
            if (this.d.m instanceof v) {
                if (!(this.e.m instanceof v) && !i()) {
                }
                z9 = true;
            }
            return z9;
        } finally {
            this.o.unlock();
        }
    }

    public final void h() {
        Set set = this.i;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((d6.d) it.next()).i.release();
        }
        set.clear();
    }

    public final boolean i() {
        n6.a aVar = this.m;
        return aVar != null && aVar.b == 4;
    }

    public final void j() {
        n6.a aVar;
        n6.a aVar2;
        n6.a aVar3 = this.l;
        g0 g0Var = this.d;
        if (aVar3 == null || !aVar3.c()) {
            n6.a aVar4 = this.l;
            g0 g0Var2 = this.e;
            if (aVar4 != null && (aVar2 = this.m) != null && aVar2.c()) {
                g0Var2.c();
                n6.a aVar5 = this.l;
                q6.m.g(aVar5);
                k(aVar5);
                return;
            }
            n6.a aVar6 = this.l;
            if (aVar6 == null || (aVar = this.m) == null) {
                return;
            }
            if (g0Var2.n < g0Var.n) {
                aVar6 = aVar;
            }
            k(aVar6);
            return;
        }
        n6.a aVar7 = this.m;
        if ((aVar7 == null || !aVar7.c()) && !i()) {
            n6.a aVar8 = this.m;
            if (aVar8 != null) {
                if (this.p == 1) {
                    h();
                    return;
                } else {
                    k(aVar8);
                    g0Var.c();
                    return;
                }
            }
            return;
        }
        int i7 = this.p;
        if (i7 != 1) {
            if (i7 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                this.p = 0;
            } else {
                d0 d0Var = this.b;
                q6.m.g(d0Var);
                d0Var.k(this.k);
            }
        }
        h();
        this.p = 0;
    }

    public final void k(n6.a aVar) {
        int i7 = this.p;
        if (i7 != 1) {
            if (i7 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.p = 0;
            }
            this.b.d(aVar);
        }
        h();
        this.p = 0;
    }
}
