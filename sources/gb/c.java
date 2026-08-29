package gb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c {
    public final HashMap a = new HashMap();

    public c(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.a.containsKey(ib.b.class)) {
                Integer num = (Integer) hashMap.get(ib.b.class);
                l.h(num);
                if (num.intValue() <= 0) {
                }
            }
            this.a.put(ib.b.class, bVar.a);
            hashMap.put(ib.b.class, 0);
        }
    }
}
