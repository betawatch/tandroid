package com.google.android.gms.internal.cast;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b4 extends h7.x5 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public b4(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // h7.x5
    public final a4 a(g4 g4Var) {
        return (a4) this.d.getAndSet(g4Var, a4.d);
    }

    @Override // h7.x5
    public final f4 b(g4 g4Var) {
        return (f4) this.c.getAndSet(g4Var, f4.c);
    }

    @Override // h7.x5
    public final void c(f4 f4Var, f4 f4Var2) {
        this.b.lazySet(f4Var, f4Var2);
    }

    @Override // h7.x5
    public final void d(f4 f4Var, Thread thread) {
        this.a.lazySet(f4Var, thread);
    }

    @Override // h7.x5
    public final boolean e(g4 g4Var, Object obj, Object obj2) {
        return h7.y5.a(this.e, g4Var, obj, obj2);
    }

    @Override // h7.x5
    public final boolean f(g4 g4Var, f4 f4Var, f4 f4Var2) {
        return h7.y5.a(this.c, g4Var, f4Var, f4Var2);
    }
}
