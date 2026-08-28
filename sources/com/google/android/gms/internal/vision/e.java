package com.google.android.gms.internal.vision;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends e1 {
    public final we.b b = new we.b(17, (byte) 0);

    @Override // com.google.android.gms.internal.vision.e1
    public final void q(Exception exc) {
        exc.printStackTrace();
        we.b bVar = this.b;
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
                for (Throwable th : list) {
                    System.err.print("Suppressed: ");
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
