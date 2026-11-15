package com.google.android.gms.internal.vision;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class e extends e1 {
    public final q4.q b = new q4.q(15);

    @Override // com.google.android.gms.internal.vision.e1
    public final void q(Exception exc) {
        exc.printStackTrace();
        q4.q qVar = this.b;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) qVar.b;
        ReferenceQueue referenceQueue = (ReferenceQueue) qVar.c;
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
