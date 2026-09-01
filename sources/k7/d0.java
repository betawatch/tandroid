package k7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
