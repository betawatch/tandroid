package com.google.android.gms.common.api.internal;

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
import m.t3;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class x implements x0 {
    public final Context a;
    public final j0 b;
    public final Looper c;
    public final m0 d;
    public final m0 e;
    public final Map f;
    public final com.google.android.gms.common.api.c j;
    public Bundle k;
    public final Lock o;
    public final Set i = Collections.newSetFromMap(new WeakHashMap());
    public v5.a l = null;
    public v5.a m = null;
    public boolean n = false;
    public int p = 0;

    public x(Context context, j0 j0Var, ReentrantLock reentrantLock, Looper looper, v5.e eVar, a0.f fVar, a0.f fVar2, t3 t3Var, a6.b bVar, com.google.android.gms.common.api.c cVar, ArrayList arrayList, ArrayList arrayList2, a0.f fVar3, a0.f fVar4) {
        this.a = context;
        this.b = j0Var;
        this.o = reentrantLock;
        this.c = looper;
        this.j = cVar;
        this.d = new m0(context, j0Var, reentrantLock, looper, eVar, fVar2, null, fVar4, null, arrayList2, new a9.i(this, 10));
        this.e = new m0(context, j0Var, reentrantLock, looper, eVar, fVar, t3Var, fVar3, bVar, arrayList, new ae.b(this, 8));
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

    public static /* bridge */ /* synthetic */ void k(x xVar, int i10) {
        xVar.b.r(i10);
        xVar.m = null;
        xVar.l = null;
    }

    public static void l(x xVar) {
        v5.a aVar;
        v5.a aVar2;
        v5.a aVar3 = xVar.l;
        m0 m0Var = xVar.e;
        m0 m0Var2 = xVar.d;
        if (aVar3 == null || !aVar3.c()) {
            if (xVar.l != null && (aVar2 = xVar.m) != null && aVar2.c()) {
                m0Var.f();
                v5.a aVar4 = xVar.l;
                y5.l.h(aVar4);
                xVar.h(aVar4);
                return;
            }
            v5.a aVar5 = xVar.l;
            if (aVar5 == null || (aVar = xVar.m) == null) {
                return;
            }
            if (m0Var.n < m0Var2.n) {
                aVar5 = aVar;
            }
            xVar.h(aVar5);
            return;
        }
        v5.a aVar6 = xVar.m;
        if ((aVar6 == null || !aVar6.c()) && !xVar.j()) {
            v5.a aVar7 = xVar.m;
            if (aVar7 != null) {
                if (xVar.p == 1) {
                    xVar.i();
                    return;
                } else {
                    xVar.h(aVar7);
                    m0Var2.f();
                    return;
                }
            }
            return;
        }
        int i10 = xVar.p;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                xVar.p = 0;
            } else {
                j0 j0Var = xVar.b;
                y5.l.h(j0Var);
                j0Var.s(xVar.k);
            }
        }
        xVar.i();
        xVar.p = 0;
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void a() {
        this.p = 2;
        this.n = false;
        this.m = null;
        this.l = null;
        this.d.a();
        this.e.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r3.p == 1) goto L11;
     */
    @Override // com.google.android.gms.common.api.internal.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        this.o.lock();
        try {
            boolean z10 = false;
            if (this.d.m instanceof a0) {
                if (!(this.e.m instanceof a0) && !j()) {
                }
                z10 = true;
            }
            return z10;
        } finally {
            this.o.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final e c(e eVar) {
        m0 m0Var = (m0) this.f.get(eVar.o);
        y5.l.i(m0Var, "GoogleApiClient is not configured to use the API required for this call.");
        if (!m0Var.equals(this.e)) {
            m0 m0Var2 = this.d;
            m0Var2.getClass();
            eVar.l();
            return m0Var2.m.B(eVar);
        }
        if (j()) {
            com.google.android.gms.common.api.c cVar = this.j;
            eVar.o(new Status(4, null, cVar == null ? null : PendingIntent.getActivity(this.a, System.identityHashCode(this.b), cVar.n(), v6.d.a | TLObject.FLAG_27), null));
            return eVar;
        }
        m0 m0Var3 = this.e;
        m0Var3.getClass();
        eVar.l();
        return m0Var3.m.B(eVar);
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final boolean d(k5.d dVar) {
        Lock lock;
        this.o.lock();
        try {
            lock = this.o;
            lock.lock();
            try {
                boolean z10 = true;
                boolean z11 = this.p == 2;
                lock.unlock();
                if (!z11) {
                    if (b()) {
                    }
                    z10 = false;
                    return z10;
                }
                if (!(this.e.m instanceof a0)) {
                    this.i.add(dVar);
                    if (this.p == 0) {
                        this.p = 1;
                    }
                    this.m = null;
                    this.e.a();
                    return z10;
                }
                z10 = false;
                return z10;
            } finally {
                lock.unlock();
            }
        } finally {
            lock = this.o;
        }
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void e() {
        Lock lock = this.o;
        lock.lock();
        try {
            lock.lock();
            try {
                boolean z10 = this.p == 2;
                lock.unlock();
                this.e.f();
                this.m = new v5.a(4);
                if (z10) {
                    new c2.t0(this.c, 4).post(new a8.b(this, 17));
                } else {
                    i();
                }
            } finally {
                lock.unlock();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void f() {
        this.m = null;
        this.l = null;
        this.p = 0;
        this.d.f();
        this.e.f();
        i();
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.e.g(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.d.g(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final void h(v5.a aVar) {
        int i10 = this.p;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.p = 0;
            }
            this.b.C(aVar);
        }
        i();
        this.p = 0;
    }

    public final void i() {
        Set set = this.i;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((k5.d) it.next()).i.release();
        }
        set.clear();
    }

    public final boolean j() {
        v5.a aVar = this.m;
        return aVar != null && aVar.b == 4;
    }
}
