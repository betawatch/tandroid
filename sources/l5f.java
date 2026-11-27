// default package

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
