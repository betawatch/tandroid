// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class b44 implements hab, tu8 {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public b44(Executor executor) {
        this.c = executor;
    }

    public final void a(w44 w44Var) {
        Executor executor = this.c;
        synchronized (this) {
            executor.getClass();
            if (!this.a.containsKey(y53.class)) {
                this.a.put(y53.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(y53.class)).put(w44Var, executor);
        }
    }
}
