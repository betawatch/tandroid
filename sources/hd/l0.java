package hd;

import g7.g7;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l0 extends md.s {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(l0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // md.s, hd.v1
    public final void f(Object obj) {
        g(obj);
    }

    @Override // md.s, hd.v1
    public final void g(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = e;
            int i9 = atomicIntegerFieldUpdater.get(this);
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                md.a.g(f0.r(obj), g7.b(this.d));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
