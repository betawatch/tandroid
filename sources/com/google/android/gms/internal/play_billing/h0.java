package com.google.android.gms.internal.play_billing;

import g7.y5;
import g7.z5;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h0 extends y5 {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(k0.class, Thread.class, "a");
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(k0.class, k0.class, "b");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(l0.class, k0.class, "c");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(l0.class, f0.class, "b");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(l0.class, Object.class, "a");

    @Override // g7.y5
    public final f0 a(w0 w0Var) {
        return (f0) d.getAndSet(w0Var, f0.d);
    }

    @Override // g7.y5
    public final k0 b(w0 w0Var) {
        return (k0) c.getAndSet(w0Var, k0.c);
    }

    @Override // g7.y5
    public final void c(k0 k0Var, k0 k0Var2) {
        b.lazySet(k0Var, k0Var2);
    }

    @Override // g7.y5
    public final void d(k0 k0Var, Thread thread) {
        a.lazySet(k0Var, thread);
    }

    @Override // g7.y5
    public final boolean e(w0 w0Var, f0 f0Var, f0 f0Var2) {
        return z5.a(d, w0Var, f0Var, f0Var2);
    }

    @Override // g7.y5
    public final boolean f(l0 l0Var, Object obj, Object obj2) {
        return z5.a(e, l0Var, obj, obj2);
    }

    @Override // g7.y5
    public final boolean g(l0 l0Var, k0 k0Var, k0 k0Var2) {
        return z5.a(c, l0Var, k0Var, k0Var2);
    }
}
