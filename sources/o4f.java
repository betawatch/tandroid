// default package

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class o4f {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, a7f a7fVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(a7fVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(a7fVar) != obj && atomicReferenceFieldUpdater.get(a7fVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
