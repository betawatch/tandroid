// default package

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class l5f {
    public static boolean a(fba fbaVar, Collection collection) {
        collection.getClass();
        if (collection instanceof pjd) {
            collection = ((pjd) collection).zza();
        }
        boolean z = false;
        if (!(collection instanceof Set) || collection.size() <= fbaVar.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z |= fbaVar.remove(it.next());
            }
            return z;
        }
        Iterator<E> it2 = fbaVar.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }
}
