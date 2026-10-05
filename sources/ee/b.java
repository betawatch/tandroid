package ee;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class b extends p {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = a.a;

    @Override // ee.p
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        com.google.android.gms.internal.clearcut.e eVar = a.a;
        if (obj2 == eVar) {
            com.google.android.gms.internal.clearcut.e c10 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == eVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, eVar, c10)) {
                        obj2 = c10;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != eVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract com.google.android.gms.internal.clearcut.e c(Object obj);
}
