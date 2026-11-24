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
import ua9;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends ua9> {
    public static final a84 n = new a84((byte) 3);
    public final rg0 b;
    public final WeakReference c;
    public k5f f;
    public ua9 h;
    public Status i;
    public volatile boolean j;
    public boolean k;
    public boolean l;
    public final Object a = new Object();
    public final CountDownLatch d = new CountDownLatch(1);
    public final ArrayList e = new ArrayList();
    public final AtomicReference g = new AtomicReference();
    public boolean m = false;

    public BasePendingResult(x1d x1dVar) {
        this.b = new rg0(x1dVar != null ? x1dVar.b.g : Looper.getMainLooper(), (byte) 1);
        this.c = new WeakReference(x1dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void m(ua9 ua9Var) {
        if (ua9Var instanceof d2) {
            try {
                ((d2) ua9Var).h();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(ua9Var)), e);
            }
        }
    }

    public final void b(b38 b38Var) {
        synchronized (this.a) {
            if (g()) {
                b38Var.a(this.i);
            } else {
                this.e.add(b38Var);
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

    @Override // jg0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void a(ua9 ua9Var) {
        synchronized (this.a) {
            if (this.l || this.k) {
                m(ua9Var);
                return;
            }
            g();
            fre.j("Results have already been set", !g());
            fre.j("Result has already been consumed", !this.j);
            k(ua9Var);
        }
    }

    public final void i(k5f k5fVar) {
        synchronized (this.a) {
            fre.j("Result has already been consumed.", !this.j);
            if (f()) {
                return;
            }
            if (g()) {
                rg0 rg0Var = this.b;
                rg0Var.sendMessage(rg0Var.obtainMessage(1, new Pair(k5fVar, j())));
            } else {
                this.f = k5fVar;
            }
        }
    }

    public final ua9 j() {
        ua9 ua9Var;
        synchronized (this.a) {
            fre.j("Result has already been consumed.", !this.j);
            fre.j("Result is not ready.", g());
            ua9Var = this.h;
            this.h = null;
            this.f = null;
            this.j = true;
        }
        k2d k2dVar = (k2d) this.g.getAndSet(null);
        if (k2dVar != null) {
            ((Set) k2dVar.a.b).remove(this);
        }
        fre.h(ua9Var);
        return ua9Var;
    }

    public final void k(ua9 ua9Var) {
        this.h = ua9Var;
        this.i = ua9Var.a();
        this.d.countDown();
        if (this.k) {
            this.f = null;
        } else {
            k5f k5fVar = this.f;
            if (k5fVar != null) {
                rg0 rg0Var = this.b;
                rg0Var.removeMessages(2);
                rg0Var.sendMessage(rg0Var.obtainMessage(1, new Pair(k5fVar, j())));
            }
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((b38) arrayList.get(i)).a(this.i);
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

    public /* synthetic */ ua9 d(Status status) {
        return status;
    }
}
