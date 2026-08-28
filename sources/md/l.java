package md;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class l {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new n(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            int a2 = nVar.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                n c10 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c10) && atomicReferenceFieldUpdater.get(this) == nVar) {
                }
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar.b()) {
                return;
            }
            n c10 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c10) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }

    public final int c() {
        n nVar = (n) a.get(this);
        nVar.getClass();
        long j10 = n.f.get(nVar);
        return 1073741823 & (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j10)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            Object d = nVar.d();
            if (d != n.g) {
                return d;
            }
            n c10 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c10) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
