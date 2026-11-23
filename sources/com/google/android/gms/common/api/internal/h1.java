package com.google.android.gms.common.api.internal;

import a8.sa;
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
import m.o3;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class h1 implements r0 {
    public final Context a;
    public final f0 b;
    public final Looper c;
    public final i0 d;
    public final i0 e;
    public final Map f;
    public final com.google.android.gms.common.api.c j;
    public Bundle k;
    public final Lock o;
    public final Set i = Collections.newSetFromMap(new WeakHashMap());
    public n6.a l = null;
    public n6.a m = null;
    public boolean n = false;
    public int p = 0;

    public h1(Context context, f0 f0Var, ReentrantLock reentrantLock, Looper looper, n6.e eVar, a0.f fVar, a0.f fVar2, o3 o3Var, a9.e eVar2, com.google.android.gms.common.api.c cVar, ArrayList arrayList, ArrayList arrayList2, a0.f fVar3, a0.f fVar4) {
        this.a = context;
        this.b = f0Var;
        this.o = reentrantLock;
        this.c = looper;
        this.j = cVar;
        this.d = new i0(context, f0Var, reentrantLock, looper, eVar, fVar2, null, fVar4, null, arrayList2, new cb.c(this, 13));
        this.e = new i0(context, f0Var, reentrantLock, looper, eVar, fVar, o3Var, fVar3, eVar2, arrayList, new d6.i(this, 10));
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

    @Override // com.google.android.gms.common.api.internal.r0
    public final void a() {
        this.p = 2;
        this.n = false;
        this.m = null;
        this.l = null;
        this.d.a();
        this.e.a();
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final d b(d dVar) {
        i0 i0Var = (i0) this.f.get(dVar.o);
        q6.m.i(i0Var, "GoogleApiClient is not configured to use the API required for this call.");
        if (!i0Var.equals(this.e)) {
            i0 i0Var2 = this.d;
            i0Var2.getClass();
            dVar.l();
            return i0Var2.m.b(dVar);
        }
        if (i()) {
            com.google.android.gms.common.api.c cVar = this.j;
            dVar.o(new Status(4, null, cVar == null ? null : PendingIntent.getActivity(this.a, System.identityHashCode(this.b), cVar.e(), n7.c.a | TLObject.FLAG_27), null));
            return dVar;
        }
        i0 i0Var3 = this.e;
        i0Var3.getClass();
        dVar.l();
        return i0Var3.m.b(dVar);
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void c() {
        this.m = null;
        this.l = null;
        this.p = 0;
        this.d.c();
        this.e.c();
        h();
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.e.d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.d.d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final boolean e(d6.d dVar) {
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
                    if (g()) {
                    }
                    z10 = false;
                    return z10;
                }
                i0 i0Var = this.e;
                if (!(i0Var.m instanceof w)) {
                    this.i.add(dVar);
                    if (this.p == 0) {
                        this.p = 1;
                    }
                    this.m = null;
                    i0Var.a();
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

    @Override // com.google.android.gms.common.api.internal.r0
    public final void f() {
        Lock lock = this.o;
        lock.lock();
        try {
            lock.lock();
            try {
                boolean z10 = this.p == 2;
                lock.unlock();
                this.e.c();
                this.m = new n6.a(4, null, null);
                if (z10) {
                    new com.google.android.gms.internal.cast.y(this.c, 2).post(new sa(this, 22));
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
    @Override // com.google.android.gms.common.api.internal.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        this.o.lock();
        try {
            boolean z10 = false;
            if (this.d.m instanceof w) {
                if (!(this.e.m instanceof w) && !i()) {
                }
                z10 = true;
            }
            return z10;
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
        i0 i0Var = this.d;
        if (aVar3 == null || !aVar3.c()) {
            n6.a aVar4 = this.l;
            i0 i0Var2 = this.e;
            if (aVar4 != null && (aVar2 = this.m) != null && aVar2.c()) {
                i0Var2.c();
                n6.a aVar5 = this.l;
                q6.m.h(aVar5);
                k(aVar5);
                return;
            }
            n6.a aVar6 = this.l;
            if (aVar6 == null || (aVar = this.m) == null) {
                return;
            }
            if (i0Var2.n < i0Var.n) {
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
                    i0Var.c();
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
                f0 f0Var = this.b;
                q6.m.h(f0Var);
                f0Var.m(this.k);
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
            this.b.i(aVar);
        }
        h();
        this.p = 0;
    }
}
