// default package

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cu2 implements p6a {
    public final AtomicReference a;

    public cu2(v6a v6aVar) {
        this.a = new AtomicReference(v6aVar);
    }

    @Override // p6a
    public final Iterator iterator() {
        p6a p6aVar = (p6a) this.a.getAndSet(null);
        if (p6aVar != null) {
            return p6aVar.iterator();
        }
        dq9.m("This sequence can be consumed only once.");
        return null;
    }
}
