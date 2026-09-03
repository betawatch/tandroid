package c9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class o implements y9.b, y9.a {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public o(Executor executor) {
        this.c = executor;
    }

    public final void a(af.a aVar) {
        Executor executor = this.c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.a.containsKey(w8.b.class)) {
                    this.a.put(w8.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(w8.b.class)).put(aVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
