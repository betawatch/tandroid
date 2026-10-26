package a8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class m0 {
    public static boolean a(x xVar, Collection collection) {
        collection.getClass();
        if (collection instanceof q) {
            collection = ((q) collection).zza();
        }
        boolean z10 = false;
        if (!(collection instanceof Set) || collection.size() <= xVar.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z10 |= xVar.remove(it.next());
            }
            return z10;
        }
        Iterator<E> it2 = xVar.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z10 = true;
            }
        }
        return z10;
    }
}
