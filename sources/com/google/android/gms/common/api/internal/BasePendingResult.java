package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import b8.x9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.q> extends x9 {
    public static final a7.j n = new a7.j(1);
    public final f b;
    public final WeakReference c;
    public g6.p f;
    public com.google.android.gms.common.api.q h;
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
        this.b = new f(mVar != null ? mVar.b() : Looper.getMainLooper(), 2);
        this.c = new WeakReference(mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void m(com.google.android.gms.common.api.q qVar) {
        if (qVar instanceof n6.a) {
            try {
                ((n6.a) qVar).h();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(qVar)), e10);
            }
        }
    }

    @Override // b8.x9
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

    @Override // com.google.android.gms.common.api.internal.e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void a(com.google.android.gms.common.api.q qVar) {
        synchronized (this.a) {
            try {
                if (this.l || this.k) {
                    m(qVar);
                    return;
                }
                g();
                p6.m.i("Results have already been set", !g());
                p6.m.i("Result has already been consumed", !this.j);
                k(qVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(g6.p pVar) {
        synchronized (this.a) {
            try {
                p6.m.i("Result has already been consumed.", !this.j);
                if (f()) {
                    return;
                }
                if (g()) {
                    f fVar = this.b;
                    com.google.android.gms.common.api.q j10 = j();
                    fVar.getClass();
                    fVar.sendMessage(fVar.obtainMessage(1, new Pair(pVar, j10)));
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
            p6.m.i("Result has already been consumed.", !this.j);
            p6.m.i("Result is not ready.", g());
            qVar = this.h;
            this.h = null;
            this.f = null;
            this.j = true;
        }
        y0 y0Var = (y0) this.g.getAndSet(null);
        if (y0Var != null) {
            ((Set) y0Var.a.a).remove(this);
        }
        p6.m.g(qVar);
        return qVar;
    }

    public final void k(com.google.android.gms.common.api.q qVar) {
        this.h = qVar;
        this.i = qVar.a();
        this.d.countDown();
        if (this.k) {
            this.f = null;
        } else {
            g6.p pVar = this.f;
            if (pVar != null) {
                f fVar = this.b;
                fVar.removeMessages(2);
                fVar.sendMessage(fVar.obtainMessage(1, new Pair(pVar, j())));
            }
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((com.google.android.gms.common.api.o) arrayList.get(i3)).a(this.i);
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
