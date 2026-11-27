// default package

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class fba extends AbstractSet {
    public final /* synthetic */ byte a;

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                byte b = 1;
                if (collection instanceof zo5) {
                    p99 p99Var = (p99) ((zo5) collection);
                    yo5 yo5Var = p99Var.h;
                    if (yo5Var == null) {
                        yo5Var = new yo5(p99Var, b);
                        p99Var.h = yo5Var;
                    }
                    collection = yo5Var;
                }
                boolean z = false;
                if (!(collection instanceof Set) || collection.size() <= size()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        z |= remove(it.next());
                    }
                } else {
                    Iterator<E> it2 = iterator();
                    while (it2.hasNext()) {
                        if (collection.contains(it2.next())) {
                            it2.remove();
                            z = true;
                        }
                    }
                }
                return z;
            case 1:
                return g5f.a(this, collection);
            default:
                return l5f.a(this, collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                break;
            case 1:
                collection.getClass();
                break;
            default:
                collection.getClass();
                break;
        }
        return super.retainAll(collection);
    }
}
