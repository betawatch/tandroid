package ke;

import be.f0;
import be.m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w7.n;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class d extends h implements a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public d(boolean z10) {
        super(z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : e.a;
    }

    public final boolean c() {
        return Math.max(h.f.get(this), 0) == 0;
    }

    public final Object d(md.c cVar) {
        int i10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 > 1) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1));
            } else {
                id.i iVar = id.i.a;
                if (i11 <= 0) {
                    m l4 = f0.l(n.b(cVar));
                    try {
                        a(new c(this, l4));
                        Object r10 = l4.r();
                        ld.a aVar = ld.a.a;
                        if (r10 != aVar) {
                            r10 = iVar;
                        }
                        return r10 == aVar ? r10 : iVar;
                    } catch (Throwable th2) {
                        l4.A();
                        throw th2;
                    }
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    g.set(this, null);
                    return iVar;
                }
            }
        }
    }

    public final void e(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            a6.i iVar = e.a;
            if (obj2 != iVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, iVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + f0.k(this) + "[isLocked=" + c() + ",owner=" + g.get(this) + ']';
    }
}
