// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
