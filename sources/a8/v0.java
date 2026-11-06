package a8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class v0 {
    public static boolean a(h0 h0Var, Collection collection) {
        collection.getClass();
        if (collection instanceof z) {
            collection = ((z) collection).zza();
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
