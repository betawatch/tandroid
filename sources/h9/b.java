package h9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b implements Iterator {
    public final Iterator a;
    public Object b = null;
    public Collection c = null;
    public Iterator d = y0.a;
    public final /* synthetic */ l1 e;
    public final /* synthetic */ int f;

    public b(l1 l1Var, int i7) {
        this.f = i7;
        this.e = l1Var;
        this.a = l1Var.e.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.c = collection;
            this.d = collection.iterator();
        }
        Object obj = this.b;
        Object next = this.d.next();
        switch (this.f) {
            case 0:
                return next;
            default:
                return new e0(obj, next);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.d.remove();
        Collection collection = this.c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.a.remove();
        }
        l1 l1Var = this.e;
        l1Var.f--;
    }
}
