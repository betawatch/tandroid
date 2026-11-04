package com.google.android.gms.internal.cast;

import b8.ga;
import b8.ha;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y3 extends ga {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public y3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // b8.ga
    public final x3 a(d4 d4Var) {
        return (x3) this.d.getAndSet(d4Var, x3.d);
    }

    @Override // b8.ga
    public final c4 b(d4 d4Var) {
        return (c4) this.c.getAndSet(d4Var, c4.c);
    }

    @Override // b8.ga
    public final void c(c4 c4Var, c4 c4Var2) {
        this.b.lazySet(c4Var, c4Var2);
    }

    @Override // b8.ga
    public final void d(c4 c4Var, Thread thread) {
        this.a.lazySet(c4Var, thread);
    }

    @Override // b8.ga
    public final boolean e(d4 d4Var, x3 x3Var, x3 x3Var2) {
        return ha.a(this.d, d4Var, x3Var, x3Var2);
    }

    @Override // b8.ga
    public final boolean f(d4 d4Var, Object obj, Object obj2) {
        return ha.a(this.e, d4Var, obj, obj2);
    }

    @Override // b8.ga
    public final boolean g(d4 d4Var, c4 c4Var, c4 c4Var2) {
        return ha.a(this.c, d4Var, c4Var, c4Var2);
    }
}
