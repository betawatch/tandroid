package jd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class m extends l {
    public static void e(ArrayList arrayList, Iterable elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        if (elements instanceof Collection) {
            arrayList.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
    }
}
