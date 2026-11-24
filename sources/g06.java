// default package

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class g06 implements mt8 {
    public volatile Set a;
    public volatile Set b;

    public final synchronized void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.b.add(((mt8) it.next()).get());
        }
        this.a = null;
    }

    @Override // mt8
    public final Object get() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                    a();
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.b);
    }
}
