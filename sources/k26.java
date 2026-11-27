// default package

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class k26 implements vw8 {
    public volatile Set a;
    public volatile Set b;

    public final synchronized void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.b.add(((vw8) it.next()).get());
        }
        this.a = null;
    }

    @Override // vw8
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
