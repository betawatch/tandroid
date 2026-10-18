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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class w implements w0 {
    public final Context a;
    public final i0 b;
    public final Looper c;
    public final l0 d;
    public final l0 e;
    public final Map f;
    public final com.google.android.gms.common.api.c j;
    public Bundle k;
    public final Lock o;
    public final Set i = Collections.newSetFromMap(new WeakHashMap());
    public k6.a l = null;
    public k6.a m = null;
    public boolean n = false;
    public int p = 0;

    public w(Context context, i0 i0Var, ReentrantLock reentrantLock, Looper looper, k6.e eVar, a0.f fVar, a0.f fVar2, s3 s3Var, a8.d dVar, com.google.android.gms.common.api.c cVar, ArrayList arrayList, ArrayList arrayList2, a0.f fVar3, a0.f fVar4) {
        this.a = context;
        this.b = i0Var;
        this.o = reentrantLock;
        this.c = looper;
        this.j = cVar;
        this.d = new l0(context, i0Var, reentrantLock, looper, eVar, fVar2, null, fVar4, null, arrayList2, new a6.m(this, 14));
        this.e = new l0(context, i0Var, reentrantLock, looper, eVar, fVar, s3Var, fVar3, dVar, arrayList, new ya.c(this, 11));
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

    public static /* bridge */ /* synthetic */ void k(w wVar, int i10) {
        wVar.b.n(i10);
        wVar.m = null;
        wVar.l = null;
    }

    public static void l(w wVar) {
        k6.a aVar;
        k6.a aVar2;
        k6.a aVar3 = wVar.l;
        l0 l0Var = wVar.e;
        l0 l0Var2 = wVar.d;
        if (aVar3 == null || !aVar3.c()) {
            if (wVar.l != null && (aVar2 = wVar.m) != null && aVar2.c()) {
                l0Var.f();
                k6.a aVar4 = wVar.l;
                n6.l.h(aVar4);
                wVar.h(aVar4);
                return;
            }
            k6.a aVar5 = wVar.l;
            if (aVar5 == null || (aVar = wVar.m) == null) {
                return;
            }
            if (l0Var.n < l0Var2.n) {
                aVar5 = aVar;
            }
            wVar.h(aVar5);
            return;
        }
        k6.a aVar6 = wVar.m;
        if ((aVar6 == null || !aVar6.c()) && !wVar.j()) {
            k6.a aVar7 = wVar.m;
            if (aVar7 != null) {
                if (wVar.p == 1) {
                    wVar.i();
                    return;
                } else {
                    wVar.h(aVar7);
                    l0Var2.f();
                    return;
                }
            }
            return;
        }
        int i10 = wVar.p;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                wVar.p = 0;
            } else {
                i0 i0Var = wVar.b;
                n6.l.h(i0Var);
                i0Var.o(wVar.k);
            }
        }
        wVar.i();
        wVar.p = 0;
    }

    @Override // com.google.android.gms.common.api.internal.w0
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
    @Override // com.google.android.gms.common.api.internal.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        this.o.lock();
        try {
            boolean z10 = false;
            if (this.d.m instanceof z) {
                if (!(this.e.m instanceof z) && !j()) {
                }
                z10 = true;
            }
            return z10;
        } finally {
            this.o.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final e c(e eVar) {
        l0 l0Var = (l0) this.f.get(eVar.o);
        n6.l.i(l0Var, "GoogleApiClient is not configured to use the API required for this call.");
        if (!l0Var.equals(this.e)) {
            l0 l0Var2 = this.d;
            l0Var2.getClass();
            eVar.l();
            return l0Var2.m.B(eVar);
        }
        if (j()) {
            com.google.android.gms.common.api.c cVar = this.j;
            eVar.o(new Status(4, null, cVar == null ? null : PendingIntent.getActivity(this.a, System.identityHashCode(this.b), cVar.o(), k7.d.a | TLObject.FLAG_27), null));
            return eVar;
        }
        l0 l0Var3 = this.e;
        l0Var3.getClass();
        eVar.l();
        return l0Var3.m.B(eVar);
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final boolean d(a6.d dVar) {
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
                if (!(this.e.m instanceof z)) {
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

    @Override // com.google.android.gms.common.api.internal.w0
    public final void e() {
        Lock lock = this.o;
        lock.lock();
        try {
            lock.lock();
            try {
                boolean z10 = this.p == 2;
                lock.unlock();
                this.e.f();
                this.m = new k6.a(4);
                if (z10) {
                    new com.google.android.gms.internal.cast.a0(this.c, 2).post(new androidx.activity.i(this, 17));
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

    @Override // com.google.android.gms.common.api.internal.w0
    public final void f() {
        this.m = null;
        this.l = null;
        this.p = 0;
        this.d.f();
        this.e.f();
        i();
    }

    @Override // com.google.android.gms.common.api.internal.w0
    public final void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.e.g(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.d.g(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final void h(k6.a aVar) {
        int i10 = this.p;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.p = 0;
            }
            this.b.g(aVar);
        }
        i();
        this.p = 0;
    }

    public final void i() {
        Set set = this.i;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((a6.d) it.next()).i.release();
        }
        set.clear();
    }

    public final boolean j() {
        k6.a aVar = this.m;
        return aVar != null && aVar.b == 4;
    }
}
