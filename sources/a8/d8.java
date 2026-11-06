package a8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
