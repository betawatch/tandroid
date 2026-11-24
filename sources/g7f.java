// default package

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class g7f implements Iterator {
    public Map.Entry a;
    public final /* synthetic */ Iterator b;

    public g7f(xze xzeVar, Iterator it) {
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
            sc8.j("no calls to next() since the last call to remove()");
            return;
        }
        Collection collection = (Collection) entry.getValue();
        this.b.remove();
        collection.size();
        collection.clear();
        this.a = null;
    }
}
