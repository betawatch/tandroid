// default package

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class g1f {
    public static boolean a(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = cld.b;
            }
        } else {
            if (!(collection instanceof vjd)) {
                return false;
            }
            obj = ((vjd) collection).s;
        }
        return comparator.equals(obj);
    }
}
