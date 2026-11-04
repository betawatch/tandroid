package com.google.android.gms.internal.play_billing;

import b8.pa;
import b8.qa;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h0 extends pa {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(k0.class, Thread.class, "a");
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(k0.class, k0.class, "b");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(l0.class, k0.class, "c");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(l0.class, f0.class, "b");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(l0.class, Object.class, "a");

    @Override // b8.pa
    public final f0 a(w0 w0Var) {
        return (f0) d.getAndSet(w0Var, f0.d);
    }

    @Override // b8.pa
    public final k0 b(w0 w0Var) {
        return (k0) c.getAndSet(w0Var, k0.c);
    }

    @Override // b8.pa
    public final void c(k0 k0Var, k0 k0Var2) {
        b.lazySet(k0Var, k0Var2);
    }

    @Override // b8.pa
    public final void d(k0 k0Var, Thread thread) {
        a.lazySet(k0Var, thread);
    }

    @Override // b8.pa
    public final boolean e(w0 w0Var, f0 f0Var, f0 f0Var2) {
        return qa.a(d, w0Var, f0Var, f0Var2);
    }

    @Override // b8.pa
    public final boolean f(l0 l0Var, Object obj, Object obj2) {
        return qa.a(e, l0Var, obj, obj2);
    }

    @Override // b8.pa
    public final boolean g(l0 l0Var, k0 k0Var, k0 k0Var2) {
        return qa.a(c, l0Var, k0Var, k0Var2);
    }
}
