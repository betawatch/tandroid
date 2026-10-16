package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v7.c6;
import v7.m6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class t3 extends c6 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public t3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // v7.c6
    public final void a(g4 g4Var, g4 g4Var2) {
        this.b.lazySet(g4Var, g4Var2);
    }

    @Override // v7.c6
    public final void b(g4 g4Var, Thread thread) {
        this.a.lazySet(g4Var, thread);
    }

    @Override // v7.c6
    public final boolean c(h4 h4Var, v2 v2Var, v2 v2Var2) {
        return m6.a(this.d, h4Var, v2Var, v2Var2);
    }

    @Override // v7.c6
    public final boolean d(h4 h4Var, Object obj, Object obj2) {
        return m6.a(this.e, h4Var, obj, obj2);
    }

    @Override // v7.c6
    public final boolean e(h4 h4Var, g4 g4Var, g4 g4Var2) {
        return m6.a(this.c, h4Var, g4Var, g4Var2);
    }
}
