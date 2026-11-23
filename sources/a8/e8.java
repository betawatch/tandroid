package a8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class e8 {
    public static boolean a(h0 h0Var, Collection collection) {
        collection.getClass();
        if (collection instanceof c8.l) {
            collection = ((c8.l) collection).zza();
        }
        boolean z10 = false;
        if (!(collection instanceof Set) || collection.size() <= h0Var.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z10 |= h0Var.remove(it.next());
            }
            return z10;
        }
        Iterator<E> it2 = h0Var.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z10 = true;
            }
        }
        return z10;
    }
}
