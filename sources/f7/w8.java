package f7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class w8 {
    public static boolean a(h7.d0 d0Var, Collection collection) {
        collection.getClass();
        if (collection instanceof j7.l) {
            collection = ((j7.l) collection).zza();
        }
        boolean z10 = false;
        if (!(collection instanceof Set) || collection.size() <= d0Var.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z10 |= d0Var.remove(it.next());
            }
            return z10;
        }
        Iterator<E> it2 = d0Var.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z10 = true;
            }
        }
        return z10;
    }
}
