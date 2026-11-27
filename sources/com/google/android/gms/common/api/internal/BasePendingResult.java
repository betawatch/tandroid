package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import ie9;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends ie9> {
    public static final v84 n = new v84((byte) 3);
    public final sg0 b;
    public final WeakReference c;
    public baf f;
    public ie9 h;
    public Status i;
    public volatile boolean j;
    public boolean k;
    public boolean l;
    public final Object a = new Object();
    public final CountDownLatch d = new CountDownLatch(1);
    public final ArrayList e = new ArrayList();
    public final AtomicReference g = new AtomicReference();
    public boolean m = false;

    public BasePendingResult(o6d o6dVar) {
        this.b = new sg0(o6dVar != null ? o6dVar.b.g : Looper.getMainLooper(), (byte) 1);
        this.c = new WeakReference(o6dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void m(ie9 ie9Var) {
        if (ie9Var instanceof e2) {
            try {
                ((e2) ie9Var).h();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(ie9Var)), e);
            }
        }
    }

    public final void b(r68 r68Var) {
        synchronized (this.a) {
            if (g()) {
                r68Var.a(this.i);
            } else {
                this.e.add(r68Var);
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

    @Override // kg0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void a(ie9 ie9Var) {
        synchronized (this.a) {
            if (this.l || this.k) {
                m(ie9Var);
                return;
            }
            g();
            xve.j("Results have already been set", !g());
            xve.j("Result has already been consumed", !this.j);
            k(ie9Var);
        }
    }

    public final void i(baf bafVar) {
        synchronized (this.a) {
            xve.j("Result has already been consumed.", !this.j);
            if (f()) {
                return;
            }
            if (g()) {
                sg0 sg0Var = this.b;
                sg0Var.sendMessage(sg0Var.obtainMessage(1, new Pair(bafVar, j())));
            } else {
                this.f = bafVar;
            }
        }
    }

    public final ie9 j() {
        ie9 ie9Var;
        synchronized (this.a) {
            xve.j("Result has already been consumed.", !this.j);
            xve.j("Result is not ready.", g());
            ie9Var = this.h;
            this.h = null;
            this.f = null;
            this.j = true;
        }
        b7d b7dVar = (b7d) this.g.getAndSet(null);
        if (b7dVar != null) {
            ((Set) b7dVar.a.b).remove(this);
        }
        xve.h(ie9Var);
        return ie9Var;
    }

    public final void k(ie9 ie9Var) {
        this.h = ie9Var;
        this.i = ie9Var.a();
        this.d.countDown();
        if (this.k) {
            this.f = null;
        } else {
            baf bafVar = this.f;
            if (bafVar != null) {
                sg0 sg0Var = this.b;
                sg0Var.removeMessages(2);
                sg0Var.sendMessage(sg0Var.obtainMessage(1, new Pair(bafVar, j())));
            }
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((r68) arrayList.get(i)).a(this.i);
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

    public /* synthetic */ ie9 d(Status status) {
        return status;
    }
}
