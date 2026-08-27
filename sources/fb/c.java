package fb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import y5.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c {
    public final HashMap a = new HashMap();

    public c(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.a.containsKey(hb.b.class)) {
                Integer num = (Integer) hashMap.get(hb.b.class);
                l.h(num);
                if (num.intValue() <= 0) {
                }
            }
            this.a.put(hb.b.class, bVar.a);
            hashMap.put(hb.b.class, 0);
        }
    }
}
