// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class l5e extends m6f {
    public final k7b a = new k7b((byte) 17);

    @Override // m6f
    public final void a(Exception exc) {
        exc.printStackTrace();
        k7b k7bVar = this.a;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) k7bVar.b;
        ReferenceQueue referenceQueue = (ReferenceQueue) k7bVar.c;
        for (Reference poll = referenceQueue.poll(); poll != null; poll = referenceQueue.poll()) {
            concurrentHashMap.remove(poll);
        }
        List<Throwable> list = (List) concurrentHashMap.get(new a5e(exc));
        if (list == null) {
            return;
        }
        synchronized (list) {
            for (Throwable th : list) {
                System.err.print("Suppressed: ");
                th.printStackTrace();
            }
        }
    }
}
