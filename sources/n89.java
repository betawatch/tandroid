// default package

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class n89 {
    public final HashMap a = new HashMap();

    public n89(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            m89 m89Var = (m89) it.next();
            HashMap hashMap = this.a;
            m89Var.getClass();
            hashMap.put(g63.class, m89Var.a);
        }
    }

    public n89() {
    }
}
