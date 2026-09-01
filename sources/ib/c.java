package ib;

import b6.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class c {
    public final HashMap a = new HashMap();

    public c(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            if (this.a.containsKey(kb.b.class)) {
                Integer num = (Integer) hashMap.get(kb.b.class);
                m.h(num);
                if (num.intValue() <= 0) {
                }
            }
            this.a.put(kb.b.class, bVar.a);
            hashMap.put(kb.b.class, 0);
        }
    }
}
