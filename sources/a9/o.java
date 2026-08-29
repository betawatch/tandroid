package a9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o implements w9.b, w9.a {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public o(Executor executor) {
        this.c = executor;
    }

    public final void a(f fVar) {
        Executor executor = this.c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.a.containsKey(u8.b.class)) {
                    this.a.put(u8.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(u8.b.class)).put(fVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
