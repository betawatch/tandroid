// default package

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class e4f {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, vbf vbfVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(vbfVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(vbfVar) != obj && atomicReferenceFieldUpdater.get(vbfVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
