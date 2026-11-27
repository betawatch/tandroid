// default package

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
