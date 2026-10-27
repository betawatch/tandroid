package com.google.android.gms.internal.play_billing;

import a8.fb;
import a8.xa;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class s3 extends xa {
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

    @Override // a8.xa
    public final void a(f4 f4Var, f4 f4Var2) {
        this.b.lazySet(f4Var, f4Var2);
    }

    @Override // a8.xa
    public final void b(f4 f4Var, Thread thread) {
        this.a.lazySet(f4Var, thread);
    }

    @Override // a8.xa
    public final boolean c(g4 g4Var, v2 v2Var, v2 v2Var2) {
        return fb.a(this.d, g4Var, v2Var, v2Var2);
    }

    @Override // a8.xa
    public final boolean d(g4 g4Var, Object obj, Object obj2) {
        return fb.a(this.e, g4Var, obj, obj2);
    }

    @Override // a8.xa
    public final boolean e(g4 g4Var, f4 f4Var, f4 f4Var2) {
        return fb.a(this.c, g4Var, f4Var, f4Var2);
    }
}
