package com.google.android.gms.internal.vision;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e extends e1 {
    public final bf.b b = new bf.b(24, (byte) 0);

    @Override // com.google.android.gms.internal.vision.e1
    public final void q(Exception exc) {
        exc.printStackTrace();
        bf.b bVar = this.b;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) bVar.b;
        ReferenceQueue referenceQueue = (ReferenceQueue) bVar.c;
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
