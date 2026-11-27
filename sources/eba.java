// default package

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class eba extends dba implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.a.iterator();
        it.getClass();
        pj8 pj8Var = this.b;
        pj8Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (pj8Var.apply(next)) {
                return next;
            }
        }
        lq5.n();
        return null;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new eba(((SortedSet) this.a).headSet(obj), this.b);
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
        return new eba(((SortedSet) this.a).subSet(obj, obj2), this.b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new eba(((SortedSet) this.a).tailSet(obj), this.b);
    }
}
