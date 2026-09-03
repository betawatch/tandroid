package com.google.android.gms.internal.play_billing;

import j7.q6;
import j7.v6;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class s3 extends q6 {
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

    @Override // j7.q6
    public final void a(f4 f4Var, f4 f4Var2) {
        this.b.lazySet(f4Var, f4Var2);
    }

    @Override // j7.q6
    public final void b(f4 f4Var, Thread thread) {
        this.a.lazySet(f4Var, thread);
    }

    @Override // j7.q6
    public final boolean c(g4 g4Var, v2 v2Var, v2 v2Var2) {
        return v6.a(this.d, g4Var, v2Var, v2Var2);
    }

    @Override // j7.q6
    public final boolean d(g4 g4Var, Object obj, Object obj2) {
        return v6.a(this.e, g4Var, obj, obj2);
    }

    @Override // j7.q6
    public final boolean e(g4 g4Var, f4 f4Var, f4 f4Var2) {
        return v6.a(this.c, g4Var, f4Var, f4Var2);
    }
}
