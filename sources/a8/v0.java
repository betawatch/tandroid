package a8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class v0 {
    public static boolean a(h0 h0Var, Collection collection) {
        collection.getClass();
        if (collection instanceof z) {
            collection = ((z) collection).zza();
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
