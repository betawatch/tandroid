package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.data.DataHolder;
import j7.q5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.q> extends q5 {
    public static final o1 n = new o1(0);
    public final g b;
    public final WeakReference c;
    public s5.q f;
    public com.google.android.gms.common.api.q h;
    public Status i;
    public volatile boolean j;
    public boolean k;
    public boolean l;
    private p1 resultGuardian;
    public final Object a = new Object();
    public final CountDownLatch d = new CountDownLatch(1);
    public final ArrayList e = new ArrayList();
    public final AtomicReference g = new AtomicReference();
    public boolean m = false;

    public BasePendingResult(com.google.android.gms.common.api.m mVar) {
        this.b = new g(mVar != null ? mVar.c() : Looper.getMainLooper(), 5);
        this.c = new WeakReference(mVar);
    }

    public static void m(com.google.android.gms.common.api.q qVar) {
        if (qVar instanceof l8.e) {
            try {
                DataHolder dataHolder = ((l8.e) qVar).a;
                if (dataHolder != null) {
                    dataHolder.close();
                }
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(qVar)), e);
            }
        }
    }

    @Override // j7.q5
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
        boolean z4;
        synchronized (this.a) {
            z4 = this.k;
        }
        return z4;
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
                b6.m.j("Results have already been set", !g());
                b6.m.j("Result has already been consumed", !this.j);
                k(qVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(s5.q qVar) {
        synchronized (this.a) {
            try {
                b6.m.j("Result has already been consumed.", !this.j);
                if (f()) {
                    return;
                }
                if (g()) {
                    g gVar = this.b;
                    com.google.android.gms.common.api.q j10 = j();
                    gVar.getClass();
                    gVar.sendMessage(gVar.obtainMessage(1, new Pair(qVar, j10)));
                } else {
                    this.f = qVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final com.google.android.gms.common.api.q j() {
        com.google.android.gms.common.api.q qVar;
        synchronized (this.a) {
            b6.m.j("Result has already been consumed.", !this.j);
            b6.m.j("Result is not ready.", g());
            qVar = this.h;
            this.h = null;
            this.f = null;
            this.j = true;
        }
        g1 g1Var = (g1) this.g.getAndSet(null);
        if (g1Var != null) {
            ((Set) g1Var.a.a).remove(this);
        }
        b6.m.h(qVar);
        return qVar;
    }

    public final void k(com.google.android.gms.common.api.q qVar) {
        this.h = qVar;
        this.i = qVar.i();
        this.d.countDown();
        if (this.k) {
            this.f = null;
        } else {
            s5.q qVar2 = this.f;
            if (qVar2 != null) {
                g gVar = this.b;
                gVar.removeMessages(2);
                gVar.sendMessage(gVar.obtainMessage(1, new Pair(qVar2, j())));
            } else if (this.h instanceof l8.e) {
                this.resultGuardian = new p1(this);
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
        boolean z4 = true;
        if (!this.m && !((Boolean) n.get()).booleanValue()) {
            z4 = false;
        }
        this.m = z4;
    }
}
