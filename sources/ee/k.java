package ee;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class k {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new m(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            int a10 = mVar.a(runnable);
            if (a10 == 0) {
                return true;
            }
            if (a10 == 1) {
                m c10 = mVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c10) && atomicReferenceFieldUpdater.get(this) == mVar) {
                }
            } else if (a10 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar.b()) {
                return;
            }
            m c10 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c10) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }

    public final int c() {
        m mVar = (m) a.get(this);
        mVar.getClass();
        long j3 = m.f.get(mVar);
        return (((int) ((j3 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j3))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            Object d = mVar.d();
            if (d != m.g) {
                return d;
            }
            m c10 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c10) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }
}
