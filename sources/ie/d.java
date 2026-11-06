package ie;

import c8.u0;
import gd.k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.b0;
import zd.m;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class d extends h implements a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = e.a;

    public final boolean c() {
        return Math.max(h.f.get(this), 0) == 0;
    }

    public final Object d(kd.c cVar) {
        boolean e10 = e();
        k kVar = k.a;
        if (!e10) {
            m l10 = b0.l(u0.b(cVar));
            try {
                a(new c(this, l10));
                Object r10 = l10.r();
                jd.a aVar = jd.a.a;
                if (r10 != aVar) {
                    r10 = kVar;
                }
                if (r10 == aVar) {
                    return r10;
                }
            } catch (Throwable th2) {
                l10.A();
                throw th2;
            }
        }
        return kVar;
    }

    public final boolean e() {
        int i7;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 > 1) {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 1));
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    g.set(this, null);
                    return true;
                }
            }
        }
    }

    public final void f(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            com.google.android.gms.internal.clearcut.e eVar = e.a;
            if (obj2 != eVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, eVar)) {
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
        return "Mutex@" + b0.j(this) + "[isLocked=" + c() + ",owner=" + g.get(this) + ']';
    }
}
