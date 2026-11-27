// default package

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
