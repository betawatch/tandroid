package com.google.android.gms.common.api.internal;

import a8.z9;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.q> extends z9 {
    public static final m1 n = new m1(0);
    public final g b;
    public final WeakReference c;
    public f6.q f;
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
        this.b = new g(mVar != null ? mVar.c() : Looper.getMainLooper(), 2);
        this.c = new WeakReference(mVar);
    }

    public static void m(com.google.android.gms.common.api.q qVar) {
        if (qVar instanceof y8.e) {
            try {
                DataHolder dataHolder = ((y8.e) qVar).a;
                if (dataHolder != null) {
                    dataHolder.close();
                }
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(qVar)), e);
            }
        }
    }

    @Override // a8.z9
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
                o6.l.j("Results have already been set", !g());
                o6.l.j("Result has already been consumed", !this.j);
                k(qVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(f6.q qVar) {
        synchronized (this.a) {
            try {
                o6.l.j("Result has already been consumed.", !this.j);
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
            o6.l.j("Result has already been consumed.", !this.j);
            o6.l.j("Result is not ready.", g());
            qVar = this.h;
            this.h = null;
            this.f = null;
            this.j = true;
        }
        e1 e1Var = (e1) this.g.getAndSet(null);
        if (e1Var != null) {
            ((Set) e1Var.a.a).remove(this);
        }
        o6.l.h(qVar);
        return qVar;
    }

    public final void k(com.google.android.gms.common.api.q qVar) {
        this.h = qVar;
        this.i = qVar.h();
        this.d.countDown();
        if (this.k) {
            this.f = null;
        } else {
            f6.q qVar2 = this.f;
            if (qVar2 != null) {
                g gVar = this.b;
                gVar.removeMessages(2);
                gVar.sendMessage(gVar.obtainMessage(1, new Pair(qVar2, j())));
            } else if (this.h instanceof y8.e) {
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
