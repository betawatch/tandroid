// default package

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class li7 {
    public final HashMap a = new HashMap();

    public li7(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ki7 ki7Var = (ki7) it.next();
            ki7Var.getClass();
            if (this.a.containsKey(im5.class)) {
                Integer num = (Integer) hashMap.get(im5.class);
                ite.h(num);
                if (num.intValue() <= 0) {
                }
            }
            this.a.put(im5.class, ki7Var.a);
            hashMap.put(im5.class, 0);
        }
    }
}
