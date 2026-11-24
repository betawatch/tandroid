// default package

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class i3f {
    public static boolean a(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = end.b;
            }
        } else {
            if (!(collection instanceof xld)) {
                return false;
            }
            obj = ((xld) collection).s;
        }
        return comparator.equals(obj);
    }
}
