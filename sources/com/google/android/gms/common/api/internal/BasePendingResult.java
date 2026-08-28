package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.data.DataHolder;
import f7.g5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.q> extends g5 {
    public static final ad.b n = new ad.b(1);
    public final g b;
    public final WeakReference c;
    public o5.q f;
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
        this.b = new g(mVar != null ? mVar.c() : Looper.getMainLooper(), 4);
        this.c = new WeakReference(mVar);
    }

    public static void m(com.google.android.gms.common.api.q qVar) {
        if (qVar instanceof h8.e) {
            try {
                DataHolder dataHolder = ((h8.e) qVar).a;
                if (dataHolder != null) {
                    dataHolder.close();
                }
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(qVar)), e10);
            }
        }
    }

    @Override // f7.g5
    public final void b(com.google.android.gms.common.api.o oVar) {
        synchronized (this.a) {
            try {
                if (g()) {
                    oVar.a(this.i);
                } else {
                    this.e.add(oVar);
                }
            } catch (Throwable th) {
                throw th;
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
            } catch (Throwable th) {
                throw th;
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
                x5.l.j("Results have already been set", !g());
                x5.l.j("Result has already been consumed", !this.j);
                k(qVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(o5.q qVar) {
        synchronized (this.a) {
            try {
                x5.l.j("Result has already been consumed.", !this.j);
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final com.google.android.gms.common.api.q j() {
        com.google.android.gms.common.api.q qVar;
        synchronized (this.a) {
            x5.l.j("Result has already been consumed.", !this.j);
            x5.l.j("Result is not ready.", g());
            qVar = this.h;
            this.h = null;
            this.f = null;
            this.j = true;
        }
        f1 f1Var = (f1) this.g.getAndSet(null);
        if (f1Var != null) {
            ((Set) f1Var.a.a).remove(this);
        }
        x5.l.h(qVar);
        return qVar;
    }

    public final void k(com.google.android.gms.common.api.q qVar) {
        this.h = qVar;
        this.i = qVar.i();
        this.d.countDown();
        if (this.k) {
            this.f = null;
        } else {
            o5.q qVar2 = this.f;
            if (qVar2 != null) {
                g gVar = this.b;
                gVar.removeMessages(2);
                gVar.sendMessage(gVar.obtainMessage(1, new Pair(qVar2, j())));
            } else if (this.h instanceof h8.e) {
                this.resultGuardian = new n1(this);
            }
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((com.google.android.gms.common.api.o) arrayList.get(i9)).a(this.i);
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
