// default package

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class a3 implements Iterator {
    public final Iterator a;
    public Object b = null;
    public Collection c = null;
    public Iterator d = lu5.a;
    public final /* synthetic */ zi7 e;
    public final /* synthetic */ byte f;

    public a3(zi7 zi7Var, byte b) {
        this.f = b;
        this.e = zi7Var;
        this.a = zi7Var.e.entrySet().iterator();
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
                return new ho5(obj, next);
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
        zi7 zi7Var = this.e;
        zi7Var.f--;
    }
}
