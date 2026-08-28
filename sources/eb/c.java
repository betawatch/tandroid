package eb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c {
    public final HashMap a = new HashMap();

    public c(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.a.containsKey(gb.b.class)) {
                Integer num = (Integer) hashMap.get(gb.b.class);
                l.h(num);
                if (num.intValue() <= 0) {
                }
            }
            this.a.put(gb.b.class, bVar.a);
            hashMap.put(gb.b.class, 0);
        }
    }
}
