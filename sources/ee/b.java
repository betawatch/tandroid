package ee;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class b {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public b(r rVar) {
        this._prev$volatile = rVar;
    }

    public final void b() {
        b.set(this, null);
    }

    public final b c() {
        Object obj = a.get(this);
        if (obj == a.a) {
            return null;
        }
        return (b) obj;
    }

    public abstract boolean d();

    public final void e() {
        b c10;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            b bVar = (b) atomicReferenceFieldUpdater.get(this);
            while (bVar != null && bVar.d()) {
                bVar = (b) atomicReferenceFieldUpdater.get(bVar);
            }
            b c11 = c();
            kotlin.jvm.internal.j.b(c11);
            while (c11.d() && (c10 = c11.c()) != null) {
                c11 = c10;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c11);
                b bVar2 = ((b) obj) == null ? null : bVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(c11, obj, bVar2)) {
                    if (atomicReferenceFieldUpdater.get(c11) != obj) {
                        break;
                    }
                }
            }
            if (bVar != null) {
                a.set(bVar, c11);
            }
            if (!c11.d() || c11.c() == null) {
                if (bVar == null || !bVar.d()) {
                    return;
                }
            }
        }
    }
}
