package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import uc9;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends uc9> {
    public static final j94 n = new j94((byte) 3);
    public final sh0 b;
    public final WeakReference c;
    public m7f f;
    public uc9 h;
    public Status i;
    public volatile boolean j;
    public boolean k;
    public boolean l;
    public final Object a = new Object();
    public final CountDownLatch d = new CountDownLatch(1);
    public final ArrayList e = new ArrayList();
    public final AtomicReference g = new AtomicReference();
    public boolean m = false;

    public BasePendingResult(z3d z3dVar) {
        this.b = new sh0(z3dVar != null ? z3dVar.b.g : Looper.getMainLooper(), (byte) 1);
        this.c = new WeakReference(z3dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void m(uc9 uc9Var) {
        if (uc9Var instanceof d2) {
            try {
                ((d2) uc9Var).h();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(uc9Var)), e);
            }
        }
    }

    public final void b(d58 d58Var) {
        synchronized (this.a) {
            if (g()) {
                d58Var.a(this.i);
            } else {
                this.e.add(d58Var);
            }
        }
    }

    public final void c() {
        synchronized (this.a) {
            if (this.k || this.j) {
                return;
            }
            m(this.h);
            this.k = true;
            k(d(Status.r));
        }
    }

    public final void e(Status status) {
        synchronized (this.a) {
            if (!g()) {
                a(d(status));
                this.l = true;
            }
        }
    }

    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            z = this.k;
        }
        return z;
    }

    public final boolean g() {
        return this.d.getCount() == 0;
    }

    @Override // kh0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void a(uc9 uc9Var) {
        synchronized (this.a) {
            if (this.l || this.k) {
                m(uc9Var);
                return;
            }
            g();
            ite.j("Results have already been set", !g());
            ite.j("Result has already been consumed", !this.j);
            k(uc9Var);
        }
    }

    public final void i(m7f m7fVar) {
        synchronized (this.a) {
            ite.j("Result has already been consumed.", !this.j);
            if (f()) {
                return;
            }
            if (g()) {
                sh0 sh0Var = this.b;
                sh0Var.sendMessage(sh0Var.obtainMessage(1, new Pair(m7fVar, j())));
            } else {
                this.f = m7fVar;
            }
        }
    }

    public final uc9 j() {
        uc9 uc9Var;
        synchronized (this.a) {
            ite.j("Result has already been consumed.", !this.j);
            ite.j("Result is not ready.", g());
            uc9Var = this.h;
            this.h = null;
            this.f = null;
            this.j = true;
        }
        m4d m4dVar = (m4d) this.g.getAndSet(null);
        if (m4dVar != null) {
            ((Set) m4dVar.a.b).remove(this);
        }
        ite.h(uc9Var);
        return uc9Var;
    }

    public final void k(uc9 uc9Var) {
        this.h = uc9Var;
        this.i = uc9Var.a();
        this.d.countDown();
        if (this.k) {
            this.f = null;
        } else {
            m7f m7fVar = this.f;
            if (m7fVar != null) {
                sh0 sh0Var = this.b;
                sh0Var.removeMessages(2);
                sh0Var.sendMessage(sh0Var.obtainMessage(1, new Pair(m7fVar, j())));
            }
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((d58) arrayList.get(i)).a(this.i);
        }
        arrayList.clear();
    }

    public final void l() {
        boolean z = true;
        if (!this.m && !((Boolean) n.get()).booleanValue()) {
            z = false;
        }
        this.m = z;
    }

    public /* synthetic */ uc9 d(Status status) {
        return status;
    }
}
