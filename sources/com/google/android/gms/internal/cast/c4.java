package com.google.android.gms.internal.cast;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class c4 extends v7.o5 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public c4(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // v7.o5
    public final b4 a(h4 h4Var) {
        return (b4) this.d.getAndSet(h4Var, b4.d);
    }

    @Override // v7.o5
    public final g4 b(h4 h4Var) {
        return (g4) this.c.getAndSet(h4Var, g4.c);
    }

    @Override // v7.o5
    public final void c(g4 g4Var, g4 g4Var2) {
        this.b.lazySet(g4Var, g4Var2);
    }

    @Override // v7.o5
    public final void d(g4 g4Var, Thread thread) {
        this.a.lazySet(g4Var, thread);
    }

    @Override // v7.o5
    public final boolean e(h4 h4Var, b4 b4Var, b4 b4Var2) {
        return v7.p5.a(this.d, h4Var, b4Var, b4Var2);
    }

    @Override // v7.o5
    public final boolean f(h4 h4Var, Object obj, Object obj2) {
        return v7.p5.a(this.e, h4Var, obj, obj2);
    }

    @Override // v7.o5
    public final boolean g(h4 h4Var, g4 g4Var, g4 g4Var2) {
        return v7.p5.a(this.c, h4Var, g4Var, g4Var2);
    }
}
