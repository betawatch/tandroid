package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.data.DataHolder;
import h7.n5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.q> extends n5 {
    public static final cd.b n = new cd.b(1);
    public final g b;
    public final WeakReference c;
    public q5.p f;
    public com.google.android.gms.common.api.q h;
    public Status i;
    public volatile boolean j;
    public boolean k;
    public boolean l;
    private n1 resultGuardian;
    public final Object a = new Object();
    public final CountDownLatch d = new CountDownLatch(1);
    public final ArrayList e = new ArrayList();
    public final AtomicReference g = new AtomicReference();
    public boolean m = false;

    public BasePendingResult(com.google.android.gms.common.api.m mVar) {
        this.b = new g(mVar != null ? mVar.d() : Looper.getMainLooper(), 4);
        this.c = new WeakReference(mVar);
    }

    public static void m(com.google.android.gms.common.api.q qVar) {
        if (qVar instanceof j8.e) {
            try {
                DataHolder dataHolder = ((j8.e) qVar).a;
                if (dataHolder != null) {
                    dataHolder.close();
                }
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(qVar)), e10);
            }
        }
    }

    @Override // h7.n5
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
                z5.l.j("Results have already been set", !g());
                z5.l.j("Result has already been consumed", !this.j);
                k(qVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(q5.p pVar) {
        synchronized (this.a) {
            try {
                z5.l.j("Result has already been consumed.", !this.j);
                if (f()) {
                    return;
                }
                if (g()) {
                    g gVar = this.b;
                    com.google.android.gms.common.api.q j10 = j();
                    gVar.getClass();
                    gVar.sendMessage(gVar.obtainMessage(1, new Pair(pVar, j10)));
                } else {
                    this.f = pVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final com.google.android.gms.common.api.q j() {
        com.google.android.gms.common.api.q qVar;
        synchronized (this.a) {
            z5.l.j("Result has already been consumed.", !this.j);
            z5.l.j("Result is not ready.", g());
            qVar = this.h;
            this.h = null;
            this.f = null;
            this.j = true;
        }
        f1 f1Var = (f1) this.g.getAndSet(null);
        if (f1Var != null) {
            ((Set) f1Var.a.a).remove(this);
        }
        z5.l.h(qVar);
        return qVar;
    }

    public final void k(com.google.android.gms.common.api.q qVar) {
        this.h = qVar;
        this.i = qVar.i();
        this.d.countDown();
        if (this.k) {
            this.f = null;
        } else {
            q5.p pVar = this.f;
            if (pVar != null) {
                g gVar = this.b;
                gVar.removeMessages(2);
                gVar.sendMessage(gVar.obtainMessage(1, new Pair(pVar, j())));
            } else if (this.h instanceof j8.e) {
                this.resultGuardian = new n1(this);
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
