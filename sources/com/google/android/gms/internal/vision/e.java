package com.google.android.gms.internal.vision;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class e extends e1 {
    public final n4.y b = new n4.y(11);

    @Override // com.google.android.gms.internal.vision.e1
    public final void q(Exception exc) {
        exc.printStackTrace();
        n4.y yVar = this.b;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) yVar.b;
        ReferenceQueue referenceQueue = (ReferenceQueue) yVar.c;
        for (Reference poll = referenceQueue.poll(); poll != null; poll = referenceQueue.poll()) {
            concurrentHashMap.remove(poll);
        }
        List<Throwable> list = (List) concurrentHashMap.get(new d(exc));
        if (list == null) {
            return;
        }
        synchronized (list) {
            try {
                for (Throwable th2 : list) {
                    System.err.print("Suppressed: ");
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
