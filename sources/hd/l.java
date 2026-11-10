package hd;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class l extends k {
    public static void e(Iterable elements, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.j.e(elements, "elements");
        if (elements instanceof Collection) {
            abstractCollection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }
}
