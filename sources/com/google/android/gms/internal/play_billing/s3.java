package com.google.android.gms.internal.play_billing;

import a8.fb;
import a8.xa;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
