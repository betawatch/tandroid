package ld;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import k7.h8;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class k0 extends qd.s {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(k0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // qd.s, ld.u1
    public final void f(Object obj) {
        g(obj);
    }

    @Override // qd.s, ld.u1
    public final void g(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = e;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                qd.a.g(e0.r(obj), h8.b(this.d));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
