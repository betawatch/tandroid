// default package

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class i9f implements Iterator {
    public Map.Entry a;
    public final /* synthetic */ Iterator b;

    public i9f(z1f z1fVar, Iterator it) {
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.b.next();
        this.a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Map.Entry entry = this.a;
        if (!(entry != null)) {
            dq9.m("no calls to next() since the last call to remove()");
            return;
        }
        Collection collection = (Collection) entry.getValue();
        this.b.remove();
        collection.size();
        collection.clear();
        this.a = null;
    }
}
