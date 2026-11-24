// default package

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class o9a extends n9a implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.a.iterator();
        it.getClass();
        di8 di8Var = this.b;
        di8Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (di8Var.apply(next)) {
                return next;
            }
        }
        u36.g();
        return null;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new o9a(((SortedSet) this.a).headSet(obj), this.b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.a;
        while (true) {
            Object last = sortedSet.last();
            if (this.b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new o9a(((SortedSet) this.a).subSet(obj, obj2), this.b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new o9a(((SortedSet) this.a).tailSet(obj), this.b);
    }
}
