package k7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class d0 {
    public static boolean a(l7.d0 d0Var, Collection collection) {
        collection.getClass();
        if (collection instanceof n7.l) {
            collection = ((n7.l) collection).zza();
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
