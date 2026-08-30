package com.google.android.gms.internal.cast;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a4 extends j7.a6 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public a4(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // j7.a6
    public final z3 a(f4 f4Var) {
        return (z3) this.d.getAndSet(f4Var, z3.d);
    }

    @Override // j7.a6
    public final e4 b(f4 f4Var) {
        return (e4) this.c.getAndSet(f4Var, e4.c);
    }

    @Override // j7.a6
    public final void c(e4 e4Var, e4 e4Var2) {
        this.b.lazySet(e4Var, e4Var2);
    }

    @Override // j7.a6
    public final void d(e4 e4Var, Thread thread) {
        this.a.lazySet(e4Var, thread);
    }

    @Override // j7.a6
    public final boolean e(f4 f4Var, Object obj, Object obj2) {
        return j7.b6.a(this.e, f4Var, obj, obj2);
    }

    @Override // j7.a6
    public final boolean f(f4 f4Var, e4 e4Var, e4 e4Var2) {
        return j7.b6.a(this.c, f4Var, e4Var, e4Var2);
    }
}
