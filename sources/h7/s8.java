package h7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class s8 {
    public static boolean a(j7.d0 d0Var, Collection collection) {
        collection.getClass();
        if (collection instanceof j7.v) {
            collection = ((j7.v) collection).zza();
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
