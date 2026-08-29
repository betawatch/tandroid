package com.google.android.gms.internal.play_billing;

import h7.o6;
import h7.t6;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class r3 extends o6 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public r3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // h7.o6
    public final void a(e4 e4Var, e4 e4Var2) {
        this.b.lazySet(e4Var, e4Var2);
    }

    @Override // h7.o6
    public final void b(e4 e4Var, Thread thread) {
        this.a.lazySet(e4Var, thread);
    }

    @Override // h7.o6
    public final boolean c(f4 f4Var, u2 u2Var, u2 u2Var2) {
        return t6.a(this.d, f4Var, u2Var, u2Var2);
    }

    @Override // h7.o6
    public final boolean d(f4 f4Var, Object obj, Object obj2) {
        return t6.a(this.e, f4Var, obj, obj2);
    }

    @Override // h7.o6
    public final boolean e(f4 f4Var, e4 e4Var, e4 e4Var2) {
        return t6.a(this.c, f4Var, e4Var, e4Var2);
    }
}
