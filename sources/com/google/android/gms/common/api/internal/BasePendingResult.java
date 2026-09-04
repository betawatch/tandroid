package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.data.DataHolder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import v7.e5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.q> extends e5 {
    public static final n1 n = new n1(0);
    public final g b;
    public final WeakReference c;
    public e6.r f;
    public com.google.android.gms.common.api.q h;
    public Status i;
    public volatile boolean j;
    public boolean k;
    public boolean l;
    private o1 resultGuardian;
    public final Object a = new Object();
    public final CountDownLatch d = new CountDownLatch(1);
    public final ArrayList e = new ArrayList();
    public final AtomicReference g = new AtomicReference();
    public boolean m = false;

    public BasePendingResult(com.google.android.gms.common.api.m mVar) {
        this.b = new g(mVar != null ? mVar.c() : Looper.getMainLooper(), 2);
        this.c = new WeakReference(mVar);
    }

    public static void m(com.google.android.gms.common.api.q qVar) {
        if (qVar instanceof x8.e) {
            try {
                DataHolder dataHolder = ((x8.e) qVar).a;
                if (dataHolder != null) {
                    dataHolder.close();
                }
            } catch (RuntimeException e7) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(qVar)), e7);
            }
        }
    }

    @Override // v7.e5
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

    public abstract com.google.android.gms.common.api.q d(Status status);

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

    @Override // com.google.android.gms.common.api.internal.f
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void a(com.google.android.gms.common.api.q qVar) {
        synchronized (this.a) {
            try {
                if (this.l || this.k) {
                    m(qVar);
                    return;
                }
                g();
                n6.l.j("Results have already been set", !g());
                n6.l.j("Result has already been consumed", !this.j);
                k(qVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(e6.r rVar) {
        synchronized (this.a) {
            try {
                n6.l.j("Result has already been consumed.", !this.j);
                if (f()) {
                    return;
                }
                if (g()) {
                    g gVar = this.b;
                    com.google.android.gms.common.api.q j3 = j();
                    gVar.getClass();
                    gVar.sendMessage(gVar.obtainMessage(1, new Pair(rVar, j3)));
                } else {
                    this.f = rVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final com.google.android.gms.common.api.q j() {
        com.google.android.gms.common.api.q qVar;
        synchronized (this.a) {
            n6.l.j("Result has already been consumed.", !this.j);
            n6.l.j("Result is not ready.", g());
            qVar = this.h;
            this.h = null;
            this.f = null;
            this.j = true;
        }
        f1 f1Var = (f1) this.g.getAndSet(null);
        if (f1Var != null) {
            ((Set) f1Var.a.a).remove(this);
        }
        n6.l.h(qVar);
        return qVar;
    }

    public final void k(com.google.android.gms.common.api.q qVar) {
        this.h = qVar;
        this.i = qVar.i();
        this.d.countDown();
        if (this.k) {
            this.f = null;
        } else {
            e6.r rVar = this.f;
            if (rVar != null) {
                g gVar = this.b;
                gVar.removeMessages(2);
                gVar.sendMessage(gVar.obtainMessage(1, new Pair(rVar, j())));
            } else if (this.h instanceof x8.e) {
                this.resultGuardian = new o1(this);
            }
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.google.android.gms.common.api.o) arrayList.get(i10)).a(this.i);
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
