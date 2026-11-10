package com.google.android.gms.internal.cast;

import a8.v8;
import a8.w8;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class x3 extends v8 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public x3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // a8.v8
    public final w3 a(c4 c4Var) {
        return (w3) this.d.getAndSet(c4Var, w3.d);
    }

    @Override // a8.v8
    public final b4 b(c4 c4Var) {
        return (b4) this.c.getAndSet(c4Var, b4.c);
    }

    @Override // a8.v8
    public final void c(b4 b4Var, b4 b4Var2) {
        this.b.lazySet(b4Var, b4Var2);
    }

    @Override // a8.v8
    public final void d(b4 b4Var, Thread thread) {
        this.a.lazySet(b4Var, thread);
    }

    @Override // a8.v8
    public final boolean e(c4 c4Var, w3 w3Var, w3 w3Var2) {
        return w8.a(this.d, c4Var, w3Var, w3Var2);
    }

    @Override // a8.v8
    public final boolean f(c4 c4Var, Object obj, Object obj2) {
        return w8.a(this.e, c4Var, obj, obj2);
    }

    @Override // a8.v8
    public final boolean g(c4 c4Var, b4 b4Var, b4 b4Var2) {
        return w8.a(this.c, c4Var, b4Var, b4Var2);
    }
}
