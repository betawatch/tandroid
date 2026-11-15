package com.google.android.gms.common.api.internal;

import a8.k8;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.r> extends k8 {
    public static final b7.j n = new b7.j(1);
    public final f b;
    public final WeakReference c;
    public h6.q f;
    public com.google.android.gms.common.api.r h;
    public Status i;
    public volatile boolean j;
    public boolean k;
    public boolean l;
    public final Object a = new Object();
    public final CountDownLatch d = new CountDownLatch(1);
    public final ArrayList e = new ArrayList();
    public final AtomicReference g = new AtomicReference();
    public boolean m = false;

    public BasePendingResult(com.google.android.gms.common.api.m mVar) {
        this.b = new f(mVar != null ? mVar.a() : Looper.getMainLooper(), 2);
        this.c = new WeakReference(mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void m(com.google.android.gms.common.api.r rVar) {
        if (rVar instanceof o6.a) {
            try {
                ((o6.a) rVar).f();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(rVar)), e10);
            }
        }
    }

    @Override // a8.k8
    public final void b(com.google.android.gms.common.api.o oVar) {
        synchronized (this.a) {
            try {
                if (g()) {
                    oVar.a(this.i);
                } else {
                    this.e.add(oVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        synchronized (this.a) {
            try {
                if (!this.k && !this.j) {
                    m(this.h);
                    this.k = true;
                    k(d(Status.r));
                }
            } finally {
            }
        }
    }

    public abstract com.google.android.gms.common.api.r d(Status status);

    public final void e(Status status) {
        synchronized (this.a) {
            try {
                if (!g()) {
                    a(d(status));
                    this.l = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean f() {
        boolean z10;
        synchronized (this.a) {
            z10 = this.k;
        }
        return z10;
    }

    public final boolean g() {
        return this.d.getCount() == 0;
    }

    @Override // com.google.android.gms.common.api.internal.e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void a(com.google.android.gms.common.api.r rVar) {
        synchronized (this.a) {
            try {
                if (this.l || this.k) {
                    m(rVar);
                    return;
                }
                g();
                q6.m.i("Results have already been set", !g());
                q6.m.i("Result has already been consumed", !this.j);
                k(rVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(h6.q qVar) {
        synchronized (this.a) {
            try {
                q6.m.i("Result has already been consumed.", !this.j);
                if (f()) {
                    return;
                }
                if (g()) {
                    f fVar = this.b;
                    com.google.android.gms.common.api.r j3 = j();
                    fVar.getClass();
                    fVar.sendMessage(fVar.obtainMessage(1, new Pair(qVar, j3)));
                } else {
                    this.f = qVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final com.google.android.gms.common.api.r j() {
        com.google.android.gms.common.api.r rVar;
        synchronized (this.a) {
            q6.m.i("Result has already been consumed.", !this.j);
            q6.m.i("Result is not ready.", g());
            rVar = this.h;
            this.h = null;
            this.f = null;
            this.j = true;
        }
        z0 z0Var = (z0) this.g.getAndSet(null);
        if (z0Var != null) {
            ((Set) z0Var.a.a).remove(this);
        }
        q6.m.g(rVar);
        return rVar;
    }

    public final void k(com.google.android.gms.common.api.r rVar) {
        this.h = rVar;
        this.i = rVar.a();
        this.d.countDown();
        if (this.k) {
            this.f = null;
        } else {
            h6.q qVar = this.f;
            if (qVar != null) {
                f fVar = this.b;
                fVar.removeMessages(2);
                fVar.sendMessage(fVar.obtainMessage(1, new Pair(qVar, j())));
            }
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((com.google.android.gms.common.api.o) arrayList.get(i7)).a(this.i);
        }
        arrayList.clear();
    }

    public final void l() {
        boolean z10 = true;
        if (!this.m && !((Boolean) n.get()).booleanValue()) {
            z10 = false;
        }
        this.m = z10;
    }
}
