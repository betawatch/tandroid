package c9;

import androidx.emoji2.text.w;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class n implements y9.b, y9.a {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public n(Executor executor) {
        this.c = executor;
    }

    public final void a(w wVar) {
        Executor executor = this.c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.a.containsKey(w8.b.class)) {
                    this.a.put(w8.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(w8.b.class)).put(wVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
