package e9;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import w7.m8;
import w7.n9;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class l1 extends AbstractSet {
    public final /* synthetic */ int a;

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                if (collection instanceof w0) {
                    collection = ((w0) collection).b();
                }
                boolean z10 = false;
                if (!(collection instanceof Set) || collection.size() <= size()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        z10 |= remove(it.next());
                    }
                } else {
                    Iterator<E> it2 = iterator();
                    while (it2.hasNext()) {
                        if (collection.contains(it2.next())) {
                            it2.remove();
                            z10 = true;
                        }
                    }
                }
                return z10;
            case 1:
                return m8.a(this, collection);
            default:
                return n9.a(this, collection);
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
