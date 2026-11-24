// default package

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
