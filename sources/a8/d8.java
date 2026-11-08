package a8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class d8 {
    public static boolean a(h0 h0Var, Collection collection) {
        collection.getClass();
        if (collection instanceof c8.l) {
            collection = ((c8.l) collection).zza();
        }
        boolean z9 = false;
        if (!(collection instanceof Set) || collection.size() <= h0Var.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z9 |= h0Var.remove(it.next());
            }
            return z9;
        }
        Iterator<E> it2 = h0Var.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z9 = true;
            }
        }
        return z9;
    }
}
