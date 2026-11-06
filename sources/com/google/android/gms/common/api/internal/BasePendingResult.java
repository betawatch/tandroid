package com.google.android.gms.common.api.internal;

import a8.j8;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.q> extends j8 {
    public static final b7.j n = new b7.j(1);
    public final f b;
    public final WeakReference c;
    public h6.q f;
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
        this.b = new f(mVar != null ? mVar.a() : Looper.getMainLooper(), 2);
        this.c = new WeakReference(mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void m(com.google.android.gms.common.api.q qVar) {
        if (qVar instanceof o6.a) {
            try {
                ((o6.a) qVar).f();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(qVar)), e10);
            }
        }
    }

    @Override // a8.j8
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
        boolean z9;
        synchronized (this.a) {
            z9 = this.k;
        }
        return z9;
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
                q6.m.i("Results have already been set", !g());
                q6.m.i("Result has already been consumed", !this.j);
                k(qVar);
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
                    com.google.android.gms.common.api.q j3 = j();
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

    public final com.google.android.gms.common.api.q j() {
        com.google.android.gms.common.api.q qVar;
        synchronized (this.a) {
            q6.m.i("Result has already been consumed.", !this.j);
            q6.m.i("Result is not ready.", g());
            qVar = this.h;
            this.h = null;
            this.f = null;
            this.j = true;
        }
        x0 x0Var = (x0) this.g.getAndSet(null);
        if (x0Var != null) {
            ((Set) x0Var.a.a).remove(this);
        }
        q6.m.g(qVar);
        return qVar;
    }

    public final void k(com.google.android.gms.common.api.q qVar) {
        this.h = qVar;
        this.i = qVar.a();
        this.d.countDown();
        if (this.k) {
            this.f = null;
        } else {
            h6.q qVar2 = this.f;
            if (qVar2 != null) {
                f fVar = this.b;
                fVar.removeMessages(2);
                fVar.sendMessage(fVar.obtainMessage(1, new Pair(qVar2, j())));
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
        boolean z9 = true;
        if (!this.m && !((Boolean) n.get()).booleanValue()) {
            z9 = false;
        }
        this.m = z9;
    }
}
