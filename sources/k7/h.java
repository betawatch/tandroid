package k7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class h {
    public static boolean a(l7.d0 d0Var, Collection collection) {
        collection.getClass();
        if (collection instanceof l7.v) {
            collection = ((l7.v) collection).zza();
        }
        boolean z4 = false;
        if (!(collection instanceof Set) || collection.size() <= d0Var.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z4 |= d0Var.remove(it.next());
            }
            return z4;
        }
        Iterator<E> it2 = d0Var.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z4 = true;
            }
        }
        return z4;
    }
}
