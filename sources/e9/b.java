package e9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b implements Iterator {
    public final Iterator a;
    public Object b = null;
    public Collection c = null;
    public Iterator d = d1.a;
    public final /* synthetic */ p1 e;
    public final /* synthetic */ int f;

    public b(p1 p1Var, int i10) {
        this.f = i10;
        this.e = p1Var;
        this.a = p1Var.e.entrySet().iterator();
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
                return new j0(obj, next);
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
        p1 p1Var = this.e;
        p1Var.f--;
    }
}
