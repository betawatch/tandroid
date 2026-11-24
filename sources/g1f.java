// default package

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
