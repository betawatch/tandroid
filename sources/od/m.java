package od;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class m {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new o(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            int a2 = oVar.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                o c3 = oVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, c3) && atomicReferenceFieldUpdater.get(this) == oVar) {
                }
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            if (oVar.b()) {
                return;
            }
            o c3 = oVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, c3) && atomicReferenceFieldUpdater.get(this) == oVar) {
            }
        }
    }

    public final int c() {
        o oVar = (o) a.get(this);
        oVar.getClass();
        long j10 = o.f.get(oVar);
        return 1073741823 & (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j10)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            Object d = oVar.d();
            if (d != o.g) {
                return d;
            }
            o c3 = oVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, c3) && atomicReferenceFieldUpdater.get(this) == oVar) {
            }
        }
    }
}
