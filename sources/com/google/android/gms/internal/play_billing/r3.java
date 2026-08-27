package com.google.android.gms.internal.play_billing;

import g7.a6;
import g7.g6;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r3 extends a6 {
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

    @Override // g7.a6
    public final void a(e4 e4Var, e4 e4Var2) {
        this.b.lazySet(e4Var, e4Var2);
    }

    @Override // g7.a6
    public final void b(e4 e4Var, Thread thread) {
        this.a.lazySet(e4Var, thread);
    }

    @Override // g7.a6
    public final boolean c(f4 f4Var, u2 u2Var, u2 u2Var2) {
        return g6.a(this.d, f4Var, u2Var, u2Var2);
    }

    @Override // g7.a6
    public final boolean d(f4 f4Var, Object obj, Object obj2) {
        return g6.a(this.e, f4Var, obj, obj2);
    }

    @Override // g7.a6
    public final boolean e(f4 f4Var, e4 e4Var, e4 e4Var2) {
        return g6.a(this.c, f4Var, e4Var, e4Var2);
    }
}
