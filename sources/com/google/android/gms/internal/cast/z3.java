package com.google.android.gms.internal.cast;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class z3 extends g7.p5 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public z3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // g7.p5
    public final y3 a(e4 e4Var) {
        return (y3) this.d.getAndSet(e4Var, y3.d);
    }

    @Override // g7.p5
    public final d4 b(e4 e4Var) {
        return (d4) this.c.getAndSet(e4Var, d4.c);
    }

    @Override // g7.p5
    public final void c(d4 d4Var, d4 d4Var2) {
        this.b.lazySet(d4Var, d4Var2);
    }

    @Override // g7.p5
    public final void d(d4 d4Var, Thread thread) {
        this.a.lazySet(d4Var, thread);
    }

    @Override // g7.p5
    public final boolean e(e4 e4Var, Object obj, Object obj2) {
        return g7.q5.a(this.e, e4Var, obj, obj2);
    }

    @Override // g7.p5
    public final boolean f(e4 e4Var, d4 d4Var, d4 d4Var2) {
        return g7.q5.a(this.c, e4Var, d4Var, d4Var2);
    }
}
