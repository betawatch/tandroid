// default package

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ig7 {
    public final HashMap a = new HashMap();

    public ig7(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hg7 hg7Var = (hg7) it.next();
            hg7Var.getClass();
            if (this.a.containsKey(ik5.class)) {
                Integer num = (Integer) hashMap.get(ik5.class);
                fre.h(num);
                if (num.intValue() <= 0) {
                }
            }
            this.a.put(ik5.class, hg7Var.a);
            hashMap.put(ik5.class, 0);
        }
    }
}
