// default package

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class g6f {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, wdf wdfVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(wdfVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(wdfVar) != obj && atomicReferenceFieldUpdater.get(wdfVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
