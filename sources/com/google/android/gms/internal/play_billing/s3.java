package com.google.android.gms.internal.play_billing;

import b8.bb;
import b8.ua;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s3 extends ua {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public s3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // b8.ua
    public final void a(f4 f4Var, f4 f4Var2) {
        this.b.lazySet(f4Var, f4Var2);
    }

    @Override // b8.ua
    public final void b(f4 f4Var, Thread thread) {
        this.a.lazySet(f4Var, thread);
    }

    @Override // b8.ua
    public final boolean c(g4 g4Var, v2 v2Var, v2 v2Var2) {
        return bb.a(this.d, g4Var, v2Var, v2Var2);
    }

    @Override // b8.ua
    public final boolean d(g4 g4Var, Object obj, Object obj2) {
        return bb.a(this.e, g4Var, obj, obj2);
    }

    @Override // b8.ua
    public final boolean e(g4 g4Var, f4 f4Var, f4 f4Var2) {
        return bb.a(this.c, g4Var, f4Var, f4Var2);
    }
}
