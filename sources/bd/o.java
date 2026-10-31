package bd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class o extends n {
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
