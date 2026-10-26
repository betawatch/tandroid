package com.google.android.gms.internal.cast;

import a8.ja;
import a8.ka;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class x3 extends ja {
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

    @Override // a8.ja
    public final w3 a(c4 c4Var) {
        return (w3) this.d.getAndSet(c4Var, w3.d);
    }

    @Override // a8.ja
    public final b4 b(c4 c4Var) {
        return (b4) this.c.getAndSet(c4Var, b4.c);
    }

    @Override // a8.ja
    public final void c(b4 b4Var, b4 b4Var2) {
        this.b.lazySet(b4Var, b4Var2);
    }

    @Override // a8.ja
    public final void d(b4 b4Var, Thread thread) {
        this.a.lazySet(b4Var, thread);
    }

    @Override // a8.ja
    public final boolean e(c4 c4Var, w3 w3Var, w3 w3Var2) {
        return ka.a(this.d, c4Var, w3Var, w3Var2);
    }

    @Override // a8.ja
    public final boolean f(c4 c4Var, Object obj, Object obj2) {
        return ka.a(this.e, c4Var, obj, obj2);
    }

    @Override // a8.ja
    public final boolean g(c4 c4Var, b4 b4Var, b4 b4Var2) {
        return ka.a(this.c, c4Var, b4Var, b4Var2);
    }
}
