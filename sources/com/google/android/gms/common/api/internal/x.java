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
import m.s3;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
    public y5.a l = null;
    public y5.a m = null;
    public boolean n = false;
    public int p = 0;

    public x(Context context, j0 j0Var, ReentrantLock reentrantLock, Looper looper, y5.e eVar, a0.f fVar, a0.f fVar2, s3 s3Var, a8.j jVar, com.google.android.gms.common.api.c cVar, ArrayList arrayList, ArrayList arrayList2, a0.f fVar3, a0.f fVar4) {
        this.a = context;
        this.b = j0Var;
        this.o = reentrantLock;
        this.c = looper;
        this.j = cVar;
        this.d = new m0(context, j0Var, reentrantLock, looper, eVar, fVar2, null, fVar4, null, arrayList2, new androidx.biometric.f0(this, 6));
        this.e = new m0(context, j0Var, reentrantLock, looper, eVar, fVar, s3Var, fVar3, jVar, arrayList, new a3.c(this, 7));
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
        xVar.b.n(i10);
        xVar.m = null;
        xVar.l = null;
    }

    public static void l(x xVar) {
        y5.a aVar;
        y5.a aVar2;
        y5.a aVar3 = xVar.l;
        m0 m0Var = xVar.e;
        m0 m0Var2 = xVar.d;
        if (aVar3 == null || !aVar3.f()) {
            if (xVar.l != null && (aVar2 = xVar.m) != null && aVar2.f()) {
                m0Var.e();
                y5.a aVar4 = xVar.l;
                b6.m.h(aVar4);
                xVar.h(aVar4);
                return;
            }
            y5.a aVar5 = xVar.l;
            if (aVar5 == null || (aVar = xVar.m) == null) {
                return;
            }
            if (m0Var.n < m0Var2.n) {
                aVar5 = aVar;
            }
            xVar.h(aVar5);
            return;
        }
        y5.a aVar6 = xVar.m;
        if ((aVar6 == null || !aVar6.f()) && !xVar.j()) {
            y5.a aVar7 = xVar.m;
            if (aVar7 != null) {
                if (xVar.p == 1) {
                    xVar.i();
                    return;
                } else {
                    xVar.h(aVar7);
                    m0Var2.e();
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
                b6.m.h(j0Var);
                j0Var.o(xVar.k);
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
            boolean z4 = false;
            if (this.d.m instanceof a0) {
                if (!(this.e.m instanceof a0) && !j()) {
                }
                z4 = true;
            }
            return z4;
        } finally {
            this.o.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final e c(e eVar) {
        m0 m0Var = (m0) this.f.get(eVar.o);
        b6.m.i(m0Var, "GoogleApiClient is not configured to use the API required for this call.");
        if (!m0Var.equals(this.e)) {
            m0 m0Var2 = this.d;
            m0Var2.getClass();
            eVar.l();
            return m0Var2.m.H(eVar);
        }
        if (j()) {
            com.google.android.gms.common.api.c cVar = this.j;
            eVar.o(new Status(4, null, cVar == null ? null : PendingIntent.getActivity(this.a, System.identityHashCode(this.b), cVar.o(), y6.d.a | TLObject.FLAG_27), null));
            return eVar;
        }
        m0 m0Var3 = this.e;
        m0Var3.getClass();
        eVar.l();
        return m0Var3.m.H(eVar);
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void d() {
        Lock lock = this.o;
        lock.lock();
        try {
            lock.lock();
            try {
                boolean z4 = this.p == 2;
                lock.unlock();
                this.e.e();
                this.m = new y5.a(4);
                if (z4) {
                    new a7.e(this.c, 5).post(new androidx.activity.i(this, 15));
                } else {
                    i();
                }
            } finally {
                lock.unlock();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void e() {
        this.m = null;
        this.l = null;
        this.p = 0;
        this.d.e();
        this.e.e();
        i();
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.e.f(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.d.f(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final boolean g(o5.d dVar) {
        Lock lock;
        this.o.lock();
        try {
            lock = this.o;
            lock.lock();
            try {
                boolean z4 = true;
                boolean z10 = this.p == 2;
                lock.unlock();
                if (!z10) {
                    if (b()) {
                    }
                    z4 = false;
                    return z4;
                }
                if (!(this.e.m instanceof a0)) {
                    this.i.add(dVar);
                    if (this.p == 0) {
                        this.p = 1;
                    }
                    this.m = null;
                    this.e.a();
                    return z4;
                }
                z4 = false;
                return z4;
            } finally {
                lock.unlock();
            }
        } finally {
            lock = this.o;
        }
    }

    public final void h(y5.a aVar) {
        int i10 = this.p;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.p = 0;
            }
            this.b.v(aVar);
        }
        i();
        this.p = 0;
    }

    public final void i() {
        Set set = this.i;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((o5.d) it.next()).i.release();
        }
        set.clear();
    }

    public final boolean j() {
        y5.a aVar = this.m;
        return aVar != null && aVar.b == 4;
    }
}
